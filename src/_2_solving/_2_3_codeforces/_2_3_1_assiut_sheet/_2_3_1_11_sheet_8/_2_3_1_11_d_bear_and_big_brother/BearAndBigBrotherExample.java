package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_d_bear_and_big_brother;

import java.util.Scanner;

/**
 * <h1>D. Bear and Big Brother</h1>
 * <h2>
 * time limit per test: 1 second
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
 * Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.
 * <br/>
 * Right now, Limak and Bob weigh a and b respectively. It's guaranteed that Limak's weight is smaller than or equal to his brother's weight.
 * <br/>
 * Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.
 * <br/>
 * After how many full years will Limak become strictly larger (strictly heavier) than Bob?
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 7</h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 9</h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1 1</h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample, Limak weighs 4 and Bob weighs 7 initially. After one year their weights are 4·3=12 and 7·2=14 respectively (one weight is tripled while the other one is doubled). Limak isn't larger than Bob yet. After the second year weights are 36 and 28, so the first weight is greater than the second one. Limak became larger than Bob after two years so you should print 2.
 * <br/>
 * In the second sample, Limak's and Bob's weights in next years are: 12 and 18, then 36 and 36, and finally 108 and 72 (after three years). The answer is 3. Remember that Limak wants to be larger than Bob and he won't be satisfied with equal weights.
 * <br/>
 * In the third sample, Limak becomes larger than Bob after the first year. Their weights will be 3 and 2 then.
 * </h2>
 */

public class BearAndBigBrotherExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short limakWeight = INPUT.nextByte(),
            bobWeight = INPUT.nextByte();

    public static void main(final String[] PARAMETERS) {
        System.out.print(gettingYearsInWhichLimakIsHeavierThanBob());
    }

    private static short gettingYearsInWhichLimakIsHeavierThanBob() {
        byte counter = 0;
        while (limakWeight <= bobWeight) {
            limakWeight *= 3;
            bobWeight *= 2;
            counter++;
        }
        return counter;
    }
}