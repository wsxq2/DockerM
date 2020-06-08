package top.wsxq2.dockerm.model.portainer;

public class UserCreateRequest {
    private final String username;
    private final String password;
    private final int role;

    public UserCreateRequest(String username, String password, int role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserCreateRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                '}';
    }


}
