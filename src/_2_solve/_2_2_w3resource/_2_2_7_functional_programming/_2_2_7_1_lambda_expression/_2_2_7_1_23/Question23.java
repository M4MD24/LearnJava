package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_23;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to find the average length of strings in a list.</h2>
 */

public class Question23 {
    public static void main(final String[] PARAMETERS) {
        final List<String> TEXTS = Arrays.asList("orange", "Apple", "mango", "BANANA", "Strawberry", "CHERRY");
        final double AVERAGE_OF_TEXTS_LENGTHS = TEXTS
                .stream()
                .mapToInt(String::length)
                .average()
                .orElse(0);
        System.out.print(AVERAGE_OF_TEXTS_LENGTHS);
    }
}