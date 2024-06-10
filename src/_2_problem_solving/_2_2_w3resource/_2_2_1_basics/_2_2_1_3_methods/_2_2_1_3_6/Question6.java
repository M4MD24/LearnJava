package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_6;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to compute the sum of digits in an integer.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input an integer: 25</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The sum is 7</h2>
 */

public class Question6 {
    public static void main(final String[] ARGS) {
        final int DIGITS = 25;
        System.out.printf("Input an integer: %d", DIGITS);
        System.out.printf("The sum is: %d", getSumOfDigits(DIGITS));
    }

    private static int getSumOfDigits(int digits) {
        int sumOFDigits = 0;
        while (digits != 0) {
            sumOFDigits += digits % 10;
            digits /= 10;
        }
        return sumOFDigits;
    }
}