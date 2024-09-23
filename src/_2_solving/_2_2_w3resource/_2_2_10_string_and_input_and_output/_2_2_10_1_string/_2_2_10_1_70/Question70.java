package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_70;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check two given strings whether any of them appears at the end of the other string (ignore case sensitivity).</h2>
 */

public class Question70 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isBalance("gfpmpnppqab"));
    }

    private static boolean isBalance(final String TEXT) {
        return TEXT.matches("(?i).*pq.*");
    }
}