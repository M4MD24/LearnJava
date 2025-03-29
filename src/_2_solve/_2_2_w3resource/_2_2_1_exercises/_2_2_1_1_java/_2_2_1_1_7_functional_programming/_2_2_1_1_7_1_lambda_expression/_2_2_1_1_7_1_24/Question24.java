package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_1_lambda_expression._2_2_1_1_7_1_24;

import java.util.function.Function;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to find the largest prime factor of a given number.</h2>
 */

public class Question24 {
    public static void main(final String[] ARGUMENTS) {
        final Function<Long, Long> LARGEST_PRIME_FACTOR = (NUMBER) -> {
            long factor = 2;
            while (factor * factor <= NUMBER) {
                if (NUMBER % factor == 0)
                    NUMBER /= factor;
                else
                    factor++;
            }
            return NUMBER;
        };
        System.out.print(LARGEST_PRIME_FACTOR.apply(8L));
    }
}