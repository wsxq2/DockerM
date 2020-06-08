
package top.wsxq2.dockerm.model.docker.networkoverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import top.wsxq2.dockerm.model.docker.network.Config;

import java.util.ArrayList;
import java.util.List;

public class Ipam {

    @SerializedName("Config")
    @Expose
    private List<Config> config = new ArrayList<>();
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("Options")
    @Expose
    private Object options;

    /**
     * No args constructor for use in serialization
     */
    public Ipam() {
    }

    /**
     * @param driver
     * @param options
     * @param config
     */
    public Ipam(List<Config> config, String driver, Object options) {
        super();
        this.config = config;
        this.driver = driver;
        this.options = options;
    }

    public List<Config> getConfig() {
        return config;
    }

    public String getDriver() {
        return driver;
    }

    public Object getOptions() {
        return options;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ipam.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null) ? "<null>" : this.config));
        sb.append(',');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null) ? "<null>" : this.driver));
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
