
package top.wsxq2.dockerm.model.docker.network;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ipam {

    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("Config")
    @Expose
    private List<Config> config = new ArrayList<Config>();
    @SerializedName("Options")
    @Expose
    private Map<String, String> options;

    public String getDriver() {
        return driver;
    }

    public List<Config> getConfig() {
        return config;
    }

    public Map<String, String> getOptions() {
        return options;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ipam.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null) ? "<null>" : this.driver));
        sb.append(',');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null) ? "<null>" : this.config));
        sb.append(',');
        sb.append("options");
        sb.append('=');
        sb.append(((this.options == null) ? "<null>" : this.options));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
