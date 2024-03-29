package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_j_lucky_division;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>J. Lucky Division</h1>
 * <h2>
 * time limit per test: 2 second
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
 * Petya loves lucky numbers. Everybody knows that lucky numbers are positive integers whose decimal representation contains only the lucky digits 4 and 7. For example, numbers 47, 744, 4 are lucky and 5, 17, 467 are not.
 * <br/>
 * Petya calls a number almost lucky if it could be evenly divided by some lucky number. Help him find out if the given number n is almost lucky.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>47</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>16</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>78</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * Note that all lucky numbers are almost lucky as any number is evenly divisible by itself.
 * <br/>
 * In the first sample 47 is a lucky number. In the second sample 16 is divisible by 4.
 * </h2>
 */

public class LuckyDivisionExample {
    public static void main(String[] args) throws IOException {
        final short NUMBER = Short.parseShort(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print(divisibleByLuckyNumbers(NUMBER) ? "YES" : "NO");
    }

    private static boolean divisibleByLuckyNumbers(final short NUMBER) {
        return (NUMBER % 4 == 0 ||
                NUMBER % 7 == 0 ||
                NUMBER % 44 == 0 ||
                NUMBER % 47 == 0 ||
                NUMBER % 74 == 0 ||
                NUMBER % 77 == 0 ||
                NUMBER % 444 == 0 ||
                NUMBER % 447 == 0 ||
                NUMBER % 474 == 0 ||
                NUMBER % 744 == 0 ||
                NUMBER % 477 == 0 ||
                NUMBER % 747 == 0 ||
                NUMBER % 774 == 0 ||
                NUMBER % 777 == 0);
    }
}