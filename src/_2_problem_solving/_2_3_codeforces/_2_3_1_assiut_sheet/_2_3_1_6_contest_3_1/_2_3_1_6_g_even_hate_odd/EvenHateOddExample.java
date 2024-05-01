package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_6_contest_3_1._2_3_1_6_g_even_hate_odd;

import java.util.Scanner;

/**
 * <h1>G. Even Hate Odd</h1>
 * <h2>
 * time limit per test: 5 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>You are given an array a of n integers. You have two kinds of operations</h2>
 * <ul>
 *     <li>increment any element in a (increase it by one).</li>
 *     <li>decrement any element in a (decrease it by one).</li>
 * </ul>
 * <h2>What is the minimum number of operations to make the number of even elements equal to the number of odd elements, or detect that this is impossible?</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 4
 * <br/>
 * 1 2 3 4
 * <br/>
 * 4
 * <br/>
 * 1 1 1 1
 * <br/>
 * 3
 * <br/>
 * 1 2 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 0
 * <br/>
 * 2
 * <br/>
 * -1
 * </h2>
 */

public class EvenHateOddExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int length;
    private static int[] numbers;

    public static void main(final String[] ARGS) {
        byte countOfTestCases = INPUT.nextByte();
        while (countOfTestCases > 0) {
            inputValues();
            if (length % 2 == 0) System.out.print(minimumNumberOfOperationsToMakeEvenElementsEqualOddElements());
            else System.out.print(-1);
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static int minimumNumberOfOperationsToMakeEvenElementsEqualOddElements() {
        int sumToEven = 0,
                sumToOdd = 0;
        for (int index = 0; index < length; index++) {
            final int CURRENT_ELEMENT = numbers[index];
            if (CURRENT_ELEMENT % 2 == 0) sumToOdd++;
            else sumToEven++;
        }
        if (sumToEven == sumToOdd) return 0;
        else return Math.abs(sumToEven - sumToOdd) / 2;
    }

    private static void inputValues() {
        length = INPUT.nextInt();
        numbers = new int[length];
        for (int index = 0; index < length; index++) numbers[index] = INPUT.nextInt();
    }
}