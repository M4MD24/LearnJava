package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_122_best_time_to_buy_and_sell_stock_2;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * <br/>
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 * <br/>
 * Find and return the maximum profit you can achieve.
 * </h2>
 */

public class BestTimeToBuyAndSellStock2 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {7, 1, 5, 3, 6, 4};
        System.out.print(bestTimeToBuyAndSellStock2(NUMBERS));
    }

    private static int bestTimeToBuyAndSellStock2(final int[] PRICES) {
        int maximumProfit = 0;
        for (int index = 1; index < PRICES.length; index++)
            if (PRICES[index] > PRICES[index - 1])
                maximumProfit += PRICES[index] - PRICES[index - 1];
        return maximumProfit;
    }
}