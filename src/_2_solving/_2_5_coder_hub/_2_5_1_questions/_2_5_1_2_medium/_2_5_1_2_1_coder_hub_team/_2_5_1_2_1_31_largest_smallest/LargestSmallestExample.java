package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_31_largest_smallest;

import java.util.Arrays;

public class LargestSmallestExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getLargestAndSmallestNumber(new int[]{5, 1, 2, 4, 9, 10, 200})));
        System.out.println(Arrays.toString(getLargestAndSmallestNumber(new int[]{500, 123, 52, 123, 22})));
        System.out.println(Arrays.toString(getLargestAndSmallestNumber(new int[]{1, 1, 2, 5, 2, 5, 8})));
        System.out.print(Arrays.toString(getLargestAndSmallestNumber(new int[]{7, 9, 12, 100, 244})));
    }

    private static int[] getLargestAndSmallestNumber(final int[] NUMBERS) {
        final java.util.IntSummaryStatistics SUMMARY_STATISTICS = java.util.Arrays.stream(NUMBERS).summaryStatistics();
        return new int[] {SUMMARY_STATISTICS.getMax(),SUMMARY_STATISTICS.getMin()};
    }
}