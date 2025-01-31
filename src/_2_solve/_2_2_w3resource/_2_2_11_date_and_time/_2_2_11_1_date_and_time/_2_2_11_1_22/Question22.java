package _2_solve._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_22;

import java.util.Calendar;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the dates 10 days before and after today.</h2>
 */

public class Question22 {
    public static void main(final String[] ARGUMENTS) {
        printDateBeforeTenDays(Calendar.getInstance());
        printCurrentDate(Calendar.getInstance());
        printDateAfterTenDays(Calendar.getInstance());
    }

    private static void printDateAfterTenDays(final Calendar CALENDAR) {
        CALENDAR.add(Calendar.DATE, 10);
        System.out.print("Date after 10 days : " + CALENDAR.getTime());
    }

    private static void printDateBeforeTenDays(final Calendar CALENDAR) {
        CALENDAR.add(Calendar.DATE, -10);
        System.out.println("Date before 10 days: " + CALENDAR.getTime());
    }

    private static void printCurrentDate(final Calendar CALENDAR) {
        System.out.println("Current Date       : " + CALENDAR.getTime());
    }
}