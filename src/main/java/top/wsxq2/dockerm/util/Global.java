package top.wsxq2.dockerm.util;

import javafx.stage.Stage;
import top.wsxq2.dockerm.controller.PrimaryController;

public class Global {
    private static CallApiUtil callApiUtil;
    private static PrimaryController primaryController;
    private static Stage primaryStage;
    private static int selectedEndpointID;

    public static CallApiUtil getCallApiUtil() {
        return callApiUtil;
    }

    public static PrimaryController getPrimaryController() {
        return primaryController;
    }

    public static void setPrimaryController(PrimaryController controller) {
        primaryController = controller;
    }

    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }

    public static int getSelectedEndpointID() {
        return selectedEndpointID;
    }

    public static void setSelectedEndpointID(int selectedEndpointID) {
        Global.selectedEndpointID = selectedEndpointID;
    }

    public static CallApiUtil setAndGetCallApiUtil(String portainerURL, String pass, String url, boolean init) {
        callApiUtil = new CallApiUtil(portainerURL, pass, url, init);
        return callApiUtil;
    }
}
