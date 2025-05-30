package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_20_cumulative_sum;

import java.util.Arrays;

public class CumulativeSumExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Arrays.toString(geCumulativeSum(new int[]{2, 4, 8})));
        System.out.println(Arrays.toString(geCumulativeSum(new int[]{0, 0, 0})));
        System.out.println(Arrays.toString(geCumulativeSum(new int[]{3, 4, 5})));
        System.out.print(Arrays.toString(geCumulativeSum(new int[]{-4, -3, -2})));
    }

    private static int[] geCumulativeSum(final int[] NUMBERS) {
        int currentSum = NUMBERS[0];
        for (int index = 1; index < NUMBERS.length; index++) {
            final int CURRENT_NUMBER = NUMBERS[index];
            NUMBERS[index] += currentSum;
            currentSum += CURRENT_NUMBER;
        }
        return NUMBERS;
    }
}