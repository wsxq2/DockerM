package top.wsxq2.dockerm.util;

import org.apache.commons.lang3.StringUtils;

public class StringUtil {

    public static String defaultIfEmpty(String x) {
        return defaultIfEmpty(x, "-");
    }

    public static String defaultIfEmpty(String x, String defaultS) {
        return StringUtils.isEmpty(x) ? defaultS : x;

    }

    public static String defaultIfEmpty(String[] list) {
        return list == null || list.length == 0 ? "-" : String.join(", ", list);
    }

}
