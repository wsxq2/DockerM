
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Config {

    @SerializedName("AttachStderr")
    @Expose
    private Boolean attachStderr;
    @SerializedName("AttachStdin")
    @Expose
    private Boolean attachStdin;
    @SerializedName("AttachStdout")
    @Expose
    private Boolean attachStdout;
    @SerializedName("Cmd")
    @Expose
    private List<String> cmd = new ArrayList<String>();
    @SerializedName("Domainname")
    @Expose
    private String domainname;
    @SerializedName("Env")
    @Expose
    private List<String> env = new ArrayList<String>();
    @SerializedName("Hostname")
    @Expose
    private String hostname;
    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("Labels")
    @Expose
    private Labels labels;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;
    @SerializedName("NetworkDisabled")
    @Expose
    private Boolean networkDisabled;
    @SerializedName("OpenStdin")
    @Expose
    private Boolean openStdin;
    @SerializedName("StdinOnce")
    @Expose
    private Boolean stdinOnce;
    @SerializedName("Tty")
    @Expose
    private Boolean tty;
    @SerializedName("User")
    @Expose
    private String user;
    @SerializedName("Volumes")
    @Expose
    private Volumes volumes;
    @SerializedName("WorkingDir")
    @Expose
    private String workingDir;
    @SerializedName("StopSignal")
    @Expose
    private String stopSignal;
    @SerializedName("StopTimeout")
    @Expose
    private Integer stopTimeout;
    @SerializedName("Entrypoint")
    @Expose
    private List<String> entrypoint;

    public List<String> getEntrypoint() {
        return entrypoint;
    }

    public Boolean getAttachStderr() {
        return attachStderr;
    }

    public Boolean getAttachStdin() {
        return attachStdin;
    }

    public Boolean getAttachStdout() {
        return attachStdout;
    }

    public List<String> getCmd() {
        return cmd;
    }

    public String getDomainname() {
        return domainname;
    }

    public List<String> getEnv() {
        return env;
    }

    public String getHostname() {
        return hostname;
    }

    public String getImage() {
        return image;
    }

    public Labels getLabels() {
        return labels;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public Boolean getNetworkDisabled() {
        return networkDisabled;
    }

    public Boolean getOpenStdin() {
        return openStdin;
    }

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public Boolean getTty() {
        return tty;
    }

    public String getUser() {
        return user;
    }

    public Volumes getVolumes() {
        return volumes;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public String getStopSignal() {
        return stopSignal;
    }

    public Integer getStopTimeout() {
        return stopTimeout;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("attachStderr");
        sb.append('=');
        sb.append(((this.attachStderr == null) ? "<null>" : this.attachStderr));
        sb.append(',');
        sb.append("attachStdin");
        sb.append('=');
        sb.append(((this.attachStdin == null) ? "<null>" : this.attachStdin));
        sb.append(',');
        sb.append("attachStdout");
        sb.append('=');
        sb.append(((this.attachStdout == null) ? "<null>" : this.attachStdout));
        sb.append(',');
        sb.append("cmd");
        sb.append('=');
        sb.append(((this.cmd == null) ? "<null>" : this.cmd));
        sb.append(',');
        sb.append("domainname");
        sb.append('=');
        sb.append(((this.domainname == null) ? "<null>" : this.domainname));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null) ? "<null>" : this.env));
        sb.append(',');
        sb.append("hostname");
        sb.append('=');
        sb.append(((this.hostname == null) ? "<null>" : this.hostname));
        sb.append(',');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null) ? "<null>" : this.image));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
        sb.append("macAddress");
        sb.append('=');
        sb.append(((this.macAddress == null) ? "<null>" : this.macAddress));
        sb.append(',');
        sb.append("networkDisabled");
        sb.append('=');
        sb.append(((this.networkDisabled == null) ? "<null>" : this.networkDisabled));
        sb.append(',');
        sb.append("openStdin");
        sb.append('=');
        sb.append(((this.openStdin == null) ? "<null>" : this.openStdin));
        sb.append(',');
        sb.append("stdinOnce");
        sb.append('=');
        sb.append(((this.stdinOnce == null) ? "<null>" : this.stdinOnce));
        sb.append(',');
        sb.append("tty");
        sb.append('=');
        sb.append(((this.tty == null) ? "<null>" : this.tty));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null) ? "<null>" : this.user));
        sb.append(',');
        sb.append("volumes");
        sb.append('=');
        sb.append(((this.volumes == null) ? "<null>" : this.volumes));
        sb.append(',');
        sb.append("workingDir");
        sb.append('=');
        sb.append(((this.workingDir == null) ? "<null>" : this.workingDir));
        sb.append(',');
        sb.append("stopSignal");
        sb.append('=');
        sb.append(((this.stopSignal == null) ? "<null>" : this.stopSignal));
        sb.append(',');
        sb.append("stopTimeout");
        sb.append('=');
        sb.append(((this.stopTimeout == null) ? "<null>" : this.stopTimeout));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
