package top.wsxq2.dockerm.model.portainer;

public class UserUpdateRequest {
    private final String password;
    private final int role;

    public UserUpdateRequest(String password, int role) {
        this.password = password;
        this.role = role;
    }

    public String getPassword() {
        return password;
    }

    public int getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserUpdateRequest{" +
                "password='" + password + '\'' +
                ", role=" + role +
                '}';
    }
}
