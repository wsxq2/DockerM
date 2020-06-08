package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.util.StringConverter;
import org.controlsfx.control.CheckComboBox;
import top.wsxq2.dockerm.model.portainer.*;
import top.wsxq2.dockerm.util.CallApiUtil;

import java.util.Collection;
import java.util.List;

public class AccessControlController {
    @FXML
    private ToggleGroup accessControlGroup;
    @FXML
    private ToggleButton administratorTB;
    @FXML
    private ToggleButton restrictedTB;
    @FXML
    private ToggleButton publicTB;
    @FXML
    private CheckComboBox<Team> teamsCCB;
    @FXML
    private CheckComboBox<User> usersCCB;
    @FXML
    private VBox rootVBox;
    @FXML
    private GridPane restrictedGP;

    public ToggleButton getAdministratorTB() {
        return administratorTB;
    }

    public ToggleButton getPublicTB() {
        return publicTB;
    }

    public ResourceControl getCurrentValue() {
        List<User> users = usersCCB.getCheckModel().getCheckedItems();
        int usersLen = users.size();
        UserAccess[] userAccesses = new UserAccess[usersLen];
        for (int i = 0; i < usersLen; i++) {
            userAccesses[i] = new UserAccess(users.get(i).getId());
        }
        List<Team> teams = teamsCCB.getCheckModel().getCheckedItems();
        int teamsLen = teams.size();
        TeamAccess[] teamAccesses = new TeamAccess[teamsLen];
        for (int i = 0; i < teamsLen; i++) {
            teamAccesses[i] = new TeamAccess(teams.get(i).getId());
        }
        return new ResourceControl(administratorTB.isSelected(), publicTB.isSelected(), teamAccesses, userAccesses);
    }

    @FXML
    private void initialize() {
        teamsCCB.focusedProperty().addListener((o, ov, nv) -> {
            if (nv) teamsCCB.show();
            else teamsCCB.hide();
        });
        usersCCB.focusedProperty().addListener((o, ov, nv) -> {
            if (nv) usersCCB.show();
            else usersCCB.hide();
        });

        accessControlGroup.selectedToggleProperty().addListener((observable, oldValue, newValue) -> {
            ToggleButton tb = (ToggleButton) accessControlGroup.getSelectedToggle();
            if (tb == restrictedTB) {
                rootVBox.getChildren().add(restrictedGP);

            } else {
                rootVBox.getChildren().remove(restrictedGP);
            }
        });
    }

    public void init(CallApiUtil callApiUtil) {
        usersCCB.getItems().setAll((Collection<User>) callApiUtil.getDataItems(User.class));
        usersCCB.setConverter(new StringConverter<User>() {
            @Override
            public User fromString(String string) {
                return null;
            }

            @Override
            public String toString(User object) {
                return object.getUsername();
            }
        });
        teamsCCB.getItems().setAll((Collection<Team>) callApiUtil.getDataItems(Team.class));
        teamsCCB.setConverter(new StringConverter<Team>() {
            @Override
            public Team fromString(String string) {
                return null;
            }

            @Override
            public String toString(Team object) {
                return object.getName();
            }
        });

    }
}
