package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_k_snacktower;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>K. Snacktower</h1>
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
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 3 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 3
 * <br/>
 * <br/>
 * 2 1
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 4 5 1 2 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * <br/>
 * 5 4
 * <br/>
 * <br/>
 * <br/>
 * 3 2 1
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In the example a snack of size 3 fell on the first day, and the residents immediately placed it. On the second day a snack of size 1 fell, and the residents weren't able to place it because they were missing the snack of size 2. On the third day a snack of size 2 fell, and the residents immediately placed it. Right after that they placed the snack of size 1 which had fallen before.</h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_k_snacktower.images <h2>Question</h2>
 */

public class SnacktowerExample {
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] ARGUMENTS) throws IOException {
        printSnacksTower();
        OUTPUT.flush();
    }

    private static void printSnacksTower() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final int COUNT_OF_SNACKS = Integer.parseInt(INPUT.readLine());
        final int[] SNACKS = new int[COUNT_OF_SNACKS + 1];
        int maximumSize = COUNT_OF_SNACKS;
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        for (int index = 0; index < COUNT_OF_SNACKS; index++) {
            SNACKS[Integer.parseInt(LINE.nextToken())] = 1;
            while (SNACKS[maximumSize] != 0) OUTPUT.write(maximumSize-- + " ");
            OUTPUT.write("\n");
        }
    }
}