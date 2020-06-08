
package top.wsxq2.dockerm.model.docker.imageoverview;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class ImageOverview {

    @SerializedName("Containers")
    @Expose
    private Integer containers;
    @SerializedName("Created")
    @Expose
    private Integer created;
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Labels")
    @Expose
    private Labels labels;
    @SerializedName("ParentId")
    @Expose
    private String parentId;
    @SerializedName("RepoDigests")
    @Expose
    private Object repoDigests;
    @SerializedName("RepoTags")
    @Expose
    private List<String> repoTags = new ArrayList<String>();
    @SerializedName("SharedSize")
    @Expose
    private Integer sharedSize;
    @SerializedName("Size")
    @Expose
    private Integer size;
    @SerializedName("VirtualSize")
    @Expose
    private Integer virtualSize;

    /**
     * No args constructor for use in serialization
     */
    public ImageOverview() {
    }

    /**
     * @param sharedSize
     * @param size
     * @param created
     * @param repoTags
     * @param containers
     * @param id
     * @param parentId
     * @param repoDigests
     * @param labels
     * @param virtualSize
     */
    public ImageOverview(Integer containers, Integer created, String id, Labels labels, String parentId,
                         Object repoDigests, List<String> repoTags, Integer sharedSize, Integer size,
                         Integer virtualSize) {
        super();
        this.containers = containers;
        this.created = created;
        this.id = id;
        this.labels = labels;
        this.parentId = parentId;
        this.repoDigests = repoDigests;
        this.repoTags = repoTags;
        this.sharedSize = sharedSize;
        this.size = size;
        this.virtualSize = virtualSize;
    }

    public Integer getContainers() {
        return containers;
    }

    public Integer getCreated() {
        return created;
    }

    public String getId() {
        return id;
    }

    public Labels getLabels() {
        return labels;
    }

    public String getParentId() {
        return parentId;
    }

    public Object getRepoDigests() {
        return repoDigests;
    }

    public List<String> getRepoTags() {
        return repoTags;
    }

    public Integer getSharedSize() {
        return sharedSize;
    }

    public Integer getSize() {
        return size;
    }

    public Integer getVirtualSize() {
        return virtualSize;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(ImageOverview.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("containers");
        sb.append('=');
        sb.append(((this.containers == null) ? "<null>" : this.containers));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null) ? "<null>" : this.created));
        sb.append(',');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("labels");
        sb.append('=');
        sb.append(((this.labels == null) ? "<null>" : this.labels));
        sb.append(',');
        sb.append("parentId");
        sb.append('=');
        sb.append(((this.parentId == null) ? "<null>" : this.parentId));
        sb.append(',');
        sb.append("repoDigests");
        sb.append('=');
        sb.append(((this.repoDigests == null) ? "<null>" : this.repoDigests));
        sb.append(',');
        sb.append("repoTags");
        sb.append('=');
        sb.append(((this.repoTags == null) ? "<null>" : this.repoTags));
        sb.append(',');
        sb.append("sharedSize");
        sb.append('=');
        sb.append(((this.sharedSize == null) ? "<null>" : this.sharedSize));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null) ? "<null>" : this.size));
        sb.append(',');
        sb.append("virtualSize");
        sb.append('=');
        sb.append(((this.virtualSize == null) ? "<null>" : this.virtualSize));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
