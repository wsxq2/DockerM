package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class ResourceControlUpdateRequest {
    private final boolean Public;
    private final int[] users;
    private final int[] teams;

    public ResourceControlUpdateRequest(boolean aPublic, int[] users, int[] teams) {
        Public = aPublic;
        this.users = users;
        this.teams = teams;
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

    @Override
    public String toString() {
        return "ResourceControlUpdateRequest{" +
                "Public=" + Public +
                ", users=" + Arrays.toString(users) +
                ", teams=" + Arrays.toString(teams) +
                '}';
    }
}
