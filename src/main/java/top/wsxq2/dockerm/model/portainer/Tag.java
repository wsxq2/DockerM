package top.wsxq2.dockerm.model.portainer;

public class Tag extends DataItem {
    private final String name;

    public Tag(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "name='" + name + '\'' +
                ", id=" + getId() +
                '}';
    }
}
