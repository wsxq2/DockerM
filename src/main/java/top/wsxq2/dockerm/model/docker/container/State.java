
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class State {

    @SerializedName("Error")
    @Expose
    private String error;
    @SerializedName("ExitCode")
    @Expose
    private Integer exitCode;
    @SerializedName("FinishedAt")
    @Expose
    private String finishedAt;
    @SerializedName("OOMKilled")
    @Expose
    private Boolean oOMKilled;
    @SerializedName("Dead")
    @Expose
    private Boolean dead;
    @SerializedName("Paused")
    @Expose
    private Boolean paused;
    @SerializedName("Pid")
    @Expose
    private Integer pid;
    @SerializedName("Restarting")
    @Expose
    private Boolean restarting;
    @SerializedName("Running")
    @Expose
    private Boolean running;
    @SerializedName("StartedAt")
    @Expose
    private String startedAt;
    @SerializedName("Status")
    @Expose
    private String status;

    public String getError() {
        return error;
    }

    public Integer getExitCode() {
        return exitCode;
    }

    public String getFinishedAt() {
        return finishedAt;
    }

    public Boolean getOOMKilled() {
        return oOMKilled;
    }

    public Boolean getDead() {
        return dead;
    }

    public Boolean getPaused() {
        return paused;
    }

    public Integer getPid() {
        return pid;
    }

    public Boolean getRestarting() {
        return restarting;
    }

    public Boolean getRunning() {
        return running;
    }

    public String getStartedAt() {
        return startedAt;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(State.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("error");
        sb.append('=');
        sb.append(((this.error == null) ? "<null>" : this.error));
        sb.append(',');
        sb.append("exitCode");
        sb.append('=');
        sb.append(((this.exitCode == null) ? "<null>" : this.exitCode));
        sb.append(',');
        sb.append("finishedAt");
        sb.append('=');
        sb.append(((this.finishedAt == null) ? "<null>" : this.finishedAt));
        sb.append(',');
        sb.append("oOMKilled");
        sb.append('=');
        sb.append(((this.oOMKilled == null) ? "<null>" : this.oOMKilled));
        sb.append(',');
        sb.append("dead");
        sb.append('=');
        sb.append(((this.dead == null) ? "<null>" : this.dead));
        sb.append(',');
        sb.append("paused");
        sb.append('=');
        sb.append(((this.paused == null) ? "<null>" : this.paused));
        sb.append(',');
        sb.append("pid");
        sb.append('=');
        sb.append(((this.pid == null) ? "<null>" : this.pid));
        sb.append(',');
        sb.append("restarting");
        sb.append('=');
        sb.append(((this.restarting == null) ? "<null>" : this.restarting));
        sb.append(',');
        sb.append("running");
        sb.append('=');
        sb.append(((this.running == null) ? "<null>" : this.running));
        sb.append(',');
        sb.append("startedAt");
        sb.append('=');
        sb.append(((this.startedAt == null) ? "<null>" : this.startedAt));
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
