package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_124;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the index of a value in a sorted array. If the value does not find return the index where it would be if it were inserted in order.</h2>
 * <h1>Example:</h1>
 * <h2>
 * [1, 2, 4, 5, 6] 5 (target) -> 3 (index)
 * [1, 2, 4, 5, 6] 0 (target) -> 0 (index)
 * [1, 2, 4, 5, 6] 7 (target) -> 5 (index)
 * </h2>
 */

public class Question124 {
    private static final int[] numbers = {1, 2, 4, 5, 6};
    private static final Scanner input = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        System.out.print("Input target: ");
        final int TARGET = input.nextInt();

        System.out.println("Array: " + Arrays.toString(numbers));

        searchTarget(TARGET);
    }

    private static void searchTarget(final int TARGET) {
        int index;
        for (index = 0; index < numbers.length; index++)
            if (TARGET == numbers[index] || TARGET < numbers[index]) break;
        System.out.print(index);
    }
}