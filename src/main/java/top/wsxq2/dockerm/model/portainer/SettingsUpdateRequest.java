package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class SettingsUpdateRequest {
    private final String templatesURL;
    private final String logoURL;
    private final SettingsBlackListedLabels[] blackListedLabels;
    private final boolean displayExternalContributors;
    private final int authenticationMethod;
    private final LDAPSettings lDAPSettings;
    private final boolean allowBindMountsForRegularUsers;
    private final boolean allowPrivilegedModeForRegularUsers;
    private final int edgeAgentCheckinInterval;

    public SettingsUpdateRequest(String templatesURL, String logoURL, SettingsBlackListedLabels[] blackListedLabels,
                                 boolean displayExternalContributors, int authenticationMethod,
                                 LDAPSettings lDAPSettings, boolean allowBindMountsForRegularUsers,
                                 boolean allowPrivilegedModeForRegularUsers, int edgeAgentCheckinInterval) {
        this.templatesURL = templatesURL;
        this.logoURL = logoURL;
        this.blackListedLabels = blackListedLabels;
        this.displayExternalContributors = displayExternalContributors;
        this.authenticationMethod = authenticationMethod;
        this.lDAPSettings = lDAPSettings;
        this.allowBindMountsForRegularUsers = allowBindMountsForRegularUsers;
        this.allowPrivilegedModeForRegularUsers = allowPrivilegedModeForRegularUsers;
        this.edgeAgentCheckinInterval = edgeAgentCheckinInterval;
    }

    public String getTemplatesURL() {
        return templatesURL;
    }

    public String getLogoURL() {
        return logoURL;
    }

    public SettingsBlackListedLabels[] getBlackListedLabels() {
        return blackListedLabels;
    }

    public boolean isDisplayExternalContributors() {
        return displayExternalContributors;
    }

    public int getAuthenticationMethod() {
        return authenticationMethod;
    }

    public LDAPSettings getlDAPSettings() {
        return lDAPSettings;
    }

    public boolean isAllowBindMountsForRegularUsers() {
        return allowBindMountsForRegularUsers;
    }

    public boolean isAllowPrivilegedModeForRegularUsers() {
        return allowPrivilegedModeForRegularUsers;
    }

    public int getEdgeAgentCheckinInterval() {
        return edgeAgentCheckinInterval;
    }

    @Override
    public String toString() {
        return "SettingsUpdateRequest{" +
                "templatesURL='" + templatesURL + '\'' +
                ", logoURL='" + logoURL + '\'' +
                ", blackListedLabels=" + Arrays.toString(blackListedLabels) +
                ", displayExternalContributors=" + displayExternalContributors +
                ", authenticationMethod=" + authenticationMethod +
                ", lDAPSettings=" + lDAPSettings +
                ", allowBindMountsForRegularUsers=" + allowBindMountsForRegularUsers +
                ", allowPrivilegedModeForRegularUsers=" + allowPrivilegedModeForRegularUsers +
                ", edgeAgentCheckinInterval=" + edgeAgentCheckinInterval +
                '}';
    }
}
