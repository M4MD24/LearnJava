package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_86;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the number of triples (characters appearing three times in a row) in a given string.</h2>
 */

public class Question86 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getCountOfTriplesCharacters("welllcommmmeee"));
    }

    private static long getCountOfTriplesCharacters(final String TEXT) {
        long countOfTriplesCharacters = 0;
        for (int index = 0; index < TEXT.length() - 2; index++)
            if (TEXT.charAt(index) == TEXT.charAt(index + 1) &&
                    TEXT.charAt(index) == TEXT.charAt(index + 2))
                countOfTriplesCharacters++;
        return countOfTriplesCharacters;
    }
}