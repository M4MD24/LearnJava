package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_2_g_construct_the_sum;

import java.util.Scanner;

/**
 * <h1>G. Construct the Sum</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>You are given two integers n and s, and you have to find distinct positive integers, such that each of them is ≤ n, and their summation =s. Otherwise, state that this is impossible.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 5 3
 * <br/>
 * 7 10
 * <br/>
 * 6 4
 * <br/>
 * 2 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 1
 * <br/>
 * 4 3 2 1
 * <br/>
 * 3 1
 * <br/>
 * -1
 * </h2>
 */

public class ConstructTheSumExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static long length = INPUT.nextLong();

    public static void main(String[] args) {
        inputValues();
    }

    private static void inputValues() {
        while (length-- > 0) {
            final long FIRST_NUMBER = INPUT.nextLong(),
                    SECOND_NUMBER = INPUT.nextLong();
            findDistinctPositiveIntegersLessThanFirstNumberAndTheirSummationEqualSecondNumber(FIRST_NUMBER, SECOND_NUMBER);
        }
    }

    private static void findDistinctPositiveIntegersLessThanFirstNumberAndTheirSummationEqualSecondNumber(final long FIRST_NUMBER, long SECOND_NUMBER) {
        StringBuilder numbers = new StringBuilder();
        for (int index = 1, currentSum = 0; index <= FIRST_NUMBER && currentSum < SECOND_NUMBER; index++) {
            currentSum += index;
            numbers.append(index);
            if (index <= FIRST_NUMBER - 1) numbers.append(" ");
        }
        System.out.print(numbers.reverse().substring(1));
    }
}