package top.wsxq2.dockerm.model.portainer;

public class UserSubset {
    private final int id;
    private final String username;
    private final int role;

    public UserSubset(int id, String username, int role) {
        this.id = id;
        this.username = username;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "UserSubset{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", role=" + role +
                '}';
    }
}
