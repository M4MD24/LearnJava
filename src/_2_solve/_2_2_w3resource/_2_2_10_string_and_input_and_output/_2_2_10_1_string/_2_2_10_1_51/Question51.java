package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_51;

import java.util.LinkedHashMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count and print all duplicates in the input string.</h2>
 */

public class Question51 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getAllCountOfRepeatedCharacters("Nullexia for Programming"));
    }

    private static LinkedHashMap<Character, Integer> getAllCountOfRepeatedCharacters(final String TEXT) {
        final LinkedHashMap<Character, Integer> ALL_COUNT_OF_REPEATED_CHARACTERS = new LinkedHashMap<>();
        for (final char CHARACTER : TEXT.toCharArray())
            if (TEXT.indexOf(CHARACTER) != TEXT.lastIndexOf(CHARACTER))
                ALL_COUNT_OF_REPEATED_CHARACTERS.put(
                        CHARACTER,
                        ALL_COUNT_OF_REPEATED_CHARACTERS.getOrDefault(CHARACTER, 0) + 1
                );
        return ALL_COUNT_OF_REPEATED_CHARACTERS;
    }
}