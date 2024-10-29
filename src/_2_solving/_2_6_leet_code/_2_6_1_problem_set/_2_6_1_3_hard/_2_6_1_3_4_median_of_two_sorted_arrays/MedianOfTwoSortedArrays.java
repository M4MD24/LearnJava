package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_4_median_of_two_sorted_arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
 * <br/>
 * <br/>
 * The overall run time complexity should be O(log (m+n)).
 * </h2>
 */

public class MedianOfTwoSortedArrays {
    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBERS = {1, 2},
                SECOND_NUMBERS = {3, 4};
        System.out.print(findMedianSortedArrays(FIRST_NUMBERS, SECOND_NUMBERS));
    }

    private static double findMedianSortedArrays(int[] firstNumbers, int[] secondNumbers) {
        if (firstNumbers.length > secondNumbers.length) {
            final int[] TEMPORARY_NUMBERS = firstNumbers;
            firstNumbers = secondNumbers;
            secondNumbers = TEMPORARY_NUMBERS;
        }
        final int FIRST_NUMBERS_LENGTH = firstNumbers.length,
                SECOND_NUMBERS_LENGTH = secondNumbers.length;
        final int TOTAL_HALF_LENGTH = (FIRST_NUMBERS_LENGTH + SECOND_NUMBERS_LENGTH + 1) / 2;
        int minimumIndex = 0,
                maximumIndex = FIRST_NUMBERS_LENGTH;
        while (minimumIndex <= maximumIndex) {
            final int PARTITION_FIRST_NUMBERS = (minimumIndex + maximumIndex) / 2,
                    PARTITION_SECOND_NUMBERS = TOTAL_HALF_LENGTH - PARTITION_FIRST_NUMBERS;
            if (PARTITION_FIRST_NUMBERS < FIRST_NUMBERS_LENGTH && firstNumbers[PARTITION_FIRST_NUMBERS] < secondNumbers[PARTITION_SECOND_NUMBERS - 1])
                minimumIndex = PARTITION_FIRST_NUMBERS + 1;
            else if (PARTITION_FIRST_NUMBERS > 0 && firstNumbers[PARTITION_FIRST_NUMBERS - 1] > secondNumbers[PARTITION_SECOND_NUMBERS])
                maximumIndex = PARTITION_FIRST_NUMBERS - 1;
            else {
                final int MAXIMUM_OF_LEFT;
                if (PARTITION_FIRST_NUMBERS == 0)
                    MAXIMUM_OF_LEFT = secondNumbers[PARTITION_SECOND_NUMBERS - 1];
                else if (PARTITION_SECOND_NUMBERS == 0)
                    MAXIMUM_OF_LEFT = firstNumbers[PARTITION_FIRST_NUMBERS - 1];
                else
                    MAXIMUM_OF_LEFT = Math.max(firstNumbers[PARTITION_FIRST_NUMBERS - 1], secondNumbers[PARTITION_SECOND_NUMBERS - 1]);
                if ((FIRST_NUMBERS_LENGTH + SECOND_NUMBERS_LENGTH) % 2 == 1)
                    return MAXIMUM_OF_LEFT;
                else {
                    final int MINIMUM_OF_RIGHT;
                    if (PARTITION_FIRST_NUMBERS == FIRST_NUMBERS_LENGTH)
                        MINIMUM_OF_RIGHT = secondNumbers[PARTITION_SECOND_NUMBERS];
                    else if (PARTITION_SECOND_NUMBERS == SECOND_NUMBERS_LENGTH)
                        MINIMUM_OF_RIGHT = firstNumbers[PARTITION_FIRST_NUMBERS];
                    else
                        MINIMUM_OF_RIGHT = Math.min(firstNumbers[PARTITION_FIRST_NUMBERS], secondNumbers[PARTITION_SECOND_NUMBERS]);
                    return (MAXIMUM_OF_LEFT + MINIMUM_OF_RIGHT) / 2.0;
                }
            }
        }
        throw new IllegalArgumentException("Numbers aren't sorted!");
    }

// >
    /*private static double findMedianSortedArrays(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS) {
        if (FIRST_NUMBERS.length > SECOND_NUMBERS.length)
            return findMedianSortedArrays(SECOND_NUMBERS, FIRST_NUMBERS);
        else {
            final int LENGTH_FIRST = FIRST_NUMBERS.length,
                    LENGTH_SECOND = SECOND_NUMBERS.length;
            int low = 0,
                    high = LENGTH_FIRST;
            while (low <= high) {
                final int PARTITION_FIRST = (low + high) / 2,
                        PARTITION_SECOND = (LENGTH_FIRST + LENGTH_SECOND + 1) / 2 - PARTITION_FIRST;
                final int MAXIMUM_LEFT_FIRST = (PARTITION_FIRST == 0)
                        ? Integer.MIN_VALUE
                        : FIRST_NUMBERS[PARTITION_FIRST - 1],
                        MINIMUM_RIGHT_FIRST = (PARTITION_FIRST == LENGTH_FIRST)
                                ? Integer.MAX_VALUE
                                : FIRST_NUMBERS[PARTITION_FIRST];
                final int MAXIMUM_LEFT_SECOND = (PARTITION_SECOND == 0)
                        ? Integer.MIN_VALUE
                        : SECOND_NUMBERS[PARTITION_SECOND - 1],
                        MINIMUM_RIGHT_SECOND = (PARTITION_SECOND == LENGTH_SECOND)
                                ? Integer.MAX_VALUE
                                : SECOND_NUMBERS[PARTITION_SECOND];
                if (MAXIMUM_LEFT_FIRST <= MINIMUM_RIGHT_SECOND &&
                        MAXIMUM_LEFT_SECOND <= MINIMUM_RIGHT_FIRST)
                    if ((LENGTH_FIRST + LENGTH_SECOND) % 2 == 0)
                        return (Math.max(MAXIMUM_LEFT_FIRST, MAXIMUM_LEFT_SECOND) + Math.min(MINIMUM_RIGHT_FIRST, MINIMUM_RIGHT_SECOND)) / 2.0;
                    else
                        return Math.max(MAXIMUM_LEFT_FIRST, MAXIMUM_LEFT_SECOND);
                else if (MAXIMUM_LEFT_FIRST > MINIMUM_RIGHT_SECOND)
                    high = PARTITION_FIRST - 1;
                else
                    low = PARTITION_FIRST + 1;
            }
            throw new IllegalArgumentException("Numbers aren't sorted!");
        }
    }*/
}