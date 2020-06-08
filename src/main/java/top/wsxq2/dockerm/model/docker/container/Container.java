
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Container {

    @SerializedName("AppArmorProfile")
    @Expose
    private String appArmorProfile;
    @SerializedName("Args")
    @Expose
    private List<String> args = new ArrayList<String>();
    @SerializedName("Config")
    @Expose
    private Config config;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("HostConfig")
    @Expose
    private HostConfig hostConfig;
    @SerializedName("HostnamePath")
    @Expose
    private String hostnamePath;
    @SerializedName("HostsPath")
    @Expose
    private String hostsPath;
    @SerializedName("LogPath")
    @Expose
    private String logPath;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("MountLabel")
    @Expose
    private String mountLabel;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("NetworkSettings")
    @Expose
    private NetworkSettings networkSettings;
    @SerializedName("Path")
    @Expose
    private String path;
    @SerializedName("ProcessLabel")
    @Expose
    private String processLabel;
    @SerializedName("ResolvConfPath")
    @Expose
    private String resolvConfPath;
    @SerializedName("RestartCount")
    @Expose
    private Integer restartCount;
    @SerializedName("State")
    @Expose
    private State state;
    @SerializedName("Mounts")
    @Expose
    private List<Mount> mounts = new ArrayList<>();
    @SerializedName("Ports")
    @Expose
    private List<Port> ports = new ArrayList<>();

    public String getAppArmorProfile() {
        return appArmorProfile;
    }

    public List<String> getArgs() {
        return args;
    }

    public Config getConfig() {
        return config;
    }

    public String getCreated() {
        return created;
    }

    public String getDriver() {
        return driver;
    }

    public HostConfig getHostConfig() {
        return hostConfig;
    }

    public String getHostnamePath() {
        return hostnamePath;
    }

    public String getHostsPath() {
        return hostsPath;
    }

    public String getLogPath() {
        return logPath;
    }

    public String getId() {
        return id;
    }

    public String getImage() {
        return image;
    }

    public String getMountLabel() {
        return mountLabel;
    }

    public String getName() {
        return name;
    }

    public NetworkSettings getNetworkSettings() {
        return networkSettings;
    }

    public String getPath() {
        return path;
    }

    public String getProcessLabel() {
        return processLabel;
    }

    public String getResolvConfPath() {
        return resolvConfPath;
    }

    public Integer getRestartCount() {
        return restartCount;
    }

    public State getState() {
        return state;
    }

    public List<Mount> getMounts() {
        return mounts;
    }

    public List<Port> getPorts() {
        return ports;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Container.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("appArmorProfile");
        sb.append('=');
        sb.append(((this.appArmorProfile == null) ? "<null>" : this.appArmorProfile));
        sb.append(',');
        sb.append("args");
        sb.append('=');
        sb.append(((this.args == null) ? "<null>" : this.args));
        sb.append(',');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null) ? "<null>" : this.config));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null) ? "<null>" : this.created));
        sb.append(',');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null) ? "<null>" : this.driver));
        sb.append(',');
        sb.append("hostConfig");
        sb.append('=');
        sb.append(((this.hostConfig == null) ? "<null>" : this.hostConfig));
        sb.append(',');
        sb.append("hostnamePath");
        sb.append('=');
        sb.append(((this.hostnamePath == null) ? "<null>" : this.hostnamePath));
        sb.append(',');
        sb.append("hostsPath");
        sb.append('=');
        sb.append(((this.hostsPath == null) ? "<null>" : this.hostsPath));
        sb.append(',');
        sb.append("logPath");
        sb.append('=');
        sb.append(((this.logPath == null) ? "<null>" : this.logPath));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null) ? "<null>" : this.image));
        sb.append(',');
        sb.append("mountLabel");
        sb.append('=');
        sb.append(((this.mountLabel == null) ? "<null>" : this.mountLabel));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("networkSettings");
        sb.append('=');
        sb.append(((this.networkSettings == null) ? "<null>" : this.networkSettings));
        sb.append(',');
        sb.append("path");
        sb.append('=');
        sb.append(((this.path == null) ? "<null>" : this.path));
        sb.append(',');
        sb.append("processLabel");
        sb.append('=');
        sb.append(((this.processLabel == null) ? "<null>" : this.processLabel));
        sb.append(',');
        sb.append("resolvConfPath");
        sb.append('=');
        sb.append(((this.resolvConfPath == null) ? "<null>" : this.resolvConfPath));
        sb.append(',');
        sb.append("restartCount");
        sb.append('=');
        sb.append(((this.restartCount == null) ? "<null>" : this.restartCount));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null) ? "<null>" : this.state));
        sb.append(',');
        sb.append("mounts");
        sb.append('=');
        sb.append(((this.mounts == null) ? "<null>" : this.mounts));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
