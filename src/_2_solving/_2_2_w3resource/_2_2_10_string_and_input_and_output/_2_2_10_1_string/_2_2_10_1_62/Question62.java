package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_62;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a string and return true if "good" appears starting at index 0 or 1 in the given string.</h2>
 */

public class Question62 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isGood("goodJava"));
    }

    private static boolean isGood(final String TEXT) {
        return TEXT.startsWith("good") ||
                TEXT.startsWith("good", 1);
    }
}