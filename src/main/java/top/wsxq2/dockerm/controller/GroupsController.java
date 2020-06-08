package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import top.wsxq2.dockerm.model.portainer.EndpointGroup;
import top.wsxq2.dockerm.util.ControllerUtil;

import java.util.Arrays;

public class GroupsController extends BaseController {

    @FXML
    private TableView<EndpointGroup> groupTableView;

    @FXML
    private TableColumn<EndpointGroup, String> nameCol;
    @FXML
    private TableColumn<EndpointGroup, String> descriptionCol;
    @FXML
    private TableColumn<EndpointGroup, String> tagsCol;
    @FXML
    private TableColumn<EndpointGroup, String> accessControlCol;

    @FXML
    private void handleAdd() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("GroupAdd", "Add a new group");
    }

    @Override
    protected void initialize() {
        super.initialize();
        nameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(String.valueOf(x.getValue().getName())));
        descriptionCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(String.valueOf(x.getValue().getDescription())));
        tagsCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(Arrays.toString(x.getValue().getTags())));
        accessControlCol.setCellValueFactory(x -> ControllerUtil.getAccessControlWrapper(x.getValue().getTeamAccessPolicies(),
                x.getValue().getUserAccessPolicies()));


    }

    @Override
    public void refresh() {
        groupTableView.setItems(FXCollections.observableArrayList(callApiUtil.getDataItems(EndpointGroup.class)));
    }
}
