package _2_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_16;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to implement a lambda expression to check if a list of strings contains a specific word.</h2>
 */

public class Question16 {
    public static void main(final String[] ARGS) {
        final List<String> TEXTS = Arrays.asList("Strawberry", "Apple", "Orange", "Banana");
        final boolean CONTAINS_THE_WORD = TEXTS.stream().anyMatch(WORD -> WORD.equals("Apple"));
        System.out.print(CONTAINS_THE_WORD);
    }
}