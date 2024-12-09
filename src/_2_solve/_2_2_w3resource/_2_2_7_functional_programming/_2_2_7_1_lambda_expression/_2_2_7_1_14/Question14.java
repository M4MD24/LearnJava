package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_14;

import java.util.function.Predicate;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to check if a given string is a palindrome.</h2>
 */

public class Question14 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Java";
        final Predicate<String> TEXT_IS_PALINDROME = (STRING) -> STRING.contentEquals(new StringBuilder(STRING).reverse());
        System.out.print(TEXT_IS_PALINDROME.test(TEXT));
    }
}