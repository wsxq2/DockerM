package top.wsxq2.dockerm.controller;

public abstract class RightControllerEndpoint extends ControllerEndpointArg {
    protected String selectedID;

    public void setItem(String selectedID) {
        this.selectedID = selectedID;
        refresh();
    }

    protected abstract void refresh();
}
