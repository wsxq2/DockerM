package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class Settings {
    private final String templatesURL;
    private final String logoURL;
    private final SettingsBlackListedLabels[] blackListedLabels;
    private final boolean displayExternalContributors;
    private final int authenticationMethod;
    private final LDAPSettings LDAPSettings;
    private final boolean allowBindMountsForRegularUsers;
    private final boolean allowPrivilegedModeForRegularUsers;

    public Settings(String templatesURL, String logoURL, SettingsBlackListedLabels[] blackListedLabels,
                    boolean displayExternalContributors, int authenticationMethod,
                    top.wsxq2.dockerm.model.portainer.LDAPSettings LDAPSettings, boolean allowBindMountsForRegularUsers,
                    boolean allowPrivilegedModeForRegularUsers) {
        this.templatesURL = templatesURL;
        this.logoURL = logoURL;
        this.blackListedLabels = blackListedLabels;
        this.displayExternalContributors = displayExternalContributors;
        this.authenticationMethod = authenticationMethod;
        this.LDAPSettings = LDAPSettings;
        this.allowBindMountsForRegularUsers = allowBindMountsForRegularUsers;
        this.allowPrivilegedModeForRegularUsers = allowPrivilegedModeForRegularUsers;
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

    public top.wsxq2.dockerm.model.portainer.LDAPSettings getLDAPSettings() {
        return LDAPSettings;
    }

    public boolean isAllowBindMountsForRegularUsers() {
        return allowBindMountsForRegularUsers;
    }

    public boolean isAllowPrivilegedModeForRegularUsers() {
        return allowPrivilegedModeForRegularUsers;
    }

    @Override
    public String toString() {
        return "Settings{" +
                "templatesURL='" + templatesURL + '\'' +
                ", logoURL='" + logoURL + '\'' +
                ", blackListedLabels=" + Arrays.toString(blackListedLabels) +
                ", displayExternalContributors=" + displayExternalContributors +
                ", authenticationMethod=" + authenticationMethod +
                ", LDAPSettings=" + LDAPSettings +
                ", allowBindMountsForRegularUsers=" + allowBindMountsForRegularUsers +
                ", allowPrivilegedModeForRegularUsers=" + allowPrivilegedModeForRegularUsers +
                '}';
    }
}
