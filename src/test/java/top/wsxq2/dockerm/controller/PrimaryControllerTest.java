package top.wsxq2.dockerm.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.base.NodeMatchers;
import top.wsxq2.dockerm.MainApp;
import top.wsxq2.dockerm.util.ControllerUtil;

import java.io.IOException;

public class PrimaryControllerTest extends ApplicationTest {
    PrimaryController primaryController;

    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader loader = ControllerUtil.getFXMLLoader("Primary");
            Parent primaryLayout = loader.load();
            Stage primaryStage = stage;

            Scene scene = new Scene(primaryLayout);
            primaryStage.setScene(scene);

            primaryController = loader.getController();
            MainApp mainApp = new MainApp();
            mainApp.setPrimaryStage(primaryStage);
            primaryController.init(stage);

            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    @Test
    public void testHandleNew() {
        push(KeyCode.CONTROL, KeyCode.N);
        clickOn(offset("Portainer URL:", 100, 0)).write("http://192.168.56.11:9000");
        clickOn("Next");
        clickOn(offset("Username:", 100, 0)).write("admin");
        clickOn(offset("Password:", 100, 0)).write("TWNX31004");
        push(KeyCode.TAB).push(KeyCode.getKeyCode("Tab")).push(KeyCode.TAB).push(KeyCode.ENTER);
        sleep(1000);
        FxAssert.verifyThat("Add", NodeMatchers.isNotNull());
    }
}