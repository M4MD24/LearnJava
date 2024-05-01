package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_j_lucky_array;

import java.util.Scanner;

/**
 * <h1>J. Lucky Array</h1>
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
 * <h2>Given a number N and an array A of N numbers. Determine if the array is lucky or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The array is lucky if the frequency (number of occurrence) of the minimum element is odd.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 8 8 9 5 9
 * </h2>
 * <h1>Output:</h1>
 * <h2>Lucky</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 3 3 3 5 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>Unlucky</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>First Example: minimum element is 5 and its frequency is 1 and it's ODD so the array is lucky.</h2>
 * <h2>Second Example: minimum element is 3 and its frequency is 4 and it's EVEN so the array isn't lucky.</h2>
 */

public class LuckyArrayExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        final int[] NUMBERS = new int[INPUT.nextShort()];
        inputValues(NUMBERS);
        System.out.print(isLucky(NUMBERS));
    }

    private static void inputValues(final int[] NUMBERS) {
        for (int index = 0; index < NUMBERS.length; index++) NUMBERS[index] = INPUT.nextInt();
    }

    public static String isLucky(final int[] NUMBERS) {
        int minimumNumber = NUMBERS[0],
                counter = 1;
        for (int index = 1; index < NUMBERS.length; index++) {
            if (NUMBERS[index] == minimumNumber) counter++;
            else if (NUMBERS[index] < minimumNumber) {
                minimumNumber = NUMBERS[index];
                counter = 1;
            }
        }
        return (counter % 2 == 0) ? "Unlucky" : "Lucky";
    }
}