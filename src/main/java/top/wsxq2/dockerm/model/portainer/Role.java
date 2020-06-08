package top.wsxq2.dockerm.model.portainer;

import java.util.Map;

public class Role {
    private final int id;
    private final String name;
    private final String description;
    private final Map<String, Object> authorizations;

    public Role(int id, String name, String description, Map<String, Object> authorizations) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.authorizations = authorizations;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Object> getAuthorizations() {
        return authorizations;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", authorizations=" + authorizations +
                '}';
    }
}
