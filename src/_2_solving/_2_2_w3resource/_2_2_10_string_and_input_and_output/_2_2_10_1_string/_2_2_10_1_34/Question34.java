package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_34;


import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the second most frequent character in a given string.</h2>
 */

public class Question34 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "aaaBBB";
        System.out.print(getSecondMostFrequentCharacter(TEXT));
    }

    private static String getSecondMostFrequentCharacter(final String TEXT) {
        final Map<Character, Integer> COUNT_OF_CHARACTERS = getAllCountOfCharactersAfterCollect(TEXT);
        final char SECOND_CHARACTER_OF_MAXIMUM_COUNT = getSecondCharacterOfMaximumCount(COUNT_OF_CHARACTERS);
        return SECOND_CHARACTER_OF_MAXIMUM_COUNT != ' '
                ? String.valueOf(SECOND_CHARACTER_OF_MAXIMUM_COUNT)
                : "There is no second largest repeated letter!";
    }

    private static Map<Character, Integer> getAllCountOfCharactersAfterCollect(final String TEXT) {
        final Map<Character, Integer> COUNT_OF_CHARACTERS = new HashMap<>();
        for (final char CURRENT_CHARACTER : TEXT.toCharArray())
            COUNT_OF_CHARACTERS.put(
                    CURRENT_CHARACTER,
                    COUNT_OF_CHARACTERS.getOrDefault(
                            CURRENT_CHARACTER,
                            0
                    ) + 1
            );
        return COUNT_OF_CHARACTERS;
    }

    private static char getSecondCharacterOfMaximumCount(final Map<Character, Integer> COUNT_OF_CHARACTERS) {
        int maximumCount = 0,
                secondMaximumCount = 0;
        char secondCharacterOfMaximumCount = ' ';
        for (Map.Entry<Character, Integer> CURRENT_COUNT_OF_CHARACTER : COUNT_OF_CHARACTERS.entrySet()) {
            final char CURRENT_CHARACTER = CURRENT_COUNT_OF_CHARACTER.getKey();
            final int CURRENT_COUNT = CURRENT_COUNT_OF_CHARACTER.getValue();
            if (maximumCount < CURRENT_COUNT)
                maximumCount = CURRENT_COUNT;
            else if (secondMaximumCount < CURRENT_COUNT &&
                    CURRENT_COUNT < maximumCount) {
                secondMaximumCount = CURRENT_COUNT;
                secondCharacterOfMaximumCount = CURRENT_CHARACTER;
            }
        }
        return secondCharacterOfMaximumCount;
    }
}