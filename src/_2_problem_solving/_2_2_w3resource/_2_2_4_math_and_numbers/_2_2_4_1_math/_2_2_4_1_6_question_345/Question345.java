package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_6_question_345;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to reverse an integer number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original number: 1287
 * <br/>
 * Reversed number: 7821
 * </h2>
 */

public class Question345 {
    public static void main(final String[] ARGS) {
        final long DIGITS = 1287;
        System.out.print(STR."""
                Original digits:\s\{DIGITS}
                Reversed digits:\s\{getReversedDigits(DIGITS)}""");
    }

    private static int getReversedDigits(final long DIGITS) {
        return Integer.parseInt(String.valueOf(new StringBuffer(String.valueOf(DIGITS)).reverse()));
    }
}