package top.wsxq2.dockerm.model.portainer;

public class RegistryCreateRequest {
    private final String name;
    private final int type;
    private final String URL;
    private final boolean authentication;
    private final String username;
    private final String password;

    public RegistryCreateRequest(String name, int type, String URL, boolean authentication, String username,
                                 String password) {
        this.name = name;
        this.type = type;
        this.URL = URL;
        this.authentication = authentication;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getURL() {
        return URL;
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
        return "RegistryCreateRequest{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", URL='" + URL + '\'' +
                ", authentication=" + authentication +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
