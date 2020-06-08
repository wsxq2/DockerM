package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import top.wsxq2.dockerm.model.docker.network.Config;
import top.wsxq2.dockerm.model.docker.networkoverview.NetworkOverview;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.Global;

public class NetworksController extends ControllerEndpoint {
    @FXML
    private TableColumn<NetworkOverview, String> nameCol;
    @FXML
    private TableColumn<NetworkOverview, String> scopeCol;
    @FXML
    private TableColumn<NetworkOverview, String> driverCol;
    @FXML
    private TableColumn<NetworkOverview, String> attachableCol;
    @FXML
    private TableColumn<NetworkOverview, String> internalCol;
    @FXML
    private TableColumn<NetworkOverview, String> ipamDriverCol;
    @FXML
    private TableColumn<NetworkOverview, String> ipamSubnetCol;
    @FXML
    private TableColumn<NetworkOverview, String> ipamGatewayCol;
    @FXML
    private TableColumn<NetworkOverview, String> accessControlCol;

    @FXML
    private TableView<NetworkOverview> networkOverviewTV;
    private PrimaryController primaryController;

    @Override
    protected void initialize() {
        super.initialize();
        this.primaryController = Global.getPrimaryController();

        networkOverviewTV.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        networkOverviewTV.getSelectionModel().selectedItemProperty().addListener((ob, old, newV) -> {
            if (newV == null) return;
            primaryController.enableRightPane("NetworkDetails", newV.getId());
        });

        nameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getName()));
        scopeCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getScope()));
        driverCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getDriver()));
        attachableCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getAttachable().toString()));
        internalCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getInternal().toString()));
        ipamDriverCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getIpam().getDriver()));
        ipamSubnetCol.setCellValueFactory(x -> {
            Config config = ControllerUtil.getFirstOfList(x.getValue().getIpam().getConfig());
            return new ReadOnlyStringWrapper(config == null ? "-" : config.getSubnet());
        });
        ipamGatewayCol.setCellValueFactory(x -> {
            Config item = ControllerUtil.getFirstOfList(x.getValue().getIpam().getConfig());
            return new ReadOnlyStringWrapper(item == null ? "-" : item.getGateway());
        });
        accessControlCol.setCellValueFactory(x -> ControllerUtil.getAccessControlWrapper(x.getValue().getPortainer()));
        refresh();
    }

    @Override
    public void refresh() {
        NetworkOverview[] networkOverview = callApiUtil.getDataItemsDocker(endpointID, NetworkOverview.class);
        networkOverviewTV.setItems(FXCollections.observableArrayList(networkOverview));

    }

    @FXML
    private void handleAdd() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("NetworkAdd", "Add a new network");
    }


}
