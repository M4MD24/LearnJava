package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_4_f_break_number;

import java.util.Scanner;

/**
 * <h1>F. Break Number</h1>
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
 * <h2>Let's define f(x) as the number of times at which the integer x can be divided by 2 You are given N numbers, and you should print the maximum f(x) among all these numbers.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 18 24 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 14 7 9 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 */

public class BreakNumberExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static long length = INPUT.nextLong();

    public static void main(final String[] ARGS) {
        inputValues();
    }

    private static void inputValues() {
        if (length > 1) {
            long maximumNumber = getCountDivisions(INPUT.nextLong());
            while (length-- > 1) {
                final long CURRENT_MAXIMUM = getCountDivisions(INPUT.nextLong());
                if (CURRENT_MAXIMUM > maximumNumber) maximumNumber = CURRENT_MAXIMUM;
            }
            System.out.print(maximumNumber);
        } else if (length == 1) System.out.print(getCountDivisions(INPUT.nextLong()));
    }

    private static long getCountDivisions(long number) {
        long count = 0;
        while (number % 2 == 0) {
            number /= 2;
            count++;
        }
        return count;
    }
}