package top.wsxq2.dockerm.controller;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import top.wsxq2.dockerm.model.portainer.Team;
import top.wsxq2.dockerm.model.portainer.TeamMembership;
import top.wsxq2.dockerm.model.portainer.User;
import top.wsxq2.dockerm.util.ControllerUtil;

import java.util.ArrayList;
import java.util.List;

public class TeamsController extends BaseController {
    @FXML
    private TableView<Team> teamTableView;

    @FXML
    private TableColumn<Team, String> nameCol;
    @FXML
    private TableColumn<Team, String> leadersCol;
    @FXML
    private TableColumn<Team, String> otherMembersCol;

    @FXML
    private void handleAdd() {
        ControllerUtil.showDialogWithPageUsingPrimaryStage("TeamAdd", "Add a new team");
    }


    @Override
    protected void initialize() {
        super.initialize();
        nameCol.setCellValueFactory(x -> new ReadOnlyStringWrapper(String.valueOf(x.getValue().getName())));
        leadersCol.setCellValueFactory(x -> {
            TeamMembership[] teamMemberships = callApiUtil.getThingsWithPath(TeamMembership.class, String.format(
                    "teams/%d" +
                            "/memberships", x.getValue().getId()));
            List<String> leaders = new ArrayList<>();
            for (TeamMembership teamMembership : teamMemberships) {
                if (teamMembership.getRole() == 1) {
                    leaders.add(callApiUtil.getDataItemById(User.class, teamMembership.getUserID()).getUsername());
                }
            }

            return new ReadOnlyStringWrapper(leaders.toString());
        });
        otherMembersCol.setCellValueFactory(x -> {
            TeamMembership[] teamMemberships = callApiUtil.getThingsWithPath(TeamMembership.class, String.format(
                    "teams/%d" +
                            "/memberships", x.getValue().getId()));
            List<String> others = new ArrayList<>();
            for (TeamMembership teamMembership : teamMemberships) {
                if (teamMembership.getRole() == 2) {
                    others.add(callApiUtil.getDataItemById(User.class, teamMembership.getUserID()).getUsername());
                }
            }
            return new ReadOnlyStringWrapper(others.toString());
        });


    }

    @Override
    public void refresh() {
        teamTableView.setItems(FXCollections.observableArrayList(callApiUtil.getDataItems(Team.class)));

    }
}
