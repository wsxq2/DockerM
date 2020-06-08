
package top.wsxq2.dockerm.model.docker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Actor {

    @SerializedName("ID")
    @Expose
    private String id;
    @SerializedName("Attributes")
    @Expose
    private Map<String, String> attributes;

    /**
     * No args constructor for use in serialization
     */
    public Actor() {
    }

    /**
     * @param id
     * @param attributes
     */
    public Actor(String id, Map<String, String> attributes) {
        super();
        this.id = id;
        this.attributes = attributes;
    }

    public String getId() {
        return id;
    }

    public Map<String, String> getAttributes() {
        return attributes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Actor.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("attributes");
        sb.append('=');
        sb.append(((this.attributes == null) ? "<null>" : this.attributes));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
