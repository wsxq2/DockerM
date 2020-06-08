package top.wsxq2.dockerm.model.portainer;

public class DockerHubUpdateRequest {
    private final boolean authentication;
    private final String username;
    private final String password;

    public DockerHubUpdateRequest(boolean authentication, String username, String password) {
        this.authentication = authentication;
        this.username = username;
        this.password = password;
    }

    public boolean isAuthentication() {
        return authentication;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "DockerHubUpdateRequest{" +
                "authentication=" + authentication +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
