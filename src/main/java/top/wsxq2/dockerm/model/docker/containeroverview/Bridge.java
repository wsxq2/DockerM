
package top.wsxq2.dockerm.model.docker.containeroverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Bridge {

    @SerializedName("Aliases")
    @Expose
    private Object aliases;
    @SerializedName("DriverOpts")
    @Expose
    private Object driverOpts;
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
    @SerializedName("IPAMConfig")
    @Expose
    private IPAMConfig iPAMConfig;
    @SerializedName("IPAddress")
    @Expose
    private String iPAddress;
    @SerializedName("IPPrefixLen")
    @Expose
    private Integer iPPrefixLen;
    @SerializedName("IPv6Gateway")
    @Expose
    private String iPv6Gateway;
    @SerializedName("Links")
    @Expose
    private Object links;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;
    @SerializedName("NetworkID")
    @Expose
    private String networkID;

    /**
     * No args constructor for use in serialization
     */
    public Bridge() {
    }

    /**
     * @param driverOpts
     * @param globalIPv6Address
     * @param aliases
     * @param iPv6Gateway
     * @param endpointID
     * @param globalIPv6PrefixLen
     * @param iPAMConfig
     * @param iPPrefixLen
     * @param iPAddress
     * @param macAddress
     * @param links
     * @param networkID
     * @param gateway
     */
    public Bridge(Object aliases, Object driverOpts, String endpointID, String gateway, String globalIPv6Address,
                  Integer globalIPv6PrefixLen, IPAMConfig iPAMConfig, String iPAddress, Integer iPPrefixLen,
                  String iPv6Gateway, Object links, String macAddress, String networkID) {
        super();
        this.aliases = aliases;
        this.driverOpts = driverOpts;
        this.endpointID = endpointID;
        this.gateway = gateway;
        this.globalIPv6Address = globalIPv6Address;
        this.globalIPv6PrefixLen = globalIPv6PrefixLen;
        this.iPAMConfig = iPAMConfig;
        this.iPAddress = iPAddress;
        this.iPPrefixLen = iPPrefixLen;
        this.iPv6Gateway = iPv6Gateway;
        this.links = links;
        this.macAddress = macAddress;
        this.networkID = networkID;
    }

    public Object getAliases() {
        return aliases;
    }

    public Object getDriverOpts() {
        return driverOpts;
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

    public IPAMConfig getIPAMConfig() {
        return iPAMConfig;
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

    public Object getLinks() {
        return links;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getNetworkID() {
        return networkID;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Bridge.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("aliases");
        sb.append('=');
        sb.append(((this.aliases == null) ? "<null>" : this.aliases));
        sb.append(',');
        sb.append("driverOpts");
        sb.append('=');
        sb.append(((this.driverOpts == null) ? "<null>" : this.driverOpts));
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
        sb.append("iPAMConfig");
        sb.append('=');
        sb.append(((this.iPAMConfig == null) ? "<null>" : this.iPAMConfig));
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
        sb.append("links");
        sb.append('=');
        sb.append(((this.links == null) ? "<null>" : this.links));
        sb.append(',');
        sb.append("macAddress");
        sb.append('=');
        sb.append(((this.macAddress == null) ? "<null>" : this.macAddress));
        sb.append(',');
        sb.append("networkID");
        sb.append('=');
        sb.append(((this.networkID == null) ? "<null>" : this.networkID));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
