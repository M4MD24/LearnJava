package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_11_date_and_time._2_2_1_1_11_1_date_and_time._2_2_1_1_11_1_18;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a year is a leap year or not.</h2>
 */

public class Question18 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isLeapYear(2016));
    }

    private static boolean isLeapYear(final int YEAR) {
        return (YEAR % 4 == 0 && YEAR % 100 != 0) || YEAR % 400 == 0;
    }
}