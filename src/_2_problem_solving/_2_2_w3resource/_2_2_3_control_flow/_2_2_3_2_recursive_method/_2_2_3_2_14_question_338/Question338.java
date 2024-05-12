package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_14_question_338;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java recursive method to find the sum of the digits of a given integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The sum of the digits of 123456 is: 21</h2>
 */

public class Question338 {
    public static void main(final String[] ARGS) {
        final int DIGITS = 123456;
        System.out.printf("The sum of the digits of %d is: %d",
                DIGITS,
                getSumOfDigits(0, DIGITS));
    }

    private static int getSumOfDigits(final int SUM_OF_DIGITS, final int DIGITS) {
        if (DIGITS == 0)
            return SUM_OF_DIGITS;
        else
            return getSumOfDigits(SUM_OF_DIGITS + DIGITS % 10, DIGITS / 10);
    }
}