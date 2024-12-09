package _2_solve._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_24;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to separate consonants and vowels from a given string.</h2>
 */

public class Question24 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Rana";
        System.out.print(getTextAfterMoveAllVowelsToFrontOfText(TEXT));
    }

    private static String getTextAfterMoveAllVowelsToFrontOfText(final String TEXT) {
        return TEXT.replaceAll(
                "(?i)[aeiou]",
                ""
        ) + TEXT.replaceAll(
                "(?i)[^aeiou]",
                ""
        );
    }
}