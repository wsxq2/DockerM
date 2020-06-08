package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import top.wsxq2.dockerm.util.CallApiUtil;
import top.wsxq2.dockerm.util.Global;

public class ControllerEndpointArg {
    protected CallApiUtil callApiUtil;
    protected int endpointID;

    @FXML
    protected void initialize() {
        callApiUtil = Global.getCallApiUtil();
        assert callApiUtil != null;
        endpointID = Global.getSelectedEndpointID();
        assert endpointID != 0;
    }
}
