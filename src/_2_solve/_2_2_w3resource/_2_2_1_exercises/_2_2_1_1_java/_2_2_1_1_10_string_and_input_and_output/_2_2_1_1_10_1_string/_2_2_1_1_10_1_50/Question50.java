package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_50;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the lexicographic rank of a given string.</h2>
 */

public class Question50 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(getLexicographicRank("1234567891"));
    }

    private static int getLexicographicRank(final String TEXT) {
        final String[] TEXTS_PERMUTATIONS = new String[getFactorial(TEXT.length(), 1)];
        getGeneratePermutations(TEXT, 0, TEXTS_PERMUTATIONS, new int[]{0});
        Arrays.sort(TEXTS_PERMUTATIONS);
        return Arrays.stream(TEXTS_PERMUTATIONS)
                .toList()
                .indexOf(TEXT) + 1;
    }

    private static void getGeneratePermutations(final String TEXT, final int INDEX, final String[] PERMUTATIONS, final int[] ARRAY_INDEX) {
        if (INDEX == TEXT.length())
            PERMUTATIONS[ARRAY_INDEX[0]++] = TEXT;
        else
            for (int currentIndex = INDEX; currentIndex < TEXT.length(); currentIndex++)
                getGeneratePermutations(
                        swap(
                                TEXT,
                                INDEX,
                                currentIndex
                        ),
                        INDEX + 1,
                        PERMUTATIONS,
                        ARRAY_INDEX
                );
    }

    private static String swap(final String TEXT, final int FIRST_INDEX, final int SECOND_INDEX) {
        final char[] CHARACTERS = TEXT.toCharArray();
        final char TEMPORARY_CHARACTER = CHARACTERS[FIRST_INDEX];
        CHARACTERS[FIRST_INDEX] = CHARACTERS[SECOND_INDEX];
        CHARACTERS[SECOND_INDEX] = TEMPORARY_CHARACTER;
        return new String(CHARACTERS);
    }

    private static int getFactorial(final int NUMBER, final int FACTORIAL) {
        if (NUMBER == 0)
            return FACTORIAL;
        else
            return getFactorial(NUMBER - 1, NUMBER * FACTORIAL);
    }
}