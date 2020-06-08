
package top.wsxq2.dockerm.model.docker.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class _19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("EndpointID")
    @Expose
    private String endpointID;
    @SerializedName("MacAddress")
    @Expose
    private String macAddress;
    @SerializedName("IPv4Address")
    @Expose
    private String iPv4Address;
    @SerializedName("IPv6Address")
    @Expose
    private String iPv6Address;

    public String getName() {
        return name;
    }

    public String getEndpointID() {
        return endpointID;
    }

    public String getMacAddress() {
        return macAddress;
    }

    public String getIPv4Address() {
        return iPv4Address;
    }

    public String getIPv6Address() {
        return iPv6Address;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("endpointID");
        sb.append('=');
        sb.append(((this.endpointID == null) ? "<null>" : this.endpointID));
        sb.append(',');
        sb.append("macAddress");
        sb.append('=');
        sb.append(((this.macAddress == null) ? "<null>" : this.macAddress));
        sb.append(',');
        sb.append("iPv4Address");
        sb.append('=');
        sb.append(((this.iPv4Address == null) ? "<null>" : this.iPv4Address));
        sb.append(',');
        sb.append("iPv6Address");
        sb.append('=');
        sb.append(((this.iPv6Address == null) ? "<null>" : this.iPv6Address));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
