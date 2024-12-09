package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_d_ali_baba_and_puzzles;

import java.util.Scanner;

/**
 * <h1>D. Ali Baba and Puzzles</h1>
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
 * <h2>One day, Ali Baba had an easy puzzle that he couldn't solve. The puzzle consisted of 4 numbers and his task was to check whether he could get the fourth number using arithmetic operators (+,−,×) between the other three numbers; so that each operator is used only once.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 4 5 23</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>9 5 3 7</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1 2 3 1</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class AliBabaAndPuzzlesExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final long NUMBER_1 = INPUT.nextLong(),
                NUMBER_2 = INPUT.nextLong(),
                NUMBER_3 = INPUT.nextLong(),
                NUMBER_4 = INPUT.nextLong();
        System.out.print(checkTheResult(NUMBER_1, NUMBER_2, NUMBER_3, NUMBER_4));
    }

    private static String checkTheResult(final long NUMBER_1, final long NUMBER_2, final long NUMBER_3, final long NUMBER_4) {
        final long RESULT_1 = NUMBER_1 + NUMBER_2 - NUMBER_3,
                RESULT_2 = NUMBER_1 + NUMBER_2 * NUMBER_3,
                RESULT_3 = NUMBER_1 - NUMBER_2 + NUMBER_3,
                RESULT_4 = NUMBER_1 - NUMBER_2 * NUMBER_3,
                RESULT_5 = NUMBER_1 * NUMBER_2 + NUMBER_3,
                RESULT_6 = NUMBER_1 * NUMBER_2 - NUMBER_3;
        final boolean POSSIBILITY_1 = NUMBER_4 == RESULT_1,
                POSSIBILITY_2 = NUMBER_4 == RESULT_2,
                POSSIBILITY_3 = NUMBER_4 == RESULT_3,
                POSSIBILITY_4 = NUMBER_4 == RESULT_4,
                POSSIBILITY_5 = NUMBER_4 == RESULT_5,
                POSSIBILITY_6 = NUMBER_4 == RESULT_6;

        if (POSSIBILITY_1 ||
                POSSIBILITY_2 ||
                POSSIBILITY_3 ||
                POSSIBILITY_4 ||
                POSSIBILITY_5 ||
                POSSIBILITY_6) return "YES";
        else return "NO";
    }
}