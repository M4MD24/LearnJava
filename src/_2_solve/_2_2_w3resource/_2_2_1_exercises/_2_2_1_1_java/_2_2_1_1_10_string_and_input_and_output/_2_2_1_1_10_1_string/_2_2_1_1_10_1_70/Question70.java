package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_70;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check two given strings whether any of them appears at the end of the other string (ignore case sensitivity).</h2>
 */

public class Question70 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isBalance("gfpmpnppqab"));
    }

    private static boolean isBalance(final String TEXT) {
        return TEXT.matches("(?i).*pq.*");
    }
}