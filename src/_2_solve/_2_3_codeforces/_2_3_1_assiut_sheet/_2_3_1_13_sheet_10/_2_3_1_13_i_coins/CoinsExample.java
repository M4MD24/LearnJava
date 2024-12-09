package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_i_coins;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>I. Coins</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>One day Vasya came across three Berland coins. They didn't have any numbers that's why Vasya didn't understand how their denominations differ. He supposed that if one coin is heavier than the other one, then it should be worth more. Vasya weighed all the three pairs of coins on pan balance scales and told you the results. Find out how the deminations of the coins differ or if Vasya has a mistake in the weighting results. No two coins are equal.</h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_i_coins.images <h2>Examples</h2>
 */

public class CoinsExample {
    private static final Map<Byte, Character> COINS = new HashMap<>();
    private static boolean areCoinsSame = false;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputCoins();
        printCoinsAfterSort();
    }

    private static void printCoinsAfterSort() throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        if (areCoinsSame) OUTPUT.write("Impossible");
        else for (final char COIN : COINS.values()) OUTPUT.write(COIN);
        OUTPUT.flush();
    }

    private static void inputCoins() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        byte coinA = 0, coinB = 0, coinC = 0;
        for (int index = 0; index < 3; index++) {
            final StringBuffer LINE = new StringBuffer(INPUT.readLine());
            if (LINE.charAt(1) == '>') {
                switch (LINE.charAt(0)) {
                    case 'A' -> coinA++;
                    case 'B' -> coinB++;
                    case 'C' -> coinC++;
                }
            } else {
                switch (LINE.charAt(2)) {
                    case 'A' -> coinA++;
                    case 'B' -> coinB++;
                    case 'C' -> coinC++;
                }
            }
        }
        if (coinA == coinB && coinB == coinC) areCoinsSame = true;
        else {
            COINS.put(coinA, 'A');
            COINS.put(coinB, 'B');
            COINS.put(coinC, 'C');
        }
    }
}