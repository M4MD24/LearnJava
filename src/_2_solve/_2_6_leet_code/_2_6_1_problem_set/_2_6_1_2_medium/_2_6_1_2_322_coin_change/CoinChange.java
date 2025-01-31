package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_322_coin_change;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an integer array coins representing coins of different denominations and an integer amount representing a total amount of money.
 * <br/>
 * <br/>
 * Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.
 * <br/>
 * <br/>
 * You may assume that you have an infinite number of each kind of coin.
 * </h2>
 */

public class CoinChange {
    public static void main(final String[] ARGUMENTS) {
        final int[] COINS = {1, 2, 5};
        final int AMOUNT = 11;
        System.out.print(coinChange(COINS, AMOUNT));
    }

    private static int coinChange(final int[] COINS, final int AMOUNT) {
        final int[] MINIMUM_COINS = new int[AMOUNT + 1];
        Arrays.fill(MINIMUM_COINS, AMOUNT + 1);
        MINIMUM_COINS[0] = 0;
        for (int CURRENT_AMOUNT = 1; CURRENT_AMOUNT <= AMOUNT; CURRENT_AMOUNT++)
            for (final int COIN : COINS)
                if (CURRENT_AMOUNT >= COIN)
                    MINIMUM_COINS[CURRENT_AMOUNT] = Math.min(
                            MINIMUM_COINS[CURRENT_AMOUNT],
                            MINIMUM_COINS[CURRENT_AMOUNT - COIN] + 1
                    );
        return MINIMUM_COINS[AMOUNT] > AMOUNT
                ? -1
                : MINIMUM_COINS[AMOUNT];
    }
}