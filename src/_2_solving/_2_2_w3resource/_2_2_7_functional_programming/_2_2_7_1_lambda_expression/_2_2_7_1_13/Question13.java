package _2_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_13;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to implement a lambda expression to count words in a sentence.</h2>
 */

public class Question13 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Hello Java";
        final TextMethod COUNT_OF_WORDS_OF_TEXT = (WORDS) -> WORDS.split(" +").length;
        System.out.print(COUNT_OF_WORDS_OF_TEXT.countOfWords(TEXT));
    }
}

interface TextMethod {
    long countOfWords(final String TEXT);
}