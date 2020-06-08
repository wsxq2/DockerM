package top.wsxq2.dockerm.model.portainer;

public class TeamMembership {
    private final int id;
    private final int userID;
    private final int teamID;
    private final int role;

    public TeamMembership(int id, int userID, int teamID, int role) {
        this.id = id;
        this.userID = userID;
        this.teamID = teamID;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public int getUserID() {
        return userID;
    }

    public int getTeamID() {
        return teamID;
    }

    public int getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "TeamMembership{" +
                "id=" + id +
                ", userID=" + userID +
                ", teamID=" + teamID +
                ", role=" + role +
                '}';
    }
}
