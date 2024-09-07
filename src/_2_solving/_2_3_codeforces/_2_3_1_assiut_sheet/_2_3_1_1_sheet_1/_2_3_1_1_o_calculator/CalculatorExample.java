package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_o_calculator;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * <h1>O. Calculator</h1>
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
 * Given a mathematical expression. The expression will be one of the following expressions: A+B, A−B, A*B and A/B
 * <br/>
 * Print the result of the mathematical expression.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7+54</h2>
 * <h1>Output:</h1>
 * <h2>61</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>17*10</h2>
 * <h1>Output:</h1>
 * <h2>170</h2>
 */

public class CalculatorExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final String TEXT = INPUT.nextLine();
    private static final String[] ARRAY_TEXT = TEXT.split("[+\\-*/]");
    private static final boolean IS_PLUS = Pattern.compile("\\+").matcher(TEXT).find(),
            IS_MINUS = Pattern.compile("-").matcher(TEXT).find(),
            IS_MULTIPLICATION = Pattern.compile("\\*").matcher(TEXT).find(),
            IS_DIVISION = Pattern.compile("/").matcher(TEXT).find();
    private static final long NUMBER_1 = Long.parseLong(ARRAY_TEXT[0]),
            NUMBER_2 = Long.parseLong(ARRAY_TEXT[1]);

    public static void main(final String[] PARAMETERS) {
        result();
    }

    private static void result() {
        if (IS_PLUS) System.out.printf("%d", NUMBER_1 + NUMBER_2);
        else if (IS_MINUS) System.out.printf("%d", NUMBER_1 - NUMBER_2);
        else if (IS_MULTIPLICATION) System.out.printf("%d", NUMBER_1 * NUMBER_2);
        else if (IS_DIVISION) System.out.printf("%d", NUMBER_1 / NUMBER_2);
    }
}