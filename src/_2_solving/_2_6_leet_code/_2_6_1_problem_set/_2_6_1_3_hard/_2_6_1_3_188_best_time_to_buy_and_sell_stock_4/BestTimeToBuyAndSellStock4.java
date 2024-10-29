package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_188_best_time_to_buy_and_sell_stock_4;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day, and an integer k.
 * <br/>
 * <br/>
 * Find the maximum profit you can achieve. You may complete at most k transactions: i.e. you may buy at most k times and sell at most k times.
 * <br/>
 * <br/>
 * Note: You may not engage in multiple transactions simultaneously (i.e., you must sell the stock before you buy again).
 * </h2>
 */

public class BestTimeToBuyAndSellStock4 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(maxProfit(
                2,
                new int[]{3, 2, 6, 5, 0, 3}
        ));
    }

    private static int maxProfit(final int MAXIMUM_TRANSACTIONS, final int[] PRICES) {
        if (PRICES.length == 0)
            return 0;
        else {
            final int[] BUY = new int[MAXIMUM_TRANSACTIONS + 1],
                    SELL = new int[MAXIMUM_TRANSACTIONS + 1];
            Arrays.fill(
                    BUY,
                    Integer.MIN_VALUE
            );
            Arrays.fill(
                    SELL,
                    0
            );
            for (final int PRICE : PRICES)
                for (int index = MAXIMUM_TRANSACTIONS; index > 0; index--) {
                    BUY[index] = Math.max(
                            BUY[index],
                            SELL[index - 1] - PRICE
                    );
                    SELL[index] = Math.max(
                            SELL[index],
                            BUY[index] + PRICE
                    );
                }
            return SELL[MAXIMUM_TRANSACTIONS];
        }
    }
}