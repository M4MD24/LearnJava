package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_60;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read two strings append them together and return the result. If the strings are different lengths, remove characters from the beginning of the longer string and make them equal lengths.</h2>
 */

public class Question60 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getTextAfterMergeTextsAfterAndRemoveCharactersFromBeginningOfLongerText("Welcome", "Home"));
    }

    private static String getTextAfterMergeTextsAfterAndRemoveCharactersFromBeginningOfLongerText(final String FIRST_TEXT, final String SECOND_TEXT) {
        if (FIRST_TEXT.length() > SECOND_TEXT.length())
            return FIRST_TEXT.substring(SECOND_TEXT.length() - 1) + SECOND_TEXT;
        else if (SECOND_TEXT.length() > FIRST_TEXT.length())
            return FIRST_TEXT + SECOND_TEXT.substring(FIRST_TEXT.length() - 1);
        else
            return FIRST_TEXT + SECOND_TEXT;
    }
}