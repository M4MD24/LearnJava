package _2_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_3;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGS) {
        final List<String> TEXTS = Arrays.asList("Hello", "World", "Java", "Lambda", "Expression");

        final List<String> UPPERCASE_TEXTS = TEXTS.stream().map(String::toUpperCase).toList(),
                LOWERCASE_TEXTS = TEXTS.stream().map(String::toLowerCase).toList();

        System.out.println("Original Texts : " + TEXTS);
        System.out.println("Uppercase Texts: " + UPPERCASE_TEXTS);
        System.out.print("Lowercase Texts: " + LOWERCASE_TEXTS);
    }
}