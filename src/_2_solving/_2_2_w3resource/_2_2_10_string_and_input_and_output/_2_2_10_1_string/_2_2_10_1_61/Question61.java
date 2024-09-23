package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_61;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a new string taking specified number of characters from first and last position of a given string.</h2>
 */

public class Question61 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getSpecifiedNumberOfCharactersFromFirstAndLastPositionOfText("Java", 3));
    }

    private static String getSpecifiedNumberOfCharactersFromFirstAndLastPositionOfText(final String TEXT, final int SPECIFIC_NUMBER) {
        return TEXT.substring(0, SPECIFIC_NUMBER) + TEXT.substring(TEXT.length() - SPECIFIC_NUMBER);
    }
}