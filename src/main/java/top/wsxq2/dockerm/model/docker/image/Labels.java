
package top.wsxq2.dockerm.model.docker.image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Labels {

    @SerializedName("com.example.license")
    @Expose
    private String comExampleLicense;
    @SerializedName("com.example.version")
    @Expose
    private String comExampleVersion;
    @SerializedName("com.example.vendor")
    @Expose
    private String comExampleVendor;

    public String getComExampleLicense() {
        return comExampleLicense;
    }

    public String getComExampleVersion() {
        return comExampleVersion;
    }

    public String getComExampleVendor() {
        return comExampleVendor;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Labels.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comExampleLicense");
        sb.append('=');
        sb.append(((this.comExampleLicense == null) ? "<null>" : this.comExampleLicense));
        sb.append(',');
        sb.append("comExampleVersion");
        sb.append('=');
        sb.append(((this.comExampleVersion == null) ? "<null>" : this.comExampleVersion));
        sb.append(',');
        sb.append("comExampleVendor");
        sb.append('=');
        sb.append(((this.comExampleVendor == null) ? "<null>" : this.comExampleVendor));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
