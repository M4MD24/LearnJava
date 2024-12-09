package _2_solve._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_25;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the last n vowels of a given string.</h2>
 */

public class Question25 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Java";
        System.out.print(getCountOfVowels(TEXT));
    }

    private static long getCountOfVowels(final String TEXT) {
        return Pattern.compile("(?i)[aeiou]")
                .matcher(TEXT)
                .results()
                .count();
    }
}