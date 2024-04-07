package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_t_olesya_and_rodion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * <h1>T. Olesya and Rodion</h1>
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
 * Olesya loves numbers consisting of n digits, and Rodion only likes numbers that are divisible by t. Find some number that satisfies both of them.
 * <br/>
 * Your task is: given the n and t print an integer strictly larger than zero consisting of n digits that is divisible by t. If such number doesn't exist, print -1.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 2</h2>
 * <h1>Output</h1>
 * <h2>712</h2>
 */

public class OlesyaAndRodionExample {
    public static void main(final String[] ARGS) throws IOException {
        final StringTokenizer INPUT = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        OUTPUT.write(calculateAndReturnAppropriateNumberForMuhammadAndAhmed(Byte.parseByte(INPUT.nextToken()), Byte.parseByte(INPUT.nextToken())));
        OUTPUT.flush();
    }

    private static String calculateAndReturnAppropriateNumberForMuhammadAndAhmed(final byte OLESYA_NUMBER, final byte RODION_NUMBER) {
        if (OLESYA_NUMBER == 1 && RODION_NUMBER == 10) return "-1";
        else {
            if (RODION_NUMBER == 10) return String.valueOf(new BigInteger(String.valueOf(RODION_NUMBER)).pow(OLESYA_NUMBER - 1));
            else return String.valueOf(RODION_NUMBER).repeat(OLESYA_NUMBER);
        }
    }
}