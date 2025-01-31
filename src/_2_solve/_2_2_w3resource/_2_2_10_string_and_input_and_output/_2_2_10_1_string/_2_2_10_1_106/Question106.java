package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_106;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to concatenate a given string with itself a given number of times.</h2>
 */

public class Question106 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRepeated("Java", 6));
    }

    private static String getTextAfterRepeated(final String TEXT, final int COUNT_OF_REPEAT) {
        return TEXT.repeat(COUNT_OF_REPEAT);
    }
}