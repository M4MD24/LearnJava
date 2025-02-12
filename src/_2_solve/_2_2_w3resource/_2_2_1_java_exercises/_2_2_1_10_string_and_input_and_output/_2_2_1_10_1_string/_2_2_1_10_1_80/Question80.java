package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_80;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether the character immediately before and after a specified character is the same in a given string.</h2>
 */

public class Question80 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(areSurroundFirstCharactersEqual("ABC##CAA"));
    }

    private static boolean areSurroundFirstCharactersEqual(final String TEXT) {
        return TEXT.charAt(TEXT.indexOf("#") - 1) == TEXT.charAt(TEXT.lastIndexOf("#") + 1);
    }
}