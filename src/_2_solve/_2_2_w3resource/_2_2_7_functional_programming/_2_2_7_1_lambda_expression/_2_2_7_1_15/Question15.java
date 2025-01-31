package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_15;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to calculate the sum of squares of all odd and even numbers in a list.</h2>
 */

public class Question15 {
    public static void main(final String[] ARGUMENTS) {
        final List<Integer> NUMBERS = Arrays.asList(10, 20, 33, 40, 55);
        final long SUM_OF_SQUARES_OF_ALL_ODD_NUMBERS = NUMBERS
                .stream()
                .filter(NUMBER -> NUMBER % 2 != 0)
                .mapToInt(NUMBER -> NUMBER * NUMBER)
                .sum();
        final long SUM_OF_SQUARES_OF_ALL_EVEN_NUMBERS = NUMBERS
                .stream()
                .filter(NUMBER -> NUMBER % 2 == 0)
                .mapToInt(NUMBER -> NUMBER * NUMBER)
                .sum();
        System.out.println("Sum of Squares of All Odd Numbers: " + SUM_OF_SQUARES_OF_ALL_ODD_NUMBERS);
        System.out.print("Sum of Squares of All Even Numbers: " + SUM_OF_SQUARES_OF_ALL_EVEN_NUMBERS);
    }
}