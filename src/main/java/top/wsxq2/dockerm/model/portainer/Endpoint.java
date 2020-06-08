package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;
import java.util.Map;

public class Endpoint extends DataItem {
    private static final Map<Integer, Type> typeIntToString = Map.of(1, Type.STANDALONE);
    private static final Map<Integer, Status> statusIntToString = Map.of(1, Status.UP, 0, Status.DOWN);
    private final String name;
    private final int type;
    private final String URL;
    private final int groupId;
    private final String[] tags;
    private String publicURL;
    private int[] authorizedUsers;
    private int[] authorizedTeams;
    private TLSConfiguration TLSConfig;
    private AzureCredentials azureCredentials;
    private int status;
    private Map<String, AccessPolicy> teamAccessPolicies;
    private Map<String, AccessPolicy> userAccessPolicies;
    private EndpointSnapshot[] snapshots;

    public Endpoint(int id, String name, int type, String URL, String publicURL, int groupId,
                    int[] authorizedUsers, int[] authorizedTeams, TLSConfiguration TLSConfig,
                    AzureCredentials azureCredentials, int status, String[] tags, Map<String,
            AccessPolicy> teamAccessPolicies, Map<String, AccessPolicy> userAccessPolicies,
                    EndpointSnapshot[] snapshots) {
        super(id);
        this.name = name;
        this.type = type;
        this.URL = URL;
        this.publicURL = publicURL;
        this.groupId = groupId;
        this.authorizedUsers = authorizedUsers;
        this.authorizedTeams = authorizedTeams;
        this.TLSConfig = TLSConfig;
        this.azureCredentials = azureCredentials;
        this.status = status;
        this.tags = tags;
        this.teamAccessPolicies = teamAccessPolicies;
        this.userAccessPolicies = userAccessPolicies;
        this.snapshots = snapshots;
    }

    public Endpoint(int type, String name, String URL, int groupId, String[] tags, ResourceControl resourceControl) {
        this.name = name;
        this.type = type;
        this.URL = URL;
        this.groupId = groupId;
        this.tags = tags;
        if (resourceControl == null) return;
        TeamAccess[] teamAccesses = resourceControl.getTeamAccesses();
        for (TeamAccess teamAccess : teamAccesses) {
            teamAccessPolicies.put(String.valueOf(teamAccess.getTeamId()), null);
        }
        UserAccess[] userAccesses = resourceControl.getUserAccesses();
        for (UserAccess userAccess : userAccesses) {
            userAccessPolicies.put(String.valueOf(userAccess.getUserId()), null);
        }
    }

    public int getType() {
        return type;
    }

    public String getTypeString() {
        return typeIntToString.get(type).toString();
    }

    public String getURL() {
        return URL;
    }

    public String getPublicURL() {
        return publicURL;
    }

    public int getGroupId() {
        return groupId;
    }

    public int[] getAuthorizedUsers() {
        return authorizedUsers;
    }

    public int[] getAuthorizedTeams() {
        return authorizedTeams;
    }

    public TLSConfiguration getTLSConfig() {
        return TLSConfig;
    }

    public AzureCredentials getAzureCredentials() {
        return azureCredentials;
    }

    public int getStatus() {
        return status;
    }

    public String getStatusString() {
        return statusIntToString.get(status).toString();
    }

    public String[] getTags() {
        return tags;
    }

    public Map<String, AccessPolicy> getTeamAccessPolicies() {
        return teamAccessPolicies;
    }

    public Map<String, AccessPolicy> getUserAccessPolicies() {
        return userAccessPolicies;
    }

    public EndpointSnapshot[] getSnapshots() {
        return snapshots;
    }

    public String toStringForSearch() {

        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s", getId(), getName(), typeIntToString.get(type), URL,
                publicURL,
                statusIntToString.get(status), Arrays.toString(tags), teamAccessPolicies, userAccessPolicies);

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Endpoint{" +
                "Id=" + getId() +
                ", Name='" + getName() + '\'' +
                ", Type=" + type +
                ", URL='" + URL + '\'' +
                ", PublicURL='" + publicURL + '\'' +
                ", GroupID=" + groupId +
                ", AuthorizedUsers=" + Arrays.toString(authorizedUsers) +
                ", AuthorizedTeams=" + Arrays.toString(authorizedTeams) +
                ", TLSConfig=" + TLSConfig +
                ", AzureCredentials=" + azureCredentials +
                ", Status=" + status +
                ", Tags=" + Arrays.toString(tags) +
                ", TeamAccessPolicies=" + teamAccessPolicies +
                ", UserAccessPolicies=" + userAccessPolicies +
                ", Snapshots=" + Arrays.toString(snapshots) +
                '}';
    }

    private enum Status {
        UP("up"), DOWN("down");
        private final String status;

        Status(String brand) {
            this.status = brand;
        }

        @Override
        public String toString() {
            return status;
        }
    }

    private enum Type {
        STANDALONE("Standalone");
        private final String type;

        Type(String type) {
            this.type = type;
        }


        @Override
        public String toString() {
            return type;
        }
    }
}
