package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_20_sum_two_smallest_numbers;

import java.util.Arrays;

public class SumTwoSmallestNumbersExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getSumTwoSmallestNumbers(new int[]{2, 5, 6, 7, 3}));
        System.out.println(getSumTwoSmallestNumbers(new int[]{4, 3, 60, 9}));
        System.out.println(getSumTwoSmallestNumbers(new int[]{50, 1, 1, 4}));
        System.out.print(getSumTwoSmallestNumbers(new int[]{7, 8, 60, 100}));
    }

    private static int getSumTwoSmallestNumbers(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        return NUMBERS[0] + NUMBERS[1];
    }
}