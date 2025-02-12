package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_65;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a given string and return the string without the first or last characters if they are the same, otherwise return the string without the characters.</h2>
 */

public class Question65 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemoveFirstCharacterAppearAtEnd("AaBaA"));
    }

    private static String getTextAfterRemoveFirstCharacterAppearAtEnd(final String TEXT) {
        return TEXT.charAt(0) == TEXT.charAt(TEXT.length() - 1)
                ? TEXT.substring(1, TEXT.length() - 1)
                : TEXT;
    }
}