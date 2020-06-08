package top.wsxq2.dockerm.model.portainer;

public class DockerHubSubset {
    private final boolean authentication;
    private final String username;

    public DockerHubSubset(boolean authentication, String username) {
        this.authentication = authentication;
        this.username = username;
    }

    public boolean isAuthentication() {
        return authentication;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "DockerHubSubset{" +
                "authentication=" + authentication +
                ", username='" + username + '\'' +
                '}';
    }

}
