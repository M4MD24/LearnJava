package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_c_next_alphabet;

import java.util.Scanner;

/**
 * <h1>C. Next Alphabet</h1>
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
 * <h2>Given a lowercase alphabet character. You have to print the next character in the alphabet.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The next letter to z is a.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>a</h2>
 * <h1>Output:</h1>
 * <h2>b</h2>
 */

public class NextAlphabetExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final char ALPHABET = INPUT.next().charAt(0);
        System.out.print(getNextAlphabet(ALPHABET));
    }

    private static char getNextAlphabet(final char ALPHABET) {
        return (ALPHABET != 122) ? (char) (ALPHABET + 1) : (char) 97;
    }
}