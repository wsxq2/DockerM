package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import top.wsxq2.dockerm.util.CallApiUtil;
import top.wsxq2.dockerm.util.Global;

public abstract class BaseController {
    protected CallApiUtil callApiUtil;

    @FXML
    protected void initialize() {
        this.callApiUtil = Global.getCallApiUtil();
        assert callApiUtil != null;
        refresh();
    }

    public abstract void refresh();
}
