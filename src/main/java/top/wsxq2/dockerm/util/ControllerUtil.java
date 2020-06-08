package top.wsxq2.dockerm.util;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;
import top.wsxq2.dockerm.MainApp;
import top.wsxq2.dockerm.model.portainer.Portainer;
import top.wsxq2.dockerm.model.portainer.ResourceControl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ControllerUtil {
    public static <T1, T2> Pair<T1, T2> getNodeControllerByFXML(String name) {
        FXMLLoader loader = getFXMLLoader(name);

        try {
            T1 t1 = loader.load();
            T2 t2 = loader.getController();
            return new ImmutablePair<>(t1, t2);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static FXMLLoader getFXMLLoader(String fxmlFilename) {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApp.class.getResource("/" + fxmlFilename + ".fxml"));
        return loader;
    }

    public static ReadOnlyStringWrapper getAccessControlWrapper(Portainer portainer) {
        if (portainer == null) {
            return new ReadOnlyStringWrapper("Administrator");
        }
        ResourceControl resourceControl = portainer.getResourceControl();
        String res;
        if (resourceControl.getAdministratorsOnly()) {
            res = "Administrator";
        } else if (resourceControl.getPublic()) {
            res = "Public";
        } else {
            res = "Restricted";
        }
        return new ReadOnlyStringWrapper(res);
    }

    public static ReadOnlyStringWrapper getAccessControlWrapper(Map<String, Object> teamAccessPolicies, Map<String,
            Object> userAccessPolicies) {
        String res;
        if (teamAccessPolicies.size() == 0 && userAccessPolicies.size() == 0) {
            res = "Administrator";
        } else {
            res = "Restricted";
        }
        return new ReadOnlyStringWrapper(res);
    }

    public static ReadOnlyStringWrapper getListStringWrapper(List<String> list) {
        if (list != null && list.size() > 0) {
            return new ReadOnlyStringWrapper(String.join(", ", list));
        } else {
            return new ReadOnlyStringWrapper("-");
        }
    }

    public static <T> T getFirstOfList(List<T> list) {
        if (list != null && list.size() > 0) {
            return list.get(0);
        } else {
            return null;
        }
    }

    public static void showDialogWithPage(Stage owner, String pageName, String title) {
        Pane pane = ControllerUtil.getNodeByFXML(pageName);
        Stage stage = GuiUtil.createDialog(owner, title, pane);
        stage.showAndWait();
    }

    public static <T> T getNodeByFXML(String name) {
        FXMLLoader loader = getFXMLLoader(name);

        try {
            return loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void showDialogWithPageUsingPrimaryStage(String pageName, String title) {
        Pane pane = ControllerUtil.getNodeByFXML(pageName);
        Stage stage = GuiUtil.createDialog(Global.getPrimaryStage(), title, pane);
        stage.showAndWait();
    }

}
