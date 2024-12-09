package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_6_coins_combinations;

public class CoinsCombinationsExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getCountOfCoinsCombinations(4, new int[]{1, 2}));
        System.out.println(getCountOfCoinsCombinations(10, new int[]{5, 2, 3}));
        System.out.println(getCountOfCoinsCombinations(0, new int[]{3, 5, 7}));
        System.out.print(getCountOfCoinsCombinations(11, new int[]{5, 7}));
    }

    private static int getCountOfCoinsCombinations(final int AMOUNT, final int[] COINS) {
        final int[] NUMBERS_OF_COINS_COMBINATIONS = new int[AMOUNT + 1];
        NUMBERS_OF_COINS_COMBINATIONS[0] = 1;
        for (final int COIN : COINS)
            for (int index = COIN; index <= AMOUNT; index++)
                NUMBERS_OF_COINS_COMBINATIONS[index] += NUMBERS_OF_COINS_COMBINATIONS[index - COIN];
        return NUMBERS_OF_COINS_COMBINATIONS[AMOUNT];
    }
}