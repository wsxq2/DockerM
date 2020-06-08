package top.wsxq2.dockerm.controller;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import top.wsxq2.dockerm.model.docker.image.Image;
import top.wsxq2.dockerm.util.DateUtil;

public class ImageDetailsController extends RightControllerEndpoint {
    @FXML
    private Text idT;
    @FXML
    private Text sizeT;
    @FXML
    private Text createdT;

    @FXML
    private ListView<String> tagListView;

    @Override
    protected void initialize() {
        super.initialize();

    }

    @Override
    public void refresh() {
        Image image = callApiUtil.getDataItemDocker(endpointID, Image.class, selectedID);
        idT.setText(image.getId());
        sizeT.setText(image.getSize().toString());
        createdT.setText(DateUtil.format(image.getCreated()));

        tagListView.setItems(FXCollections.observableArrayList(image.getRepoTags()));
    }
}
