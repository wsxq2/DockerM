package top.wsxq2.dockerm.model.portainer;

public class TeamCreateRequest {
    private final String name;

    public TeamCreateRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TeamCreateRequest{" +
                "name='" + name + '\'' +
                '}';
    }

}
