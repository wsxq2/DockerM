
package top.wsxq2.dockerm.model.docker.container;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Mount {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Source")
    @Expose
    private String source;
    @SerializedName("Destination")
    @Expose
    private String destination;
    @SerializedName("Driver")
    @Expose
    private String driver;
    @SerializedName("Mode")
    @Expose
    private String mode;
    @SerializedName("RW")
    @Expose
    private Boolean rw;
    @SerializedName("Propagation")
    @Expose
    private String propagation;
    @SerializedName("Type")
    @Expose
    private String type;

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public String getSource() {
        return source;
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

    public Boolean getRw() {
        return rw;
    }

    public String getPropagation() {
        return propagation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Mount.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null) ? "<null>" : this.name));
        sb.append(',');
        sb.append("source");
        sb.append('=');
        sb.append(((this.source == null) ? "<null>" : this.source));
        sb.append(',');
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
        sb.append("rw");
        sb.append('=');
        sb.append(((this.rw == null) ? "<null>" : this.rw));
        sb.append(',');
        sb.append("propagation");
        sb.append('=');
        sb.append(((this.propagation == null) ? "<null>" : this.propagation));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
