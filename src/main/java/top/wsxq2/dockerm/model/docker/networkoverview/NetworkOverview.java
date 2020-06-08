
package top.wsxq2.dockerm.model.docker.networkoverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import top.wsxq2.dockerm.model.portainer.Portainer;

public class NetworkOverview {

    @SerializedName("Attachable")
    @Expose
    private Boolean attachable;
    @SerializedName("ConfigFrom")
    @Expose
    private ConfigFrom configFrom;
    @SerializedName("ConfigOnly")
    @Expose
    private Boolean configOnly;
    @SerializedName("Containers")
    @Expose
    private Containers containers;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("EnableIPv6")
    @Expose
    private Boolean enableIPv6;
    @SerializedName("IPAM")
    @Expose
    private Ipam ipam;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Ingress")
    @Expose
    private Boolean ingress;
    @SerializedName("Internal")
    @Expose
    private Boolean internal;
    @SerializedName("Labels")
    @Expose
    private Labels labels;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Options")
    @Expose
    private Options options;
    @SerializedName("Portainer")
    @Expose
    private Portainer portainer;
    @SerializedName("Scope")
    @Expose
    private String scope;

    /**
     * No args constructor for use in serialization
     */
    public NetworkOverview() {
    }

    /**
     * @param portainer
     * @param ipam
     * @param internal
     * @param configOnly
     * @param configFrom
     * @param created
     * @param attachable
     * @param labels
     * @param ingress
     * @param driver
     * @param scope
     * @param name
     * @param options
     * @param enableIPv6
     * @param containers
     * @param id
     */
    public NetworkOverview(Boolean attachable, ConfigFrom configFrom, Boolean configOnly, Containers containers,
                           String created, String driver, Boolean enableIPv6, Ipam ipam, String id, Boolean ingress,
                           Boolean internal, Labels labels, String name, Options options, Portainer portainer,
                           String scope) {
        super();
        this.attachable = attachable;
        this.configFrom = configFrom;
        this.configOnly = configOnly;
        this.containers = containers;
        this.created = created;
        this.driver = driver;
        this.enableIPv6 = enableIPv6;
        this.ipam = ipam;
        this.id = id;
        this.ingress = ingress;
        this.internal = internal;
        this.labels = labels;
        this.name = name;
        this.options = options;
        this.portainer = portainer;
        this.scope = scope;
    }

    public Boolean getAttachable() {
        return attachable;
    }

    public ConfigFrom getConfigFrom() {
        return configFrom;
    }

    public Boolean getConfigOnly() {
        return configOnly;
    }

    public Containers getContainers() {
        return containers;
    }

    public String getCreated() {
        return created;
    }

    public String getDriver() {
        return driver;
    }

    public Boolean getEnableIPv6() {
        return enableIPv6;
    }

    public Ipam getIpam() {
        return ipam;
    }

    public String getId() {
        return id;
    }

    public Boolean getIngress() {
        return ingress;
    }

    public Boolean getInternal() {
        return internal;
    }

    public Labels getLabels() {
        return labels;
    }

    public String getName() {
        return name;
    }

    public Options getOptions() {
        return options;
    }

    public Portainer getPortainer() {
        return portainer;
    }

    public String getScope() {
        return scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NetworkOverview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attachable");
        sb.append('=');
        sb.append(((this.attachable == null) ? "<null>" : this.attachable));
        sb.append(',');
        sb.append("configFrom");
        sb.append('=');
        sb.append(((this.configFrom == null) ? "<null>" : this.configFrom));
        sb.append(',');
        sb.append("configOnly");
        sb.append('=');
        sb.append(((this.configOnly == null) ? "<null>" : this.configOnly));
        sb.append(',');
        sb.append("containers");
        sb.append('=');
        sb.append(((this.containers == null) ? "<null>" : this.containers));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null) ? "<null>" : this.created));
        sb.append(',');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null) ? "<null>" : this.driver));
        sb.append(',');
        sb.append("enableIPv6");
        sb.append('=');
        sb.append(((this.enableIPv6 == null) ? "<null>" : this.enableIPv6));
        sb.append(',');
        sb.append("ipam");
        sb.append('=');
        sb.append(((this.ipam == null) ? "<null>" : this.ipam));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("ingress");
        sb.append('=');
        sb.append(((this.ingress == null) ? "<null>" : this.ingress));
        sb.append(',');
        sb.append("internal");
        sb.append('=');
        sb.append(((this.internal == null) ? "<null>" : this.internal));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null) ? "<null>" : this.options));
        sb.append(',');
        sb.append("portainer");
        sb.append('=');
        sb.append(((this.portainer == null) ? "<null>" : this.portainer));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null) ? "<null>" : this.scope));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
