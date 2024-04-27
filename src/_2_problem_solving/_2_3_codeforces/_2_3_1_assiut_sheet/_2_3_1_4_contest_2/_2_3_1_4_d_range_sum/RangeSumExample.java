package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_4_d_range_sum;

import java.util.Scanner;

/**
 * <h1>D. Range Sum</h1>
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
 * <h2>You are given a range represented by two integers L and R, and you should find the sum of the numbers in the range between L and R inclusive.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 3 6
 * <br/>
 * 2 11
 * <br/>
 * 4 16
 * <br/>
 * 7 17
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 18
 * <br/>
 * 65
 * <br/>
 * 130
 * <br/>
 * 132
 * </h2>
 */

public class RangeSumExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static long length = INPUT.nextInt();

    public static void main(final String[] ARGS) {
        inputValues();
    }

    private static void inputValues() {
        while (length > 0) {
            final long NUMBER_1 = INPUT.nextLong(),
                    NUMBER_2 = INPUT.nextLong();
            System.out.print(getRangeSum(NUMBER_1, NUMBER_2));
            if (length-- > 1) System.out.println();
        }
    }

    private static long getRangeSum(final long NUMBER_1, final long NUMBER_2) {
        final long START = Math.min(NUMBER_1, NUMBER_2) - 1,
                END = Math.max(NUMBER_1, NUMBER_2);
        long sumStart = START * (START + 1) / 2,
                sumEnd = END * (END + 1) / 2;
        return sumEnd - sumStart;
    }
}