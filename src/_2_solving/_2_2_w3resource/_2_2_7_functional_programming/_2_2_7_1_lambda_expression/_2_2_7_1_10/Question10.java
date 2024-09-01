package _2_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_10;

import java.util.function.BiFunction;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to implement a lambda expression to concatenate two strings.</h2>
 */

public class Question10 {
    public static void main(final String[] ARGS) {
        final BiFunction<String, String, String> CONCATENATE = (FIRST_TEXT, SECOND_TEXT) -> FIRST_TEXT + SECOND_TEXT;
        System.out.print(CONCATENATE.apply("Hello ","Java"));
    }
}