package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_2_contest_1._2_3_1_2_h_data_type_guessing;

import java.util.Scanner;

/**
 * <h1>H. Data Type Guessing</h1>
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
 * <h2>Given three numbers n, k and a . Identify whether the data type of (n*k)/a is int, long long or double.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * double is when a number has a floating-point.
 * <br/>
 * int Range: [−2147483648,2147483647]
 * <br/>
 * long long can hold values of a bigger range than that of int.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 6 9</h2>
 * <h1>Output:</h1>
 * <h2>int</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>100000 200000 4</h2>
 * <h1>Output:</h1>
 * <h2>long long</h2>
 */
public class DataTypeGuessingExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final double NUMBER_1 = INPUT.nextDouble(),
                NUMBER_2 = INPUT.nextDouble(),
                NUMBER_3 = INPUT.nextDouble();
        System.out.print(checkDataType(NUMBER_1, NUMBER_2, NUMBER_3));
    }

    private static String checkDataType(final double NUMBER_1, final double NUMBER_2, final double NUMBER_3) {
        final double RESULT = NUMBER_1 * NUMBER_2 / NUMBER_3,
                PRODUCT_OF_MINIMUM_AND_MAXIMUM = (Math.min(NUMBER_1, NUMBER_2) / NUMBER_3) * Math.max(NUMBER_1, NUMBER_2),
                DECIMAL_PART = PRODUCT_OF_MINIMUM_AND_MAXIMUM - (long) PRODUCT_OF_MINIMUM_AND_MAXIMUM;
        if (DECIMAL_PART > 0 && DECIMAL_PART < 1) return "double";
        else if ((long) RESULT > (int) RESULT) return "long long";
        else return "int";
    }
}