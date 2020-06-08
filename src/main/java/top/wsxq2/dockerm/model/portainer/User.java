package top.wsxq2.dockerm.model.portainer;

public class User extends DataItem {
    private final String username;
    private final int role;
    private PortainerAuthorization portainerAuthorizations;
    private EndpointAuthorization endpointAuthorizations;

    public User(String username, int role) {
        this(-1, username, role);
    }

    public User(int id, String username, int role) {
        super(id);
        this.username = username;
        this.role = role;
    }

    public PortainerAuthorization getPortainerAuthorizations() {
        return portainerAuthorizations;
    }

    public EndpointAuthorization getEndpointAuthorizations() {
        return endpointAuthorizations;
    }

    public int getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", portainerAuthorizations=" + portainerAuthorizations +
                ", endpointAuthorizations=" + endpointAuthorizations +
                ", role=" + role +
                ", name='" + getUsername() + '\'' +
                ", id=" + getId() +
                '}';
    }

    public String getUsername() {
        return username;
    }

}
