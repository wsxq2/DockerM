package top.wsxq2.dockerm.model.portainer;

public class UserPasswordCheckRequest {
    private final String password;

    public UserPasswordCheckRequest(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "UserPasswordCheckRequest{" +
                "password='" + password + '\'' +
                '}';
    }

}
