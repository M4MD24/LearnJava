package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_m_capital_or_small_or_digit;

import java.util.Scanner;

/**
 * <h1>M. Capital or Small or Digit</h1>
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
 * <h2>Given a letter X. Determine whether X is Digit or Alphabet and if it is Alphabet determine if it is Capital Case or Small Case.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>A</h2>
 * <h1>Output:</h1>
 * <h2>
 * ALPHA
 * <br/>
 * IS CAPITAL
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>9</h2>
 * <h1>Output:</h1>
 * <h2>IS DIGIT</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>a</h2>
 * <h1>Output:</h1>
 * <h2>
 * ALPHA
 * <br/>
 * IS SMALL
 * </h2>
 */

public class CapitalOrSmallOrDigitExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LETTER = INPUT.next().charAt(0);
    private static final String IS_DIGIT = "IS DIGIT",
            ALPHA_WORD = "ALPHA",
            IS_SMALL_WORD = "IS SMALL",
            IS_CAPITAL_WORD = "IS CAPITAL";
    private static final boolean CONDITION_DIGIT = LETTER > 47 && LETTER < 58,
            CONDITION_CAPITAL = LETTER > 64 && LETTER < 91,
            CONDITION_ALPHA = LETTER > 64 && LETTER < 123;
    private static String result = "";

    public static void main(final String[] ARGS) {
        if (CONDITION_DIGIT) result = IS_DIGIT;
        else if (CONDITION_ALPHA) {
            result = ALPHA_WORD + "\n";
            if (CONDITION_CAPITAL) result += IS_CAPITAL_WORD;
            else result += IS_SMALL_WORD;
        }
        System.out.print(result);
    }
}
// digit   0:48 - 9:57
// capital A:65 - Z:90
// small   a:97 - z:122
// alpha   A:65 - z:122