package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_7;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the last day of the current month.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        final Calendar CALENDAR = Calendar.getInstance();
        System.out.print(CALENDAR.get(Calendar.DAY_OF_MONTH));
    }
}