package top.wsxq2.dockerm.model.portainer;

public class ResourceControl {
    private final boolean administratorsOnly;
    private final int id;
    private final boolean Public;
    private final String resourceId;
    private final String[] subResourceIds;
    private final boolean system;
    private final TeamAccess[] teamAccesses;
    private final UserAccess[] userAccesses;
    private final int type;

    public ResourceControl(boolean administratorsOnly, boolean aPublic, TeamAccess[] teamAccesses,
                           UserAccess[] userAccesses) {
        this(administratorsOnly, -1, aPublic, null, null, false, teamAccesses, userAccesses, -1);
    }

    public ResourceControl(boolean administratorsOnly, int id, boolean aPublic, String resourceId,
                           String[] subResourceIds, boolean system, TeamAccess[] teamAccesses,
                           UserAccess[] userAccesses, int type) {
        this.administratorsOnly = administratorsOnly;
        this.id = id;
        Public = aPublic;
        this.resourceId = resourceId;
        this.subResourceIds = subResourceIds;
        this.system = system;
        this.teamAccesses = teamAccesses;
        this.userAccesses = userAccesses;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getResourceId() {
        return resourceId;
    }

    public String[] getSubResourceIds() {
        return subResourceIds;
    }


    public int getType() {
        return type;
    }

    public boolean getPublic() {
        return Public;
    }

    public boolean getSystem() {
        return system;
    }

    public boolean getAdministratorsOnly() {
        return administratorsOnly;
    }

    public TeamAccess[] getTeamAccesses() {
        return teamAccesses;
    }

    public UserAccess[] getUserAccesses() {
        return userAccesses;
    }
}
