package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_9;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that takes a year from the user and prints whether it is a leap year or not.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the year: 2016</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>2016 is a leap year</h2>
 */

public class Question9 {
    public static void main(final String[] ARGS) {
        final int YEAR = 2016;
        System.out.printf("Input a Year: %d\n", YEAR);
        System.out.printf("%d is a %b year",
                YEAR,
                isLeapYear(YEAR) ? "leap" : "not leap");
    }

    private static boolean isLeapYear(final int YEAR) {
        return (YEAR % 4 == 0 && YEAR % 100 != 0) || YEAR % 400 == 0;
    }
}