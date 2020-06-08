
package top.wsxq2.dockerm.model.docker.volumeoverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import top.wsxq2.dockerm.model.portainer.Portainer;

public class VolumeOverview {

    @SerializedName("CreatedAt")
    @Expose
    private String createdAt;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("Labels")
    @Expose
    private Object labels;
    @SerializedName("Mountpoint")
    @Expose
    private String mountpoint;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Options")
    @Expose
    private Object options;
    @SerializedName("Portainer")
    @Expose
    private Portainer portainer;
    @SerializedName("Scope")
    @Expose
    private String scope;

    /**
     * No args constructor for use in serialization
     */
    public VolumeOverview() {
    }

    /**
     * @param createdAt
     * @param portainer
     * @param driver
     * @param scope
     * @param name
     * @param options
     * @param labels
     * @param mountpoint
     */
    public VolumeOverview(String createdAt, String driver, Object labels, String mountpoint, String name,
                          Object options, Portainer portainer, String scope) {
        super();
        this.createdAt = createdAt;
        this.driver = driver;
        this.labels = labels;
        this.mountpoint = mountpoint;
        this.name = name;
        this.options = options;
        this.portainer = portainer;
        this.scope = scope;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getDriver() {
        return driver;
    }

    public Object getLabels() {
        return labels;
    }

    public String getMountpoint() {
        return mountpoint;
    }

    public String getName() {
        return name;
    }

    public Object getOptions() {
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
        sb.append(VolumeOverview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null) ? "<null>" : this.createdAt));
        sb.append(',');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null) ? "<null>" : this.driver));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
        sb.append("mountpoint");
        sb.append('=');
        sb.append(((this.mountpoint == null) ? "<null>" : this.mountpoint));
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
