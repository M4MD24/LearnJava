package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_5;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the current time in Egypt.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final Calendar CALENDAR = Calendar.getInstance();
        printTimeInEgypt(CALENDAR);
    }

    private static void printTimeInEgypt(final Calendar CALENDAR) {
        CALENDAR.setTimeZone(TimeZone.getTimeZone("Egypt/Cairo"));
        System.out.printf(
                "%02d:%02d:%02d",
                CALENDAR.get(Calendar.HOUR_OF_DAY),
                CALENDAR.get(Calendar.MINUTE),
                CALENDAR.get(Calendar.SECOND)
        );
    }
}