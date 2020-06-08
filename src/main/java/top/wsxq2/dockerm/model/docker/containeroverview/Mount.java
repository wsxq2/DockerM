
package top.wsxq2.dockerm.model.docker.containeroverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mount {

    @SerializedName("Destination")
    @Expose
    private String destination;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("Mode")
    @Expose
    private String mode;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Propagation")
    @Expose
    private String propagation;
    @SerializedName("RW")
    @Expose
    private Boolean rw;
    @SerializedName("Source")
    @Expose
    private String source;
    @SerializedName("Type")
    @Expose
    private String type;

    /**
     * No args constructor for use in serialization
     */
    public Mount() {
    }

    /**
     * @param mode
     * @param propagation
     * @param driver
     * @param rw
     * @param destination
     * @param name
     * @param source
     * @param type
     */
    public Mount(String destination, String driver, String mode, String name, String propagation, Boolean rw,
                 String source, String type) {
        super();
        this.destination = destination;
        this.driver = driver;
        this.mode = mode;
        this.name = name;
        this.propagation = propagation;
        this.rw = rw;
        this.source = source;
        this.type = type;
    }

    public String getDestination() {
        return destination;
    }

    public String getDriver() {
        return driver;
    }

    public String getMode() {
        return mode;
    }

    public String getName() {
        return name;
    }

    public String getPropagation() {
        return propagation;
    }

    public Boolean getRw() {
        return rw;
    }

    public String getSource() {
        return source;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Mount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("destination");
        sb.append('=');
        sb.append(((this.destination == null) ? "<null>" : this.destination));
        sb.append(',');
        sb.append("driver");
        sb.append('=');
        sb.append(((this.driver == null) ? "<null>" : this.driver));
        sb.append(',');
        sb.append("mode");
        sb.append('=');
        sb.append(((this.mode == null) ? "<null>" : this.mode));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("propagation");
        sb.append('=');
        sb.append(((this.propagation == null) ? "<null>" : this.propagation));
        sb.append(',');
        sb.append("rw");
        sb.append('=');
        sb.append(((this.rw == null) ? "<null>" : this.rw));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null) ? "<null>" : this.source));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
