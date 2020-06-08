
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Volumes {

    @SerializedName("/volumes/data")
    @Expose
    private VolumesData volumesData;

    public VolumesData getVolumesData() {
        return volumesData;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Volumes.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("volumesData");
        sb.append('=');
        sb.append(((this.volumesData == null) ? "<null>" : this.volumesData));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
