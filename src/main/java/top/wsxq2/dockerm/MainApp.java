package top.wsxq2.dockerm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import top.wsxq2.dockerm.controller.PrimaryController;
import top.wsxq2.dockerm.util.Global;

import java.io.IOException;

public class MainApp extends Application {
    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);
    private Stage primaryStage;
    private VBox primaryLayout;
    private PrimaryController primaryController;

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public void setPrimaryStage(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setMaximized(true);
        this.primaryStage = primaryStage;
        Global.setPrimaryStage(primaryStage);
        this.primaryStage.setTitle("DockerM");

        initRootLayout();
    }

    private void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
//            logger.info(getClass().getResource(".").toString());
            loader.setLocation(getClass()
                    .getResource("/Primary.fxml"));
            primaryLayout = loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(primaryLayout);
            primaryStage.setScene(scene);

            // Give the controller access to the main app.
            primaryController = loader.getController();
            primaryController.init(primaryStage);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

