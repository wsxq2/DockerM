
package top.wsxq2.dockerm.model.docker.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Containers {

    @SerializedName("19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c")
    @Expose
    private top.wsxq2.dockerm.model.docker.network._19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c _19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c;

    public top.wsxq2.dockerm.model.docker.network._19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c get19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c() {
        return _19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Containers.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c");
        sb.append('=');
        sb.append(((this._19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c == null) ? "<null>" :
                this._19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
