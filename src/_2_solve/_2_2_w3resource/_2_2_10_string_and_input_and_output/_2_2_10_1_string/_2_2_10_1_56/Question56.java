package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_56;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that appends two strings, omitting one character if the concatenation creates double characters.</h2>
 */

public class Question56 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getTextAfterMergeTwoTextsAndOmittingOneCharacterIfConcatenationCreatesDoubleCharacters("food", "door"));
    }

    private static String getTextAfterMergeTwoTextsAndOmittingOneCharacterIfConcatenationCreatesDoubleCharacters(final String FIRST_TEXT, final String SECOND_TEXT) {
        return (FIRST_TEXT.charAt(FIRST_TEXT.length() - 1) == SECOND_TEXT.charAt(0))
                ? FIRST_TEXT + SECOND_TEXT.substring(1)
                : FIRST_TEXT + SECOND_TEXT;
    }
}