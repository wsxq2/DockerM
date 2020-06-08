package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wsxq2.dockerm.model.docker.container.NetworkSettingsNetwork;
import top.wsxq2.dockerm.model.docker.container.Port;
import top.wsxq2.dockerm.model.docker.containeroverview.ContainerOverview;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.DateUtil;
import top.wsxq2.dockerm.util.Global;

import java.util.List;
import java.util.Map;

public class ContainersController extends ControllerEndpoint {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    @FXML
    private Button addContainerB;
    @FXML
    private TextField searchTF;
    @FXML
    private TableView<ContainerOverview> containerOverviewTableView;
    @FXML
    private TableColumn<ContainerOverview, Integer> idCol;
    @FXML
    private TableColumn<ContainerOverview, String> nameCol;
    @FXML
    private TableColumn<ContainerOverview, String> stateCol;
    @FXML
    private TableColumn<ContainerOverview, String> imageCol;
    @FXML
    private TableColumn<ContainerOverview, String> createdCol;
    @FXML
    private TableColumn<ContainerOverview, String> IPAddressCol;
    @FXML
    private TableColumn<ContainerOverview, String> publishedPortsCol;
    @FXML
    private TableColumn<ContainerOverview, String> accessControlCol;
    private ObservableList<ContainerOverview> containerOverviews;

    @FXML
    protected void initialize() {
        super.initialize();
        PrimaryController primaryController = Global.getPrimaryController();

        containerOverviewTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        containerOverviewTableView.getSelectionModel().selectedItemProperty().addListener((ob, old, newV) -> {
            if (newV == null) return;
            primaryController.enableRightPane("ContainerDetails", newV.getId());
        });

        idCol.setCellValueFactory(i -> new ReadOnlyObjectWrapper<>(containerOverviewTableView.getItems().indexOf(i.getValue())));
        nameCol.setCellValueFactory(cv -> new ReadOnlyStringWrapper(cv.getValue().getNames().get(0).substring(1)));
        stateCol.setCellValueFactory(cv -> new ReadOnlyStringWrapper(cv.getValue().getState()));
        imageCol.setCellValueFactory(cv -> new ReadOnlyStringWrapper(cv.getValue().getImage()));
        createdCol.setCellValueFactory(cv -> new ReadOnlyStringWrapper(DateUtil.format(cv.getValue().getCreated())));

        IPAddressCol.setCellValueFactory(cv -> {
                    Map<String, NetworkSettingsNetwork> map = cv.getValue().getNetworkSettings().getNetworks();
                    NetworkSettingsNetwork nsn = map == null ? null : map.get("bridge");
                    String text = nsn == null ? "-" : nsn.getIPAddress();
                    return new ReadOnlyStringWrapper(text);
                }
        );
        publishedPortsCol.setCellValueFactory(cv -> {
            List<Port> list = cv.getValue().getPorts();
            String res = "-";
            if (list.size() != 0) {
                Port port = list.get(0);
                int publicPort = port.getPublicPort();
                int privatePort = port.getPrivatePort();
                res = String.format("%d:%d", publicPort, privatePort);
            }
            return new ReadOnlyStringWrapper(res);
        });
        accessControlCol.setCellValueFactory(cv -> ControllerUtil.getAccessControlWrapper(cv.getValue().getPortainer()));
        this.refresh();
    }

    @Override
    public void refresh() {
        ContainerOverview[] containersA = callApiUtil.getDataItemsDocker(endpointID, ContainerOverview.class);
        containerOverviews = FXCollections.observableArrayList(containersA);
        containerOverviewTableView.setItems(containerOverviews);
    }

    @FXML
    private void handleAddContainerB() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("ContainerAdd", "Add Container");
    }

    @FXML
    private void handleSearchTF() {

    }

}
