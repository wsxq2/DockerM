
package top.wsxq2.dockerm.model.docker.volumeoverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserAccess {

    @SerializedName("AccessLevel")
    @Expose
    private Integer accessLevel;
    @SerializedName("UserId")
    @Expose
    private Integer userId;

    /**
     * No args constructor for use in serialization
     */
    public UserAccess() {
    }

    /**
     * @param accessLevel
     * @param userId
     */
    public UserAccess(Integer accessLevel, Integer userId) {
        super();
        this.accessLevel = accessLevel;
        this.userId = userId;
    }

    public Integer getAccessLevel() {
        return accessLevel;
    }

    public Integer getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(UserAccess.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("accessLevel");
        sb.append('=');
        sb.append(((this.accessLevel == null) ? "<null>" : this.accessLevel));
        sb.append(',');
        sb.append("userId");
        sb.append('=');
        sb.append(((this.userId == null) ? "<null>" : this.userId));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
