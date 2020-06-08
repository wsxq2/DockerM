package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import top.wsxq2.dockerm.model.portainer.Registry;
import top.wsxq2.dockerm.util.ControllerUtil;

public class RegistriesController extends BaseController {
	@FXML
	private TableView<Registry> registryTableView;

	@FXML
	private TableColumn<Registry, String> rNameCol;
	@FXML
	private TableColumn<Registry, String> rUrlCol;
	@FXML
	private TableColumn<Registry, String> rAuthenticationCol;
	@FXML
	private TableColumn<Registry, String> rAccessControlCol;

	@Override
	protected void initialize() {
		super.initialize();
		rNameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getName()));
		rUrlCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getURL()));
		rAuthenticationCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(String.valueOf(x.getValue().isAuthentication())));
		rAccessControlCol.setCellValueFactory(x -> ControllerUtil.getAccessControlWrapper(x.getValue().getTeamAccessPolicies(),
				x.getValue().getUserAccessPolicies()));
	}

	@Override
	public void refresh() {
		registryTableView.setItems(FXCollections.observableArrayList(callApiUtil.getDataItems(Registry.class)));
	}

	@FXML
	private void handleAdd() {
		ControllerUtil.showDialogWithPageUsingPrimaryStage("RegistryAdd", "Add a new Registry");
	}


}
