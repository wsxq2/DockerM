
package top.wsxq2.dockerm.model.docker.containeroverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HostConfig {

    @SerializedName("NetworkMode")
    @Expose
    private String networkMode;

    /**
     * No args constructor for use in serialization
     */
    public HostConfig() {
    }

    /**
     * @param networkMode
     */
    public HostConfig(String networkMode) {
        super();
        this.networkMode = networkMode;
    }

    public String getNetworkMode() {
        return networkMode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(HostConfig.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("networkMode");
        sb.append('=');
        sb.append(((this.networkMode == null) ? "<null>" : this.networkMode));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
