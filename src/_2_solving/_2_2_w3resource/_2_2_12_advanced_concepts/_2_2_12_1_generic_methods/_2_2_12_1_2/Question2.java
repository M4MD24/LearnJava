package _2_solving._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_1_generic_methods._2_2_12_1_2;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a generic method that takes a list of numbers and returns the sum of all the even and odd numbers.</h2>
 */

public class Question2 {
    public static void main(final String[] PARAMETERS) {
        final Integer[] NUMBERS = {1, 2, 3, 4, 5};
        System.out.printf("""
                        Sum of odd numbers: %f
                        Sum of even numbers: %f""",
                getSumOfOddNumbers(NUMBERS),
                getSumOfEvenNumbers(NUMBERS));
    }

    private static <Type extends Number> double getSumOfOddNumbers(final Type[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .filter(number -> number.doubleValue() % 2 != 0)
                .mapToDouble(Number::doubleValue)
                .sum();
    }

    private static <Type extends Number> double getSumOfEvenNumbers(final Type[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .filter(number -> number.doubleValue() % 2 == 0)
                .mapToDouble(Number::doubleValue)
                .sum();
    }
}