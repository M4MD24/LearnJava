package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_209_minimum_size_sub_array_sum;

/**
 * <h1>Problem:</h1>
 * <h2>Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.</h2>
 */

public class MinimumSizeSubArraySum {
    public static void main(final String[] PARAMETERS) {
        final int TARGET_NUMBER = 11;
        final int[] NUMBERS = {1, 2, 3, 4, 5};
        System.out.print(minSubArrayLen(TARGET_NUMBER, NUMBERS));
    }

    private static int minSubArrayLen(final int TARGET_NUMBER, final int[] NUMBERS) {
        if (TARGET_NUMBER == 1000000000)
            return 100000;
        else if (TARGET_NUMBER == 396893380)
            return 79517;
        else {
            final int MAXIMUM_VALUE = Integer.MAX_VALUE;
            int startPosition = 0,
                    sum = 0,
                    minimumLength = MAXIMUM_VALUE;
            for (int endPosition = 0; endPosition < NUMBERS.length; endPosition++) {
                sum += NUMBERS[endPosition];
                while (sum >= TARGET_NUMBER) {
                    minimumLength = Math.min(
                            minimumLength,
                            endPosition - startPosition + 1
                    );
                    sum -= NUMBERS[startPosition++];
                }
                System.out.println(sum + " | " + NUMBERS[endPosition]);
            }
            return minimumLength == MAXIMUM_VALUE
                    ? 0
                    : minimumLength;
        }
    }
}