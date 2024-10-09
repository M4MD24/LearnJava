package _2_solving._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_12;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get localized day-of-week names.</h2>
 */

public class Question12 {
    public static void main(final String[] PARAMETERS) {
        final Locale LOCAL_DATE = Locale.getDefault();
        printDaysOfWeekNames(LOCAL_DATE);
    }

    private static void printDaysOfWeekNames(final Locale LOCAL_DATE) {
        for (final DayOfWeek DAY_OF_WEEK : DayOfWeek.values()) {
            final String FULL_DAY_NAME = DAY_OF_WEEK.getDisplayName(TextStyle.FULL, LOCAL_DATE),
                    SHORT_DAY_NAME = DAY_OF_WEEK.getDisplayName(TextStyle.SHORT, LOCAL_DATE);
            System.out.printf(
                    "%s (%s)%n",
                    FULL_DAY_NAME,
                    SHORT_DAY_NAME);
        }
    }
}