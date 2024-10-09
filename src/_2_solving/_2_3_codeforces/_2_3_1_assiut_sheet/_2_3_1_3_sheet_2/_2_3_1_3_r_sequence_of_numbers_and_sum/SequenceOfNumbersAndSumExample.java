package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_r_sequence_of_numbers_and_sum;

import java.util.Scanner;

/**
 * <h1>R. Sequence of Numbers and Sum</h1>
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
 * Given multiple lines each line contains two numbers N and M.
 * <br/>
 * For each line print a single line contains:</h2>
 * <br/>
 * <ul>
 *     <li>The numbers between N and M inclusive separated by single space.</li>
 *     <li>The message " sum =".</li>
 *     <li>The summation of all numbers between N and M inclusive.</li>
 * </ul>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * The program should be TERMINATED as soon as any of these two numbers is less than or equal to zero and don't print any thing, And M may be greater than N and Vice Versa.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 2
 * <br/>
 * 5 7
 * <br/>
 * 5 -1
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 3 4 5 sum =14
 * <br/>
 * 5 6 7 sum =18
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 2
 * <br/>
 * 6 3
 * <br/>
 * 5 0
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 3 4 5 sum =14
 * <br/>
 * 3 4 5 6 sum =18
 * </h2>
 */
public class SequenceOfNumbersAndSumExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        inputValues();
    }

    private static void inputValues() {
        while (INPUT.hasNext()) {
            final int NUMBER_1 = INPUT.nextInt(),
                    NUMBER_2 = INPUT.nextInt();
            if (NUMBER_1 < 1 || NUMBER_2 < 1) return;
            else calculateAndPrintSumBetweenTwoNumbers(NUMBER_1, NUMBER_2);
        }
    }

    private static void calculateAndPrintSumBetweenTwoNumbers(final int NUMBER_1, final int NUMBER_2) {
        int sum = 0;
        final int MAXIMUM_NUMBER = Math.max(NUMBER_1, NUMBER_2);
        for (int number = Math.min(NUMBER_1, NUMBER_2); number <= MAXIMUM_NUMBER; number++) {
            System.out.print(number + " ");
            if (number == MAXIMUM_NUMBER) System.out.print("sum =");
            sum += number;
        }
        System.out.println(sum);
    }
}