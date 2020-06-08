package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import top.wsxq2.dockerm.model.docker.containeroverview.ContainerOverview;
import top.wsxq2.dockerm.model.docker.containeroverview.Mount;
import top.wsxq2.dockerm.model.docker.volume.Volume;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.DateUtil;
import top.wsxq2.dockerm.util.JsonUtil;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class VolumeDetailsController extends RightControllerEndpoint {
    @FXML
    private Text idT;
    @FXML
    private Text createdT;
    @FXML
    private Text mountPathT;
    @FXML
    private Text driverT;

    @FXML
    private TableView<ContainerOverview> containersTV;
    @FXML
    private TableColumn<ContainerOverview, String> nameCol;
    @FXML
    private TableColumn<ContainerOverview, String> mountedAtCol;
    @FXML
    private TableColumn<ContainerOverview, String> readOnlyCol;

    @Override
    protected void initialize() {
        super.initialize();

        nameCol.setCellValueFactory(x -> ControllerUtil.getListStringWrapper(x.getValue().getNames()));
        mountedAtCol.setCellValueFactory(x -> {
            Mount mount = ControllerUtil.getFirstOfList(x.getValue().getMounts());
            return new ReadOnlyStringWrapper(mount == null ? "-" : mount.getDestination());
        });
        readOnlyCol.setCellValueFactory(x -> {
            Mount mount = ControllerUtil.getFirstOfList(x.getValue().getMounts());
            return new ReadOnlyStringWrapper(mount == null ? "-" : String.valueOf(!mount.getRw()));
        });
    }

    @Override
    public void refresh() {
        Volume volume = callApiUtil.getDataItemDocker(endpointID, Volume.class, selectedID);
        idT.setText(volume.getName());
        createdT.setText(DateUtil.format(volume.getCreatedAt()));
        mountPathT.setText(volume.getMountpoint());
        driverT.setText(volume.getDriver());

        Map<String, String[]> map = Map.of("volume", new String[]{selectedID});
        String para = URLEncoder.encode(JsonUtil.gson.toJson(map), StandardCharsets.UTF_8);
        String path = "containers/json?all=1&filters=" + para;
        ContainerOverview[] containerOverviews = callApiUtil.getDataItemsWithPathDocker(endpointID,
                ContainerOverview.class, path);
        containersTV.setItems(FXCollections.observableArrayList(containerOverviews));
    }
}
