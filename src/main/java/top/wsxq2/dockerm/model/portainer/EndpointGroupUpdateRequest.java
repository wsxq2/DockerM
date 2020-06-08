package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;
import java.util.Map;

public class EndpointGroupUpdateRequest {
    private final String name;
    private final String description;
    private final String[] tags;
    private final Map<String, AccessPolicy> teamAccessPolicies;
    private final Map<String, AccessPolicy> userAccessPolicies;

    public EndpointGroupUpdateRequest(String name, String description, String[] tags,
                                      Map<String, AccessPolicy> teamAccessPolicies,
                                      Map<String, AccessPolicy> userAccessPolicies) {
        this.name = name;
        this.description = description;
        this.tags = tags;
        this.teamAccessPolicies = teamAccessPolicies;
        this.userAccessPolicies = userAccessPolicies;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String[] getTags() {
        return tags;
    }

    public Map<String, AccessPolicy> getTeamAccessPolicies() {
        return teamAccessPolicies;
    }

    public Map<String, AccessPolicy> getUserAccessPolicies() {
        return userAccessPolicies;
    }

    @Override
    public String toString() {
        return "EndpointGroupUpdateRequest{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", tags=" + Arrays.toString(tags) +
                ", teamAccessPolicies=" + teamAccessPolicies +
                ", userAccessPolicies=" + userAccessPolicies +
                '}';
    }

}
