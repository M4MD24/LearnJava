package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_35;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print all permutations of a given string with repetition.</h2>
 */

public class Question35 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "abcd";
        System.out.printf("Permutations of \"%s\"\n", TEXT);
        printGenerateDifferentPermutations(TEXT, 0);
    }

    private static void printGenerateDifferentPermutations(final String TEXT, final int INDEX) {
        if (INDEX == TEXT.length())
            System.out.println(TEXT);
        else {
            for (int currentIndex = INDEX; currentIndex < TEXT.length(); currentIndex++)
                printGenerateDifferentPermutations(
                        swap(
                                TEXT,
                                INDEX,
                                currentIndex
                        ),
                        INDEX + 1
                );
        }
    }

    private static String swap(final String TEXT, final int FIRST_INDEX, final int SECOND_INDEX) {
        final char[] CHARACTERS = TEXT.toCharArray();
        final char TEMPORARY_CHARACTER = CHARACTERS[FIRST_INDEX];
        CHARACTERS[FIRST_INDEX] = CHARACTERS[SECOND_INDEX];
        CHARACTERS[SECOND_INDEX] = TEMPORARY_CHARACTER;
        return new String(CHARACTERS);
    }
}