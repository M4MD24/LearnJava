package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_48;

import java.util.regex.Pattern;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove "b" and "ac" from a given string.</h2>
 */

public class Question48 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(remove_B_And_AC_Letters("Nullbacbexia"));
    }

    private static String remove_B_And_AC_Letters(final String TEXT) {
        return Pattern.compile("b|ac")
                .matcher(TEXT)
                .replaceAll("");
    }
}