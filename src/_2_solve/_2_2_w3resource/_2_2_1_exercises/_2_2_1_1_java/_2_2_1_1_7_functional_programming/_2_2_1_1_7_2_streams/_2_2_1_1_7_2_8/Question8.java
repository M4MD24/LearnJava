package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_2_streams._2_2_1_1_7_2_8;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the second smallest and largest elements in a list of integers using streams.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) {
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
        System.out.println("Second Largest Numbers : " + SECOND_LARGEST_ELEMENT);
        System.out.print("Second Smallest Numbers: " + SECOND_SMALLEST_ELEMENT);
    }
}