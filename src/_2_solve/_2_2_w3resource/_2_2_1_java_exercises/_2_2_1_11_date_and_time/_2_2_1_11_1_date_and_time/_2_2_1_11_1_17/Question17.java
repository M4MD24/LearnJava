package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_11_date_and_time._2_2_1_11_1_date_and_time._2_2_1_11_1_17;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get a date before and after 1 year and compare it to the current date.</h2>
 */

public class Question17 {
    public static void main(final String[] ARGUMENTS) {
        printDateBeforeOneYear(Calendar.getInstance());
        printCurrentDate(Calendar.getInstance());
        printDateAfterOneYear(Calendar.getInstance());
    }

    private static void printDateAfterOneYear(final Calendar CALENDAR) {
        CALENDAR.add(Calendar.YEAR, 1);
        System.out.print("Date after 1 year : " + CALENDAR.getTime());
    }

    private static void printDateBeforeOneYear(final Calendar CALENDAR) {
        CALENDAR.add(Calendar.YEAR, -1);
        System.out.println("Date before 1 year: " + CALENDAR.getTime());
    }

    private static void printCurrentDate(final Calendar CALENDAR) {
        System.out.println("Current Date      : " + CALENDAR.getTime());
    }
}