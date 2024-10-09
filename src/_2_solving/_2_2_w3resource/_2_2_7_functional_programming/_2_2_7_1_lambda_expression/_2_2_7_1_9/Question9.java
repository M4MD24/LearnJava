package _2_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_9;

import java.util.function.Predicate;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to create a lambda expression to check if a number is prime.</h2>
 */

public class Question9 {
    public static void main(final String[] PARAMETERS) {
        final Predicate<Integer> IS_PALINDROME = NUMBER -> {
            if (NUMBER == 0 || NUMBER == 1) return false;
            else if (NUMBER == 2 || NUMBER == 3) return true;
            else if (NUMBER % 2 == 0 || NUMBER % 3 == 0) return false;
            else {
                for (int index = 5; index * index <= NUMBER; index += 2)
                    if (NUMBER % index == 0 || (NUMBER % (index + 2)) == 0) return false;
                return true;
            }
        };
        System.out.print(IS_PALINDROME.test(5));
    }
}