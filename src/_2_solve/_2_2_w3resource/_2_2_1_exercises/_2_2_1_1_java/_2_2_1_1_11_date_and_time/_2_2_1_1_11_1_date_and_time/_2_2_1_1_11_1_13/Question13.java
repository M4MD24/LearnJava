package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_13;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get a day of the week on a specific date.</h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final Calendar CALENDAR = Calendar.getInstance();
        System.out.print(CALENDAR.get(Calendar.DAY_OF_WEEK));
    }
}