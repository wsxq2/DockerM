package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.apache.commons.lang3.tuple.Pair;
import top.wsxq2.dockerm.model.portainer.Template;
import top.wsxq2.dockerm.util.ControllerUtil;
import top.wsxq2.dockerm.util.Global;

import java.util.Collection;
import java.util.List;

public class TemplatesController extends ControllerEndpoint {
    @FXML
    private VBox templateOverviewsVBox;

    private PrimaryController primaryController;
    private HBox selectedTemplateHBox;

    @Override
    protected void initialize() {
        primaryController = Global.getPrimaryController();
        super.initialize();
    }

    @Override
    public void refresh() {
        Collection<Template> templates = callApiUtil.getDataItems(Template.class);

        List<Node> list = templateOverviewsVBox.getChildren();
        list.clear();

        for (Template template : templates) {
            Pair<HBox, TemplateOverviewController> vBoxBaseControllerPair = ControllerUtil.getNodeControllerByFXML(
                    "TemplateOverview");
            assert vBoxBaseControllerPair != null;
            HBox templateOverviewHBox = vBoxBaseControllerPair.getLeft();
            TemplateOverviewController toc = vBoxBaseControllerPair.getRight();
            toc.setItem(template);

            templateOverviewHBox.addEventHandler(MouseEvent.MOUSE_CLICKED,
                    event -> {
                        if (selectedTemplateHBox != null)
                            selectedTemplateHBox.setStyle("-fx-background-color: inherit");
                        primaryController.enableRightPane("TemplateDeploy", String.valueOf(template.getId()));
                        selectedTemplateHBox = templateOverviewHBox;
                        selectedTemplateHBox.setStyle("-fx-background-color: gray");
                    });
            list.add(templateOverviewHBox);
        }
    }

}
