
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class NetworkSettings {

    @SerializedName("Bridge")
    @Expose
    private String bridge;
    @SerializedName("SandboxID")
    @Expose
    private String sandboxID;
    @SerializedName("HairpinMode")
    @Expose
    private Boolean hairpinMode;
    @SerializedName("LinkLocalIPv6Address")
    @Expose
    private String linkLocalIPv6Address;
    @SerializedName("LinkLocalIPv6PrefixLen")
    @Expose
    private Integer linkLocalIPv6PrefixLen;
    @SerializedName("SandboxKey")
    @Expose
    private String sandboxKey;
    @SerializedName("SecondaryIPAddresses")
    @Expose
    private Object secondaryIPAddresses;
    @SerializedName("SecondaryIPv6Addresses")
    @Expose
    private Object secondaryIPv6Addresses;
    @SerializedName("EndpointID")
    @Expose
    private String endpointID;
    @SerializedName("Gateway")
    @Expose
    private String gateway;
    @SerializedName("GlobalIPv6Address")
    @Expose
    private String globalIPv6Address;
    @SerializedName("GlobalIPv6PrefixLen")
    @Expose
    private Integer globalIPv6PrefixLen;
    @SerializedName("IPAddress")
    @Expose
    private String iPAddress;
    @SerializedName("IPPrefixLen")
    @Expose
    private Integer iPPrefixLen;
    @SerializedName("IPv6Gateway")
    @Expose
    private String iPv6Gateway;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;
    @SerializedName("Networks")
    @Expose
    private Map<String, NetworkSettingsNetwork> networks;

    public String getBridge() {
        return bridge;
    }

    public String getSandboxID() {
        return sandboxID;
    }

    public Boolean getHairpinMode() {
        return hairpinMode;
    }

    public String getLinkLocalIPv6Address() {
        return linkLocalIPv6Address;
    }

    public Integer getLinkLocalIPv6PrefixLen() {
        return linkLocalIPv6PrefixLen;
    }

    public String getSandboxKey() {
        return sandboxKey;
    }

    public Object getSecondaryIPAddresses() {
        return secondaryIPAddresses;
    }

    public Object getSecondaryIPv6Addresses() {
        return secondaryIPv6Addresses;
    }

    public String getEndpointID() {
        return endpointID;
    }

    public String getGateway() {
        return gateway;
    }

    public String getGlobalIPv6Address() {
        return globalIPv6Address;
    }

    public Integer getGlobalIPv6PrefixLen() {
        return globalIPv6PrefixLen;
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

    public String getMacAddress() {
        return macAddress;
    }

    public Map<String, NetworkSettingsNetwork> getNetworks() {
        return networks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NetworkSettings.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bridge");
        sb.append('=');
        sb.append(((this.bridge == null) ? "<null>" : this.bridge));
        sb.append(',');
        sb.append("sandboxID");
        sb.append('=');
        sb.append(((this.sandboxID == null) ? "<null>" : this.sandboxID));
        sb.append(',');
        sb.append("hairpinMode");
        sb.append('=');
        sb.append(((this.hairpinMode == null) ? "<null>" : this.hairpinMode));
        sb.append(',');
        sb.append("linkLocalIPv6Address");
        sb.append('=');
        sb.append(((this.linkLocalIPv6Address == null) ? "<null>" : this.linkLocalIPv6Address));
        sb.append(',');
        sb.append("linkLocalIPv6PrefixLen");
        sb.append('=');
        sb.append(((this.linkLocalIPv6PrefixLen == null) ? "<null>" : this.linkLocalIPv6PrefixLen));
        sb.append(',');
        sb.append("sandboxKey");
        sb.append('=');
        sb.append(((this.sandboxKey == null) ? "<null>" : this.sandboxKey));
        sb.append(',');
        sb.append("secondaryIPAddresses");
        sb.append('=');
        sb.append(((this.secondaryIPAddresses == null) ? "<null>" : this.secondaryIPAddresses));
        sb.append(',');
        sb.append("secondaryIPv6Addresses");
        sb.append('=');
        sb.append(((this.secondaryIPv6Addresses == null) ? "<null>" : this.secondaryIPv6Addresses));
        sb.append(',');
        sb.append("endpointID");
        sb.append('=');
        sb.append(((this.endpointID == null) ? "<null>" : this.endpointID));
        sb.append(',');
        sb.append("gateway");
        sb.append('=');
        sb.append(((this.gateway == null) ? "<null>" : this.gateway));
        sb.append(',');
        sb.append("globalIPv6Address");
        sb.append('=');
        sb.append(((this.globalIPv6Address == null) ? "<null>" : this.globalIPv6Address));
        sb.append(',');
        sb.append("globalIPv6PrefixLen");
        sb.append('=');
        sb.append(((this.globalIPv6PrefixLen == null) ? "<null>" : this.globalIPv6PrefixLen));
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
        sb.append("macAddress");
        sb.append('=');
        sb.append(((this.macAddress == null) ? "<null>" : this.macAddress));
        sb.append(',');
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
