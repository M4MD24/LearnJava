package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_12;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a lambda expression to multiply and sum all elements in a list of integers.</h2>
 */

public class Question12 {
    public static void main(final String[] PARAMETERS) {
        final List<Integer> NUMBERS = Arrays.asList(1, 2, 3, 4, 5);
        final int RESULT_OF_MULTIPLY_OF_ALL_NUMBERS = NUMBERS
                .stream()
                .reduce(1, (FIRST_NUMBER, SECOND_NUMBER) -> FIRST_NUMBER * SECOND_NUMBER);
        final int RESULT_OF_SUMMATION_OF_ALL_NUMBERS = NUMBERS
                .stream()
                .reduce(0, Integer::sum);
        System.out.println("Multiply of All Numbers: " + RESULT_OF_MULTIPLY_OF_ALL_NUMBERS);
        System.out.print("Summation of All Number: " + RESULT_OF_SUMMATION_OF_ALL_NUMBERS);
    }
}