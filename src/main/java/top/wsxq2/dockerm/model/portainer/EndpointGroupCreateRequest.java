package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class EndpointGroupCreateRequest {
    private final String name;
    private final String description;
    private final Pair[] labels;
    private final int[] AssociatedEndpoints;

    public EndpointGroupCreateRequest(String name, String description, Pair[] labels, int[] associatedEndpoints) {
        this.name = name;
        this.description = description;
        this.labels = labels;
        AssociatedEndpoints = associatedEndpoints;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Pair[] getLabels() {
        return labels;
    }

    public int[] getAssociatedEndpoints() {
        return AssociatedEndpoints;
    }

    @Override
    public String toString() {
        return "EndpointGroupCreateRequest{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", labels=" + Arrays.toString(labels) +
                ", AssociatedEndpoints=" + Arrays.toString(AssociatedEndpoints) +
                '}';
    }

}
