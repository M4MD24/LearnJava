package _2_solving._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_21;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to remove all non-alphanumeric characters from a given string.</h2>
 */

public class Question21 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "_Nullexia_ $4% @Programming";
        System.out.print(getTextAfterRemoveAllNonAlphanumericCharacters(TEXT));
    }

    private static String getTextAfterRemoveAllNonAlphanumericCharacters(final String TEXT) {
        return TEXT.replaceAll(
                "[^a-zA-Z0-9]",
                ""
        );
    }
}