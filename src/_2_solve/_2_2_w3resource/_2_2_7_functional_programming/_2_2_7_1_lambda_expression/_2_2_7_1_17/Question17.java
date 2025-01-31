package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_17;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to find the length of the longest and smallest string in a list.</h2>
 */

public class Question17 {
    public static void main(final String[] ARGUMENTS) {
        final List<String> TEXTS = Arrays.asList("Strawberry", "Apple", "Orange", "Banana");
        final int MAXIMUM_LENGTH = TEXTS
                .stream()
                .mapToInt(String::length)
                .max()
                .orElse(0);
        final int MINIMUM_LENGTH = TEXTS
                .stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
        System.out.println("Length of the longest text: " + MAXIMUM_LENGTH);
        System.out.print("Length of the smallest text: " + MINIMUM_LENGTH);
    }
}