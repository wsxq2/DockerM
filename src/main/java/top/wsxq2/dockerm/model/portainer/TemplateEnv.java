package top.wsxq2.dockerm.model.portainer;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class TemplateEnv {
    private final String name;
    private final String label;
    private final String description;
    @SerializedName("default")
    private final String Default;
    private final boolean preset;
    private final TemplateEnvSelect[] select;

    public TemplateEnv(String name, String label, String description, String aDefault, boolean preset,
                       TemplateEnvSelect[] select) {
        this.name = name;
        this.label = label;
        this.description = description;
        Default = aDefault;
        this.preset = preset;
        this.select = select;
    }

    public String getName() {
        return name;
    }

    public String getLabel() {
        return label;
    }

    public String getDescription() {
        return description;
    }

    public String getDefault() {
        return Default;
    }

    public boolean isPreset() {
        return preset;
    }

    public TemplateEnvSelect[] getSelect() {
        return select;
    }

    @Override
    public String toString() {
        return "TemplateEnv{" +
                "name='" + name + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                ", Default='" + Default + '\'' +
                ", preset=" + preset +
                ", select=" + Arrays.toString(select) +
                '}';
    }
}
