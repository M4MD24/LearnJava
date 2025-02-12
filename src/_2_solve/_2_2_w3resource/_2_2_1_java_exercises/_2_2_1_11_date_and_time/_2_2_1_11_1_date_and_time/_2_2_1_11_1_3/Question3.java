package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_3;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the maximum value of the year, month, week, and date from the current date of a default calendar.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final Calendar CALENDAR = Calendar.getInstance();
        printMaximumDate(CALENDAR);
    }

    private static void printMaximumDate(final Calendar CALENDAR) {
        System.out.printf("""
                        %d-%d-%d-%d""",
                CALENDAR.getActualMaximum(Calendar.YEAR),
                CALENDAR.getActualMaximum(Calendar.MONTH),
                CALENDAR.getActualMaximum(Calendar.WEEK_OF_YEAR),
                CALENDAR.getActualMaximum(Calendar.DAY_OF_MONTH)
        );
    }
}