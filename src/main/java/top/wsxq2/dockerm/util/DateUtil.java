package top.wsxq2.dockerm.util;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    private static DateTimeFormatter dateTimeFormatter;

    public static String format(long timestamp) {
        return Instant.ofEpochSecond(timestamp).atZone(ZoneId.systemDefault()).format(getDateTimeFormatter());
    }

    public static DateTimeFormatter getDateTimeFormatter() {
        if (dateTimeFormatter == null) {
            dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").withZone(ZoneId.systemDefault());
        }
        return dateTimeFormatter;
    }

    public static String format(String date) {
        return ZonedDateTime.parse(date, DateTimeFormatter.ISO_ZONED_DATE_TIME).format(getDateTimeFormatter());
//        return ZonedDateTime.parse(date,DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.of("UTC"))).format
//        (getDateTimeFormatter());
    }
}
