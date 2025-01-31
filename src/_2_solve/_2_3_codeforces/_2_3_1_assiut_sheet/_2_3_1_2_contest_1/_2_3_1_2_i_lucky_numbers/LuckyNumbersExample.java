package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_i_lucky_numbers;

import java.util.Scanner;

/**
 * <h1>I. Lucky Numbers</h1>
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
 * A number of two digits is lucky if one of its digits is divisible by the other.
 * <br/>
 * For example, 39, 82, and 55 are lucky, while 79 and 43 are not.
 * <br/>
 * Given a number between 10 and 99, determine whether it is lucky or not.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>39</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>64</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */
public class LuckyNumbersExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        final byte NUMBER = INPUT.nextByte();
        System.out.print(isLucky(NUMBER));
    }

    private static String isLucky(final byte NUMBER) {
        final byte NUMBER_1 = (byte) (NUMBER % 10),
                NUMBER_2 = (byte) (NUMBER / 10);
        if (NUMBER_1 % NUMBER_2 == 0 || NUMBER_2 % NUMBER_1 == 0) return "YES";
        else return "NO";
    }
}