package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_62;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a string and return true if "good" appears starting at index 0 or 1 in the given string.</h2>
 */

public class Question62 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isGood("goodJava"));
    }

    private static boolean isGood(final String TEXT) {
        return TEXT.startsWith("good") ||
                TEXT.startsWith("good", 1);
    }
}