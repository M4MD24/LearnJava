package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_101;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test if a string contains only digits. Returns true or false.</h2>
 */

public class Question101 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(areOnlyDigits("46542319779654"));
    }

    private static boolean areOnlyDigits(final String TEXT) {
        return TEXT.matches("\\d+");
    }
}