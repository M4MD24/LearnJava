package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_88;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to return a string where every appearance of the lowercase word 'is' has been replaced with 'is not'.</h2>
 */

public class Question88 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "It is a orange!";
        System.out.print(TEXT.replaceAll("is", "is not"));
    }
}