package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the sequence of one upper case letter followed by lower case letters.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Nullexia";
        System.out.print(isContainOneUppercaseLetterAndFollowedByLowercaseLetters(TEXT));
    }

    private static boolean isContainOneUppercaseLetterAndFollowedByLowercaseLetters(final String TEXT) {
        return TEXT.matches("[A-Z][a-z]+");
    }
}