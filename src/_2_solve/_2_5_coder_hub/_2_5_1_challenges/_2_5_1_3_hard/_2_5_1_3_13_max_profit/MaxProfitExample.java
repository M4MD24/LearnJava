package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_13_max_profit;

public class MaxProfitExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[]{1, 4, 2, 5}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    private static int maxProfit(final int[] PRICES) {
        if (PRICES == null || PRICES.length == 0)
            return 0;
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