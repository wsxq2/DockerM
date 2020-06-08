package top.wsxq2.dockerm.model;

import org.junit.Before;
import org.junit.Test;
import top.wsxq2.dockerm.model.portainer.User;
import top.wsxq2.dockerm.util.JsonUtil;

public class UserTest {
    User user;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGson() {
//        assertThat(user);
        System.out.println(JsonUtil.gson.toJson(user));
    }
}