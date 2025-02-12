package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_109;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reverses all odd-length words in a string.</h2>
 */

public class Question109 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterReverseAllOddLengthWords("Java Programming Language"));
    }

    private static String getTextAfterReverseAllOddLengthWords(final String TEXT) {
        return String.join(
                " ",
                Arrays.stream(TEXT.split(" "))
                        .map(word -> word.length() % 2 != 0
                                ? new StringBuilder(word).reverse()
                                : word
                        )
                        .toList()
        );
    }
}