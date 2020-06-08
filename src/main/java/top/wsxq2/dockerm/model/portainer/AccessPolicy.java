package top.wsxq2.dockerm.model.portainer;

public class AccessPolicy {
    private final int roleID;

    public AccessPolicy(int roleID) {
        this.roleID = roleID;
    }

    public int getRoleID() {
        return roleID;
    }

    @Override
    public String toString() {
        return "AccessPolicy{" +
                "roleID=" + roleID +
                '}';
    }
}
