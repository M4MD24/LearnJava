package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_sheets._2_3_1_1_data_types_and_conditions._o_calculator;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * <h1>O. Calculator</h1>
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
    private static String TEXT;
    private static long NUMBER_1,
            NUMBER_2;

    public static void main(String[] args) {
        enterInput();
    }

    private static void enterInput() {
        TEXT = INPUT.nextLine();
        String[] ARRAY_TEXT = TEXT.split("[+\\-*/]");
        if (ARRAY_TEXT.length == 1) {
            System.out.println("Enter valid data!");
            enterInput();
        } else {
            NUMBER_1 = Long.parseLong(ARRAY_TEXT[0]);
            NUMBER_2 = Long.parseLong(ARRAY_TEXT[1]);
            System.out.print(result());
        }
    }

    private static long result() {
        boolean IS_PLUS = Pattern.compile("\\+").matcher(TEXT).find(),
                IS_MINUS = Pattern.compile("-").matcher(TEXT).find(),
                IS_MULTIPLICATION = Pattern.compile("\\*").matcher(TEXT).find(),
                IS_DIVISION = Pattern.compile("/").matcher(TEXT).find();
        if (IS_PLUS) return NUMBER_1 + NUMBER_2;
        else if (IS_MINUS) return NUMBER_1 - NUMBER_2;
        else if (IS_MULTIPLICATION) return NUMBER_1 * NUMBER_2;
        else if (IS_DIVISION) return NUMBER_1 / NUMBER_2;
        else throw new Error("Enter valid operator [ +, -, *, / ]");
    }
}