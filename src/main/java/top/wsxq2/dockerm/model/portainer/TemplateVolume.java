package top.wsxq2.dockerm.model.portainer;

public class TemplateVolume {
    private final String container;
    private final String bind;
    private final boolean readonly;

    public TemplateVolume(String container, String bind, boolean readonly) {
        this.container = container;
        this.bind = bind;
        this.readonly = readonly;
    }

    public String getContainer() {
        return container;
    }

    public String getBind() {
        return bind;
    }

    public boolean isReadonly() {
        return readonly;
    }

    @Override
    public String toString() {
        return "TemplateVolume{" +
                "container='" + container + '\'' +
                ", bind='" + bind + '\'' +
                ", readonly=" + readonly +
                '}';
    }

}
