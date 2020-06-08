
package top.wsxq2.dockerm.model.docker.image;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Image {

    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Container")
    @Expose
    private String container;
    @SerializedName("Comment")
    @Expose
    private String comment;
    @SerializedName("Os")
    @Expose
    private String os;
    @SerializedName("Architecture")
    @Expose
    private String architecture;
    @SerializedName("Parent")
    @Expose
    private String parent;
    @SerializedName("ContainerConfig")
    @Expose
    private ContainerConfig containerConfig;
    @SerializedName("DockerVersion")
    @Expose
    private String dockerVersion;
    @SerializedName("VirtualSize")
    @Expose
    private Integer virtualSize;
    @SerializedName("Size")
    @Expose
    private Integer size;
    @SerializedName("Author")
    @Expose
    private String author;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("GraphDriver")
    @Expose
    private GraphDriver graphDriver;
    @SerializedName("RepoDigests")
    @Expose
    private List<String> repoDigests = new ArrayList<String>();
    @SerializedName("RepoTags")
    @Expose
    private List<String> repoTags = new ArrayList<String>();
    @SerializedName("Config")
    @Expose
    private Config config;
    @SerializedName("RootFS")
    @Expose
    private RootFS rootFS;
    @SerializedName("Labels")
    @Expose
    private Map<String, String> labels;
    @SerializedName("ParentId")
    @Expose
    private String parentId;
    @SerializedName("SharedSize")
    @Expose
    private int sharedSize;

    public String getId() {
        return id;
    }

    public String getContainer() {
        return container;
    }

    public String getComment() {
        return comment;
    }

    public String getOs() {
        return os;
    }

    public String getArchitecture() {
        return architecture;
    }

    public String getParent() {
        return parent;
    }

    public ContainerConfig getContainerConfig() {
        return containerConfig;
    }

    public String getDockerVersion() {
        return dockerVersion;
    }

    public Integer getVirtualSize() {
        return virtualSize;
    }

    public Integer getSize() {
        return size;
    }

    public String getAuthor() {
        return author;
    }

    public String getCreated() {
        return created;
    }

    public GraphDriver getGraphDriver() {
        return graphDriver;
    }

    public List<String> getRepoDigests() {
        return repoDigests;
    }

    public List<String> getRepoTags() {
        return repoTags;
    }

    public Config getConfig() {
        return config;
    }

    public RootFS getRootFS() {
        return rootFS;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Image.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null) ? "<null>" : this.id));
        sb.append(',');
        sb.append("container");
        sb.append('=');
        sb.append(((this.container == null) ? "<null>" : this.container));
        sb.append(',');
        sb.append("comment");
        sb.append('=');
        sb.append(((this.comment == null) ? "<null>" : this.comment));
        sb.append(',');
        sb.append("os");
        sb.append('=');
        sb.append(((this.os == null) ? "<null>" : this.os));
        sb.append(',');
        sb.append("architecture");
        sb.append('=');
        sb.append(((this.architecture == null) ? "<null>" : this.architecture));
        sb.append(',');
        sb.append("parent");
        sb.append('=');
        sb.append(((this.parent == null) ? "<null>" : this.parent));
        sb.append(',');
        sb.append("containerConfig");
        sb.append('=');
        sb.append(((this.containerConfig == null) ? "<null>" : this.containerConfig));
        sb.append(',');
        sb.append("dockerVersion");
        sb.append('=');
        sb.append(((this.dockerVersion == null) ? "<null>" : this.dockerVersion));
        sb.append(',');
        sb.append("virtualSize");
        sb.append('=');
        sb.append(((this.virtualSize == null) ? "<null>" : this.virtualSize));
        sb.append(',');
        sb.append("size");
        sb.append('=');
        sb.append(((this.size == null) ? "<null>" : this.size));
        sb.append(',');
        sb.append("author");
        sb.append('=');
        sb.append(((this.author == null) ? "<null>" : this.author));
        sb.append(',');
        sb.append("created");
        sb.append('=');
        sb.append(((this.created == null) ? "<null>" : this.created));
        sb.append(',');
        sb.append("graphDriver");
        sb.append('=');
        sb.append(((this.graphDriver == null) ? "<null>" : this.graphDriver));
        sb.append(',');
        sb.append("repoDigests");
        sb.append('=');
        sb.append(((this.repoDigests == null) ? "<null>" : this.repoDigests));
        sb.append(',');
        sb.append("repoTags");
        sb.append('=');
        sb.append(((this.repoTags == null) ? "<null>" : this.repoTags));
        sb.append(',');
        sb.append("config");
        sb.append('=');
        sb.append(((this.config == null) ? "<null>" : this.config));
        sb.append(',');
        sb.append("rootFS");
        sb.append('=');
        sb.append(((this.rootFS == null) ? "<null>" : this.rootFS));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
