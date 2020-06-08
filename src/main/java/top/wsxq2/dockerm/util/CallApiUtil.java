package top.wsxq2.dockerm.util;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import net.jcip.annotations.ThreadSafe;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wsxq2.dockerm.model.docker.Event;
import top.wsxq2.dockerm.model.docker.container.Container;
import top.wsxq2.dockerm.model.docker.containeroverview.ContainerOverview;
import top.wsxq2.dockerm.model.docker.image.Image;
import top.wsxq2.dockerm.model.docker.imageoverview.ImageOverview;
import top.wsxq2.dockerm.model.docker.network.Network;
import top.wsxq2.dockerm.model.docker.networkoverview.NetworkOverview;
import top.wsxq2.dockerm.model.docker.volume.Volume;
import top.wsxq2.dockerm.model.docker.volumeoverview.VolumeOverview;
import top.wsxq2.dockerm.model.portainer.*;

import java.lang.reflect.Array;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@ThreadSafe
public class CallApiUtil {
    private final URL portainerURL;
    private final HttpClient client;
    private final Map<String, List<String>> httpHeaders;
    private final AuthenticateUserRequest authenticateUserRequest;

    private final CachedData cachedData;
    private final Map<Class<?>, Object[]> classObjectsMap;
    private final Map<Class<?>, Object> classObjectMap;
    private final Map<Class<? extends DataItem>, String> whichMaps;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    public CallApiUtil(String portainerURL, String user, String pass, boolean init) {
        //field init
        try {
            this.portainerURL = new URL(portainerURL);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("portainerURL error");
        }
        client =
                HttpClient.newBuilder().connectTimeout(Duration.ofMillis(3000)).version(HttpClient.Version.HTTP_1_1)
                        .followRedirects(HttpClient.Redirect.NORMAL).build();
        httpHeaders = new ConcurrentHashMap<>();
        cachedData = new CachedData();
        whichMaps = Map.of(Endpoint.class, "endpoints", EndpointGroup.class, "endpoint_groups", User.class, "users",
                Team.class, "teams", Tag.class, "tags", Template.class, "templates", Registry.class, "registries");
        classObjectsMap = new ConcurrentHashMap<Class<?>, Object[]>();
        classObjectMap = new ConcurrentHashMap<>();
        this.authenticateUserRequest = new AuthenticateUserRequest(user, pass);

        String aur = JsonUtil.gson.toJson(authenticateUserRequest);
        logger.debug("authenticateUserRequest: {}, portainerURL: {}", aur, portainerURL);
        String response;

        //init
        if (init) {
            response = invoke("POST", "users/admin/init", aur);
            if (response == null) throw new IllegalArgumentException("init failed");
        }

        //login
        response = invoke("POST", "auth", aur);
        if (response == null) throw new IllegalArgumentException("login failed");
        appendHeader("Authorization", List.of("Bearer " + JsonUtil.gson.fromJson(response,
                AuthenticateUserResponse.class).getJwt()));

//        if (!refreshCachedData()) {
//            throw new IllegalArgumentException("get data failed");
//        }
        //auto refresh cachedData
//        ScheduledExecutorService executorService=Executors.newSingleThreadScheduledExecutor();
//        executorService.scheduleAtFixedRate(()->{
//            MDC.put("threadName", "timer");
//            refreshCachedData();
//        },0,10,TimeUnit.MINUTES);
    }

    private String invoke(String method, String path, String body) {
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();
        for (Map.Entry<String, List<String>> httpHeader : httpHeaders.entrySet()) {
            requestBuilder.header(httpHeader.getKey(), String.join(",", httpHeader.getValue()));
        }
        String url = portainerURL + "/api/" + path;
        HttpRequest request = requestBuilder.method(method, HttpRequest.BodyPublishers.ofString(body))
                .uri(URI.create(url)).timeout(Duration.ofMillis(3000)).build();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            logger.info("{} {} {}", method, url, response.statusCode());
            if (!body.isEmpty()) {
                logger.debug("request.body: {}", body);
            }
            logger.debug("response.body(): {}", response.body());
            String res = response.body().trim();
            if (response.statusCode() == 200 && !res.isEmpty()) {
                return res;
            }
        } catch (Exception e) {
            logger.error("connect to portainer error!");
        }
        return null;
    }

    public final void appendHeader(String key, List<String> value) {
        this.httpHeaders.put(key, value);
    }

    public AuthenticateUserRequest getAuthenticateUserRequest() {
        return authenticateUserRequest;
    }

    public URL getPortainerURL() {
        return portainerURL;
    }

    private synchronized boolean refreshCachedData() {
//        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//        try {
        for (Class<? extends DataItem> c : whichMaps.keySet()) {
//                executor.execute(()->refreshCachedDataOne(c));
            refreshCachedDataOne(c);
        }
//            executor.shutdown();
//            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
//                logger.warn("refreshCachedData timeout");
//                return false;
//            }
//        } catch (Exception err) {
//            logger.error("refreshCachedData failed");
//            return false;
//        }
        return true;
    }

    private synchronized <T extends DataItem> void refreshCachedDataOne(Class<T> which) {
//        System.out.println(which);
        Map<Integer, T> map = cachedData.getMap(which);
        map.clear();
        for (T item : getThingsThroughAPI(which)) {
            map.put(item.getId(), item);
        }
    }

    @SuppressWarnings("unchecked")
    private <T> T[] getThingsThroughAPI(Class<T> which) {
        T[] tsZero = (T[]) Array.newInstance(which, 0);
        Class<T[]> whichArray = (Class<T[]>) tsZero.getClass();
        String res = invoke("GET", whichMaps.get(which));
        if (res == null) return tsZero;
        return JsonUtil.gson.fromJson(res, whichArray);
    }

    private String invoke(String method, String path) {
        return invoke(method, path, "");
    }

    @SuppressWarnings("unchecked")
    public <T> T[] getThingsWithPath(Class<T> which, String path) {
        T[] tsZero = (T[]) Array.newInstance(which, 0);
        Class<T[]> whichArray = (Class<T[]>) tsZero.getClass();
        String res = invoke("GET", path);
        if (res == null) return tsZero;
        return JsonUtil.gson.fromJson(res, whichArray);
    }

    public <T extends DataItem> String addDataItemByMap(Class<T> which, Map<Object, Object> t) {
        appendHeader("Content-Type", List.of("application/x-www-form-urlencoded; charset=utf-8"));
        String res = invoke("POST", whichMaps.get(which), ofFormData(t));
        if (res != null) refreshCachedDataOne(which);
        return res;
    }

    private static String ofFormData(Map<Object, Object> data) {
        var builder = new StringBuilder();
        for (Map.Entry<Object, Object> entry : data.entrySet()) {
            if (builder.length() > 0) {
                builder.append("&");
            }
            builder
                    .append(URLEncoder.encode(entry.getKey().toString(), StandardCharsets.UTF_8));
            builder.append("=");
            builder
                    .append(URLEncoder.encode(entry.getValue().toString(), StandardCharsets.UTF_8));
        }
        return builder.toString();
    }

    public <T extends DataItem, T2> String addDataItemByObject(Class<T> which, T2 t) {
        appendHeader("Content-Type", List.of("application/x-www-form-urlencoded; charset=utf-8"));
        String res = invoke("POST", whichMaps.get(which), JsonUtil.gson.toJson(t));
        if (res != null) refreshCachedDataOne(which);
        return res;
    }

    public <T> T getDataItemById(Class<T> which, int id) {
        return getThingWithPath(which, String.format("%s/%d", whichMaps.get(which), id));
//        return cachedData.getMap(which).get(id);
    }

    public <T> T getThingWithPath(Class<T> which, String path) {
        String res = invoke("GET", path);
        if (res == null) return null;
        return JsonUtil.gson.fromJson(res, which);
    }

    public <T> Collection<T> getDataItems(Class<T> which) {
        return Arrays.asList(getThingsThroughAPI(which));
//        return cachedData.getMap(which).values();
    }

    public JsonObject getThingJODocker(int endpoint, String path) {
        assert endpoint != 0;
        String res = invokeDocker("GET", endpoint, path, "");
        return JsonParser.parseString(res).getAsJsonObject();
    }

    private String invokeDocker(String method, int endpoint, String path, String body) {
        return invoke(method, "endpoints/" + endpoint + "/docker/" + path, body);
    }

    @SuppressWarnings("unchecked")
    public <T> T[] getDataItemsWithPathDocker(int endpoint, Class<T> which, String path) {
        assert endpoint != 0;
        assert which != null;
        assert !StringUtils.isEmpty(path);
        T[] tsZero = (T[]) Array.newInstance(which, 0);
        String res = invokeDocker("GET", endpoint, path, "");
        if (res == null) return tsZero;

        Class<T[]> whichArray = (Class<T[]>) tsZero.getClass();
        if (VolumeOverview.class.equals(which)) {
            JsonObject jsonObject = JsonParser.parseString(res).getAsJsonObject();
            return JsonUtil.gson.fromJson(jsonObject.get("Volumes"), whichArray);
        } else if (Event.class.equals(which)) {
            return JsonUtil.gson.fromJson("[" + res + "]", whichArray);
        } else {
            return JsonUtil.gson.fromJson(res, whichArray);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T[] getDataItemsDocker(int endpoint, Class<T> which) {
        assert endpoint != 0;
        assert which != null;
        Map<Class<?>, String> classStringMap = Map.of(ContainerOverview.class, "containers/json?all=1",
                ImageOverview.class, "images/json?all=1", VolumeOverview.class, "volumes", NetworkOverview.class,
                "networks", Event.class, "events");
        String path = classStringMap.get(which);
        T[] tsZero = (T[]) Array.newInstance(which, 0);
        String res = invokeDocker("GET", endpoint, path, "");
        if (res == null) return tsZero;

        Class<T[]> whichArray = (Class<T[]>) tsZero.getClass();
        if (VolumeOverview.class.equals(which)) {
            JsonObject jsonObject = JsonParser.parseString(res).getAsJsonObject();
            return JsonUtil.gson.fromJson(jsonObject.get("Volumes"), whichArray);
        } else {
            return JsonUtil.gson.fromJson(res, whichArray);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T getDataItemDocker(int endpoint, Class<T> which, String id) {
        assert endpoint != 0;
        assert which != null;
        assert !StringUtils.isEmpty(id);
        Map<Class<?>, String> classStringMap = Map.of(Container.class, String.format("containers/%s/json", id),
                Image.class, String.format("images/%s/json", id), Volume.class, "volumes/" + id, Network.class,
                "networks/" + id);
        String path = classStringMap.get(which);
        String res = invokeDocker("GET", endpoint, path, "");
        if (res == null) return null;
        return JsonUtil.gson.fromJson(res, which);
    }


    //HTTP/1.1 405 Method Not Allowed
//    public Tag getTag(int id){
//        return JsonUtil.gson.fromJson((invoke("GET", "/tags/"+id, ""), Tag.class));
//    }

}
