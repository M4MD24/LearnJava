package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to check if a given string is empty.</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final TextMethod TEXT_IS_EMPTY = String::isEmpty;
        System.out.print(TEXT_IS_EMPTY.isEmpty(""));
    }
}

interface TextMethod {
    boolean isEmpty(final String FIRST_NUMBER);
}