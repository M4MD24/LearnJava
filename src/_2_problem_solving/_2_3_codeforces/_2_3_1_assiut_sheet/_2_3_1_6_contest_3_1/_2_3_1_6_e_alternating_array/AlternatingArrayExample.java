package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_6_contest_3_1._2_3_1_6_e_alternating_array;

import java.util.Scanner;

/**
 * <h1>E. Alternating Array</h1>
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
 * An array of integers is said to be alternating if each element has a different sign than the one next to it.
 * <br/>
 * i.e. for each element in the array such that (0 ≤ i < n), only one of these conditions must be met:
 * </h2>
 * <ul>
 *     <li>if ai<0 then ai+1>0</li>
 *     <li>if ai>0 then ai+1<0</li>
 * </ul>
 * <h2>
 * For example, [1, -3, 2] and [3] are alternating arrays, while [1,-3, -2] and [1, 2] are not.
 * <br/>
 * You are given an array a of n integers, in one operation, you are allowed to choose a number and multiply it by -1 (change its sign). what is the minimum number of operations required to convert the given array into an alternating array.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 3 4 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 -2 3 -4 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 */

public class AlternatingArrayExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();

    private static final int[] NUMBERS_1 = new int[LENGTH],
            NUMBERS_2 = new int[LENGTH];

    public static void main(String[] args) {
        inputValues();
        minimumNumberOfOperationsRequiredToConvertArrayIntoAnAlternatingArray();
    }

    private static void minimumNumberOfOperationsRequiredToConvertArrayIntoAnAlternatingArray() {
        int temporary1 = 0,
                counter1 = 0,
                temporary2 = 0,
                counter2 = 1;
        NUMBERS_2[0] *= -1;

        for (int index = 0; index < LENGTH; index++) {
            if (index != 0) {
                if ((temporary1 > 0 && NUMBERS_1[index] > 0) || (temporary1 < 0 && NUMBERS_1[index] < 0)) {
                    NUMBERS_1[index] *= -1;
                    counter1++;
                }
                if ((temporary2 > 0 && NUMBERS_2[index] > 0) || (temporary2 < 0 && NUMBERS_2[index] < 0)) {
                    NUMBERS_2[index] *= -1;
                    counter2++;
                }
            }
            temporary1 = NUMBERS_1[index];
            temporary2 = NUMBERS_2[index];
        }

        System.out.print(Math.min(counter1, counter2));
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) {
            int value = INPUT.nextInt();
            NUMBERS_1[index] = value;
            NUMBERS_2[index] = value;
        }
    }
}