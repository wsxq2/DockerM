package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import top.wsxq2.dockerm.model.portainer.User;
import top.wsxq2.dockerm.util.ControllerUtil;

public class UsersController extends BaseController {
    @FXML
    private TableView<User> userTableView;

    @FXML
    private TableColumn<User, String> nameCol;
    @FXML
    private TableColumn<User, String> roleCol;


    @FXML
    private void handleAdd() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("UserAdd", "Add a new user");
    }

    @Override
    protected void initialize() {
        super.initialize();
        nameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(String.valueOf(x.getValue().getUsername())));
        roleCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(String.valueOf(x.getValue().getRole())));
    }

    @Override
    public void refresh() {
        userTableView.setItems(FXCollections.observableArrayList(callApiUtil.getDataItems(User.class)));
    }
}
