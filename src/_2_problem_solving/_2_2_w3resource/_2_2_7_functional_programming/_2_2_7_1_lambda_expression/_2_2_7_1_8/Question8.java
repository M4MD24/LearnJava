package _2_problem_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_8;

import java.util.function.LongUnaryOperator;

/**
 * <h1>Question:</h1>
 * <h2>Write a lambda expression to implement a lambda expression to calculate the factorial of a given number.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGS) {
        final LongUnaryOperator NUMBERS = TARGET_NUMBER -> {
            long multiplication = 1;
            for (long index = 2; index <= TARGET_NUMBER; index++)
                multiplication *= index;
            return multiplication;
        };
        System.out.print(NUMBERS.applyAsLong(3));
    }
}