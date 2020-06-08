
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NetworkSettingsNetwork {

    @SerializedName("NetworkID")
    @Expose
    private String networkID;
    @SerializedName("EndpointID")
    @Expose
    private String endpointID;
    @SerializedName("Gateway")
    @Expose
    private String gateway;
    @SerializedName("IPAddress")
    @Expose
    private String iPAddress;
    @SerializedName("IPPrefixLen")
    @Expose
    private Integer iPPrefixLen;
    @SerializedName("IPv6Gateway")
    @Expose
    private String iPv6Gateway;
    @SerializedName("GlobalIPv6Address")
    @Expose
    private String globalIPv6Address;
    @SerializedName("GlobalIPv6PrefixLen")
    @Expose
    private Integer globalIPv6PrefixLen;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;
    @Expose(serialize = false, deserialize = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNetworkID() {
        return networkID;
    }

    public String getEndpointID() {
        return endpointID;
    }

    public String getGateway() {
        return gateway;
    }

    public String getIPAddress() {
        return iPAddress;
    }

    public Integer getIPPrefixLen() {
        return iPPrefixLen;
    }

    public String getIPv6Gateway() {
        return iPv6Gateway;
    }

    public String getGlobalIPv6Address() {
        return globalIPv6Address;
    }

    public Integer getGlobalIPv6PrefixLen() {
        return globalIPv6PrefixLen;
    }

    public String getMacAddress() {
        return macAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NetworkSettingsNetwork.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("networkID");
        sb.append('=');
        sb.append(((this.networkID == null) ? "<null>" : this.networkID));
        sb.append(',');
        sb.append("endpointID");
        sb.append('=');
        sb.append(((this.endpointID == null) ? "<null>" : this.endpointID));
        sb.append(',');
        sb.append("gateway");
        sb.append('=');
        sb.append(((this.gateway == null) ? "<null>" : this.gateway));
        sb.append(',');
        sb.append("iPAddress");
        sb.append('=');
        sb.append(((this.iPAddress == null) ? "<null>" : this.iPAddress));
        sb.append(',');
        sb.append("iPPrefixLen");
        sb.append('=');
        sb.append(((this.iPPrefixLen == null) ? "<null>" : this.iPPrefixLen));
        sb.append(',');
        sb.append("iPv6Gateway");
        sb.append('=');
        sb.append(((this.iPv6Gateway == null) ? "<null>" : this.iPv6Gateway));
        sb.append(',');
        sb.append("globalIPv6Address");
        sb.append('=');
        sb.append(((this.globalIPv6Address == null) ? "<null>" : this.globalIPv6Address));
        sb.append(',');
        sb.append("globalIPv6PrefixLen");
        sb.append('=');
        sb.append(((this.globalIPv6PrefixLen == null) ? "<null>" : this.globalIPv6PrefixLen));
        sb.append(',');
        sb.append("macAddress");
        sb.append('=');
        sb.append(((this.macAddress == null) ? "<null>" : this.macAddress));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
