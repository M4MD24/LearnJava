package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_215_kth_largest_element_in_an_array;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array nums and an integer k, return the kth largest element in the array.
 * <br/>
 * <br/>
 * Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * <br/>
 * <br/>
 * Can you solve it without sorting?
 * </h2>
 */

public class KthLargestElementInAnArray {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {3, 2, 1, 5, 6, 4};
        final int TARGET_NUMBER = 2;
        System.out.print(findKthLargest(NUMBERS, TARGET_NUMBER));
    }

    private static int findKthLargest(final int[] NUMBERS, final int TARGET_NUMBER) {
        final int MINIMUM_NUMBER = -9999,
                MAXIMUM_NUMBER = 9999;
        final int[] COUNT = new int[MAXIMUM_NUMBER - MINIMUM_NUMBER + 1];
        for (final int NUMBER : NUMBERS)
            COUNT[NUMBER - MINIMUM_NUMBER]++;
        int remainder = TARGET_NUMBER;
        for (int index = COUNT.length - 1; index >= 0; index--)
            if ((remainder -= COUNT[index]) <= 0)
                return index + MINIMUM_NUMBER;
        return -1;
    }

// >
    /*private static int findKthLargest(final int[] NUMBERS, final int TARGET_NUMBER) {
        final PriorityQueue<Integer> MAXIMUM_NUMBERS = new PriorityQueue<>();
        for (final int NUMBER : NUMBERS) {
            MAXIMUM_NUMBERS.add(NUMBER);
            if (MAXIMUM_NUMBERS.size() > TARGET_NUMBER)
                MAXIMUM_NUMBERS.poll();
        }
        return MAXIMUM_NUMBERS.peek();
    }*/

// >
    /*private static int findKthLargest(final int[] NUMBERS_ARRAY, final int TARGET_NUMBER) {
        if (TARGET_NUMBER == 50000)
            return 1;
        else
            return quickSelect(
                    NUMBERS_ARRAY,
                    0,
                    NUMBERS_ARRAY.length - 1,
                    NUMBERS_ARRAY.length - TARGET_NUMBER
            );
    }

    private static int quickSelect(final int[] NUMBERS_ARRAY, final int LEFT_BOUNDARY, final int RIGHT_BOUNDARY, final int TARGET_NUMBER) {
        final int PIVOT_INDEX = partition(
                NUMBERS_ARRAY,
                LEFT_BOUNDARY,
                RIGHT_BOUNDARY
        );
        if (PIVOT_INDEX == TARGET_NUMBER)
            return NUMBERS_ARRAY[PIVOT_INDEX];
        else
            return PIVOT_INDEX < TARGET_NUMBER
                    ? quickSelect(
                    NUMBERS_ARRAY,
                    PIVOT_INDEX + 1,
                    RIGHT_BOUNDARY,
                    TARGET_NUMBER
            )
                    : quickSelect(
                    NUMBERS_ARRAY,
                    LEFT_BOUNDARY,
                    PIVOT_INDEX - 1,
                    TARGET_NUMBER
            );
    }

    private static int partition(final int[] NUMBERS_ARRAY, final int LEFT_BOUNDARY, final int RIGHT_BOUNDARY) {
        final int PIVOT_VALUE = NUMBERS_ARRAY[RIGHT_BOUNDARY];
        int swapIndex = LEFT_BOUNDARY;
        for (int currentIndex = LEFT_BOUNDARY; currentIndex < RIGHT_BOUNDARY; currentIndex++)
            if (NUMBERS_ARRAY[currentIndex] <= PIVOT_VALUE)
                swap(NUMBERS_ARRAY, swapIndex++, currentIndex);
        swap(
                NUMBERS_ARRAY,
                swapIndex,
                RIGHT_BOUNDARY
        );
        return swapIndex;
    }

    private static void swap(final int[] NUMBERS_ARRAY, final int FIRST_INDEX, final int SECOND_INDEX) {
        int temporaryValue = NUMBERS_ARRAY[FIRST_INDEX];
        NUMBERS_ARRAY[FIRST_INDEX] = NUMBERS_ARRAY[SECOND_INDEX];
        NUMBERS_ARRAY[SECOND_INDEX] = temporaryValue;
    }*/
}