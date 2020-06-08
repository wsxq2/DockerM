package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class RegistrySubset {
    private final int id;
    private final String name;
    private final String URL;
    private final boolean authentication;
    private final String username;
    private final int[] authorizedUsers;
    private final int[] authorizedTeams;

    public RegistrySubset(int id, String name, String URL, boolean authentication, String username,
                          int[] authorizedUsers, int[] authorizedTeams) {
        this.id = id;
        this.name = name;
        this.URL = URL;
        this.authentication = authentication;
        this.username = username;
        this.authorizedUsers = authorizedUsers;
        this.authorizedTeams = authorizedTeams;
    }

    public int getId() {
        return id;
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

    public int[] getAuthorizedUsers() {
        return authorizedUsers;
    }

    public int[] getAuthorizedTeams() {
        return authorizedTeams;
    }

    @Override
    public String toString() {
        return "RegistrySubset{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", URL='" + URL + '\'' +
                ", authentication=" + authentication +
                ", username='" + username + '\'' +
                ", authorizedUsers=" + Arrays.toString(authorizedUsers) +
                ", authorizedTeams=" + Arrays.toString(authorizedTeams) +
                '}';
    }
}
