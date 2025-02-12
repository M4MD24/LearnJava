package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_26;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that partitions an array of integers into even and odd numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [7, 2, 4, 1, 3, 5, 6, 8, 2, 10]
 * <br/>
 * After partition the said array becomes: [10, 2, 4, 2, 8, 6, 5, 3, 1, 7]
 * </h2>
 */

public class Question26 {
    private static int[] numbers = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};

    public static void main(final String[] ARGUMENTS) {
        System.out.printf("Original array: %s\n", Arrays.toString(numbers));
        sortOddAndEvenNumbers();
        System.out.printf("After partition the said array becomes: %s", Arrays.toString(numbers));
    }

    private static void sortOddAndEvenNumbers() {
        final int[] NUMBERS_AFTER_SORT_ODD_AND_EVEN_NUMBERS = new int[numbers.length];
        for (int index = 0, evenIndex = 0, oddIndex = numbers.length - 1; index < numbers.length; index++) {
            if (numbers[index] % 2 != 0)
                NUMBERS_AFTER_SORT_ODD_AND_EVEN_NUMBERS[oddIndex--] = numbers[index];
            else
                NUMBERS_AFTER_SORT_ODD_AND_EVEN_NUMBERS[evenIndex++] = numbers[index];
        }
        numbers = NUMBERS_AFTER_SORT_ODD_AND_EVEN_NUMBERS;
    }
}