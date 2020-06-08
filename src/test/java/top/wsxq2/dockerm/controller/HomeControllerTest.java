package top.wsxq2.dockerm.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testfx.api.FxToolkit;
import org.testfx.framework.junit.ApplicationTest;
import top.wsxq2.dockerm.util.CallApiUtil;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

public class HomeControllerTest extends ApplicationTest {
    Logger logger = LoggerFactory.getLogger(getClass());
    private Scene scene;
    private HomeController homeController;
    private Stage stage;
    private CallApiUtil callApiUtil;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        FxToolkit.hideStage();
        release(new KeyCode[]{});
        release(new MouseButton[]{});
    }

    @Override
    public void start(Stage stage) throws Exception {
        logger.debug("start");
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/Home.fxml"));
        VBox vBox = loader.load();
        scene = new Scene(new ScrollPane(vBox));

        stage.setScene(scene);
        homeController = loader.getController();
        this.stage = stage;
        stage.setTitle("Home");
        this.callApiUtil = new CallApiUtil("http://192.168.56.11:9000", "admin", "TWNX31004", false);
//        homeController.init(callApiUtil,stage);
        stage.show();
//        Platform.setImplicitExit(false);
        logger.debug("end");
    }

    @Test
    public void testShow() throws InterruptedException {
//        assertNotNull(homeController);
//        assert homeController!=null;
        verifyThat(".button", hasText("Add"));
    }

    @Test
    public void testAdd() {
//        clickOn("Add");
//        verifyThat(".button",hasText("Submit"));
        sleep(1000000);
    }


}