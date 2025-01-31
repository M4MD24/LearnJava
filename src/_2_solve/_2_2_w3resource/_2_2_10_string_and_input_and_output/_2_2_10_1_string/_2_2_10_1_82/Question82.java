package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_82;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a string containing every character twice of a given string.</h2>
 */

public class Question82 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRepeatEveryCharacterTwice("Welcome"));
    }

    private static String getTextAfterRepeatEveryCharacterTwice(final String TEXT) {
        return TEXT.replaceAll(".", "$0$0");
    }
}