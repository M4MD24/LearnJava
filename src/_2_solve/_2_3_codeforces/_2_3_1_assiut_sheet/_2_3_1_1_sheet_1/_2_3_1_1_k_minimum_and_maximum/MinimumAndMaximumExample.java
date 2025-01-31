package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_k_minimum_and_maximum;

import java.util.Scanner;

/**
 * <h1>K. Minimum and Maximum</h1>
 * <h2>
 * time limit per test: 0.25 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given 3 numbers A, B and C, Print the minimum and the maximum numbers.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1 2 3</h2>
 * <h1>Output:</h1>
 * <h2>1 3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>-1 -2 -3</h2>
 * <h1>Output:</h1>
 * <h2>-3 -1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 20 -5</h2>
 * <h1>Output:</h1>
 * <h2>-5 20</h2>
 */

public class MinimumAndMaximumExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final long NUMBER_1 = Long.parseLong(INPUT.next()),
            NUMBER_2 = Long.parseLong(INPUT.next()),
            NUMBER_3 = Long.parseLong(INPUT.next());

    public static void main(final String[] ARGUMENTS) {
        System.out.printf("%d %d", getMinimumNumber(), getMaximumNumber());
    }

    private static long getMinimumNumber() {
        if (NUMBER_1 <= NUMBER_2 && NUMBER_1 <= NUMBER_3) return NUMBER_1;
        else if (NUMBER_2 <= NUMBER_1 && NUMBER_2 <= NUMBER_3) return NUMBER_2;
        else return NUMBER_3;
    }

    private static long getMaximumNumber() {
        if (NUMBER_1 >= NUMBER_2 && NUMBER_1 >= NUMBER_3) return NUMBER_1;
        else if (NUMBER_2 >= NUMBER_1 && NUMBER_2 >= NUMBER_3) return NUMBER_2;
        else return NUMBER_3;
    }
}