package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_11;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the number of days in a month.</h2>
 */

public class Question11 {
    public static void main(final String[] PARAMETERS) {
        final Calendar CALENDAR = Calendar.getInstance();
        System.out.printf("Days of month: %d", CALENDAR.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}