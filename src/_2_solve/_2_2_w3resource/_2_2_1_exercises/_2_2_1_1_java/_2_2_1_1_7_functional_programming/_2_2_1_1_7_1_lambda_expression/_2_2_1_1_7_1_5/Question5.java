package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_1_lambda_expression._2_2_1_1_7_1_5;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to sort a list of strings in alphabetical order.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final List<String> TEXTS = Arrays.asList("Cat", "Apple", "Bear", "Deer"),
                SORTED_TEXTS = TEXTS.stream().sorted().toList();
        System.out.println("Original Texts: " + TEXTS);
        System.out.print("Sorted Texts  : " + SORTED_TEXTS);
    }
}