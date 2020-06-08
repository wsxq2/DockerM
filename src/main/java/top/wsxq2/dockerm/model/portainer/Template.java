package top.wsxq2.dockerm.model.portainer;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Template extends DataItem {
    @SerializedName("type")
    @Expose
    private final int type;
    @SerializedName("title")
    @Expose
    private final String title;
    @SerializedName("description")
    @Expose
    private final String description;
    @SerializedName("administrator_only")
    @Expose
    private final boolean administrator_only;
    @SerializedName("image")
    @Expose
    private final String image;
    @SerializedName("repository")
    @Expose
    private final TemplateRepository repository;
    @SerializedName("name")
    @Expose
    private final String name;
    @SerializedName("logo")
    @Expose
    private final String logo;
    @SerializedName("env")
    @Expose
    private final TemplateEnv[] env;
    @SerializedName("note")
    @Expose
    private final String note;
    @SerializedName("platform")
    @Expose
    private final String platform;
    @SerializedName("categories")
    @Expose
    private final String[] categories;
    @SerializedName("registry")
    @Expose
    private final String registry;
    @SerializedName("command")
    @Expose
    private final String command;
    @SerializedName("network")
    @Expose
    private final String network;
    @SerializedName("volumes")
    @Expose
    private final TemplateVolume[] volumes;
    @SerializedName("ports")
    @Expose
    private final String[] ports;
    @SerializedName("labels")
    @Expose
    private final Pair[] labels;
    @SerializedName("privileged")
    @Expose
    private final boolean privileged;
    @SerializedName("interactive")
    @Expose
    private final boolean interactive;
    @SerializedName("restart_policy")
    @Expose
    private final String restart_policy;
    @SerializedName("hostname")
    @Expose
    private final String hostname;

    public Template(int id, int type, String title, String description, boolean administrator_only, String image,
                    TemplateRepository repository, String name, String logo, TemplateEnv[] env, String note,
                    String platform, String[] categories, String registry, String command, String network,
                    TemplateVolume[] volumes, String[] ports, Pair[] labels, boolean privileged, boolean interactive,
                    String restart_policy, String hostname) {
        super(id);
        this.type = type;
        this.title = title;
        this.description = description;
        this.administrator_only = administrator_only;
        this.image = image;
        this.repository = repository;
        this.name = name;
        this.logo = logo;
        this.env = env;
        this.note = note;
        this.platform = platform;
        this.categories = categories;
        this.registry = registry;
        this.command = command;
        this.network = network;
        this.volumes = volumes;
        this.ports = ports;
        this.labels = labels;
        this.privileged = privileged;
        this.interactive = interactive;
        this.restart_policy = restart_policy;
        this.hostname = hostname;
    }

    public int getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isAdministrator_only() {
        return administrator_only;
    }

    public String getImage() {
        return image;
    }

    public TemplateRepository getRepository() {
        return repository;
    }

    public String getName() {
        return name;
    }

    public String getLogo() {
        return logo;
    }

    public TemplateEnv[] getEnv() {
        return env;
    }

    public String getNote() {
        return note;
    }

    public String getPlatform() {
        return platform;
    }

    public String[] getCategories() {
        return categories;
    }

    public String getRegistry() {
        return registry;
    }

    public String getCommand() {
        return command;
    }

    public String getNetwork() {
        return network;
    }

    public TemplateVolume[] getVolumes() {
        return volumes;
    }

    public String[] getPorts() {
        return ports;
    }

    public Pair[] getLabels() {
        return labels;
    }

    public boolean isPrivileged() {
        return privileged;
    }

    public boolean isInteractive() {
        return interactive;
    }

    public String getRestart_policy() {
        return restart_policy;
    }

    public String getHostname() {
        return hostname;
    }

    @Override
    public String toString() {
        return "Template{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", administrator_only=" + administrator_only +
                ", image='" + image + '\'' +
                ", repository=" + repository +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", env=" + Arrays.toString(env) +
                ", note='" + note + '\'' +
                ", platform='" + platform + '\'' +
                ", categories=" + Arrays.toString(categories) +
                ", registry='" + registry + '\'' +
                ", command='" + command + '\'' +
                ", network='" + network + '\'' +
                ", volumes=" + Arrays.toString(volumes) +
                ", ports=" + Arrays.toString(ports) +
                ", labels=" + Arrays.toString(labels) +
                ", privileged=" + privileged +
                ", interactive=" + interactive +
                ", restart_policy='" + restart_policy + '\'' +
                ", hostname='" + hostname + '\'' +
                ", id=" + getId() +
                '}';
    }

}
