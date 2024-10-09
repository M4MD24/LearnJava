package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_121_best_time_to_buy_and_sell_stock;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * <br/>
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * <br/>
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 * </h2>
 */

public class BestTimeToBuyAndSellStock {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {7, 1, 5, 3, 6, 4};
        System.out.print(bestTimeToBuyAndSellStock(NUMBERS));
    }

    private static int bestTimeToBuyAndSellStock(final int[] PRICES) {
        int minimumPrice = Integer.MAX_VALUE,
                maximumPrice = 0;
        for (final int PRICE : PRICES)
            maximumPrice = Math.max(
                    maximumPrice,
                    PRICE - (minimumPrice = Math.min(
                            minimumPrice,
                            PRICE
                    ))
            );
        return maximumPrice;
    }
}