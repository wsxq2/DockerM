
package top.wsxq2.dockerm.model.docker;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Event {

    @SerializedName("Type")
    @Expose
    private String type;
    @SerializedName("Action")
    @Expose
    private String action;
    @SerializedName("Actor")
    @Expose
    private Actor actor;
    @SerializedName("time")
    @Expose
    private Integer time;

    /**
     * No args constructor for use in serialization
     */
    public Event() {
    }

    /**
     * @param actor
     * @param action
     * @param time
     * @param type
     */
    public Event(String type, String action, Actor actor, Integer time) {
        super();
        this.type = type;
        this.action = action;
        this.actor = actor;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public String getAction() {
        return action;
    }

    public Actor getActor() {
        return actor;
    }

    public Integer getTime() {
        return time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Event.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null) ? "<null>" : this.type));
        sb.append(',');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null) ? "<null>" : this.action));
        sb.append(',');
        sb.append("actor");
        sb.append('=');
        sb.append(((this.actor == null) ? "<null>" : this.actor));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null) ? "<null>" : this.time));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
