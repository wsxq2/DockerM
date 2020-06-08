package top.wsxq2.dockerm.model.portainer;

public class DockerHub {
    private final boolean authentication;
    private final String username;
    private final String passoword;

    public DockerHub(boolean authentication, String username, String passoword) {
        this.authentication = authentication;
        this.username = username;
        this.passoword = passoword;
    }

    public boolean isAuthentication() {
        return authentication;
    }

    public String getUsername() {
        return username;
    }

    public String getPassoword() {
        return passoword;
    }

    @Override
    public String toString() {
        return "DockerHub{" +
                "authentication=" + authentication +
                ", username='" + username + '\'' +
                ", passoword='" + passoword + '\'' +
                '}';
    }

}
