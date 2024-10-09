package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_p_log_two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * <h1>O. Log2</h1>
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
 * <h2>Given a number N. Print ⌊log2(N)⌋.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1</h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>8</h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_o_fibonacci.images <h2>Figure 1</h2>
 */

public class LogTwoExample {
    static int returnLog2Recursion(int count, BigInteger number) {
        if (number.compareTo(new BigInteger("1")) <= 0) return count;
        return returnLog2Recursion(++count, number.divide(BigInteger.valueOf(2)));
    }

    public static void main(final String[] PARAMETERS) throws IOException {
        System.out.print(returnLog2Recursion(0, new BigInteger(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }
}