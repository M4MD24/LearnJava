package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_j_multiples;

import java.util.Scanner;

/**
 * <h1>J. Multiples</h1>
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
 * <h2>Given two numbers A and B. Print "Multiples" if A is multiple of B or vice versa. Otherwise print "No Multiples".</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>9 3</h2>
 * <h1>Output:</h1>
 * <h2>Multiples</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>6 24</h2>
 * <h1>Output:</h1>
 * <h2>Multiples</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>12 5</h2>
 * <h1>Output:</h1>
 * <h2>No Multiples</h2>
 */

public class MultiplesExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final long NUMBER_1 = Long.parseLong(INPUT.next()),
            NUMBER_2 = Long.parseLong(INPUT.next());
    private static final String CONDITION = (NUMBER_1 % NUMBER_2 == 0 || NUMBER_2 % NUMBER_1 == 0) ? "Multiples" : "No Multiples";

    public static void main(final String[] PARAMETERS) {
        System.out.print(CONDITION);
    }
}