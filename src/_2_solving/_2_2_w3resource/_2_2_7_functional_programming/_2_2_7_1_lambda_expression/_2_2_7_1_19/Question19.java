package _2_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_19;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to find the second largest and smallest element in an array.</h2>
 */

public class Question19 {
    public static void main(final String[] PARAMETERS) {
        Strings();
        Numbers();
    }

    private static void Numbers() {
        final int[] NUMBERS = {10, 5, 20, 8, 15};
        final int SECOND_LARGEST_ELEMENT = Arrays
                .stream(NUMBERS)
                .distinct()
                .sorted()
                .skip(NUMBERS.length - 2)
                .findFirst()
                .getAsInt();
        final int SECOND_SMALLEST_ELEMENT = Arrays
                .stream(NUMBERS)
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .getAsInt();
        System.out.println("■ Numbers");
        System.out.println("Second Largest Element : " + SECOND_LARGEST_ELEMENT);
        System.out.print("Second Smallest Element: " + SECOND_SMALLEST_ELEMENT);
    }

    private static void Strings() {
        final String[] TEXTS = {"Orange", "Apple", "Cherry", "Banana", "Strawberry"};
        Arrays.sort(TEXTS, Comparator.comparingInt(String::length));
        final String SECOND_LARGEST_ELEMENT = TEXTS[TEXTS.length - 2],
                SECOND_SMALLEST_ELEMENT = TEXTS[1];
        System.out.println("■ Strings");
        System.out.println("Second Largest Element : " + SECOND_LARGEST_ELEMENT);
        System.out.println("Second Smallest Element: " + SECOND_SMALLEST_ELEMENT + "\n");
    }
}