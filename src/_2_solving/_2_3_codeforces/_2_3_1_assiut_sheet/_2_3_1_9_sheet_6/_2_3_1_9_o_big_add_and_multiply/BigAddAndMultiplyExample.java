package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_o_big_add_and_multiply;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * <h1>O. Big Add and Multiply</h1>
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
 * <h2>Given a number N. Print N + 9999 and N * 9999.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1</h2>
 * <h1>Output:</h1>
 * <h2>
 * 10000
 * <br/>
 * 9999
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10</h2>
 * <h1>Output:</h1>
 * <h2>
 * 10009
 * <br/>
 * 99990
 * </h2>
 */

public class BigAddAndMultiplyExample {
    public static void main(final String[] ARGS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BigInteger FIRST_NUMBER = new BigInteger(INPUT.readLine()),
                SECOND_NUMBER = new BigInteger("9999");
        System.out.println(FIRST_NUMBER.add(SECOND_NUMBER));
        System.out.print(FIRST_NUMBER.multiply(SECOND_NUMBER));
    }
}