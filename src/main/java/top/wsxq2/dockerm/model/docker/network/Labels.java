
package top.wsxq2.dockerm.model.docker.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Labels {

    @SerializedName("com.example.some-label")
    @Expose
    private String comExampleSomeLabel;
    @SerializedName("com.example.some-other-label")
    @Expose
    private String comExampleSomeOtherLabel;

    public String getComExampleSomeLabel() {
        return comExampleSomeLabel;
    }

    public String getComExampleSomeOtherLabel() {
        return comExampleSomeOtherLabel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Labels.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("comExampleSomeLabel");
        sb.append('=');
        sb.append(((this.comExampleSomeLabel == null) ? "<null>" : this.comExampleSomeLabel));
        sb.append(',');
        sb.append("comExampleSomeOtherLabel");
        sb.append('=');
        sb.append(((this.comExampleSomeOtherLabel == null) ? "<null>" : this.comExampleSomeOtherLabel));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
