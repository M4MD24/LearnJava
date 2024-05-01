package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_moethods._2_2_1_3_6_question_255;

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

public class Question255 {
    public static void main(final String[] ARGS) {
        final int DIGITS = 25;
        System.out.println(STR."Input an integer: \{DIGITS}");
        System.out.print(STR."The sum is: \{getSumOfDigits(DIGITS)}");
    }

    private static Object getSumOfDigits(int digits) {
        int sumOFDigits = 0;
        while (digits != 0) {
            sumOFDigits += digits % 10;
            digits /= 10;
        }
        return sumOFDigits;
    }
}