package _2_solve._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_13;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the word Python in a given string. If the word Python appears in the string return Java otherwise return C++. Ignore case sensitive.</h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "python Programming Language";
        final String SPECIFIC_TEXT = "Python";
        System.out.print(isContainSpecificText(TEXT, SPECIFIC_TEXT));
    }

    private static String isContainSpecificText(final String TEXT, final String SPECIFIC_TEXT) {
        return Pattern.compile(
                        "\\b" + SPECIFIC_TEXT + "\\b",
                        Pattern.CASE_INSENSITIVE
                ).matcher(TEXT)
                .find()
                ? "Java"
                : "C++";
    }
}