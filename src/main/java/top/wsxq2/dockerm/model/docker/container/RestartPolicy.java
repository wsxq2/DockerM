
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RestartPolicy {

    @SerializedName("MaximumRetryCount")
    @Expose
    private Integer maximumRetryCount;
    @SerializedName("Name")
    @Expose
    private String name;

    public Integer getMaximumRetryCount() {
        return maximumRetryCount;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RestartPolicy.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("maximumRetryCount");
        sb.append('=');
        sb.append(((this.maximumRetryCount == null) ? "<null>" : this.maximumRetryCount));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
