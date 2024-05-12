package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_moethods._2_2_1_3_5_question_254;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to count all the words in a string.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the text: The quick brown fox jumps over the lazy dog.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Number of words in the text: 9</h2>
 */

public class Question254 {
    public static void main(final String[] ARGS) {
        final String TEXT = "The quick brown fox jumps over the lazy dog.";
        System.out.printf("Input the text: %s\n", TEXT);
        System.out.printf("Number of words in the text: %d", TEXT.split(" +").length);
    }
}