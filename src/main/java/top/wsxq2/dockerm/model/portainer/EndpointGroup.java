package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;
import java.util.Map;

public class EndpointGroup extends DataItem {
    private final String name;
    private final String description;
    private final String[] labels;
    private final String[] tags;
    private final Map<String, Object> teamAccessPolicies;
    private final Map<String, Object> userAccessPolicies;

    public EndpointGroup(String name, int id, String description, String[] labels, String[] tags,
                         Map<String, Object> teamAccessPolicies, Map<String, Object> userAccessPolicies) {
        super(id);
        this.name = name;
        this.description = description;
        this.labels = labels;
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

    public String[] getLabels() {
        return labels;
    }

    public String[] getTags() {
        return tags;
    }

    public Map<String, Object> getTeamAccessPolicies() {
        return teamAccessPolicies;
    }

    public Map<String, Object> getUserAccessPolicies() {
        return userAccessPolicies;
    }

    @Override
    public String toString() {
        return "EndpointGroup{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", labels=" + Arrays.toString(labels) +
                ", tags=" + Arrays.toString(tags) +
                ", teamAccessPolicies=" + teamAccessPolicies +
                ", userAccessPolicies=" + userAccessPolicies +
                ", id=" + getId() +
                '}';
    }
}
