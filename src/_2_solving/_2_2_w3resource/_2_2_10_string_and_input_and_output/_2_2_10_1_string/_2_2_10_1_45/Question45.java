package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_45;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to reverse words in a given string.</h2>
 */

public class Question45 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Learn Java Programming Language";
        System.out.print(getTextAfterReversePlacesWords(TEXT));
    }

    private static String getTextAfterReversePlacesWords(final String TEXT) {
        final String[] CURRENT_WORDS = TEXT.split(" ");
        final int MAXIMUM_LENGTH = CURRENT_WORDS.length;
        final String[] REVERSED_WORDS = new String[MAXIMUM_LENGTH];
        for (int indexOfCurrentWords = 0, indexOfReversedWords = MAXIMUM_LENGTH - 1; indexOfCurrentWords < MAXIMUM_LENGTH; indexOfCurrentWords++, indexOfReversedWords--)
            REVERSED_WORDS[indexOfReversedWords] = CURRENT_WORDS[indexOfCurrentWords];
        return String.join(
                " ",
                REVERSED_WORDS
        );
    }
}