package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_s_good_number;

import java.util.Scanner;

/**
 * <h1>S. Good Number</h1>
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
 * A number is called k-good if it contains the digits from 0 to k at least once.
 * <br/>
 * Given an array a1,a2,…,an. Count the number of k-good numbers in the array.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 10 6
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * <br/>
 * 1234560
 * </h2>
 * <h1>Output:</h1>
 * <h2>10</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2 1
 * <br/>
 * 1
 * <br/>
 * 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 */

public class GoodNumberExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static byte countOfTestCases = INPUT.nextByte(),
            sumOfGoodNumbers = 0;
    private static final byte TARGET_NUMBER = INPUT.nextByte();

    public static void main(final String[] ARGUMENTS) {
        inputValues();
        System.out.print(sumOfGoodNumbers);
    }

    private static void inputValues() {
        while (countOfTestCases-- > 0) {
            final StringBuffer NUMBER = new StringBuffer(INPUT.next());
            final byte LENGTH_OF_NUMBER = (byte) NUMBER.length();
            if (LENGTH_OF_NUMBER >= TARGET_NUMBER)
                if (isGoonNumber(NUMBER))
                    sumOfGoodNumbers++;
        }
    }

    private static boolean isGoonNumber(final StringBuffer NUMBER) {
        boolean isGoonNumber = true;
        for (byte targetNumberIndex = 0; targetNumberIndex <= TARGET_NUMBER; targetNumberIndex++) {
            if (!NUMBER.toString().contains(String.valueOf(targetNumberIndex))) {
                isGoonNumber = false;
                break;
            }
        }
        return isGoonNumber;
    }
}