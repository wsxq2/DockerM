package top.wsxq2.dockerm.model.portainer;

public class Status {
    private final boolean authentication;
    private final boolean endpointManagement;
    private final boolean analytics;
    private final String version;

    public Status(boolean authentication, boolean endpointManagement, boolean analytics, String version) {
        this.authentication = authentication;
        this.endpointManagement = endpointManagement;
        this.analytics = analytics;
        this.version = version;
    }

    public boolean isAuthentication() {
        return authentication;
    }

    public boolean isEndpointManagement() {
        return endpointManagement;
    }

    public boolean isAnalytics() {
        return analytics;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Status{" +
                "authentication=" + authentication +
                ", endpointManagement=" + endpointManagement +
                ", analytics=" + analytics +
                ", version='" + version + '\'' +
                '}';
    }
}
