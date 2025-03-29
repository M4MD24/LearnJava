package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_87;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether a specified character is happy or not. A character is happy when the same character appears to its left or right in a string.</h2>
 */

public class Question87 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isCharacterHappy("Apple", 'p'));
    }

    private static boolean isCharacterHappy(final String TEXT, final char SPECIFIC_CHARACTER) {
        final int INDEX_OF_SPECIFIC_CHARACTER = TEXT.indexOf(SPECIFIC_CHARACTER);
        if (INDEX_OF_SPECIFIC_CHARACTER == 0)
            return TEXT.charAt(INDEX_OF_SPECIFIC_CHARACTER) == TEXT.charAt(INDEX_OF_SPECIFIC_CHARACTER + 1);
        else if (INDEX_OF_SPECIFIC_CHARACTER == TEXT.length() - 1)
            return TEXT.charAt(INDEX_OF_SPECIFIC_CHARACTER) == TEXT.charAt(INDEX_OF_SPECIFIC_CHARACTER - 1);
        else
            return TEXT.charAt(INDEX_OF_SPECIFIC_CHARACTER) == TEXT.charAt(INDEX_OF_SPECIFIC_CHARACTER + 1) ||
                    TEXT.charAt(INDEX_OF_SPECIFIC_CHARACTER) == TEXT.charAt(INDEX_OF_SPECIFIC_CHARACTER - 1);
    }
}