package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class LDAPSettings {
    private final boolean anonymousMode;
    private final String readerDN;
    private final String password;
    private final String URL;
    private final TLSConfiguration TLSConfig;
    private final boolean startTLS;
    private final LDAPSearchSettings[] searchSettings;
    private final LDAPGroupSearchSetting[] groupSearchSettings;
    private final boolean autoCreateUsers;

    public LDAPSettings(boolean anonymousMode, String readerDN, String password, String URL,
                        TLSConfiguration TLSConfig, boolean startTLS, LDAPSearchSettings[] searchSettings,
                        LDAPGroupSearchSetting[] groupSearchSettings, boolean autoCreateUsers) {
        this.anonymousMode = anonymousMode;
        this.readerDN = readerDN;
        this.password = password;
        this.URL = URL;
        this.TLSConfig = TLSConfig;
        this.startTLS = startTLS;
        this.searchSettings = searchSettings;
        this.groupSearchSettings = groupSearchSettings;
        this.autoCreateUsers = autoCreateUsers;
    }

    public boolean isAnonymousMode() {
        return anonymousMode;
    }

    public String getReaderDN() {
        return readerDN;
    }

    public String getPassword() {
        return password;
    }

    public String getURL() {
        return URL;
    }

    public TLSConfiguration getTLSConfig() {
        return TLSConfig;
    }

    public boolean isStartTLS() {
        return startTLS;
    }

    public LDAPSearchSettings[] getSearchSettings() {
        return searchSettings;
    }

    public LDAPGroupSearchSetting[] getGroupSearchSettings() {
        return groupSearchSettings;
    }

    public boolean isAutoCreateUsers() {
        return autoCreateUsers;
    }

    @Override
    public String toString() {
        return "LDAPSettings{" +
                "anonymousMode=" + anonymousMode +
                ", readerDN='" + readerDN + '\'' +
                ", password='" + password + '\'' +
                ", URL='" + URL + '\'' +
                ", TLSConfig=" + TLSConfig +
                ", startTLS=" + startTLS +
                ", searchSettings=" + Arrays.toString(searchSettings) +
                ", groupSearchSettings=" + Arrays.toString(groupSearchSettings) +
                ", autoCreateUsers=" + autoCreateUsers +
                '}';
    }
}
