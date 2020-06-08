package top.wsxq2.dockerm.model.portainer;

import java.util.Map;

public class RegistryUpdateRequest {
    private final String name;
    private final String URL;
    private final boolean authentication;
    private final String username;
    private final String password;
    private final Map<String, AccessPolicy> teamAccessPolicies;
    private final Map<String, AccessPolicy> userAccessPolicies;

    public RegistryUpdateRequest(String name, String URL, boolean authentication, String username, String password,
                                 Map<String, AccessPolicy> teamAccessPolicies,
                                 Map<String, AccessPolicy> userAccessPolicies) {
        this.name = name;
        this.URL = URL;
        this.authentication = authentication;
        this.username = username;
        this.password = password;
        this.teamAccessPolicies = teamAccessPolicies;
        this.userAccessPolicies = userAccessPolicies;
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

    public Map<String, AccessPolicy> getTeamAccessPolicies() {
        return teamAccessPolicies;
    }

    public Map<String, AccessPolicy> getUserAccessPolicies() {
        return userAccessPolicies;
    }

    @Override
    public String toString() {
        return "RegistryUpdateRequest{" +
                "name='" + name + '\'' +
                ", URL='" + URL + '\'' +
                ", authentication=" + authentication +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", teamAccessPolicies=" + teamAccessPolicies +
                ", userAccessPolicies=" + userAccessPolicies +
                '}';
    }
}
