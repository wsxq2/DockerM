
package top.wsxq2.dockerm.model.docker.image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Config {

    @SerializedName("Image")
    @Expose
    private String image;
    @SerializedName("NetworkDisabled")
    @Expose
    private Boolean networkDisabled;
    @SerializedName("OnBuild")
    @Expose
    private List<Object> onBuild = new ArrayList<Object>();
    @SerializedName("StdinOnce")
    @Expose
    private Boolean stdinOnce;
    @SerializedName("PublishService")
    @Expose
    private String publishService;
    @SerializedName("AttachStdin")
    @Expose
    private Boolean attachStdin;
    @SerializedName("OpenStdin")
    @Expose
    private Boolean openStdin;
    @SerializedName("Domainname")
    @Expose
    private String domainname;
    @SerializedName("AttachStdout")
    @Expose
    private Boolean attachStdout;
    @SerializedName("Tty")
    @Expose
    private Boolean tty;
    @SerializedName("Hostname")
    @Expose
    private String hostname;
    @SerializedName("Cmd")
    @Expose
    private List<String> cmd = new ArrayList<String>();
    @SerializedName("Env")
    @Expose
    private List<String> env = new ArrayList<String>();
    @SerializedName("Labels")
    @Expose
    private Labels__1 labels;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;
    @SerializedName("AttachStderr")
    @Expose
    private Boolean attachStderr;
    @SerializedName("WorkingDir")
    @Expose
    private String workingDir;
    @SerializedName("User")
    @Expose
    private String user;

    public String getImage() {
        return image;
    }

    public Boolean getNetworkDisabled() {
        return networkDisabled;
    }

    public List<Object> getOnBuild() {
        return onBuild;
    }

    public Boolean getStdinOnce() {
        return stdinOnce;
    }

    public String getPublishService() {
        return publishService;
    }

    public Boolean getAttachStdin() {
        return attachStdin;
    }

    public Boolean getOpenStdin() {
        return openStdin;
    }

    public String getDomainname() {
        return domainname;
    }

    public Boolean getAttachStdout() {
        return attachStdout;
    }

    public Boolean getTty() {
        return tty;
    }

    public String getHostname() {
        return hostname;
    }

    public List<String> getCmd() {
        return cmd;
    }

    public List<String> getEnv() {
        return env;
    }

    public Labels__1 getLabels() {
        return labels;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public Boolean getAttachStderr() {
        return attachStderr;
    }

    public String getWorkingDir() {
        return workingDir;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("image");
        sb.append('=');
        sb.append(((this.image == null) ? "<null>" : this.image));
        sb.append(',');
        sb.append("networkDisabled");
        sb.append('=');
        sb.append(((this.networkDisabled == null) ? "<null>" : this.networkDisabled));
        sb.append(',');
        sb.append("onBuild");
        sb.append('=');
        sb.append(((this.onBuild == null) ? "<null>" : this.onBuild));
        sb.append(',');
        sb.append("stdinOnce");
        sb.append('=');
        sb.append(((this.stdinOnce == null) ? "<null>" : this.stdinOnce));
        sb.append(',');
        sb.append("publishService");
        sb.append('=');
        sb.append(((this.publishService == null) ? "<null>" : this.publishService));
        sb.append(',');
        sb.append("attachStdin");
        sb.append('=');
        sb.append(((this.attachStdin == null) ? "<null>" : this.attachStdin));
        sb.append(',');
        sb.append("openStdin");
        sb.append('=');
        sb.append(((this.openStdin == null) ? "<null>" : this.openStdin));
        sb.append(',');
        sb.append("domainname");
        sb.append('=');
        sb.append(((this.domainname == null) ? "<null>" : this.domainname));
        sb.append(',');
        sb.append("attachStdout");
        sb.append('=');
        sb.append(((this.attachStdout == null) ? "<null>" : this.attachStdout));
        sb.append(',');
        sb.append("tty");
        sb.append('=');
        sb.append(((this.tty == null) ? "<null>" : this.tty));
        sb.append(',');
        sb.append("hostname");
        sb.append('=');
        sb.append(((this.hostname == null) ? "<null>" : this.hostname));
        sb.append(',');
        sb.append("cmd");
        sb.append('=');
        sb.append(((this.cmd == null) ? "<null>" : this.cmd));
        sb.append(',');
        sb.append("env");
        sb.append('=');
        sb.append(((this.env == null) ? "<null>" : this.env));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
        sb.append("macAddress");
        sb.append('=');
        sb.append(((this.macAddress == null) ? "<null>" : this.macAddress));
        sb.append(',');
        sb.append("attachStderr");
        sb.append('=');
        sb.append(((this.attachStderr == null) ? "<null>" : this.attachStderr));
        sb.append(',');
        sb.append("workingDir");
        sb.append('=');
        sb.append(((this.workingDir == null) ? "<null>" : this.workingDir));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null) ? "<null>" : this.user));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
