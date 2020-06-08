package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wsxq2.dockerm.model.portainer.Endpoint;
import top.wsxq2.dockerm.model.portainer.EndpointGroup;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.Global;
import top.wsxq2.dockerm.util.GuiUtil;

import java.io.IOException;
import java.util.Collection;
import java.util.Objects;
import java.util.stream.Collectors;

import static top.wsxq2.dockerm.util.Global.getPrimaryStage;

public class HomeController extends BaseController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @FXML
    private TextField searchField;
    @FXML
    private VBox endpointOverviewsVBox;
    private Collection<Endpoint> toBeDisplayedEndpoint;
    private PrimaryController primaryController;

    @FXML
    protected void initialize() {
        super.initialize();
        this.primaryController = Global.getPrimaryController();
        assert primaryController != null;

        this.toBeDisplayedEndpoint = callApiUtil.getDataItems(Endpoint.class);
        handleEndpointOverview();
//        KeyCombination kc = new KeyCodeCombination(KeyCode.F5);
//        assert Global.getPrimaryStage()!=null;
//        assert Global.getPrimaryStage().getScene()!=null;
////        logger.debug("Global.getPrimaryStage:{}, Global.getPrimaryStage().getScene: {}", Global.getPrimaryStage(),
////                Global.getPrimaryStage().getScene());
//        Map<KeyCombination, Runnable> accelerators = Global.getPrimaryStage().getScene().getAccelerators();
//        if(accelerators.get(kc)==null) {
//            accelerators.put(kc, () -> {
//                toBeDisplayedEndpoint = callApiUtil.getDataItems(Endpoint.class);
//                handleEndpointOverview();
//            });
//        }

    }

    private void handleEndpointOverview() {
//        logger.info("Start handleEndpointOverview");
        Collection<Endpoint> endpoints = toBeDisplayedEndpoint;
//        logger.debug("endpoints.size():{}", endpoints.size());

        endpointOverviewsVBox.getChildren().clear();

        try {
            for (Endpoint endpoint : endpoints) {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/EndpointOverview.fxml"));
                VBox endpointOverviewVBox = loader.load();
                endpointOverviewVBox.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
                    Global.setSelectedEndpointID(endpoint.getId());
                    primaryController.handleHost();
                });
                EndpointOverviewController eoc = loader.getController();
                eoc.init(callApiUtil);
                eoc.setEndpoint(endpoint);
                endpointOverviewsVBox.getChildren().add(endpointOverviewVBox);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        logger.info("End handleEndpointOverview");
    }

    @FXML
    private void handleAdd() {
        showEndpointAddDialog();
        toBeDisplayedEndpoint = callApiUtil.getDataItems(Endpoint.class);
        handleEndpointOverview();
    }

    private void showEndpointAddDialog() {
        VBox endpointAddVBox = ControllerUtil.getNodeByFXML("EndpointAdd");
        Stage dialogStage = GuiUtil.createDialog(getPrimaryStage(), "Add endpoint", endpointAddVBox);
        dialogStage.showAndWait();
    }

    @FXML
    private void handleSearch() {
        Collection<Endpoint> endpointCollection = callApiUtil.getDataItems(Endpoint.class);
        String searchText = searchField.getText();
        if (Objects.equals(searchText, "")) return;
        logger.debug("searchText:{}", searchText);
        toBeDisplayedEndpoint =
                endpointCollection.stream().filter((i) -> (i.toStringForSearch() + callApiUtil.getDataItemById(EndpointGroup.class, i.getGroupId())).contains(searchText)).collect(Collectors.toUnmodifiableList());
        handleEndpointOverview();
    }

    @Override
    public void refresh() {
        this.toBeDisplayedEndpoint = callApiUtil.getDataItems(Endpoint.class);
        handleEndpointOverview();
    }

}
