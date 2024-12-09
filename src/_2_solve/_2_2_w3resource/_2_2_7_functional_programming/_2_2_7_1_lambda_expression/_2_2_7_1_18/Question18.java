package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_18;

import java.util.function.Predicate;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to check if a given number is a perfect square.</h2>
 */

public class Question18 {
    public static void main(final String[] PARAMETERS) {
        final Predicate<Integer> IS_PERFECT_SQUARE = (NUMBER) -> {
            final double CURRENT_SQUARE = Math.sqrt(NUMBER);
            final long PERFECT_SQUARE = (long) Math.sqrt(NUMBER);
            return CURRENT_SQUARE == PERFECT_SQUARE;
        };
        System.out.print(IS_PERFECT_SQUARE.test(144));
    }
}