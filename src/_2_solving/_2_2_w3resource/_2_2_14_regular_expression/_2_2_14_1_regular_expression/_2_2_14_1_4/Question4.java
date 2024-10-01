package _2_solving._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_4;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the sequence of one upper case letter followed by lower case letters.</h2>
 */

public class Question4 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Nullexia";
        System.out.print(isContainOneUppercaseLetterAndFollowedByLowercaseLetters(TEXT));
    }

    private static boolean isContainOneUppercaseLetterAndFollowedByLowercaseLetters(final String TEXT) {
        return TEXT.matches("[A-Z][a-z]+");
    }
}