package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_47;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to rearrange a string so that the same characters are positioned a distance away.</h2>
 */

public class Question47 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(rearrangeTextBySpecificDistance(
                "accessories",
                4
        ));
    }

    private static String rearrangeTextBySpecificDistance(final String TEXT, final int SPECIFIC_DISTANCE) {
        final LinkedHashMap<Character, Integer> COUNT_OF_REPEATED_CHARACTERS = getCountOfRepeatedCharacters(TEXT);
        if (canRearrangeText(COUNT_OF_REPEATED_CHARACTERS, SPECIFIC_DISTANCE, TEXT)) {
            StringBuilder textAfterRearrange = new StringBuilder(" ".repeat(TEXT.length()));
            final String NOT_REPEATED_CHARACTERS = TEXT.chars()
                    .mapToObj(character -> (char) character)
                    .filter(character -> TEXT.indexOf(character) == TEXT.lastIndexOf(character))
                    .map(String::valueOf)
                    .collect(Collectors.joining());
            int startIndexOfTextAfterRearrange = 0;
            while (!COUNT_OF_REPEATED_CHARACTERS.isEmpty()) {
                final char CHARACTER = COUNT_OF_REPEATED_CHARACTERS.lastEntry().getKey();
                final int COUNT = COUNT_OF_REPEATED_CHARACTERS.pollLastEntry().getValue();
                for (int counter = 0, currentIndexOfTextAfterRearrange = startIndexOfTextAfterRearrange; counter < COUNT; counter++, currentIndexOfTextAfterRearrange += SPECIFIC_DISTANCE + 1)
                    textAfterRearrange.setCharAt(currentIndexOfTextAfterRearrange, CHARACTER);
                startIndexOfTextAfterRearrange++;
            }
            for (final char CHARACTER : NOT_REPEATED_CHARACTERS.toCharArray())
                textAfterRearrange = new StringBuilder(textAfterRearrange.toString().replaceFirst(" ", String.valueOf(CHARACTER)));
            return textAfterRearrange.toString();
        } else
            return new Exception("\u001B[31mCan't Rearrange!").getMessage();
    }

    private static LinkedHashMap<Character, Integer> getCountOfRepeatedCharacters(final String TEXT) {
        final LinkedHashMap<Character, Integer> COUNT_OF_REPEATED_CHARACTERS = new LinkedHashMap<>();
        for (final char CHARACTER : TEXT.toCharArray())
            if (TEXT.indexOf(CHARACTER) != TEXT.lastIndexOf(CHARACTER))
                COUNT_OF_REPEATED_CHARACTERS.put(
                        CHARACTER,
                        COUNT_OF_REPEATED_CHARACTERS.getOrDefault(CHARACTER, 0) + 1
                );
        return COUNT_OF_REPEATED_CHARACTERS;
    }

    private static boolean canRearrangeText(final LinkedHashMap<Character, Integer> COUNT_OF_REPEATED_CHARACTERS, final int SPECIFIC_DISTANCE, final String TEXT) {
        final long MAXIMUM_COUNT_REPEATED_CHARACTERS = Collections.max(COUNT_OF_REPEATED_CHARACTERS.values());
        final long COUNT_OF_REPEATED_MAXIMUM_COUNT_REPEATED_CHARACTERS = COUNT_OF_REPEATED_CHARACTERS.values()
                .stream()
                .filter(count -> count == MAXIMUM_COUNT_REPEATED_CHARACTERS)
                .count();
        return MAXIMUM_COUNT_REPEATED_CHARACTERS * SPECIFIC_DISTANCE - 1 <= TEXT.length() &&
                MAXIMUM_COUNT_REPEATED_CHARACTERS * SPECIFIC_DISTANCE + COUNT_OF_REPEATED_MAXIMUM_COUNT_REPEATED_CHARACTERS - 2 <= TEXT.length();
    }
}