package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_1_lambda_expression._2_2_1_1_7_1_4;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to filter out even and odd numbers from a list of integers.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        final List<Integer> NUMBERS = Arrays.asList(11, 20, 33, 40, 55);

        final List<Integer> ODD_NUMBERS = NUMBERS.stream().filter(NUMBER -> NUMBER % 2 != 0).toList(),
                EVEN_NUMBERS = NUMBERS.stream().filter(NUMBER -> NUMBER % 2 == 0).toList();

        System.out.println("Original Numbers: " + NUMBERS);
        System.out.println("Odd Numbers\t\t: " + ODD_NUMBERS);
        System.out.print("Even List\t\t: " + EVEN_NUMBERS);
    }
}