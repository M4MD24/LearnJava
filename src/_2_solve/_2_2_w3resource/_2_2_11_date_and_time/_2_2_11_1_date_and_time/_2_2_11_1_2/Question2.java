package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_2;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get and display information (year, month, day, hour, minute, second, millisecond) about a default calendar.</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final Calendar CALENDAR = Calendar.getInstance();
        setDateAndTime(CALENDAR);
        printDateAndTime(CALENDAR);
    }

    private static void printDateAndTime(final Calendar CALENDAR) {
        System.out.printf("""
                        %04d-%02d-%02d
                        %02d:%02d:%02d:%03d""",
                CALENDAR.get(Calendar.YEAR),
                CALENDAR.get(Calendar.MONTH),
                CALENDAR.get(Calendar.DAY_OF_MONTH),
                CALENDAR.get(Calendar.HOUR_OF_DAY),
                CALENDAR.get(Calendar.MINUTE),
                CALENDAR.get(Calendar.SECOND),
                CALENDAR.get(Calendar.MILLISECOND)
        );
    }

    private static void setDateAndTime(final Calendar CALENDAR) {
        CALENDAR.set(Calendar.YEAR, 2003);
        CALENDAR.set(Calendar.MONTH, 6);
        CALENDAR.set(Calendar.DATE, 9);
        CALENDAR.set(Calendar.HOUR_OF_DAY, 0);
        CALENDAR.set(Calendar.MINUTE, 0);
        CALENDAR.set(Calendar.SECOND, 0);
        CALENDAR.set(Calendar.MILLISECOND, 0);
    }
}