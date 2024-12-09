package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_13_k_sum_sub_set;

public class KSumSubSetExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(areThereNumbersEqualTheTargetSum(new int[]{7, 3, 2, 5, 8}, 14));
        System.out.println(areThereNumbersEqualTheTargetSum(new int[]{2, 4, 6, 8}, 11));
        System.out.println(areThereNumbersEqualTheTargetSum(new int[]{7, 5, 3, 1}, 4));
        System.out.print(areThereNumbersEqualTheTargetSum(new int[]{14, 8, 12, 9}, 21));
    }

    private static boolean areThereNumbersEqualTheTargetSum(final int[] NUMBERS, final int TARGET_SUM) {
        final boolean[] REACHABLE_SUMS = new boolean[TARGET_SUM + 1];
        REACHABLE_SUMS[0] = true;
        for (final int NUMBER : NUMBERS)
            for (int index = TARGET_SUM; index >= NUMBER; index--)
                REACHABLE_SUMS[index] = REACHABLE_SUMS[index] || REACHABLE_SUMS[index - NUMBER];
        return REACHABLE_SUMS[TARGET_SUM];
    }
}