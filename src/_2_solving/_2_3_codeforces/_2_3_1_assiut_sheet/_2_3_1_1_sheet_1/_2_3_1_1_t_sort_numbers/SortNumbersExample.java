package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_t_sort_numbers;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>S. Sort Numbers</h1>
 * <h2>
 * time limit per test: 0.25 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given three numbers A,B,C. Print these numbers in ascending order followed by a blank line and then the values in the sequence as they were read.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 -2 1</h2>
 * <h1>Output:</h1>
 * <h2>
 * -2
 * <br/>
 * 1
 * <br/>
 * 3
 * <br/>
 * 3
 * <br/>
 * -2
 * <br/>
 * 1
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>-2 10 0</h2>
 * <h1>Output:</h1>
 * <h2>
 * -2
 * <br/>
 * 0
 * <br/>
 * 10
 * <br/>
 * -2
 * <br/>
 * 10
 * <br/>
 * 0
 * </h2>
 */

public class SortNumbersExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = Integer.parseInt(INPUT.next()),
                SECOND_NUMBER = Integer.parseInt(INPUT.next()),
                THIRD_NUMBER = Integer.parseInt(INPUT.next());
        print3NumbersAfterSort(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
        System.out.println();
        print3NumberBeforeSort(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
    }

    private static void print3NumbersAfterSort(int FIRST_NUMBER, int SECOND_NUMBER, int THIRD_NUMBER) {
        int[] array = {FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER};
        Arrays.sort(array);
        for (int element : array) System.out.println(element);
    }

    private static void print3NumberBeforeSort(int FIRST_NUMBER, int SECOND_NUMBER, int THIRD_NUMBER) {
        int[] array = {FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER};
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index]);
            if (index != array.length - 1) System.out.println();
        }
    }
}