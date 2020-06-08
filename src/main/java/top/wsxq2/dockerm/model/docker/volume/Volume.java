
package top.wsxq2.dockerm.model.docker.volume;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Volume {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("Mountpoint")
    @Expose
    private String mountpoint;
    @SerializedName("Status")
    @Expose
    private Map<String, String> status;
    @SerializedName("Labels")
    @Expose
    private Map<String, String> labels;
    @SerializedName("Scope")
    @Expose
    private String scope;
    @SerializedName("CreatedAt")
    @Expose
    private String createdAt;
    @SerializedName("Options")
    @Expose
    private Map<String, String> options;

    public String getCreatedAt() {
        return createdAt;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public String getName() {
        return name;
    }

    public String getDriver() {
        return driver;
    }

    public String getMountpoint() {
        return mountpoint;
    }

    public Object getStatus() {
        return status;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    public String getScope() {
        return scope;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Volume.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null) ? "<null>" : this.driver));
        sb.append(',');
        sb.append("mountpoint");
        sb.append('=');
        sb.append(((this.mountpoint == null) ? "<null>" : this.mountpoint));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null) ? "<null>" : this.status));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
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
