package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import javafx.scene.text.Text;
import top.wsxq2.dockerm.model.docker.containeroverview.ContainerOverview;
import top.wsxq2.dockerm.model.docker.imageoverview.ImageOverview;
import top.wsxq2.dockerm.model.docker.networkoverview.NetworkOverview;
import top.wsxq2.dockerm.model.docker.volumeoverview.VolumeOverview;
import top.wsxq2.dockerm.util.Global;

public class HostController extends ControllerEndpoint {
    @FXML
    private Text nContainersT;
    @FXML
    private Text nImagesT;
    @FXML
    private Text nVolumesT;
    @FXML
    private Text nNetworksT;
    private PrimaryController primaryController;

    @FXML
    protected void initialize() {
        this.primaryController = Global.getPrimaryController();
        super.initialize();
    }

    @FXML
    private void handleContainers() {
        primaryController.handleContainers();
    }

    @FXML
    private void handleImages() {
        primaryController.handleImages();
    }

    @FXML
    private void handleVolumes() {
        primaryController.handleVolumes();
    }

    @FXML
    private void handleNetworks() {
        primaryController.handleNetworks();
    }

    @Override
    public void refresh() {
        nContainersT.setText(String.valueOf(callApiUtil.getDataItemsDocker(endpointID, ContainerOverview.class).length));
        nImagesT.setText(String.valueOf(callApiUtil.getDataItemsDocker(endpointID, ImageOverview.class).length));
        nVolumesT.setText(String.valueOf(callApiUtil.getDataItemsDocker(endpointID, VolumeOverview.class).length));
        nNetworksT.setText(String.valueOf(callApiUtil.getDataItemsDocker(endpointID, NetworkOverview.class).length));
    }

}
