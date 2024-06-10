package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_11;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java recursive method to generate all possible permutations of a given string.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Permutations of "abc":
 * <br/>
 * abc
 * <br/>
 * acb
 * <br/>
 * bac
 * <br/>
 * bca
 * <br/>
 * cab
 * <br/>
 * cba
 * </h2>
 */

public class Question11 {
    public static void main(final String[] ARGS) {
        final String TEXT = "abc";
        System.out.printf("Permutations of \"%s\"\n", TEXT);
        printGenerateDifferentPermutations(TEXT, 0);
    }

    public static void printGenerateDifferentPermutations(final String TEXT, final int INDEX) {
        if (INDEX == TEXT.length())
            System.out.println(TEXT);
        else
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

    public static String swap(final String TEXT, final int FIRST_INDEX, final int SECOND_INDEX) {
        final char[] CHARACTERS = TEXT.toCharArray();
        final char TEMPORARY_CHARACTER = CHARACTERS[FIRST_INDEX];
        CHARACTERS[FIRST_INDEX] = CHARACTERS[SECOND_INDEX];
        CHARACTERS[SECOND_INDEX] = TEMPORARY_CHARACTER;
        return new String(CHARACTERS);
    }
}