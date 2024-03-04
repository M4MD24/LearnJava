package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_sheets._2_3_1_1_data_types_and_conditions._2_3_1_1_u_float_or_int;

import java.util.Scanner;

/**
 * <h1>U. Float or Int</h1>
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
 * <h2>Given a number N, Determine whether N is float number or integer number.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * If N is float number then print "float" followed by the integer part followed by decimal part separated by space.
 * <br/>
 * If N is integer number then print "int" followed by the integer part separated by space.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>234.000</h2>
 * <h1>Output:</h1>
 * <h2>int 234</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>534.958</h2>
 * <h1>Output:</h1>
 * <h2>float 534 0.958</h2>
 */

public class IntOrFloatExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final float FLOAT_NUMBER = INPUT.nextFloat();

    public static void main(String[] args) {
        isIntOrFloat();
    }

    private static void isIntOrFloat() {
        final int INT_NUMBER = (int) FLOAT_NUMBER;
        if (FLOAT_NUMBER == INT_NUMBER) System.out.print("int " + INT_NUMBER);
        else if (FLOAT_NUMBER > INT_NUMBER) System.out.print("float " + INT_NUMBER + " " + (FLOAT_NUMBER - INT_NUMBER));
    }
}