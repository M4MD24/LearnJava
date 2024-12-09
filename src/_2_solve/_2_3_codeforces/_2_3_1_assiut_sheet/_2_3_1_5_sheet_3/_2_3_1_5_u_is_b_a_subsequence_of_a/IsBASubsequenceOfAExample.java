package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_u_is_b_a_subsequence_of_a;

import java.util.Scanner;

/**
 * <h1>U. Is B a subsequence of A</h1>
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
 * a sub sequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.
 * <br/>
 * IF array = [1,6,3 , 7] then the some subsequences are [1,3,7] , [6,7] , [1] , [6,3,7] , [1,7] .
 * <br/>
 * Something like [3,1] and [6 , 7 , 1] would not be sub sequences of the array [1,6,3 , 7].
 * <br/>
 * Given 2 numbers N, M and 2 arrays A consists of N numbers and B consists of M numbers. Determine whether B is a sub-sequence of A or not.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * The array B is called a sub-sequence of A if it's possible to remove zero or some elements from A to get B.
 * <br/>
 * For example: if A=[1,4,7], and B is [1], [1,4], [1,7],[1,4,7] or [4,7] then B is a sub-sequence of A.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 2
 * <br/>
 * 1 4 7
 * <br/>
 * 1 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 7 4
 * <br/>
 * 1 8 4 7 5 2 7
 * <br/>
 * 4 5 7 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * 21 8 40
 * <br/>
 * 21 8 40
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 */

public class IsBASubsequenceOfAExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short SEQUENCE_LENGTH = INPUT.nextShort(),
            SUB_SEQUENCE_LENGTH = INPUT.nextShort();

    public static void main(final String[] PARAMETERS) {
        final int[] SEQUENCE = inputValues(SEQUENCE_LENGTH),
                SUB_SEQUENCE = inputValues(SUB_SEQUENCE_LENGTH);
        System.out.print(isSubSequence(SEQUENCE, SUB_SEQUENCE));
    }

    private static String isSubSequence(final int[] SEQUENCE, final int[] SUB_SEQUENCE) {
        short counter = 0;
        for (short round = 0, index = 0; index < SEQUENCE_LENGTH; )
            if (SEQUENCE[index] == SUB_SEQUENCE[round]) {
                round++;
                index++;
                counter++;
                if (counter == SUB_SEQUENCE_LENGTH) return "YES";
            } else index++;
        return "NO";
    }

    private static int[] inputValues(final short LENGTH) {
        int[] array = new int[LENGTH];
        for (int index = 0; index < LENGTH; index++) array[index] = INPUT.nextInt();
        return array;
    }
}