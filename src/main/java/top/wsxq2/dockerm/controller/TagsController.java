package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import top.wsxq2.dockerm.model.portainer.Tag;
import top.wsxq2.dockerm.util.ControllerUtil;

import java.util.Collection;

public class TagsController extends BaseController {
    @FXML
    private TableView<Tag> tagsTV;

    @FXML
    private TableColumn<Tag, String> idCol;

    @FXML
    private TableColumn<Tag, String> nameCol;

    @Override
    protected void initialize() {
        super.initialize();
        idCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(String.valueOf(x.getValue().getId())));
        nameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getName()));
    }

    @FXML
    private void handleAdd() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("TagAdd", "Add a new tag");
    }


    @Override
    public void refresh() {
        Collection<Tag> tags = callApiUtil.getDataItems(Tag.class);
//        System.out.println(tags);
        tagsTV.setItems(FXCollections.observableArrayList(tags));
    }
}
