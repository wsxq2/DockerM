package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import top.wsxq2.dockerm.model.docker.volumeoverview.VolumeOverview;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.DateUtil;
import top.wsxq2.dockerm.util.Global;

public class VolumesController extends ControllerEndpoint {
    @FXML
    private TableView<VolumeOverview> volumesTV;

    @FXML
    private TableColumn<VolumeOverview, String> nameCol;
    @FXML
    private TableColumn<VolumeOverview, String> driverCol;
    @FXML
    private TableColumn<VolumeOverview, String> mountPointCol;
    @FXML
    private TableColumn<VolumeOverview, String> createdCol;
    @FXML
    private TableColumn<VolumeOverview, String> accessControlCol;

    @Override
    protected void initialize() {
        super.initialize();

        PrimaryController primaryController = Global.getPrimaryController();

        volumesTV.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        volumesTV.getSelectionModel().selectedItemProperty().addListener((ob, old, newV) -> {
            if (newV == null) return;
            primaryController.enableRightPane("VolumeDetails", newV.getName());
        });

//		indexCol.setCellValueFactory(i->new ReadOnlyObjectWrapper<>(volumesTV.getItems().indexOf(i.getValue())));
        nameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getName()));
        driverCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getDriver()));
        mountPointCol.setCellValueFactory((x -> new ReadOnlyStringWrapper(x.getValue().getMountpoint())));
        createdCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(DateUtil.format(x.getValue().getCreatedAt())));
        accessControlCol.setCellValueFactory(x -> ControllerUtil.getAccessControlWrapper(x.getValue().getPortainer()));
    }

    @Override
    public void refresh() {
        VolumeOverview[] volumeOverviews = callApiUtil.getDataItemsDocker(endpointID, VolumeOverview.class);
        volumesTV.setItems(FXCollections.observableArrayList(volumeOverviews));
    }

    @FXML
    private void handleAdd() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("VolumeAdd", "Add a new volume");
    }
}
