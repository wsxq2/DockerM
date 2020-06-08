package top.wsxq2.dockerm.model.portainer;

public class UserAccess {
    private final int userId;
    private final int accessLevel;

    public UserAccess(int userId) {
        this(userId, 1);
    }

    public UserAccess(int userId, int accessLevel) {
        this.userId = userId;
        this.accessLevel = accessLevel;
    }

    public int getUserId() {
        return userId;
    }
}
