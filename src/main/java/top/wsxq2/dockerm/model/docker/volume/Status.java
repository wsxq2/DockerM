
package top.wsxq2.dockerm.model.docker.volume;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("hello")
    @Expose
    private String hello;

    public String getHello() {
        return hello;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Status.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("hello");
        sb.append('=');
        sb.append(((this.hello == null) ? "<null>" : this.hello));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
