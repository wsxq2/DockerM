
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sysctls {

    @SerializedName("net.ipv4.ip_forward")
    @Expose
    private String netIpv4IpForward;

    public String getNetIpv4IpForward() {
        return netIpv4IpForward;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Sysctls.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("netIpv4IpForward");
        sb.append('=');
        sb.append(((this.netIpv4IpForward == null) ? "<null>" : this.netIpv4IpForward));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
