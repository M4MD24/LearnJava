package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_7;

import java.time.YearMonth;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the number of days in a month.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input a month number: 2
 * <br/>
 * Input a year: 2016
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>February 2016 has 29 days</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) {
        final int MONTH = 2,
                YEAR = 2016;
        System.out.printf("""
                        Input a month:\s%d
                        Input a year:\s%d
                        """,
                MONTH,
                YEAR);
        System.out.printf("%s %d has %d days",
                getNameOfMonth(MONTH),
                YEAR,
                getCountOfDaysOfMonthThisYear(MONTH, YEAR));
    }

    private static int getCountOfDaysOfMonthThisYear(final int MONTH, final int YEAR) {
        return YearMonth.of(YEAR, MONTH).lengthOfMonth();
    }

    private static String getNameOfMonth(final int MONTH) {
        return switch (MONTH) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> throw new IllegalStateException(String.format("Unacceptable number: %d", MONTH));
        };
    }
}