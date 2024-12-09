package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_h_chewbacca_and_number;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>H. Chewbacca and Number</h1>
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
 * <h2>
 * Luke Skywalker gave Chewbacca an integer number x. Chewbacca isn't good at numbers but he loves inverting digits in them. Inverting digit t means replacing it with digit 9-t.
 * <br/>
 * Help Chewbacca to transform the initial number x to the minimum possible positive number by inverting some (possibly, zero) digits. The decimal representation of the final number shouldn't start with a zero.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>27</h2>
 * <h1>Output:</h1>
 * <h2>22</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4545</h2>
 * <h1>Output:</h1>
 * <h2>4444</h2>
 */

public class ChewbaccaAndNumberExample {
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        printMinimumNumberChewBaccaWant(new StringBuffer(new BufferedReader(new InputStreamReader(System.in)).readLine()));
        OUTPUT.flush();
    }

    private static void printMinimumNumberChewBaccaWant(final StringBuffer NUMBERS) throws IOException {
        OUTPUT.write(NUMBERS.charAt(0) == '9' || NUMBERS.charAt(0) < '5' ? NUMBERS.charAt(0) : (char) ('9' - NUMBERS.charAt(0) + '0'));
        for (int index = 1; index < NUMBERS.length(); index++) OUTPUT.write(NUMBERS.charAt(index) >= '5' ? (char) ('9' - NUMBERS.charAt(index) + '0') : NUMBERS.charAt(index));
    }
}