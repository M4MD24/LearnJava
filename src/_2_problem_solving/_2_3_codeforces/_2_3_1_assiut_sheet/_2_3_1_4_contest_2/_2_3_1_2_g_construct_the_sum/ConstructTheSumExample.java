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
    public static void main(String[] args) {
        inputValues();
    }

    private static void inputValues() {
        final Scanner INPUT = new Scanner(System.in);
        byte length = INPUT.nextByte();
        while (length-- > 0) {
            final long FIRST_NUMBER = INPUT.nextLong(),
                    SECOND_NUMBER = INPUT.nextLong();
            calculateAndPrintNumbers(FIRST_NUMBER, SECOND_NUMBER);
            if (length > 0) System.out.println();
        }
    }

    private static void calculateAndPrintNumbers(long firstNumber, long secondNumber) {
        if ((firstNumber * (firstNumber + 1) / 2) < secondNumber) System.out.print(-1);
        else {
            StringBuilder numbers = new StringBuilder();
            for (long index = 1, sum = 0; index <= firstNumber; index++) {
                if (sum + index <= secondNumber) {
                    sum += index;
                    numbers.append(index);
                } else {
                    sum = sum - (index - 1);
                    sum += index;
                    numbers = new StringBuilder(numbers.substring(0, numbers.lastIndexOf(" ")));
                    numbers.replace(numbers.lastIndexOf(" ") + 1, numbers.length(), String.valueOf(index));
                }
                if (sum == secondNumber) break;
                else numbers.append(" ");
            }
            System.out.print(numbers.reverse());
        }
    }
}