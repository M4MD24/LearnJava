package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_m_distinct_numbers;

import java.util.HashSet;
import java.util.Scanner;

/**
 * <h1>M. Distinct Number</h1>
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
 * <h2>Given an array A of size N. Print the number of distinct numbers in the array.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 2 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 8 9 2 9
 * </h2>
 * <h1>Output:</h1>
 * <h2>4</h2>
 */

public class DistinctNumberExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static final HashSet<Short> NUMBERS = new HashSet<>();

    public static void main(final String[] ARGS) {
        inputValues();
        System.out.print(getCountDistinctNumber());
    }

    private static short getCountDistinctNumber() {
        return (short) NUMBERS.size();
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS.add(INPUT.nextShort());
    }
}