package top.wsxq2.dockerm.model.portainer;

public class LDAPGroupSearchSetting {
    private final String groupBaseDN;
    private final String groupFilter;
    private final String groupAttribute;

    public LDAPGroupSearchSetting(String groupBaseDN, String groupFilter, String groupAttribute) {
        this.groupBaseDN = groupBaseDN;
        this.groupFilter = groupFilter;
        this.groupAttribute = groupAttribute;
    }

    public String getGroupBaseDN() {
        return groupBaseDN;
    }

    public String getGroupFilter() {
        return groupFilter;
    }

    public String getGroupAttribute() {
        return groupAttribute;
    }

    @Override
    public String toString() {
        return "LDAPGroupSearchSetting{" +
                "groupBaseDN='" + groupBaseDN + '\'' +
                ", groupFilter='" + groupFilter + '\'' +
                ", groupAttribute='" + groupAttribute + '\'' +
                '}';
    }
}
