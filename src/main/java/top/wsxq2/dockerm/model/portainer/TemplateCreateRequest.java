package top.wsxq2.dockerm.model.portainer;

import java.util.Arrays;

public class TemplateCreateRequest {
    private final int type;
    private final String title;
    private final String description;
    private final boolean administrator_only;
    private final String image;
    private final TemplateRepository repository;
    private final String name;
    private final String logo;
    private final TemplateEnv env;
    private final String note;
    private final String platform;
    private final String[] categories;
    private final String registry;
    private final String command;
    private final String network;
    private final TemplateVolume[] volumes;
    private final String[] ports;
    private final Pair[] labels;
    private final boolean privileged;
    private final boolean interactive;
    private final String restart_policy;
    private final String hostname;

    public TemplateCreateRequest(int type, String title, String description, boolean administrator_only, String image
            , TemplateRepository repository, String name, String logo, TemplateEnv env, String note, String platform,
                                 String[] categories, String registry, String command, String network,
                                 TemplateVolume[] volumes, String[] ports, Pair[] labels, boolean privileged,
                                 boolean interactive, String restart_policy, String hostname) {
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

    public TemplateEnv getEnv() {
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
        return "TemplateCreateRequest{" +
                "type=" + type +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", administrator_only=" + administrator_only +
                ", image='" + image + '\'' +
                ", repository=" + repository +
                ", name='" + name + '\'' +
                ", logo='" + logo + '\'' +
                ", env=" + env +
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
                '}';
    }


}
