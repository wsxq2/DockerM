package top.wsxq2.dockerm.model.portainer;

public class AuthenticateUserRequest {
    private final String username;
    private final String password;

    public AuthenticateUserRequest(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }
}
