package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_b_memo_and_momo;

import java.util.Scanner;

/**
 * <h1>B. Momo and Memo</h1>
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
 * Memo and Momo are playing a game. Memo will choose a positive number a, and Momo will choose a positive number b
 * <br/>
 * Your task is to tell them who will win according to the following rules:
 * <br/>
 * <ul>
 *     <li>If both a and b are divisible by k, both of them win and you should print "Both".</li>
 *     <li>If a is divisible by k but b isn't, Memo wins and you should print "Memo".</li>
 *     <li>If b is divisible by k but a isn't, Momo wins and you should print "Momo".</li>
 *     <li>If both a and b are not divisible by k , no one wins and you should print "No One".</li>
 * </ul>
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>15 7 3</h2>
 * <h1>Output:</h1>
 * <h2>Memo</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>22 10 2</h2>
 * <h1>Output:</h1>
 * <h2>Both</h2>
 */

public class MomoAndMemoExample {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        final long INPUT_MEMO = INPUT.nextLong(),
                INPUT_MOMO = INPUT.nextLong(),
                DIVISOR_NUMBER = INPUT.nextLong();
        System.out.print(checkWhoWin(INPUT_MEMO, INPUT_MOMO, DIVISOR_NUMBER));
    }

    private static String checkWhoWin(final long INPUT_MEMO, final long INPUT_MOMO, final long DIVISOR_NUMBER) {
        final boolean MEMO_WIN = INPUT_MEMO % DIVISOR_NUMBER == 0,
                MOMO_WIN = INPUT_MOMO % DIVISOR_NUMBER == 0,
                BOTH_WIN = MEMO_WIN && MOMO_WIN;

        if (BOTH_WIN) return "Both";
        else if (MEMO_WIN) return "Memo";
        else if (MOMO_WIN) return "Momo";
        else return "No One";
    }
}