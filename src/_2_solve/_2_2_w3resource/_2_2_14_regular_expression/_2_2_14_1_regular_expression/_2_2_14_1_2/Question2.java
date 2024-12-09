package _2_solve._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that matches a string that has a p followed by zero or more q's.</h2>
 */

public class Question2 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "pqq";
        System.out.print(is_p_FollowedByNothingOrMore_q(TEXT));
    }

    private static boolean is_p_FollowedByNothingOrMore_q(final String TEXT) {
        return TEXT.matches("pq*");
    }
}