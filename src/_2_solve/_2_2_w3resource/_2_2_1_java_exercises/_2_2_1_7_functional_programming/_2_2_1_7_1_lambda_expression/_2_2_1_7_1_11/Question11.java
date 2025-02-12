package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_7_functional_programming._2_2_1_7_1_lambda_expression._2_2_1_7_1_11;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to find the maximum and minimum values in a list of integers.</h2>
 */

public class Question11 {
    public static void main(final String[] ARGUMENTS) {
        final List<Integer> NUMBERS = Arrays.asList(10, 22, 30, 40, 55);
        final int MAXIMUM_NUMBER_OF_NUMBERS = NUMBERS
                .stream()
                .mapToInt(NUMBER -> NUMBER)
                .max()
                .getAsInt();
        final int MINIMUM_NUMBER_OF_NUMBERS = NUMBERS
                .stream()
                .mapToInt(NUMBER -> NUMBER)
                .min()
                .getAsInt();
        System.out.println("Maximum Number: " + MAXIMUM_NUMBER_OF_NUMBERS);
        System.out.print("Minimum Number: " + MINIMUM_NUMBER_OF_NUMBERS);
    }
}