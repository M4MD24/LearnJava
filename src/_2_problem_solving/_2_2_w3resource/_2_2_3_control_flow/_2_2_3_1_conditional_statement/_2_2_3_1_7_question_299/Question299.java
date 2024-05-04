package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_7_question_299;

import java.time.YearMonth;

/**
 * <h1>Question:</h1>
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

public class Question299 {
    public static void main(final String[] ARGS) {
        final int MONTH = 2,
                YEAR = 2016;
        System.out.println(STR."""
                Input a month:\s\{MONTH}
                Input a year:\s\{YEAR}""");
        System.out.print(STR."\{getNameOfMonth(MONTH)} \{YEAR} has \{getCountOfDaysOfMonthThisYear(MONTH, YEAR)} days");
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
            default -> throw new IllegalStateException(STR."Unacceptable number: \{MONTH}");
        };
    }
}