package top.wsxq2.dockerm.model.portainer;

public class TeamMembershipCreateRequest {
    private final int userID;
    private final int teamID;
    private final int role;

    public TeamMembershipCreateRequest(int userID, int teamID, int role) {
        this.userID = userID;
        this.teamID = teamID;
        this.role = role;
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
        return "TeamMembershipCreateRequest{" +
                "userID=" + userID +
                ", teamID=" + teamID +
                ", role=" + role +
                '}';
    }
}
