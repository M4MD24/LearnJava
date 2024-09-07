package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_u_knapsack;

import java.util.Scanner;

/**
 * <h1>U. Knapsack</h1>
 * <h2>
 * time limit per test: 2 second
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
 * There are N items numbered from 1 to N. The ith item has a weight of wi and a value of vi
 * <br/>
 * You have to choose some items out of the N
 * items and carry them home in a knapsack. The capacity of the knapsack is W which donate the maximum weight that can be carried inside the knapsack. In other words, W
 * <br/>
 * means the total summation of all weights of items that can be carried in the knapsack.
 * <br/>
 * Print maximum possible sum of values of items that you can take home.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 8
 * <br/>
 * 3 30
 * <br/>
 * 4 50
 * <br/>
 * 5 60
 * </h2>
 * <h1>Output:</h1>
 * <h2>90</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6 15
 * <br/>
 * 6 5
 * <br/>
 * 5 6
 * <br/>
 * 6 4
 * <br/>
 * 6 6
 * <br/>
 * 3 5
 * <br/>
 * 7 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>17</h2>
 */

public class KnapsackExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte COUNT_OF_TEST_CASES = INPUT.nextByte();
    private static final byte[] WEIGHTS = new byte[COUNT_OF_TEST_CASES];
    private static final short[] VALUES = new short[COUNT_OF_TEST_CASES];
    private static final byte MAXIMUM_WEIGHT_TO_STORAGE = INPUT.nextByte();

    public static void main(final String[] PARAMETERS) {
        inputValues((byte) 0);
        System.out.print(getMaximumPossibleSumOfValues(COUNT_OF_TEST_CASES, MAXIMUM_WEIGHT_TO_STORAGE));
    }

    private static short getMaximumPossibleSumOfValues(byte index, final byte MAXIMUM_WEIGHT_TO_STORAGE) {
        if (index == 0 || MAXIMUM_WEIGHT_TO_STORAGE == 0) return 0;
        if (WEIGHTS[--index] > MAXIMUM_WEIGHT_TO_STORAGE) return getMaximumPossibleSumOfValues(
                index,
                MAXIMUM_WEIGHT_TO_STORAGE
        );
        else return (short) Math.max(
                VALUES[index] + getMaximumPossibleSumOfValues(
                        index,
                        (byte) (MAXIMUM_WEIGHT_TO_STORAGE - WEIGHTS[index])),
                getMaximumPossibleSumOfValues(
                        index,
                        MAXIMUM_WEIGHT_TO_STORAGE)
        );
    }

    private static void inputValues(byte index) {
        if (index < COUNT_OF_TEST_CASES) {
            inputItemWeightAndValue(index++, INPUT.nextByte(), INPUT.nextShort());
            inputValues(index);
        }
    }

    private static void inputItemWeightAndValue(final byte INDEX, final byte WEIGHT, final short VALUE) {
        WEIGHTS[INDEX] = WEIGHT;
        VALUES[INDEX] = VALUE;
    }
}