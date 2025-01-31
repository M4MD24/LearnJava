package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_21;

import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to calculate the sum of all prime numbers in a given range.</h2>
 */

public class Question21 {
    public static void main(final String[] ARGUMENTS) {
        final int START_RANGE = 1,
                END_RANGE = 5,
                SUM_OF_PRIME_NUMBERS = IntStream
                        .rangeClosed(START_RANGE, END_RANGE)
                        .filter(Question21::isPrime)
                        .sum();
        System.out.print("Sum of prime numbers between " + START_RANGE + " and " + END_RANGE + " is: " + SUM_OF_PRIME_NUMBERS);
    }

    private static boolean isPrime(final int NUMBER) {
        if (NUMBER == 0 || NUMBER == 1) return false;
        else if (NUMBER == 2 || NUMBER == 3) return true;
        else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
        else {
            for (int index = 5; index * index <= NUMBER; index += 2)
                if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0) return false;
            return true;
        }
    }
}