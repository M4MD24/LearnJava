package _2_solve._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_18;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given non-negative integers using the Stooge Sort Algorithm.</h2>
 */

public class Question18 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        stoogeSort(NUMBERS, 0, NUMBERS.length - 1);
        System.out.print(Arrays.toString(NUMBERS));
    }

    private static void stoogeSort(final int[] ARRAY, final int START_INDEX, final int END_INDEX) {
        if (START_INDEX >= END_INDEX)
            return;
        if (ARRAY[START_INDEX] > ARRAY[END_INDEX]) {
            int temp = ARRAY[START_INDEX];
            ARRAY[START_INDEX] = ARRAY[END_INDEX];
            ARRAY[END_INDEX] = temp;
        }
        if (END_INDEX - START_INDEX + 1 > 2) {
            final int ONE_THIRD_LENGTH = (END_INDEX - START_INDEX + 1) / 3;
            stoogeSort(
                    ARRAY,
                    START_INDEX,
                    END_INDEX - ONE_THIRD_LENGTH
            );
            stoogeSort(
                    ARRAY,
                    START_INDEX + ONE_THIRD_LENGTH,
                    END_INDEX
            );
            stoogeSort(
                    ARRAY,
                    START_INDEX,
                    END_INDEX - ONE_THIRD_LENGTH
            );
        }
    }
}