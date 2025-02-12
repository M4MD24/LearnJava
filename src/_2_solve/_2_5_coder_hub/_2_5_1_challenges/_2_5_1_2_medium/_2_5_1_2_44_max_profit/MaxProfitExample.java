package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_44_max_profit;

public class MaxProfitExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
        System.out.println(maxProfit(new int[]{1, 4, 2, 5}));
        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    private static int maxProfit(final int[] PRICES) {
        int firstBuy = PRICES[0];
        int firstProfit = 0;
        int secondBuy = PRICES[0];
        int maxTotalProfit = 0;
        for (int index = 1; index < PRICES.length; index++) {
            final int PRICE = PRICES[index];
            firstBuy = Math.min(firstBuy, PRICE);
            firstProfit = Math.max(firstProfit, PRICE - firstBuy);
            secondBuy = Math.min(secondBuy, PRICE - firstProfit);
            maxTotalProfit = Math.max(maxTotalProfit, PRICE - secondBuy);
        }
        return maxTotalProfit;
    }
}