package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;
import org.apache.commons.lang3.StringUtils;
import top.wsxq2.dockerm.model.docker.container.*;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.DateUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static top.wsxq2.dockerm.util.StringUtil.defaultIfEmpty;

public class ContainerDetailsController extends RightControllerEndpoint {
    @FXML
    private Text idT;
    @FXML
    private Text nameT;
    @FXML
    private Text ipAddressT;
    @FXML
    private Text statusT;
    @FXML
    private Text createdT;
    @FXML
    private Text startTimeT;
    @FXML
    private Text stopTimeT;

    @FXML
    private Text imageT;
    @FXML
    private Text portConfigurationT;
    @FXML
    private Text cmdT;
    @FXML
    private Text entryPointT;
    @FXML
    private ListView<String> envLV;
    @FXML
    private Text restartPoliciesT;

    @FXML
    private TableView<Mount> usedVolumesTV;
    @FXML
    private TableColumn<Mount, String> vNameCol;
    @FXML
    private TableColumn<Mount, String> vDriverCol;
    @FXML
    private TableColumn<Mount, String> vDestinationCol;

    @FXML
    private TableView<NetworkSettingsNetwork> connectedNetworksTV;
    @FXML
    private TableColumn<NetworkSettingsNetwork, String> nNameCol;
    @FXML
    private TableColumn<NetworkSettingsNetwork, String> nIPAddressCol;
    @FXML
    private TableColumn<NetworkSettingsNetwork, String> nGatewayCol;
    @FXML
    private TableColumn<NetworkSettingsNetwork, String> nMacAddressCol;

    private Container container;

    @Override
    protected void initialize() {
        super.initialize();
        initDetailTab();
    }

    private void initDetailTab() {
        vNameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getName()));
        vDriverCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getDriver()));
        vDestinationCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getDestination()));
        nNameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(defaultIfEmpty(x.getValue().getName())));
        nIPAddressCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(defaultIfEmpty(x.getValue().getIPAddress())));
        nGatewayCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(defaultIfEmpty(x.getValue().getGateway())));
        nMacAddressCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(defaultIfEmpty(x.getValue().getMacAddress())));
    }

    @Override
    public void refresh() {
        this.container = callApiUtil.getDataItemDocker(endpointID, Container.class, selectedID);
        assert container != null;
        setStatusTab();
        setDetailTab();
    }

    private void setStatusTab() {
        String text = "-";
        idT.setText(container.getId());
        nameT.setText(container.getName().substring(1));

        text = container.getNetworkSettings().getIPAddress();
        text = StringUtils.isEmpty(text) ? "-" : text;
        ipAddressT.setText(text);

        statusT.setText(container.getState().getStatus());
        createdT.setText(DateUtil.format(container.getCreated()));
        startTimeT.setText(DateUtil.format(container.getState().getStartedAt()));
        stopTimeT.setText(DateUtil.format(container.getState().getFinishedAt()));

    }

    private void setDetailTab() {
        String text = "-";
        List<String> texts;
        imageT.setText(container.getImage());

        List<Port> ports = container.getPorts();
        if (ports.size() > 0) {
            Port port = ports.get(0);
            text = String.format("%s:%d->%d/%s", port.getIP(), port.getPublicPort(), port.getPrivatePort(),
                    port.getType());
        }
        portConfigurationT.setText(text);

        texts = container.getConfig().getCmd();
        text = String.join(", ", texts == null ? new ArrayList<>() : texts);
        text = StringUtils.isEmpty(text) ? "-" : text;
        cmdT.setText(text);

        texts = container.getConfig().getEntrypoint();
        text = String.join(", ", texts == null ? new ArrayList<>() : texts);
        text = StringUtils.isEmpty(text) ? "-" : text;
        entryPointT.setText(text);

        texts = container.getConfig().getEnv();
        envLV.setItems(FXCollections.observableArrayList(texts));

        RestartPolicy restartPolicy = container.getHostConfig().getRestartPolicy();
        text = restartPolicy.getName();
        text = StringUtils.isEmpty(text) ? "-" : text;
        restartPoliciesT.setText(text);

        Mount[] mounts = container.getMounts().stream().filter(x -> "volume".equals(x.getType())).toArray(Mount[]::new);
        usedVolumesTV.setItems(FXCollections.observableArrayList(mounts));

        Map<String, NetworkSettingsNetwork> map = container.getNetworkSettings().getNetworks();
        for (String key : map.keySet()) {
            map.get(key).setName(key);
        }
        connectedNetworksTV.setItems(FXCollections.observableArrayList(map.values()));

    }

    private void handleX(String pageName, String title) {
        ControllerUtil.showDialogWithPageUsingPrimaryStage(pageName, title);
    }

    @FXML
    private void handleLogs() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("ContainerLog", "Container Logs");
    }

    @FXML
    private void handleInspect() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("ContainerInspect", "Container Inspect");
    }

    @FXML
    private void handleStats() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("ContainerStats", "Container Stats");
    }

    @FXML
    private void handleConsole() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("ContainerConsole", "Container Console");
    }

    @FXML
    private void handleAttach() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("ContainerAttach", "Attach");
    }
}
