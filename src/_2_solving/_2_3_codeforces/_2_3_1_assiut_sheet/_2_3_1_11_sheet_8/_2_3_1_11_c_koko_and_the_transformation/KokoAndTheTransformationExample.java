package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_c_koko_and_the_transformation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>C. Koko And The Transformation</h1>
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
 * <h2>koko has two arrays a and b, he wants to know if he can transform a to b in a finite number of steps. In each step he can perform one of two operations:</h2>
 * <ul>
 *     <li>Pick two values from a and merge them into one value equal to their sum.</li>
 *     <li>Pick value from a and split it into two values such that their sum are equal to the initial value.</li>
 * </ul>
 * <h2>koko needs your help, can you find out if he can transform a to b in a finite number of steps?</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 5
 * <br/>
 * 6 15 6
 * <br/>
 * 5 12 0 3 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>Yes</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * - One solution to the sample case is: split 15 to 12 and 3, split 6 to 1 and 5, merge 1 and 6 to 7. split 7 to 7 and 0.
 * <br/>
 * - Note that: the order of the numbers in a or b is not important.
 * </h2>
 */

public class KokoAndTheTransformationExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
    private static StringTokenizer line;
    private static int firstNumbersLength, secondNumbersLength, firstNumbersSum = 0, secondNumbersSum = 0;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.write(firstNumbersSum == secondNumbersSum ? "Yes" : "No");
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        line = new StringTokenizer(INPUT.readLine());
        firstNumbersLength = Integer.parseInt(line.nextToken());
        secondNumbersLength = Integer.parseInt(line.nextToken());
        line = new StringTokenizer(INPUT.readLine());
        firstNumbersSum += Integer.parseInt(line.nextToken());
        inputFirstNumbers();
        line = new StringTokenizer(INPUT.readLine());
        secondNumbersSum += Integer.parseInt(line.nextToken());
        inputSecondNumbers();
    }

    private static void inputSecondNumbers() {
        if (secondNumbersLength-- > 1) {
            secondNumbersSum += Integer.parseInt(line.nextToken());
            inputSecondNumbers();
        }
    }

    private static void inputFirstNumbers() {
        if (firstNumbersLength-- > 1) {
            firstNumbersSum += Integer.parseInt(line.nextToken());
            inputFirstNumbers();
        }
    }
}