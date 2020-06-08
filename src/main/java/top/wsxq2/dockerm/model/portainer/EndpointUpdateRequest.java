package top.wsxq2.dockerm.model.portainer;

import java.util.Map;

public class EndpointUpdateRequest {
    private final String name;
    private final String URL;
    private final String publicURL;
    private final int groupID;
    private final boolean TLS;
    private final boolean TLSSkipVerify;
    private final boolean TLSSkipClientVeriy;
    private final String applicationID;
    private final String tenantID;
    private final String authenticationKey;
    private final Map<String, AccessPolicy> teamAccessPolicies;
    private final Map<String, AccessPolicy> userAccessPolicies;

    public EndpointUpdateRequest(String name, String URL, String publicURL, int groupID, boolean TLS,
                                 boolean TLSSkipVerify, boolean TLSSkipClientVeriy, String applicationID,
                                 String tenantID, String authenticationKey,
                                 Map<String, AccessPolicy> teamAccessPolicies,
                                 Map<String, AccessPolicy> userAccessPolicies) {
        this.name = name;
        this.URL = URL;
        this.publicURL = publicURL;
        this.groupID = groupID;
        this.TLS = TLS;
        this.TLSSkipVerify = TLSSkipVerify;
        this.TLSSkipClientVeriy = TLSSkipClientVeriy;
        this.applicationID = applicationID;
        this.tenantID = tenantID;
        this.authenticationKey = authenticationKey;
        this.teamAccessPolicies = teamAccessPolicies;
        this.userAccessPolicies = userAccessPolicies;
    }

    public String getName() {
        return name;
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

    public boolean isTLS() {
        return TLS;
    }

    public boolean isTLSSkipVerify() {
        return TLSSkipVerify;
    }

    public boolean isTLSSkipClientVeriy() {
        return TLSSkipClientVeriy;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public String getTenantID() {
        return tenantID;
    }

    public String getAuthenticationKey() {
        return authenticationKey;
    }

    public Map<String, AccessPolicy> getTeamAccessPolicies() {
        return teamAccessPolicies;
    }

    public Map<String, AccessPolicy> getUserAccessPolicies() {
        return userAccessPolicies;
    }

    @Override
    public String toString() {
        return "EndpointUpdateRequest{" +
                "name='" + name + '\'' +
                ", URL='" + URL + '\'' +
                ", publicURL='" + publicURL + '\'' +
                ", groupID=" + groupID +
                ", TLS=" + TLS +
                ", TLSSkipVerify=" + TLSSkipVerify +
                ", TLSSkipClientVeriy=" + TLSSkipClientVeriy +
                ", applicationID='" + applicationID + '\'' +
                ", tenantID='" + tenantID + '\'' +
                ", authenticationKey='" + authenticationKey + '\'' +
                ", teamAccessPolicies=" + teamAccessPolicies +
                ", userAccessPolicies=" + userAccessPolicies +
                '}';
    }
}
