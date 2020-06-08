
package top.wsxq2.dockerm.model.docker.containeroverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import top.wsxq2.dockerm.model.docker.container.Port;
import top.wsxq2.dockerm.model.portainer.Portainer;

import java.util.ArrayList;
import java.util.List;

public class ContainerOverview {

    @SerializedName("Command")
    @Expose
    private String command;
    @SerializedName("Created")
    @Expose
    private Integer created;
    @SerializedName("HostConfig")
    @Expose
    private HostConfig hostConfig;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("ImageID")
    @Expose
    private String imageID;
    @SerializedName("Labels")
    @Expose
    private Labels labels;
    @SerializedName("Mounts")
    @Expose
    private List<Mount> mounts = new ArrayList<Mount>();
    @SerializedName("Names")
    @Expose
    private List<String> names = new ArrayList<String>();
    @SerializedName("NetworkSettings")
    @Expose
    private NetworkSettings networkSettings;
    @SerializedName("Portainer")
    @Expose
    private Portainer portainer;
    @SerializedName("Ports")
    @Expose
    private List<Port> ports = new ArrayList<Port>();
    @SerializedName("State")
    @Expose
    private String state;
    @SerializedName("Status")
    @Expose
    private String status;

    /**
     * No args constructor for use in serialization
     */
    public ContainerOverview() {
    }

    /**
     * @param image
     * @param networkSettings
     * @param portainer
     * @param imageID
     * @param created
     * @param mounts
     * @param hostConfig
     * @param ports
     * @param command
     * @param labels
     * @param names
     * @param id
     * @param state
     * @param status
     */
    public ContainerOverview(String command, Integer created, HostConfig hostConfig, String id, String image,
                             String imageID, Labels labels, List<Mount> mounts, List<String> names,
                             NetworkSettings networkSettings, Portainer portainer, List<Port> ports, String state,
                             String status) {
        super();
        this.command = command;
        this.created = created;
        this.hostConfig = hostConfig;
        this.id = id;
        this.image = image;
        this.imageID = imageID;
        this.labels = labels;
        this.mounts = mounts;
        this.names = names;
        this.networkSettings = networkSettings;
        this.portainer = portainer;
        this.ports = ports;
        this.state = state;
        this.status = status;
    }

    public String getCommand() {
        return command;
    }

    public Integer getCreated() {
        return created;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getImageID() {
        return imageID;
    }

    public Labels getLabels() {
        return labels;
    }

    public List<Mount> getMounts() {
        return mounts;
    }

    public List<String> getNames() {
        return names;
    }

    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public Portainer getPortainer() {
        return portainer;
    }

    public List<Port> getPorts() {
        return ports;
    }

    public String getState() {
        return state;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ContainerOverview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("command");
        sb.append('=');
        sb.append(((this.command == null) ? "<null>" : this.command));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null) ? "<null>" : this.created));
        sb.append(',');
        sb.append("hostConfig");
        sb.append('=');
        sb.append(((this.hostConfig == null) ? "<null>" : this.hostConfig));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null) ? "<null>" : this.image));
        sb.append(',');
        sb.append("imageID");
        sb.append('=');
        sb.append(((this.imageID == null) ? "<null>" : this.imageID));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
        sb.append("mounts");
        sb.append('=');
        sb.append(((this.mounts == null) ? "<null>" : this.mounts));
        sb.append(',');
        sb.append("names");
        sb.append('=');
        sb.append(((this.names == null) ? "<null>" : this.names));
        sb.append(',');
        sb.append("networkSettings");
        sb.append('=');
        sb.append(((this.networkSettings == null) ? "<null>" : this.networkSettings));
        sb.append(',');
        sb.append("portainer");
        sb.append('=');
        sb.append(((this.portainer == null) ? "<null>" : this.portainer));
        sb.append(',');
        sb.append("ports");
        sb.append('=');
        sb.append(((this.ports == null) ? "<null>" : this.ports));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null) ? "<null>" : this.state));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null) ? "<null>" : this.status));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
