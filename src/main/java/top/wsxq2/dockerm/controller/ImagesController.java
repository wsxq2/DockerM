package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.apache.commons.io.FileUtils;
import top.wsxq2.dockerm.model.docker.imageoverview.ImageOverview;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.DateUtil;
import top.wsxq2.dockerm.util.Global;

import java.util.List;

public class ImagesController extends ControllerEndpoint {
    @FXML
    private TableView<ImageOverview> imagesTV;

    @FXML
    private TableColumn<ImageOverview, String> idCol;
    @FXML
    private TableColumn<ImageOverview, String> tagsCol;
    @FXML
    private TableColumn<ImageOverview, String> sizeCol;
    @FXML
    private TableColumn<ImageOverview, String> createdCol;


    @Override
    protected void initialize() {
        super.initialize();
        PrimaryController primaryController = Global.getPrimaryController();

        imagesTV.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        imagesTV.getSelectionModel().selectedItemProperty().addListener((ob, old, newV) -> {
            if (newV == null) return;
            primaryController.enableRightPane("ImageDetails", newV.getId());
        });

//		indexCol.setCellValueFactory(i->new ReadOnlyObjectWrapper<>(imagesTV.getItems().indexOf(i.getValue())));
        idCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(x.getValue().getId()));
        tagsCol.setCellValueFactory(x -> {
            List<String> texts = x.getValue().getRepoTags();
            String text;
            if (texts != null && texts.size() > 0) {
                text = texts.get(0);
            } else {
                text = "-";
            }
            return new ReadOnlyStringWrapper(text);
        });
        sizeCol.setCellValueFactory((x -> new ReadOnlyStringWrapper(FileUtils.byteCountToDisplaySize(x.getValue().getSize()))));
        createdCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(DateUtil.format(x.getValue().getCreated())));
    }

    @Override
    public void refresh() {
        ImageOverview[] imageOverviews = callApiUtil.getDataItemsDocker(endpointID, ImageOverview.class);
        imagesTV.setItems(FXCollections.observableArrayList(imageOverviews));
    }

    @FXML
    private void handleBuild() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("ImageBuild", "Build new image");
    }
}
