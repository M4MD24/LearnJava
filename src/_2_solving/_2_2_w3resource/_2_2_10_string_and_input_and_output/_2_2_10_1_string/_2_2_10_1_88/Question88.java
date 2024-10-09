package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_88;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to return a string where every appearance of the lowercase word 'is' has been replaced with 'is not'.</h2>
 */

public class Question88 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "It is a orange!";
        System.out.print(TEXT.replaceAll("is", "is not"));
    }
}