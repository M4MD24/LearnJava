package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_108;

import java.util.regex.Pattern;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check whether there are two consecutive (following each other continuously), identical letters in a given string.</h2>
 */

public class Question108 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(areContainConsecutiveCharacters("Nullexia"));
    }

    private static boolean areContainConsecutiveCharacters(final String TEXT) {
        return Pattern.compile("(.)\\1")
                .matcher(TEXT)
                .find();
    }
}