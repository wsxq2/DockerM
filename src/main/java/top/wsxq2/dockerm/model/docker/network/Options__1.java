
package top.wsxq2.dockerm.model.docker.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Options__1 {

    @SerializedName("com.docker.network.bridge.default_bridge")
    @Expose
    private String comDockerNetworkBridgeDefaultBridge;
    @SerializedName("com.docker.network.bridge.enable_icc")
    @Expose
    private String comDockerNetworkBridgeEnableIcc;
    @SerializedName("com.docker.network.bridge.enable_ip_masquerade")
    @Expose
    private String comDockerNetworkBridgeEnableIpMasquerade;
    @SerializedName("com.docker.network.bridge.host_binding_ipv4")
    @Expose
    private String comDockerNetworkBridgeHostBindingIpv4;
    @SerializedName("com.docker.network.bridge.name")
    @Expose
    private String comDockerNetworkBridgeName;
    @SerializedName("com.docker.network.driver.mtu")
    @Expose
    private String comDockerNetworkDriverMtu;

    public String getComDockerNetworkBridgeDefaultBridge() {
        return comDockerNetworkBridgeDefaultBridge;
    }

    public String getComDockerNetworkBridgeEnableIcc() {
        return comDockerNetworkBridgeEnableIcc;
    }

    public String getComDockerNetworkBridgeEnableIpMasquerade() {
        return comDockerNetworkBridgeEnableIpMasquerade;
    }

    public String getComDockerNetworkBridgeHostBindingIpv4() {
        return comDockerNetworkBridgeHostBindingIpv4;
    }

    public String getComDockerNetworkBridgeName() {
        return comDockerNetworkBridgeName;
    }

    public String getComDockerNetworkDriverMtu() {
        return comDockerNetworkDriverMtu;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Options__1.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comDockerNetworkBridgeDefaultBridge");
        sb.append('=');
        sb.append(((this.comDockerNetworkBridgeDefaultBridge == null) ? "<null>" :
                this.comDockerNetworkBridgeDefaultBridge));
        sb.append(',');
        sb.append("comDockerNetworkBridgeEnableIcc");
        sb.append('=');
        sb.append(((this.comDockerNetworkBridgeEnableIcc == null) ? "<null>" : this.comDockerNetworkBridgeEnableIcc));
        sb.append(',');
        sb.append("comDockerNetworkBridgeEnableIpMasquerade");
        sb.append('=');
        sb.append(((this.comDockerNetworkBridgeEnableIpMasquerade == null) ? "<null>" :
                this.comDockerNetworkBridgeEnableIpMasquerade));
        sb.append(',');
        sb.append("comDockerNetworkBridgeHostBindingIpv4");
        sb.append('=');
        sb.append(((this.comDockerNetworkBridgeHostBindingIpv4 == null) ? "<null>" :
                this.comDockerNetworkBridgeHostBindingIpv4));
        sb.append(',');
        sb.append("comDockerNetworkBridgeName");
        sb.append('=');
        sb.append(((this.comDockerNetworkBridgeName == null) ? "<null>" : this.comDockerNetworkBridgeName));
        sb.append(',');
        sb.append("comDockerNetworkDriverMtu");
        sb.append('=');
        sb.append(((this.comDockerNetworkDriverMtu == null) ? "<null>" : this.comDockerNetworkDriverMtu));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
