package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_9_heap;

import java.util.Arrays;

public class HeapExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {45, 7, 20, 20, 40, 25, 40, 23, -2};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        heapSort(NUMBERS);
        System.out.print("After Heap Sort : " + Arrays.toString(NUMBERS));
    }

    private static void heapify(final int[] NUMBERS, final int LENGTH, final int CURRENT_INDEX) {
        int largestNumberIndex = CURRENT_INDEX;
        final int LEFT = 2 * CURRENT_INDEX + 1,
                RIGHT = 2 * CURRENT_INDEX + 2;
        if (LEFT < LENGTH && NUMBERS[LEFT] > NUMBERS[largestNumberIndex])
            largestNumberIndex = LEFT;
        if (RIGHT < LENGTH && NUMBERS[RIGHT] > NUMBERS[largestNumberIndex])
            largestNumberIndex = RIGHT;
        if (largestNumberIndex != CURRENT_INDEX) {
            final int TEMPORARY_NUMBER = NUMBERS[CURRENT_INDEX];
            NUMBERS[CURRENT_INDEX] = NUMBERS[largestNumberIndex];
            NUMBERS[largestNumberIndex] = TEMPORARY_NUMBER;
            heapify(NUMBERS, LENGTH, largestNumberIndex);
        }
    }

    private static void heapSort(final int[] NUMBERS) {
        final int LENGTH = NUMBERS.length;
        for (int index = LENGTH / 2 - 1; index >= 0; index--)
            heapify(NUMBERS, LENGTH, index);
        for (int index = LENGTH - 1; index >= 0; index--) {
            final int TEMPORARY_NUMBER = NUMBERS[0];
            NUMBERS[0] = NUMBERS[index];
            NUMBERS[index] = TEMPORARY_NUMBER;
            heapify(NUMBERS, index, 0);
        }
    }
}