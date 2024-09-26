package _2_solving._2_2_w3resource._2_2_11_date_and_time._2_2_11_1_date_and_time._2_2_11_1_25;

import java.time.Year;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the information of the current/given year.</h2>
 */

public class Question25 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getYearInformation(Year.now()));
    }

    private static String getYearInformation(final Year YEAR) {
        return String.format("""
                        Current Year: %s
                        Is current year leap year? %b
                        Length of the year: %d days""",
                YEAR,
                YEAR.isLeap(),
                YEAR.length()
        );
    }
}