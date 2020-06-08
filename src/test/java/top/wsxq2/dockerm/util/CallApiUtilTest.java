package top.wsxq2.dockerm.util;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import top.wsxq2.dockerm.model.docker.Event;
import top.wsxq2.dockerm.model.docker.containeroverview.ContainerOverview;
import top.wsxq2.dockerm.model.docker.imageoverview.ImageOverview;
import top.wsxq2.dockerm.model.docker.networkoverview.NetworkOverview;
import top.wsxq2.dockerm.model.docker.volumeoverview.VolumeOverview;
import top.wsxq2.dockerm.model.portainer.Endpoint;
import top.wsxq2.dockerm.model.portainer.Template;
import top.wsxq2.dockerm.model.portainer.User;
import top.wsxq2.dockerm.model.portainer.UserCreateRequest;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.JVM)
public class CallApiUtilTest {
    private CallApiUtil callApiUtil;

    @Before
    public void setUp() {
        callApiUtil = new CallApiUtil("http://192.168.56.11:9000", "admin", "TWNX31004", false);
    }

    @Test
    public void getDataItems() {
        testGetDataItems(Template.class);
    }


    private <T> void testGetDataItems(Class<T> tClass) {
        Collection<T> collection = callApiUtil.getDataItems(tClass);
        System.out.println(collection);
        assertNotEquals(0, collection.size());
    }

    @Test
    public void getDataItem() {
        for (int i = 1; i <= 5; i++) {
            Endpoint endpoint = callApiUtil.getDataItemById(Endpoint.class, i);
            System.out.println(endpoint);
            assertEquals(i, endpoint.getId());
        }
    }

    @Test
    @Ignore
    public void CallApiUtil() {
        CallApiUtil callApiUtil = new CallApiUtil("http://192.168.56.11:9001", "admin", "TWNX31004", true);
        Collection<User> users = callApiUtil.getDataItems(User.class);
        User findedUser = null;
        for (User user : users) {
            if (user.getUsername().equals("admin")) findedUser = user;
        }
        assertNotNull(findedUser);
    }

    @Test
    public void appendHeader() {
        callApiUtil.appendHeader("abc", List.of("a", "b"));
        callApiUtil.appendHeader("User-Agent", List.of("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 " +
                "(KHTML, like Gecko) Chrome/81.0.4044.138 Safari/537.36"));
        callApiUtil.getDataItems(User.class);
    }

    @Test
    public void addDataItem() {
        Map<Object, Object> map = Map.of("Name", "adfads", "EndpointType", 1, "URL", "tcp://192.168.56.11:1234",
                "GroupID",
                2);
        String str = callApiUtil.addDataItemByMap(Endpoint.class, map);
//        System.out.println(str);
        assertNotNull(str);

        str = callApiUtil.addDataItemByObject(User.class, new UserCreateRequest("lalalahahaa", "ABCD", 2));
//        System.out.println(str);
        assertNotNull(str);
    }

    @Test
    public void getDataItemsDocker() {
        for (Class c : new Class[]{ContainerOverview.class, ImageOverview.class, VolumeOverview.class,
                NetworkOverview.class, Event.class}) {
            getDataItemsDockerHelper(c);
        }
    }

    private <T> void getDataItemsDockerHelper(Class<T> tClass) {
        T[] ts = callApiUtil.getDataItemsDocker(1, tClass);
        System.out.println(Arrays.toString(ts));
        assertNotEquals(0, ts.length);

    }

    @Test
    public void getDataItemsDockerOne() {
        Instant instant = Instant.now();
        instant.minus(1, ChronoUnit.DAYS);
        Event[] ts = callApiUtil.getDataItemsWithPathDocker(1, Event.class, String.format(
                "events?since=%d&until=%d", instant.minus(Duration.ofDays(1)).toEpochMilli() / 1000,
                instant.toEpochMilli() / 1000));
        System.out.println(Arrays.toString(ts));

        assertNotEquals(0, ts.length);

    }

    @Test
    public void a() {
    }

}