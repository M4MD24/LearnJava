package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_g_twins;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>G. Twins</h1>
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
 * <h2>
 * Imagine that you have a twin brother or sister. Having another person that looks exactly like you seems very unusual. It's hard to say if having something of an alter ego is good or bad. And if you do have a twin, then you very well know what it's like.
 * <br/>
 * Now let's imagine a typical morning in your family. You haven't woken up yet, and Mom is already going to work. She has been so hasty that she has nearly forgotten to leave the two of her darling children some money to buy lunches in the school cafeteria. She fished in the purse and found some number of coins, or to be exact, n coins of arbitrary values a1,a2,...,an. But as Mom was running out of time, she didn't split the coins for you two. So she scribbled a note asking you to split the money equally.
 * <br/>
 * As you woke up, you found Mom's coins and read her note. "But why split the money equally?" — you thought. After all, your twin is sleeping and he won't know anything. So you decided to act like that: pick for yourself some subset of coins so that the sum of values of your coins is strictly larger than the sum of values of the remaining coins that your twin will have. However, you correctly thought that if you take too many coins, the twin will suspect the deception. So, you've decided to stick to the following strategy to avoid suspicions: you take the minimum number of coins, whose sum of values is strictly more than the sum of values of the remaining coins. On this basis, determine what minimum number of coins you need to take to divide them in the described manner.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 3 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 2 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample you will have to take 2 coins (you and your twin have sums equal to 6,0 correspondingly). If you take 1 coin, you get sums 3,3. If you take 0 coins, you get sums 0,6. Those variants do not satisfy you as your sum should be strictly more that your twins' sum.
 * <br/>
 * In the second sample one coin isn't enough for us, too. You can pick coins with values 1,2 or 2,2. In any case, the minimum number of coins equals 2.
 * </h2>
 */

public class TwinsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static byte countOfSumOfCoins = INPUT.nextByte();
    private static final short[] SUM_OF_COINS = new short[countOfSumOfCoins];
    private static short totalCoinsSum = 0;

    public static void main(final String[] PARAMETERS) {
        inputSumOfCoins();
        Arrays.sort(SUM_OF_COINS);
        System.out.print(getMinimumSumCoinCount());
    }

    private static int getMinimumSumCoinCount() {
        short sumTwinsCoins = 0,
                minimumSumCoinCount = 0;
        while (countOfSumOfCoins-- > -1) {
            minimumSumCoinCount++;
            if ((sumTwinsCoins += SUM_OF_COINS[countOfSumOfCoins]) > totalCoinsSum - sumTwinsCoins)
                break;
        }
        return minimumSumCoinCount;
    }

    private static void inputSumOfCoins() {
        for (byte index = 0; index < countOfSumOfCoins; index++)
            totalCoinsSum += SUM_OF_COINS[index] = INPUT.nextByte();
    }
}