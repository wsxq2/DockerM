package top.wsxq2.dockerm.util;

import org.junit.Test;

import static org.junit.Assert.assertNotEquals;

public class DateUtilTest {

    @Test
    public void getDateTimeFormatter() {
    }

    @Test
    public void format() {
    }

    @Test
    public void testFormat() {
        String date = DateUtil.format("2020-05-12T13:58:41.040186047Z");
        System.out.println(date);
        assertNotEquals(0, date.length());
        date = DateUtil.format("2020-03-14T10:32:18.141276975+08:00");
        System.out.println(date);
        assertNotEquals(0, date.length());
    }

}