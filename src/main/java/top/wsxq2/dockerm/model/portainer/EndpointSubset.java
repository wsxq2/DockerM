package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class EndpointSubset {
    private final int id;
    private final String name;
    private final int type;
    private final String URL;
    private final String publicURL;
    private final int groupID;
    private final int[] authorizedUsers;
    private final int[] authorizedTeams;
    private final TLSConfiguration TLSConfig;

    public EndpointSubset(int id, String name, int type, String URL, String publicURL, int groupID,
                          int[] authorizedUsers, int[] authorizedTeams, TLSConfiguration TLSConfig) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.URL = URL;
        this.publicURL = publicURL;
        this.groupID = groupID;
        this.authorizedUsers = authorizedUsers;
        this.authorizedTeams = authorizedTeams;
        this.TLSConfig = TLSConfig;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType() {
        return type;
    }

    public String getURL() {
        return URL;
    }

    public String getPublicURL() {
        return publicURL;
    }

    public int getGroupID() {
        return groupID;
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

    @Override
    public String toString() {
        return "EndpointSubset{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", URL='" + URL + '\'' +
                ", publicURL='" + publicURL + '\'' +
                ", groupID=" + groupID +
                ", authorizedUsers=" + Arrays.toString(authorizedUsers) +
                ", authorizedTeams=" + Arrays.toString(authorizedTeams) +
                ", TLSConfig=" + TLSConfig +
                '}';
    }
}
