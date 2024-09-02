package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_4_a_timon_and_pumbaa;

import java.util.Scanner;

/**
 * <h1>A. Timon and Pumbaa</h1>
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
 * <h1>Question:</h1>
 * <h2>
 * Timon has a candies and his friend, Pumbaa, has b candies, so Pumbaa asked Timon to tell him the value of a−b.
 * <br/>
 * However, Timon will tell him the value of a−b if the value is ≥0; otherwise, he will lie and say 0.
 * <br/>
 * Since it was a hard task for Timon, he's asking for your help.
 * <br/>
 * Given two numbers a and b, find the answer.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>9 1</h2>
 * <h1>Output:</h1>
 * <h2>8</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1 9</h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 */

public class TimonAndPumbaaExample {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        final long TIMON_CANDIES = INPUT.nextLong(),
                PUMBAA_CANDIES = INPUT.nextLong();
        pumbaaAskedTimonToTellHimHowMuchCandies(TIMON_CANDIES, PUMBAA_CANDIES);
    }

    private static void pumbaaAskedTimonToTellHimHowMuchCandies(long TIMON_CANDIES, long PUMBAA_CANDIES) {
        boolean timonConditionToTellPumbaaHowMuchCandies = TIMON_CANDIES > PUMBAA_CANDIES;
        if (timonConditionToTellPumbaaHowMuchCandies) tellHim(TIMON_CANDIES, PUMBAA_CANDIES);
        else doNotTellHim();
    }

    private static void doNotTellHim() {
        System.out.print(0);
    }

    private static void tellHim(long TIMON_CANDIES, long PUMBAA_CANDIES) {
        System.out.print(TIMON_CANDIES - PUMBAA_CANDIES);
    }
}