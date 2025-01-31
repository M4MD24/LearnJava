package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_89;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the sum of the numbers that appear in a given string.</h2>
 */

public class Question89 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "1 + 2 + 3 = ?";
        System.out.print(getSumOfNumbersAppearInText(TEXT));
    }

    private static int getSumOfNumbersAppearInText(final String TEXT) {
        return Pattern.compile("\\d+")
                .matcher(TEXT)
                .results()
                .mapToInt(match -> Integer.parseInt(match.group()))
                .sum();
    }
}