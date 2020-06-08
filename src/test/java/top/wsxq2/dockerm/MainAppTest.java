package top.wsxq2.dockerm;

import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import org.junit.Test;
import org.testfx.api.FxAssert;
import org.testfx.framework.junit.ApplicationTest;
import org.testfx.matcher.base.NodeMatchers;


public class MainAppTest extends ApplicationTest {
    @Override
    public void start(Stage stage) throws Exception {
        MainApp mainApp = new MainApp();
        mainApp.start(stage);
    }

    @Test
    public void testHandleNew() {
        push(KeyCode.CONTROL, KeyCode.N);
        clickOn(offset("Portainer URL:", 100, 0)).write("http://192.168.56.11:9000");
        clickOn("Next");
        clickOn(offset("Username:", 100, 0)).write("admin");
        clickOn(offset("Password:", 100, 0)).write("TWNX31004");
        push(KeyCode.TAB).push(KeyCode.getKeyCode("Tab")).push(KeyCode.TAB).push(KeyCode.ENTER);
        sleep(300000);
        FxAssert.verifyThat("Add", NodeMatchers.isNotNull());
//       Assertions.assertThat()
//        Node menuItem= lookup("New").query();
    }

}
