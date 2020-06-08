package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import top.wsxq2.dockerm.model.docker.containeroverview.ContainerOverview;
import top.wsxq2.dockerm.model.docker.network.Config;
import top.wsxq2.dockerm.model.docker.network.Network;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.JsonUtil;
import top.wsxq2.dockerm.util.StringUtil;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class NetworkDetailsController extends RightControllerEndpoint {
    @FXML
    private Text nameT;
    @FXML
    private Text idT;
    @FXML
    private Text driverT;
    @FXML
    private Text scopeT;
    @FXML
    private Text attachableT;
    @FXML
    private Text internalT;
    @FXML
    private Text subnetT;
    @FXML
    private Text gatewayT;

    @FXML
    private TableView<Map.Entry<String, String>> optionsTV;
    @FXML
    private TableColumn<Map.Entry<String, String>, String> keyCol;
    @FXML
    private TableColumn<Map.Entry<String, String>, String> valueCol;

    @FXML
    private TableView<ContainerOverview> containerOverviewTV;
    @FXML
    private TableColumn<ContainerOverview, String> cNameCol;
    @FXML
    private TableColumn<ContainerOverview, String> cIpv4AddressCol;
    @FXML
    private TableColumn<ContainerOverview, String> cIpv6AddressCol;
    @FXML
    private TableColumn<ContainerOverview, String> cMacAddressCol;

    @Override
    protected void initialize() {
        System.out.println("just for test");
        super.initialize();
        keyCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getKey()));
        valueCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getValue()));
        cNameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(ControllerUtil.getFirstOfList(x.getValue().getNames())));
    }

    @Override
    public void refresh() {
        Network network = callApiUtil.getDataItemDocker(endpointID, Network.class, selectedID);
        nameT.setText(network.getName());
        idT.setText(network.getId());
        driverT.setText(network.getDriver());
        scopeT.setText(network.getScope());
        attachableT.setText(network.getAttachable().toString());
        internalT.setText(network.getInternal().toString());
        Config item = ControllerUtil.getFirstOfList(network.getIpam().getConfig());
        subnetT.setText(item == null ? "-" : item.getSubnet());
        gatewayT.setText(item == null ? "-" : item.getSubnet());

        optionsTV.setItems(FXCollections.observableArrayList(network.getOptions().entrySet()));

        Map<String, String[]> map = Map.of("network", new String[]{selectedID});
        String para = URLEncoder.encode(JsonUtil.gson.toJson(map), StandardCharsets.UTF_8);
        String path = "containers/json?all=1&filters=" + para;
        ContainerOverview[] containerOverviews = callApiUtil.getDataItemsWithPathDocker(endpointID,
                ContainerOverview.class, path);
        containerOverviewTV.setItems(FXCollections.observableArrayList(containerOverviews));
        cIpv4AddressCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(StringUtil.defaultIfEmpty(x.getValue().getNetworkSettings().getNetworks().get(network.getName()).getIPAddress())));
        cIpv6AddressCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(StringUtil.defaultIfEmpty(x.getValue().getNetworkSettings().getNetworks().get(network.getName()).getGlobalIPv6Address())));
        cMacAddressCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(StringUtil.defaultIfEmpty(x.getValue().getNetworkSettings().getNetworks().get(network.getName()).getIPAddress())));
    }
}
