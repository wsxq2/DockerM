package top.wsxq2.dockerm.model.portainer;

public class TagCreateRequest {
    private final String name;

    public TagCreateRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TagCreateRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
