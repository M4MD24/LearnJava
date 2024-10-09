package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_1;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Quick sort algorithm.</h2>
 */


public class Question1 {
    public static void main(final String[] PARAMETERS) {
        int[] numbers = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(quickSort(numbers, 0, numbers.length - 1));
    }

    private static String quickSort(final int[] ARRAY, final int LOW, final int HIGH) {
        if (LOW < HIGH) {
            final int PIVOT = partition(ARRAY, LOW, HIGH);
            quickSort(ARRAY, LOW, PIVOT - 1);
            quickSort(ARRAY, PIVOT + 1, HIGH);
        }
        return Arrays.toString(ARRAY);
    }

    private static int partition(final int[] ARRAY, final int LOW, final int HIGH) {
        int pivot = ARRAY[HIGH],
                index = LOW - 1;
        for (int index2 = LOW; index2 < HIGH; index2++)
            if (ARRAY[index2] < pivot) {
                index++;
                final int TEMPORARY_NUMBER = ARRAY[index];
                ARRAY[index] = ARRAY[index2];
                ARRAY[index2] = TEMPORARY_NUMBER;
            }
        final int TEMPORARY_NUMBER = ARRAY[index + 1];
        ARRAY[index + 1] = ARRAY[HIGH];
        ARRAY[HIGH] = TEMPORARY_NUMBER;
        return index + 1;
    }
}