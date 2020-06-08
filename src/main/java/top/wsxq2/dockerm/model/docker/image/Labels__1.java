
package top.wsxq2.dockerm.model.docker.image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Labels__1 {

    @SerializedName("com.example.vendor")
    @Expose
    private String comExampleVendor;
    @SerializedName("com.example.version")
    @Expose
    private String comExampleVersion;
    @SerializedName("com.example.license")
    @Expose
    private String comExampleLicense;

    public String getComExampleVendor() {
        return comExampleVendor;
    }

    public String getComExampleVersion() {
        return comExampleVersion;
    }

    public String getComExampleLicense() {
        return comExampleLicense;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Labels__1.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comExampleVendor");
        sb.append('=');
        sb.append(((this.comExampleVendor == null) ? "<null>" : this.comExampleVendor));
        sb.append(',');
        sb.append("comExampleVersion");
        sb.append('=');
        sb.append(((this.comExampleVersion == null) ? "<null>" : this.comExampleVersion));
        sb.append(',');
        sb.append("comExampleLicense");
        sb.append('=');
        sb.append(((this.comExampleLicense == null) ? "<null>" : this.comExampleLicense));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
