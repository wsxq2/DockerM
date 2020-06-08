package top.wsxq2.dockerm.controller;

import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.util.WaitForAsyncUtils;
import top.wsxq2.dockerm.util.CallApiUtil;

import java.io.IOException;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.control.LabeledMatchers.hasText;

public class EndpointAddControllerTest extends ApplicationTest {

    Logger logger = LoggerFactory.getLogger(getClass());
    Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
    }

    @Before
    public void beforeEachTest() throws Exception {
        Platform.runLater(() -> {
            logger.debug("start");
            FXMLLoader loader = new FXMLLoader(
                    getClass().getResource("/EndpointAdd.fxml"));
            VBox vBox = null;
            try {
                vBox = loader.load();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }

            stage.setScene(new Scene(new ScrollPane(vBox), 1000, 1000));
            stage.setTitle("EndpointAdd");
            EndpointAddController endpointAddController = loader.getController();
            endpointAddController.init(new CallApiUtil("http://192.168.56.11:9000", "admin", "TWNX31004", false),
                    stage);
            stage.show();
            logger.debug("end");
        });
        WaitForAsyncUtils.waitForFxEvents();
    }

    @Test
    public void testShow() {
        verifyThat(".label", hasText("Name"));
    }

    @Test
    public void testSubmit() {
        clickOn("Docker API");
        clickOn("#Name").write(RandomStringUtils.randomAlphanumeric(10));
        clickOn("#URL").write("http://192.168.56.11:1234");
        clickOn("#Group").clickOn(offset("#Group", 0, 25));
        clickOn("#Tags").clickOn(offset("#Tags", 0, 25));
        clickOn("Submit");
        sleep(3000);
    }

    @Test
    public void hand() {
        sleep(10000);
    }
}