package top.wsxq2.dockerm.model.portainer;

public class AzureCredentials {
    private final String applicationID;
    private final String tenantID;
    private final String authenticationKey;

    public AzureCredentials(String applicationID, String tenantID, String authenticationKey) {
        this.applicationID = applicationID;
        this.tenantID = tenantID;
        this.authenticationKey = authenticationKey;
    }
}
