package top.wsxq2.dockerm.model.portainer;

public class LDAPSearchSettings {
    private final String baseDN;
    private final String filter;
    private final String usernameattribute;

    public LDAPSearchSettings(String baseDN, String filter, String usernameattribute) {
        this.baseDN = baseDN;
        this.filter = filter;
        this.usernameattribute = usernameattribute;
    }

    public String getBaseDN() {
        return baseDN;
    }

    public String getFilter() {
        return filter;
    }

    public String getUsernameattribute() {
        return usernameattribute;
    }

    @Override
    public String toString() {
        return "LDAPSearchSettings{" +
                "baseDN='" + baseDN + '\'' +
                ", filter='" + filter + '\'' +
                ", usernameattribute='" + usernameattribute + '\'' +
                '}';
    }
}
