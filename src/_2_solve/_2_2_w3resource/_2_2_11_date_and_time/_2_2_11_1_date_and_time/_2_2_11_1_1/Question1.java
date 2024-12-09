package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_1;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a Date object using the Calendar class.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        final Calendar CALENDAR = Calendar.getInstance();
        CALENDAR.set(Calendar.YEAR, 2003);
        CALENDAR.set(Calendar.MONTH, 6 - 1);
        CALENDAR.set(Calendar.DATE, 9);
        CALENDAR.set(Calendar.HOUR, -12);
        CALENDAR.set(Calendar.MINUTE, 0);
        CALENDAR.set(Calendar.SECOND, 0);
        System.out.print(CALENDAR.getTime());
    }
}