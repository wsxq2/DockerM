
package top.wsxq2.dockerm.model.docker.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Config {

    @SerializedName("Subnet")
    @Expose
    private String subnet;
    @SerializedName("Gateway")
    @Expose
    private String gateway;

    public String getSubnet() {
        return subnet;
    }

    public String getGateway() {
        return gateway;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Config.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("subnet");
        sb.append('=');
        sb.append(((this.subnet == null) ? "<null>" : this.subnet));
        sb.append(',');
        sb.append("gateway");
        sb.append('=');
        sb.append(((this.gateway == null) ? "<null>" : this.gateway));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
