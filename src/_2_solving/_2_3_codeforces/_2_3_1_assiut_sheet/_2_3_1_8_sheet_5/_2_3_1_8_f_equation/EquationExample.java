package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_f_equation;

import java.util.Scanner;

/**
 * <h1>E. Equation</h1>
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
 * Given two numbers X and N. Print the result of the following equation:
 * <br/>
 * S=(X0-1)+(X2)+(X4)+(X6)+...............+(XN)
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function and don't use built-in function.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 5</h2>
 * <h1>Output:</h1>
 * <h2>650</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_f_equation.images <h2>Note</h2>
 */

public class EquationExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(equation(INPUT.nextByte(), INPUT.nextByte()));
    }

    public static long equation(final byte NUMBER, byte count) {
        long sum = 0;
        while (count > 1) {
            if (count % 2 == 0) sum += power(NUMBER, count);
            count--;
        }
        return sum;
    }

    public static long power(final byte NUMBER, byte power) {
        long sum = 1;
        while (power-- > 0)
            sum *= NUMBER;
        return sum;
    }
}