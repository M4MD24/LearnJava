package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_198_house_robber;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed, the only constraint stopping you from robbing each of them is that adjacent houses have security systems connected and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <br/>
 * <br/>
 * Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * </h2>
 */

public class HouseRobber {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {2, 7, 9, 3, 1};
        System.out.print(rob(NUMBERS));
    }

    private static int rob(final int[] HOUSE_AMOUNTS) {
        int previousMaximumAmount = 0,
                currentMaximumAmount = 0;
        for (final int CURRENT_HOUSE_AMOUNT : HOUSE_AMOUNTS) {
            final int TEMPORARY_CURRENT_MAXIMUM_AMOUNT = currentMaximumAmount;
            currentMaximumAmount = Math.max(previousMaximumAmount + CURRENT_HOUSE_AMOUNT, currentMaximumAmount);
            previousMaximumAmount = TEMPORARY_CURRENT_MAXIMUM_AMOUNT;
        }
        return currentMaximumAmount;
    }
}