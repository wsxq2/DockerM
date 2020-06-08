
package top.wsxq2.dockerm.model.docker.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Options {

    @SerializedName("foo")
    @Expose
    private String foo;

    public String getFoo() {
        return foo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Options.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("foo");
        sb.append('=');
        sb.append(((this.foo == null) ? "<null>" : this.foo));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
