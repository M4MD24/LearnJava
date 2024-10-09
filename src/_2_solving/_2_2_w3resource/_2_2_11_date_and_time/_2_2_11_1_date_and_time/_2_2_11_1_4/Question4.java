package _2_solving._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_4;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the minimum value of year, month, week, date from the current date of a default calendar.</h2>
 */

public class Question4 {
    public static void main(final String[] PARAMETERS) {
        final Calendar CALENDAR = Calendar.getInstance();
        printMinimumDate(CALENDAR);
    }

    private static void printMinimumDate(final Calendar CALENDAR) {
        System.out.printf("""
                        %d-%d-%d-%d""",
                CALENDAR.getActualMinimum(Calendar.YEAR),
                CALENDAR.getActualMinimum(Calendar.MONTH),
                CALENDAR.getActualMinimum(Calendar.WEEK_OF_YEAR),
                CALENDAR.getActualMinimum(Calendar.DAY_OF_MONTH)
        );
    }
}