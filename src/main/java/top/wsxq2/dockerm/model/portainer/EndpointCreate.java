package top.wsxq2.dockerm.model.portainer;

public class EndpointCreate {
    private final String name;
    private final int endpointType;
    private String URL;
    private String publicURL;
    private String groupId;

    public EndpointCreate(String name, int endpointType, String URL, String publicURL, String groupId) {
        this.name = name;
        this.endpointType = endpointType;
        this.URL = URL;
        this.publicURL = publicURL;
        this.groupId = groupId;
    }

    public EndpointCreate(String name, int endpointType) {
        this.name = name;
        this.endpointType = endpointType;
    }

    @Override
    public String toString() {
        return "EndpointCreate{" +
                "name='" + name + '\'' +
                ", endpointType=" + endpointType +
                ", URL='" + URL + '\'' +
                ", publicURL='" + publicURL + '\'' +
                ", groupId='" + groupId + '\'' +
                '}';
    }
}
