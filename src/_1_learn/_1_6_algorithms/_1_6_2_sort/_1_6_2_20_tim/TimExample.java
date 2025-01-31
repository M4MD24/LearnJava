package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_20_tim;

import java.util.Arrays;

public class TimExample {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(timSort(NUMBERS));
    }

    private static final int RUN_LENGTH = 32;

    private static String timSort(final int[] ARRAY) {
        for (int startIndex = 0; startIndex < ARRAY.length; startIndex += RUN_LENGTH)
            insertionSort(
                    ARRAY,
                    startIndex,
                    Math.min(
                            startIndex + RUN_LENGTH - 1,
                            ARRAY.length - 1
                    )
            );
        for (int currentSize = RUN_LENGTH; currentSize < ARRAY.length; currentSize *= 2)
            for (int leftIndex = 0; leftIndex < ARRAY.length; leftIndex += 2 * currentSize)
                merge(
                        ARRAY,
                        leftIndex,
                        Math.min(
                                leftIndex + currentSize - 1,
                                ARRAY.length - 1
                        ),
                        Math.min(
                                leftIndex + 2 * currentSize - 1,
                                ARRAY.length - 1
                        )
                );
        return Arrays.toString(ARRAY);
    }

    private static void insertionSort(final int[] ARRAY, final int LEFT_BOUND, final int RIGHT_BOUND) {
        for (int index = LEFT_BOUND + 1; index <= RIGHT_BOUND; index++) {
            final int CURRENT_VALUE = ARRAY[index];
            int previousIndex = index - 1;
            while (previousIndex >= LEFT_BOUND &&
                    ARRAY[previousIndex] > CURRENT_VALUE)
                ARRAY[previousIndex + 1] = ARRAY[previousIndex--];
            ARRAY[previousIndex + 1] = CURRENT_VALUE;
        }
    }

    private static void merge(final int[] ARRAY, final int LEFT_BOUND, final int MIDDLE_POINT, final int RIGHT_BOUND) {
        final int[] MERGED_ARRAY = new int[RIGHT_BOUND - LEFT_BOUND + 1];
        int leftPointer = LEFT_BOUND,
                rightPointer = MIDDLE_POINT + 1;
        int mergeIndex = 0;
        while (leftPointer <= MIDDLE_POINT &&
                rightPointer <= RIGHT_BOUND)
            MERGED_ARRAY[mergeIndex++] = ARRAY[leftPointer] <= ARRAY[rightPointer]
                    ? ARRAY[leftPointer++]
                    : ARRAY[rightPointer++];
        while (leftPointer <= MIDDLE_POINT)
            MERGED_ARRAY[mergeIndex++] = ARRAY[leftPointer++];
        while (rightPointer <= RIGHT_BOUND)
            MERGED_ARRAY[mergeIndex++] = ARRAY[rightPointer++];
        System.arraycopy(
                MERGED_ARRAY,
                0,
                ARRAY,
                LEFT_BOUND,
                MERGED_ARRAY.length
        );
    }

// >
    /*private static String timSort(final int[] ARRAY) {
        Arrays.sort(ARRAY);
        return Arrays.toString(ARRAY);
    }*/
}