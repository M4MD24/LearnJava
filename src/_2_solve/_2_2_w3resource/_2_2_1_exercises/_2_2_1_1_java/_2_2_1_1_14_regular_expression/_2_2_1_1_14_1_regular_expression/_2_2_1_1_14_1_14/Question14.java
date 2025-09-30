package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_14;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the number of vowels in a given string using a regular expression.</h2>
 */

public class Question14 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Barmajaa";
        System.out.print(getCountOfVowels(TEXT));
    }

    private static long getCountOfVowels(final String TEXT) {
        return Pattern.compile("[AaEeIiOoUu]")
                .matcher(TEXT)
                .results()
                .count();
    }
}