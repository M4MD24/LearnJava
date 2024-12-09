package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_64;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a string. If a substring of length two appears at both its beginning and end, return a string without the substring at the beginning; otherwise, return the original string unchanged.</h2>
 */

public class Question64 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getTextAfterRemoveFirstTwoCharactersAppearAtEnd("educated"));
    }

    private static String getTextAfterRemoveFirstTwoCharactersAppearAtEnd(final String TEXT) {
        return TEXT.endsWith(TEXT.substring(0, 2))
                ? TEXT.substring(2)
                : TEXT;
    }
}