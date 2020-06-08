package top.wsxq2.dockerm.model.portainer;

public class Portainer {
    private ResourceControl resourceControl;

    public Portainer() {
    }

    public Portainer(ResourceControl resourceControl) {
        this.resourceControl = resourceControl;
    }

    public ResourceControl getResourceControl() {
        return resourceControl;
    }

    @Override
    public String toString() {
        return "Portainer{" +
                "resourceControl=" + resourceControl +
                '}';
    }

}
