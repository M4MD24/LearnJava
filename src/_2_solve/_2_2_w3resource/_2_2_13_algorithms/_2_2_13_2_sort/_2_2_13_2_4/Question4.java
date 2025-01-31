package _2_solve._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_4;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Merge Sort Algorithm.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(mergeSorting(
                NUMBERS,
                0,
                NUMBERS.length - 1
        ));
    }

    private static String mergeSorting(final int[] ARRAY, final int LEFT, final int RIGHT) {
        if (LEFT < RIGHT) {
            final int MIDDLE = (LEFT + RIGHT) / 2;
            mergeSorting(ARRAY, LEFT, MIDDLE);
            mergeSorting(ARRAY, MIDDLE + 1, RIGHT);
            merge(ARRAY, LEFT, MIDDLE, RIGHT);
        }
        return Arrays.toString(ARRAY);
    }

    private static void merge(final int[] ARRAY, final int LEFT, final int MIDDLE, final int RIGHT) {
        final int NUMBER_1 = MIDDLE - LEFT + 1,
                NUMBER_2 = RIGHT - MIDDLE;
        final int[] LEFT_ARRAY = new int[NUMBER_1],
                RIGHT_ARRAY = new int[NUMBER_2];
        System.arraycopy(ARRAY, LEFT, LEFT_ARRAY, 0, NUMBER_1);
        for (int index = 0; index < NUMBER_2; index++)
            RIGHT_ARRAY[index] = ARRAY[MIDDLE + 1 + index];
        int index1 = 0,
                index2 = 0,
                index3 = LEFT;
        while (index1 < NUMBER_1 && index2 < NUMBER_2) {
            if (LEFT_ARRAY[index1] <= RIGHT_ARRAY[index2])
                ARRAY[index3] = LEFT_ARRAY[index1++];
            else
                ARRAY[index3] = RIGHT_ARRAY[index2++];
            index3++;
        }
        while (index1 < NUMBER_1)
            ARRAY[index3++] = LEFT_ARRAY[index1++];
        while (index2 < NUMBER_2)
            ARRAY[index3++] = RIGHT_ARRAY[index2++];
    }
}