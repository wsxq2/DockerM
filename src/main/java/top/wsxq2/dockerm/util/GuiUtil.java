package top.wsxq2.dockerm.util;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class GuiUtil {
    public static Alert createAlert(Stage owner, Alert.AlertType type, String title, String contentText) {
        Alert dlg = new Alert(type, contentText);
        dlg.setTitle(title);
        dlg.initModality(Modality.WINDOW_MODAL);
        dlg.initOwner(owner);
        return dlg;
    }

    public static Alert createAlert(Stage owner, Alert.AlertType type, String title) {
        Alert dlg = new Alert(type, title);
        dlg.setTitle(title);
        dlg.initModality(Modality.WINDOW_MODAL);
        dlg.initOwner(owner);
        return dlg;
    }

    public static Stage createDialog(Stage owner, String title, Parent parent) {
        Stage dialogStage = new Stage();
        dialogStage.setTitle(title);
        dialogStage.initModality(Modality.WINDOW_MODAL);
        dialogStage.initOwner(owner);
        Scene scene = new Scene(parent);
        dialogStage.setScene(scene);
        return dialogStage;
    }
}
