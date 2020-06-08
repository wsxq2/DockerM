package top.wsxq2.dockerm.model.portainer;

public class TeamAccess {
    private final int teamId;
    private final int accessLevel;

    public TeamAccess(int teamId) {
        this(teamId, 1);
    }

    public TeamAccess(int teamId, int accessLevel) {
        this.teamId = teamId;
        this.accessLevel = accessLevel;
    }

    public int getTeamId() {
        return teamId;
    }
}
