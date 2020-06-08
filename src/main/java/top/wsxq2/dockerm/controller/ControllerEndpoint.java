package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import top.wsxq2.dockerm.util.Global;

public abstract class ControllerEndpoint extends BaseController {
    protected int endpointID;

    @FXML
    protected void initialize() {
        this.endpointID = Global.getSelectedEndpointID();
        assert endpointID != 0;
        super.initialize();
    }
}
