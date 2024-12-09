package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_43;

import java.util.TimeZone;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to display all the available time zones in Africa.</h2>
 */

public class Question43 {
    public static void main(final String[] PARAMETERS) {
        final String[] TIME_ZONE_IDS = TimeZone.getAvailableIDs();
        for (final String TIME_ZONE_ID : TIME_ZONE_IDS)
            if (TIME_ZONE_ID.startsWith("Africa/")) {
                final TimeZone TIME_ZONE = TimeZone.getTimeZone(TIME_ZONE_ID);
                final String DISPLAY_NAME = TIME_ZONE.getDisplayName();
                System.out.printf("%30s - %s%n",
                        TIME_ZONE_ID,
                        DISPLAY_NAME
                );
            }
    }
}