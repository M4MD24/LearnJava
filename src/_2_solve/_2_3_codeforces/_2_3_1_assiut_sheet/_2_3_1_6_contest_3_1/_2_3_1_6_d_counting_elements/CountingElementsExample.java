package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_6_contest_3_1._2_3_1_6_d_counting_elements;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>D. Counting Elements</h1>
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
 * You are given an array a of n integers, count the number of element ai in the array such that ai+1 is also exists in the array a.
 * <br/>
 * If there are duplicates in a, count them separately.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 4 4 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 2 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 8
 * <br/>
 * 1 1 3 3 5 5 7 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6
 * <br/>
 * 1 3 2 3 5 0
 * </h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 */

public class CountingElementsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final short[] NUMBERS = new short[LENGTH];

    public static void main(final String[] PARAMETERS) {
        inputValues();
        countingValues();
    }

    private static void countingValues() {
        Arrays.sort(NUMBERS);
        short counter = 0,
                sum = 0,
                temporary = 0;
        for (short index = 0; index < LENGTH; index++) {
            final short CURRENT_VALUE = NUMBERS[index];
            if (index != 0) {
                if (temporary == CURRENT_VALUE) sum++;
                else {
                    if (temporary + 1 == CURRENT_VALUE) counter += sum;
                    temporary = CURRENT_VALUE;
                    sum = 1;
                }
            } else {
                temporary = CURRENT_VALUE;
                sum = 1;
            }
        }
        System.out.print(counter);
    }

    private static void inputValues() {
        for (short index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextShort();
    }
}