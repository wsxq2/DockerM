
package top.wsxq2.dockerm.model.docker.image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class RootFS {

    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Layers")
    @Expose
    private List<String> layers = new ArrayList<String>();

    public String getType() {
        return type;
    }

    public List<String> getLayers() {
        return layers;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RootFS.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("layers");
        sb.append('=');
        sb.append(((this.layers == null) ? "<null>" : this.layers));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
