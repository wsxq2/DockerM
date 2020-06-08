package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;
import java.util.Map;

public class Registry extends DataItem {
    private final String name;
    private final String URL;
    private final boolean authentication;
    private final String username;
    private final String password;
    private final int[] authorizedUsers;
    private final int[] authorizedTeams;
    private final Map<String, Object> teamAccessPolicies;
    private final Map<String, Object> userAccessPolicies;

    public Registry(int id, String name, String URL, boolean authentication, String username, String password,
                    int[] authorizedUsers, int[] authorizedTeams, Map<String, Object> teamAccessPolicies, Map<String,
            Object> userAccessPolicies) {
        this.name = name;
        this.URL = URL;
        this.authentication = authentication;
        this.username = username;
        this.password = password;
        this.authorizedUsers = authorizedUsers;
        this.authorizedTeams = authorizedTeams;
        this.teamAccessPolicies = teamAccessPolicies;
        this.userAccessPolicies = userAccessPolicies;
    }

    public Map<String, Object> getTeamAccessPolicies() {
        return teamAccessPolicies;
    }

    public Map<String, Object> getUserAccessPolicies() {
        return userAccessPolicies;
    }

    public String getName() {
        return name;
    }

    public String getURL() {
        return URL;
    }

    public boolean isAuthentication() {
        return authentication;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int[] getAuthorizedUsers() {
        return authorizedUsers;
    }

    public int[] getAuthorizedTeams() {
        return authorizedTeams;
    }

    @Override
    public String toString() {
        return "Registry{" +
                "name='" + name + '\'' +
                ", URL='" + URL + '\'' +
                ", authentication=" + authentication +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", authorizedUsers=" + Arrays.toString(authorizedUsers) +
                ", authorizedTeams=" + Arrays.toString(authorizedTeams) +
                ", teamAccessPolicies=" + teamAccessPolicies +
                ", userAccessPolicies=" + userAccessPolicies +
                ", id=" + getId() +
                '}';
    }

}
