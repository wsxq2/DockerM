package top.wsxq2.dockerm.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.apache.commons.lang3.tuple.Pair;
import org.controlsfx.dialog.Wizard;
import org.controlsfx.dialog.WizardPane;
import org.controlsfx.validation.ValidationSupport;
import org.controlsfx.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wsxq2.dockerm.MainApp;
import top.wsxq2.dockerm.model.portainer.AuthenticateUserRequest;
import top.wsxq2.dockerm.util.*;

import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.prefs.Preferences;

import static top.wsxq2.dockerm.util.ControllerUtil.getNodeControllerByFXML;

public class PrimaryController {
    private static final Logger logger = LoggerFactory.getLogger(PrimaryController.class);
    @FXML
    private Button homeB;
    @FXML
    private Button appTemplatesB;
    @FXML
    private Button containersB;
    @FXML
    private Button imagesB;
    @FXML
    private Button networksB;
    @FXML
    private Button volumesB;
    @FXML
    private Button hostB;
    @FXML
    private Button eventsB;
    @FXML
    private SplitPane splitPane;
    @FXML
    private Pane leftPane;
    @FXML
    private Pane middlePane;
    @FXML
    private Pane rightPane;
    private Map<String, Pair<TabPane, ? extends RightControllerEndpoint>> rightContentMap;
    private Map<String, Pair<VBox, ? extends BaseController>> middleContentMap;
    private Map<String, Stage> settingsMap;
    private URL portainerURL;
    private CallApiUtil callApiUtil;
    private Stage primaryStage;
    private AuthenticateUserRequest authenticateUserRequest;

    private Preferences preferences;
    private Button currentSelected;


    @FXML
    private void initialize() {
        Global.setPrimaryController(this);
        settingsMap = new HashMap<>();
        preferences = Preferences.userNodeForPackage(MainApp.class);
        if (preferences.get("url", null) != null) {
            String url = preferences.get("url", null);
            String user = preferences.get("user", null);
            String pass = preferences.get("pass", null);
            handleNewPart(url, user, pass, false);
        }
    }

    private void handleNewPart(String url, String user, String pass, boolean init) {
        try {
            callApiUtil = Global.setAndGetCallApiUtil(url, user, pass, init);
            preferences.put("url", url);
            preferences.put("user", user);
            preferences.put("pass", pass);
            authenticateUserRequest = callApiUtil.getAuthenticateUserRequest();
            portainerURL = callApiUtil.getPortainerURL();

            rightContentMap = new HashMap<>();
            middleContentMap = new HashMap<>();

            handleHome();
        } catch (IllegalArgumentException e) {
            logger.error(e.getLocalizedMessage());
            Alert dlg = GuiUtil.createAlert(primaryStage, Alert.AlertType.ERROR, "wizard input " +
                    "error", "URL or " +
                    "Username or " +
                    "Password is not " +
                    "correct");
            dlg.showAndWait();
        }
    }

    @FXML
    private void handleHome() {
        if (currentSelected != null)
            currentSelected.setUnderline(false);
        currentSelected = homeB;
//        currentSelected.setUnderline(true);
        setMiddlePane("Home");
        toggleLeftPane(false);
        disableRightPane();
    }

    public void setMiddlePane(String pageName) {
        Pair<VBox, ? extends BaseController> paneControllerPair;
        if (middleContentMap.get(pageName) == null) {
            paneControllerPair = getNodeControllerByFXML(pageName);
            assert paneControllerPair != null;
            VBox vBox = paneControllerPair.getLeft();
            AnchorPane.setBottomAnchor(vBox, (double) 0);
            AnchorPane.setTopAnchor(vBox, (double) 0);
            AnchorPane.setRightAnchor(vBox, (double) 0);
            AnchorPane.setLeftAnchor(vBox, (double) 0);
            middleContentMap.put(pageName, paneControllerPair);
        } else {
            paneControllerPair = middleContentMap.get(pageName);
        }
        BaseController baseController = paneControllerPair.getRight();
        if (baseController != null) {
            baseController.refresh();
        }
        middlePane.getChildren().setAll(paneControllerPair.getLeft());
    }

    public void toggleLeftPane(boolean yes) {
        List<Node> list = splitPane.getItems();
        if (yes) {
            if (list.contains(leftPane)) return;
            list.add(0, leftPane);
            splitPane.setDividerPositions(0.125);
        } else {
            list.remove(leftPane);
        }
    }

    public void disableRightPane() {
        splitPane.getItems().remove(rightPane);
    }

    @FXML
    public void handleContainers() {
        currentSelected.setUnderline(false);
        currentSelected = containersB;
        currentSelected.setUnderline(true);
        setMiddlePane("Containers");
        disableRightPane();
    }

    @FXML
    private void handleAppTemplates() {
        currentSelected.setUnderline(false);
        currentSelected = appTemplatesB;
        currentSelected.setUnderline(true);
        setMiddlePane("Templates");
        disableRightPane();
    }

    @FXML
    public void handleImages() {
        currentSelected.setUnderline(false);
        currentSelected = imagesB;
        currentSelected.setUnderline(true);
        setMiddlePane("Images");
        disableRightPane();
    }

    @FXML
    public void handleNetworks() {
        currentSelected.setUnderline(false);
        currentSelected = networksB;
        currentSelected.setUnderline(true);
        setMiddlePane("Networks");
        disableRightPane();
    }

    @FXML
    public void handleVolumes() {
        currentSelected.setUnderline(false);
        currentSelected = volumesB;
        currentSelected.setUnderline(true);
        setMiddlePane("Volumes");
        disableRightPane();
    }

    @FXML
    public void handleHost() {
        currentSelected.setUnderline(false);
        currentSelected = hostB;
        currentSelected.setUnderline(true);
        toggleLeftPane(true);
        setMiddlePane("Host");
        enableRightPane("HostOverview", "");
    }

    public void enableRightPane(String pageName, String selectedID) {
        List<Node> list = splitPane.getItems();
        Pair<TabPane, ? extends RightControllerEndpoint> tabPaneControllerPair;
        if (rightContentMap.get(pageName) == null) {
            tabPaneControllerPair = getNodeControllerByFXML(pageName);
            assert tabPaneControllerPair != null;
//            logger.debug("tabPaneControllerPair.getRight:{}", tabPaneControllerPair.getRight());

            TabPane tabPane = tabPaneControllerPair.getLeft();
            AnchorPane.setBottomAnchor(tabPane, (double) 0);
            AnchorPane.setTopAnchor(tabPane, (double) 0);
            AnchorPane.setRightAnchor(tabPane, (double) 0);
            AnchorPane.setLeftAnchor(tabPane, (double) 0);
            rightContentMap.put(pageName, tabPaneControllerPair);
        } else {
            tabPaneControllerPair = rightContentMap.get(pageName);
        }
        RightControllerEndpoint rightPaneController = tabPaneControllerPair.getRight();
//        logger.debug("pageName: {}, selectedID: {}, rightPaneController:{}",pageName,selectedID, rightPaneController);
        if (rightPaneController != null) {
            rightPaneController.setItem(selectedID);
        }
        rightPane.getChildren().setAll(tabPaneControllerPair.getLeft());
        if (list.contains(rightPane)) return;
        list.add(rightPane);
        splitPane.setDividerPositions(0.06, 0.65);
    }

    @FXML
    private void handleEvents() {
        currentSelected.setUnderline(false);
        currentSelected = eventsB;
        currentSelected.setUnderline(true);
        setMiddlePane("Events");
        disableRightPane();
    }

    @FXML
    private void handleFileNew() {
        Wizard wizard = createNewWizard();
        wizard.showAndWait().filter(result -> result == ButtonType.FINISH).ifPresent(result -> {
            Map<String, Object> settingMap = wizard.getSettings();
            String url = (String) settingMap.get("URL");
            String user = (String) settingMap.get("username");
            String pass = (String) settingMap.get("password");
            boolean init = (boolean) settingMap.getOrDefault("init", false);
            logger.debug("from wizard: url={}, user={}, pass={}", url, user, pass);
            handleNewPart(url, user, pass, init);
        });
    }

    private Wizard createNewWizard() {
        Wizard wizard = new Wizard(primaryStage);
        wizard.setTitle("Create a new session");

        WizardPane page1 = new WizardPane() {
            final ValidationSupport vs = new ValidationSupport();

            {
                vs.initInitialDecoration();

                GridPane page1Grid = new GridPane();
                page1Grid.setVgap(10);
                page1Grid.setHgap(10);

                page1Grid.add(new Label("Portainer URL:"), 0, 0);
                TextField tfURL = new TextField();
                tfURL.setPromptText("e.g. http://192.168.56.11:9000");
//                vs.registerValidator(tfURL, Validator.createRegexValidator("Not a valid URL!", "\\b
//                (https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]", Severity.ERROR);
                tfURL.setId("URL");
                GridPane.setHgrow(tfURL, Priority.ALWAYS);
                vs.registerValidator(tfURL, ValidatorUtil.getUrlValidator());
                page1Grid.add(tfURL, 1, 0);

                setContent(page1Grid);
            }

            @Override
            public void onEnteringPage(Wizard wizard) {
                wizard.invalidProperty().unbind();
                wizard.invalidProperty().bind(vs.invalidProperty());
            }
        };

        WizardPane page2 = new WizardPane() {
            final ValidationSupport vs = new ValidationSupport();

            {
                vs.initInitialDecoration();

                int row = 0;

                GridPane page2Grid = new GridPane();
                page2Grid.setVgap(10);
                page2Grid.setHgap(10);

                page2Grid.add(new Label("Username:"), 0, row);
                TextField tfUsername = new TextField();
                tfUsername.setPromptText("e.g. admin");
                GridPane.setHgrow(tfUsername, Priority.ALWAYS);
                tfUsername.setId("username");
                vs.registerValidator(tfUsername, ValidatorUtil.getEmptyValidator());
                page2Grid.add(tfUsername, 1, row++);

                page2Grid.add(new Label("Password:"), 0, row);
                PasswordField pfPassword = new PasswordField();
                GridPane.setHgrow(pfPassword, Priority.ALWAYS);
                pfPassword.setId("password");
                vs.registerValidator(pfPassword, Validator.createPredicateValidator((Predicate<String>) t ->
                        t.length() >= 8, "Password must be 8 characters long!"));
                page2Grid.add(pfPassword, 1, row++);

                page2Grid.add(new Text("Init: "), 0, row);
                CheckBox checkBox = new CheckBox("");
                checkBox.setId("init");
                page2Grid.add(checkBox, 1, row);

                setContent(page2Grid);
            }

            @Override
            public void onEnteringPage(Wizard wizard) {
                wizard.invalidProperty().unbind();
                wizard.invalidProperty().bind(vs.invalidProperty());
            }
        };

        // create wizard
        wizard.setFlow(new Wizard.LinearFlow(page1, page2));
        return wizard;
    }

    @FXML
    private void handleFileOpen() {

    }

    @FXML
    private void handleFileOpenRecent() {

    }

    @FXML
    private void handleFileSave() {

    }

    @FXML
    private void handleFileSaveAs() {

    }

    @FXML
    private void handleFileClose() {
        toggleLeftPane(false);
        disableRightPane();
        middlePane.getChildren().removeAll(middleContentMap.get("Home").getLeft());
        preferences.remove("url");
        preferences.remove("user");
        preferences.remove("pass");
    }

    @FXML
    private void handleFileQuit() {
        System.exit(0);
    }

    @FXML
    private void handleSettingsBasic() {
        handleS("SettingsBasic", "Basic Settings");
    }

    private void handleS(String pageName, String title) {
        if (settingsMap.get(pageName) == null) {
            settingsMap.put(pageName, GuiUtil.createDialog(Global.getPrimaryStage(), title.equals("") ? pageName :
                            title,
                    ControllerUtil.getNodeByFXML(pageName)));
        }
        settingsMap.get(pageName).showAndWait();

    }

    @FXML
    private void handleSettingsRegistries() {
        handleS("Registries", "");
    }

    @FXML
    private void handleSettingsTeams() {
        handleS("Teams", "");

    }

    @FXML
    private void handleSettingsUsers() {
        handleS("Users", "");

    }

    @FXML
    private void handleSettingsGroups() {
        handleS("Groups", "");
    }

    @FXML
    private void handleSettingsTags() {
        handleS("Tags", "");

    }

    @FXML
    private void handleHelpShortcuts() {

    }

    @FXML
    private void handleHelpHelp() {

    }

    @FXML
    private void handleHelpAbout() {
        handleS("About", "");
    }

    public void init(Stage stage) {
        primaryStage = stage;
//        Global.setPrimaryStage(primaryStage);
        splitPane.getItems().removeAll(leftPane, rightPane);
    }

}
