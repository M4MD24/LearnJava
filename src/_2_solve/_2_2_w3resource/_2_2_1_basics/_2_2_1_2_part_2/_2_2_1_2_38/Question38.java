package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_38;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find all the start indices of a given string's anagrams in another given string.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original String: zyxwyxyxzwxyz
 * <br/>
 * Starting anagram indices of xyz: [0, 6, 10]
 * </h2>
 */

public class Question38 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "zyxwyxyxzwxyz", TARGET_TEXT = "xyz";
        System.out.printf("Original String: %s\n", TEXT);
        System.out.printf("Starting anagram indices of %s: %s",
                TARGET_TEXT,
                TARGET_TEXT.length() < TEXT.length()
                        ? getStartingAnagramIndicesOfTargetText(TEXT, TARGET_TEXT)
                        : -1);
    }

    private static ArrayList<Integer> getStartingAnagramIndicesOfTargetText(final String TEXT, final String TARGET_TEXT) {
        final ArrayList<Integer> STARTING_ANAGRAM_INDICES_OF_TARGET_TEXT = new ArrayList<>();
        final byte[] TARGET_TEXT_CHARACTERS = new byte[26];
        addCharacters(TARGET_TEXT_CHARACTERS, TARGET_TEXT);
        for (int startIndex = 0, endIndex = TARGET_TEXT.length(); endIndex <= TEXT.length(); startIndex++, endIndex++) {
            final byte[] SUB_TEXT_CHARACTERS = new byte[26];
            addCharacters(SUB_TEXT_CHARACTERS, TEXT.substring(startIndex, endIndex));
            if (Arrays.equals(TARGET_TEXT_CHARACTERS, SUB_TEXT_CHARACTERS)) {
                STARTING_ANAGRAM_INDICES_OF_TARGET_TEXT.add(startIndex);
                startIndex = endIndex;
                endIndex += 3;
            }
        }
        return STARTING_ANAGRAM_INDICES_OF_TARGET_TEXT;
    }

    private static void addCharacters(final byte[] CHARACTERS, final String TEXT_CHARACTERS) {
        for (int index = 0; index < TEXT_CHARACTERS.length(); index++)
            CHARACTERS[TEXT_CHARACTERS.charAt(index) - 'a']++;
    }
}