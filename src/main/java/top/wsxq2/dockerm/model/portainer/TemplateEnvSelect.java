package top.wsxq2.dockerm.model.portainer;

public class TemplateEnvSelect {
    private final String text;
    private final String value;
    private final boolean Default;

    public TemplateEnvSelect(String text, String value, boolean aDefault) {
        this.text = text;
        this.value = value;
        Default = aDefault;
    }

    public String getText() {
        return text;
    }

    public String getValue() {
        return value;
    }

    public boolean isDefault() {
        return Default;
    }

    @Override
    public String toString() {
        return "TemplateEnvSelect{" +
                "text='" + text + '\'' +
                ", value='" + value + '\'' +
                ", Default=" + Default +
                '}';
    }
}
