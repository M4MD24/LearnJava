package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_15;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove all vowels from a given string. Return the updated string.</h2>
 */

public class Question15 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Java Programming Language";
        System.out.print(getTextAfterRemoveAllVowels(TEXT));
    }

    private static String getTextAfterRemoveAllVowels(final String TEXT) {
        return TEXT.replaceAll(
                "[AaEeIiOoUu]",
                ""
        );
    }
}