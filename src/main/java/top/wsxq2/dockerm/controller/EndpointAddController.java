package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import org.controlsfx.control.CheckComboBox;
import org.controlsfx.validation.ValidationSupport;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wsxq2.dockerm.model.portainer.Endpoint;
import top.wsxq2.dockerm.model.portainer.EndpointGroup;
import top.wsxq2.dockerm.model.portainer.Tag;
import top.wsxq2.dockerm.util.*;

import java.util.List;
import java.util.Map;

public class EndpointAddController {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    public ToggleGroup environmentTypeTG;
    @FXML
    private ToggleButton dockerAPITB;
    @FXML
    private ToggleButton portainerAgentTB;
    @FXML
    private TextField nameField;
    @FXML
    private TextField urlFiled;
    @FXML
    private ComboBox<EndpointGroup> endpointGroupCB;
    @FXML
    private CheckComboBox<Tag> tagsCCB;
    private Stage dialogStage;

    private Map<Toggle, Integer> toggleIntegerMap;
    private CallApiUtil callApiUtil;

    @FXML
    private void initialize() {
        toggleIntegerMap = Map.of(dockerAPITB, 1, portainerAgentTB, 2);

        ValidationSupport validationSupport = new ValidationSupport();
        validationSupport.initInitialDecoration();
        validationSupport.registerValidator(nameField, ValidatorUtil.getEmptyValidator());
        validationSupport.registerValidator(urlFiled, ValidatorUtil.getUrlValidator());

        this.callApiUtil = Global.getCallApiUtil();
        this.dialogStage = Global.getPrimaryStage();
        endpointGroupCB.getItems().setAll(callApiUtil.getDataItems(EndpointGroup.class));
        endpointGroupCB.setConverter(new StringConverter<>() {
            @Override
            public EndpointGroup fromString(String string) {
                return null;
            }

            @Override
            public String toString(EndpointGroup object) {
                return object == null ? null : object.getName();
            }
        });
        tagsCCB.getItems().setAll(callApiUtil.getDataItems(Tag.class));
        tagsCCB.setConverter(new StringConverter<>() {
            @Override
            public Tag fromString(String string) {
                return null;
            }

            @Override
            public String toString(Tag object) {
                return object.getName();
            }
        });

    }

    public void init(CallApiUtil callApiUtil, Stage dialogStage) {
        tagsCCB.focusedProperty().addListener((o, ov, nv) -> {
            if (nv) tagsCCB.show();
            else tagsCCB.hide();
        });
    }

    @FXML
    private void handleSubmit() {
        List<Tag> tagsList = tagsCCB.getCheckModel().getCheckedItems();
        String[] tags = null;
        if (tagsList != null) {
            tags = tagsList.stream().map(Tag::getName).toArray(String[]::new);
        }
        EndpointGroup endpointGroup = endpointGroupCB.getSelectionModel().getSelectedItem();
        Toggle toggle = environmentTypeTG.getSelectedToggle();
        int type = toggleIntegerMap.get(environmentTypeTG.getSelectedToggle());
        Map<Object, Object> endpoint = Map.of("EndpointType", type, "Name",
                nameField.getText(), "URL", urlFiled.getText(), "GroupID", endpointGroup == null ? "" : endpointGroup
                , "Tags",
                tags == null ? "" : JsonUtil.gson.toJson(tags));

        String res = callApiUtil.addDataItemByMap(Endpoint.class, endpoint);
        if (res == null) {
            Alert alert = GuiUtil.createAlert(dialogStage, Alert.AlertType.ERROR, "Add endpoint error", "Maybe " +
                    "something you input is wrong?");
            alert.showAndWait();
            return;
        }
        dialogStage.close();
    }

}
