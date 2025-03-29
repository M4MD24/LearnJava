package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_g_smallest_product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>G. Smallest Product</h1>
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
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 4 2 1 10 6
 * </h2>
 * <h1>Output:</h1>
 * <h2>4</h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_g_smallest_product.images <h2>Question</h2>
 */

public class SmallestProductExample {
    private static int countOfNumbers;
    private static double numbersMultiplicationSum = 0;

    public static void main(final String[] ARGUMENTS) throws IOException {
        inputValues();
        System.out.print(getSmallestProduct());
    }

    private static long getSmallestProduct() {
        return (long) Math.pow(10, numbersMultiplicationSum / countOfNumbers) + 1;
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfNumbers = Integer.parseInt(INPUT.readLine());
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        for (int index = 0; index < countOfNumbers; index++) numbersMultiplicationSum += Math.log10(Long.parseLong(LINE.nextToken()));
    }
}