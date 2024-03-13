package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_m_lucky_number;

import java.util.Scanner;

/**
 * <h1>M. Lucky Numbers</h1>
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
 * <h2>Given two numbers A and B. Print all lucky numbers between A and B inclusive.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * The Lucky number is any positive number that its decimal representation contains only 4 and 7.
 * <br/>
 * For example: numbers 4, 7, 47 and 744 are lucky and numbers 5, 17 and 174 are not.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 20</h2>
 * <h1>Output:</h1>
 * <h2>4 7</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>8 15</h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 */

public class LuckyNumberExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final int NUMBER_1 = INPUT.nextInt(),
                NUMBER_2 = INPUT.nextInt();
        findAndPrintLuckyNumbers(NUMBER_1, NUMBER_2);
    }

    private static void findAndPrintLuckyNumbers(int NUMBER_1, int NUMBER_2) {
        boolean foundLuckyNumber = false;

        for (int index = NUMBER_1; index <= NUMBER_2; index++)
            if (isLuckyNumber(index)) {
                System.out.print(index);
                if (!foundLuckyNumber) System.out.print(" ");
                foundLuckyNumber = true;
            }

        if (!foundLuckyNumber) System.out.print("-1");
    }

    private static boolean isLuckyNumber(final int NUMBER) {
        final String NUMBER_STRING = String.valueOf(NUMBER);
        return NUMBER_STRING.matches("[47]+");
    }
}