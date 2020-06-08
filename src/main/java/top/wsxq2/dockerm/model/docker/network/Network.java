
package top.wsxq2.dockerm.model.docker.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import top.wsxq2.dockerm.model.portainer.Portainer;

import java.util.Map;

public class Network {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Scope")
    @Expose
    private String scope;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("EnableIPv6")
    @Expose
    private Boolean enableIPv6;
    @SerializedName("IPAM")
    @Expose
    private Ipam ipam;
    @SerializedName("Internal")
    @Expose
    private Boolean internal;
    @SerializedName("Attachable")
    @Expose
    private Boolean attachable;
    @SerializedName("Ingress")
    @Expose
    private Boolean ingress;
    @SerializedName("Containers")
    @Expose
    private Map<String, Object> containers;
    @SerializedName("Options")
    @Expose
    private Map<String, String> options;
    @SerializedName("Labels")
    @Expose
    private Map<String, String> labels;
    @SerializedName("Portainer")
    @Expose
    private Portainer portainer;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getCreated() {
        return created;
    }

    public String getScope() {
        return scope;
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

    public Boolean getInternal() {
        return internal;
    }

    public Boolean getAttachable() {
        return attachable;
    }

    public Boolean getIngress() {
        return ingress;
    }

    public Map<String, Object> getContainers() {
        return containers;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    public Map<String, String> getLabels() {
        return labels;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Network.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null) ? "<null>" : this.created));
        sb.append(',');
        sb.append("scope");
        sb.append('=');
        sb.append(((this.scope == null) ? "<null>" : this.scope));
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
        sb.append("internal");
        sb.append('=');
        sb.append(((this.internal == null) ? "<null>" : this.internal));
        sb.append(',');
        sb.append("attachable");
        sb.append('=');
        sb.append(((this.attachable == null) ? "<null>" : this.attachable));
        sb.append(',');
        sb.append("ingress");
        sb.append('=');
        sb.append(((this.ingress == null) ? "<null>" : this.ingress));
        sb.append(',');
        sb.append("containers");
        sb.append('=');
        sb.append(((this.containers == null) ? "<null>" : this.containers));
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null) ? "<null>" : this.options));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
