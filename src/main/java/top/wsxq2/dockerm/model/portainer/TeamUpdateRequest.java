package top.wsxq2.dockerm.model.portainer;

public class TeamUpdateRequest {
    private final String name;

    public TeamUpdateRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TeamUpdateRequest{" +
                "name='" + name + '\'' +
                '}';
    }
}
