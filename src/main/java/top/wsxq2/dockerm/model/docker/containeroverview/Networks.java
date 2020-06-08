
package top.wsxq2.dockerm.model.docker.containeroverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Networks {

    @SerializedName("bridge")
    @Expose
    private Bridge bridge;

    /**
     * No args constructor for use in serialization
     */
    public Networks() {
    }

    /**
     * @param bridge
     */
    public Networks(Bridge bridge) {
        super();
        this.bridge = bridge;
    }

    public Bridge getBridge() {
        return bridge;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Networks.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("bridge");
        sb.append('=');
        sb.append(((this.bridge == null) ? "<null>" : this.bridge));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
