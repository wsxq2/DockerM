package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class ResourceControlCreateRequest {
    private final String resourceID;
    private final String type;
    private final boolean Public;
    private final int[] users;
    private final int[] teams;
    private final String subResourceIDS;

    public ResourceControlCreateRequest(String resourceID, String type, boolean aPublic, int[] users, int[] teams,
                                        String subResourceIDS) {
        this.resourceID = resourceID;
        this.type = type;
        Public = aPublic;
        this.users = users;
        this.teams = teams;
        this.subResourceIDS = subResourceIDS;
    }

    public String getResourceID() {
        return resourceID;
    }

    public String getType() {
        return type;
    }

    public boolean isPublic() {
        return Public;
    }

    public int[] getUsers() {
        return users;
    }

    public int[] getTeams() {
        return teams;
    }

    public String getSubResourceIDS() {
        return subResourceIDS;
    }

    @Override
    public String toString() {
        return "ResourceControlCreateRequest{" +
                "resourceID='" + resourceID + '\'' +
                ", type='" + type + '\'' +
                ", Public=" + Public +
                ", users=" + Arrays.toString(users) +
                ", teams=" + Arrays.toString(teams) +
                ", subResourceIDS='" + subResourceIDS + '\'' +
                '}';
    }

}
