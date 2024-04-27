package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_i_divisibility;

import java.util.Scanner;

/**
 * <h1>I. Divisibility</h1>
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
 * <h1>Question:</h1>
 * <h2>Given three numbers A, B and X. Print the summation of numbers between A and B inclusive that are divisible by X.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 20 5</h2>
 * <h1>Output:</h1>
 * <h2>50</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 12 3</h2>
 * <h1>Output:</h1>
 * <h2>30</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In the first example: The numbers [5, 10, 15, 20] are dividable by 5 then the result: 5 + 10 + 15 + 20 = 50.</h2>
 */

public class DivisibilityExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static long number1 = INPUT.nextLong(),
            number2 = INPUT.nextLong();

    public static void main(final String[] ARGS) {
        if (number1 > number2) swap();
        System.out.print(summationOfAllNumbersFromMinimumNumberToMaximumNumberInclusiveAreDivisibleByTargetNumber(number1, number2, INPUT.nextLong()));
    }

    private static long summationOfAllNumbersFromMinimumNumberToMaximumNumberInclusiveAreDivisibleByTargetNumber(final long MINIMUM_NUMBER, final long MAXIMUM_NUMBER, final long TARGET_NUMBER) {
        return (summationFromOneToTargetNumberInclusive(MAXIMUM_NUMBER / TARGET_NUMBER) * TARGET_NUMBER) - (summationFromOneToTargetNumberInclusive((MINIMUM_NUMBER - 1) / TARGET_NUMBER) * TARGET_NUMBER);
    }

    private static long summationFromOneToTargetNumberInclusive(final long TARGET_NUMBER) {
        return TARGET_NUMBER * (TARGET_NUMBER + 1) / 2;
    }

    private static void swap() {
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
    }
}