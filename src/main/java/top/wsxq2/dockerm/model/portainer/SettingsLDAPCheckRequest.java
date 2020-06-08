package top.wsxq2.dockerm.model.portainer;

public class SettingsLDAPCheckRequest {
    private final LDAPSettings LDAPSettings;

    public SettingsLDAPCheckRequest(top.wsxq2.dockerm.model.portainer.LDAPSettings LDAPSettings) {
        this.LDAPSettings = LDAPSettings;
    }

    public top.wsxq2.dockerm.model.portainer.LDAPSettings getLDAPSettings() {
        return LDAPSettings;
    }

    @Override
    public String toString() {
        return "SettingsLDAPCheckRequest{" +
                "LDAPSettings=" + LDAPSettings +
                '}';
    }

}
