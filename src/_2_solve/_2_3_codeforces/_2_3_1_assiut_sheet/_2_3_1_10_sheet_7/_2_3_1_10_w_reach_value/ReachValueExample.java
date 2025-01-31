package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_w_reach_value;

import java.util.Scanner;

/**
 * <h1>W. Reach Value</h1>
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
 * <h2>Given a number N. Initially you have a value equal 1 and you can perform one of the following operation any number of times:</h2>
 * <ol>
 *     <li>Multiply your current value by 10.</li>
 *     <li>Multiply your current value by 20.</li>
 * </ol>
 * <h2>Determine if your value can reach N or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1
 * <br/>
 * 2
 * <br/>
 * 10
 * <br/>
 * 25
 * <br/>
 * 200
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * YES
 * <br/>
 * NO
 * <br/>
 * YES
 * <br/>
 * NO
 * <br/>
 * YES
 * </h2>
 */

public class ReachValueExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte LENGTH = INPUT.nextByte();
    private static long value;

    public static void main(final String[] ARGUMENTS) {
        inputValues((byte) 0);
    }

    private static void inputValues(byte index) {
        if (index++ < LENGTH) {
            value = INPUT.nextLong();
            System.out.println(canNumber1ReachToTargetNumber(1) ? "YES" : "NO");
            inputValues(index);
        }
    }

    private static boolean canNumber1ReachToTargetNumber(final long NUMBER) {
        if (NUMBER == value) return true;
        else if (NUMBER > value) return false;
        else return canNumber1ReachToTargetNumber(NUMBER * 10) ||
                    canNumber1ReachToTargetNumber(NUMBER * 20);
    }
}