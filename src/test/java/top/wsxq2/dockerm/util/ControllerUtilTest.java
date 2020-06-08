package top.wsxq2.dockerm.util;

import org.junit.Test;
import org.testfx.framework.junit.ApplicationTest;

public class ControllerUtilTest extends ApplicationTest {
    @Test
    public void getNodeControllerByFXML() {
        ControllerUtil.getNodeControllerByFXML("NetworkDetails");
    }

}