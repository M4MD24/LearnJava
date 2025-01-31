package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_63;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether the first two characters appear at the end of a given string.</h2>
 */

public class Question63 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isFirstTwoCharactersAppearAtEnd("educated"));
    }

    private static boolean isFirstTwoCharactersAppearAtEnd(final String TEXT) {
        return TEXT.endsWith(TEXT.substring(0, 2));
    }
}