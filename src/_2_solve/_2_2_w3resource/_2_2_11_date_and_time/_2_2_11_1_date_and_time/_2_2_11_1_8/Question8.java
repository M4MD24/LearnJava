package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_8;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the last date of the month.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) {
        final Calendar CALENDAR = Calendar.getInstance();
        System.out.print(CALENDAR.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}