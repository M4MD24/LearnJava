package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_3_methods._2_2_1_1_3_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method to count all the words in a string.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the text: The quick brown fox jumps over the lazy dog.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Number of words in the text: 9</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "The quick brown fox jumps over the lazy dog.";
        System.out.printf("Input the text: %s\n", TEXT);
        System.out.printf("Number of words in the text: %d", TEXT.split(" +").length);
    }
}