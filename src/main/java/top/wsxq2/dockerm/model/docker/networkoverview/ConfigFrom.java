
package top.wsxq2.dockerm.model.docker.networkoverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ConfigFrom {

    @SerializedName("Network")
    @Expose
    private String network;

    /**
     * No args constructor for use in serialization
     */
    public ConfigFrom() {
    }

    /**
     * @param network
     */
    public ConfigFrom(String network) {
        super();
        this.network = network;
    }

    public String getNetwork() {
        return network;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ConfigFrom.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("network");
        sb.append('=');
        sb.append(((this.network == null) ? "<null>" : this.network));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
