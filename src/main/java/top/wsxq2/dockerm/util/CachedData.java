package top.wsxq2.dockerm.util;

import top.wsxq2.dockerm.model.portainer.*;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CachedData {
    private final Map<Integer, Endpoint> endpointMap;
    private final Map<Integer, User> userMap;
    private final Map<Integer, Team> teamMap;
    private final Map<Integer, EndpointGroup> endpointGroupMap;
    private final Map<Integer, Tag> tagMap;
    private final Map<Integer, Template> templateMap;

    Map<Class<?>, Map<Integer, ? extends DataItem>> maps;

    public CachedData() {
        this.endpointMap = new ConcurrentHashMap<>();
        this.userMap = new ConcurrentHashMap<>();
        this.teamMap = new ConcurrentHashMap<>();
        this.endpointGroupMap = new ConcurrentHashMap<>();
        this.tagMap = new ConcurrentHashMap<>();
        this.templateMap = new ConcurrentHashMap<>();

        maps = Map.of(EndpointGroup.class, endpointGroupMap, User.class, userMap, Team.class, teamMap, Endpoint.class,
                endpointMap, Tag.class, tagMap, Template.class, templateMap);
    }

    @SuppressWarnings("unchecked")
    public <T> Map<Integer, T> getMap(Class<T> which) {
        return (Map<Integer, T>) maps.get(which);
    }

}
