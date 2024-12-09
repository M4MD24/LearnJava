package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_b_print_from_one_to_targe_number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>B. Print from One to Target Number</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given a number N. Print numbers from 1 to N in separate lines.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 4
 * <br/>
 * 5
 * </h2>
 */

public class PrintFromOneToTargetNumberExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        printOneToTargetNumber(Short.parseShort(new BufferedReader(new InputStreamReader(System.in)).readLine()));
    }

    private static void printOneToTargetNumber(final short TARGET_NUMBER) {
        System.out.print(returnOneToTargetNumberRecursion((short) 1, TARGET_NUMBER));
    }

    private static String returnOneToTargetNumberRecursion(short index, final short TARGET_NUMBER) {
        if (index <= TARGET_NUMBER) return index++ + "\n" + returnOneToTargetNumberRecursion(index, TARGET_NUMBER);
        return "";
    }
}