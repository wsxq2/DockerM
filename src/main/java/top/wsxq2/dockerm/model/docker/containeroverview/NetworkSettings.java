
package top.wsxq2.dockerm.model.docker.containeroverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import top.wsxq2.dockerm.model.docker.container.NetworkSettingsNetwork;

import java.util.Map;

public class NetworkSettings {

    @SerializedName("Networks")
    @Expose
    private Map<String, NetworkSettingsNetwork> networks;

    /**
     * No args constructor for use in serialization
     */
    public NetworkSettings() {
    }

    /**
     * @param networks
     */
    public NetworkSettings(Map<String, NetworkSettingsNetwork> networks) {
        super();
        this.networks = networks;
    }

    public Map<String, NetworkSettingsNetwork> getNetworks() {
        return networks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NetworkSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("networks");
        sb.append('=');
        sb.append(((this.networks == null) ? "<null>" : this.networks));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
