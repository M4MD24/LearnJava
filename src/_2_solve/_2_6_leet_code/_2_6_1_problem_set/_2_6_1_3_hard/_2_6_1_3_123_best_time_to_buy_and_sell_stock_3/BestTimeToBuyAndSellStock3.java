package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_123_best_time_to_buy_and_sell_stock_3;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <br/>
 * <br/>
 * Find the maximum profit you can achieve. You may complete at most two transactions.
 * <br/>
 * <br/>
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * </h2>
 */

public class BestTimeToBuyAndSellStock3 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

    private static int maxProfit(final int[] PRICES) {
        if (PRICES == null || PRICES.length == 0)
            return 0;
        else {
            final int MAXIMUM_LENGTH = PRICES.length;
            final int[] LEFT_PROFIT = new int[MAXIMUM_LENGTH];
            int minimumPrice = PRICES[0];
            for (int index = 1; index < MAXIMUM_LENGTH; index++) {
                LEFT_PROFIT[index] = Math.max(LEFT_PROFIT[index - 1], PRICES[index] - minimumPrice);
                minimumPrice = Math.min(minimumPrice, PRICES[index]);
            }
            final int[] RIGHT_PROFIT = new int[MAXIMUM_LENGTH];
            int maximumPrice = PRICES[MAXIMUM_LENGTH - 1];
            for (int index = MAXIMUM_LENGTH - 2; index >= 0; index--) {
                RIGHT_PROFIT[index] = Math.max(RIGHT_PROFIT[index + 1], maximumPrice - PRICES[index]);
                maximumPrice = Math.max(maximumPrice, PRICES[index]);
            }
            int maxProfit = 0;
            for (int index = 0; index < MAXIMUM_LENGTH; index++)
                maxProfit = Math.max(maxProfit, LEFT_PROFIT[index] + RIGHT_PROFIT[index]);
            return maxProfit;
        }
    }
}