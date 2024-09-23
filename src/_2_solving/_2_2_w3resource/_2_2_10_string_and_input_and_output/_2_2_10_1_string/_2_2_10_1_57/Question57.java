package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_57;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a string from a given string by swapping the last two characters of the given string. The string length must be two or more.</h2>
 */

public class Question57 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getTextAfterSwapLastTwoCharacters("String"));
    }

    private static String getTextAfterSwapLastTwoCharacters(final String TEXT) {
        if (TEXT.length() > 1)
            return TEXT.substring(0, TEXT.length() - 2) + TEXT.charAt(TEXT.length() - 1) + TEXT.charAt(TEXT.length() - 2);
        else
            return new Exception("\u001B[31mNothing to swap last two characters!").getMessage();
    }
}