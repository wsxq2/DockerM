package top.wsxq2.dockerm.model.portainer;

public class UserPasswordCheckResponse {
    private final boolean valid;

    public UserPasswordCheckResponse(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }

    @Override
    public String toString() {
        return "UserPasswordCheckResponse{" +
                "valid=" + valid +
                '}';
    }
}
