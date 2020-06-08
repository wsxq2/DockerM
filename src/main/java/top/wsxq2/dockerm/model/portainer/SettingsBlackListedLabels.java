package top.wsxq2.dockerm.model.portainer;

public class SettingsBlackListedLabels {
    private final String name;
    private final String value;

    public SettingsBlackListedLabels(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "SettingsBlackListedLabels{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
