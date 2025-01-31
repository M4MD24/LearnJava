package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_g_magnets;

import java.util.Scanner;

/**
 * <h1>G. Magnets</h1>
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
 * <h1>Problem:</h1>
 * <h2>
 * Mad scientist Mike entertains himself by arranging rows of dominoes. He doesn't need dominoes, though: he uses rectangular magnets instead. Each magnet has two poles, positive (a "plus") and negative (a "minus"). If two magnets are put together at a close distance, then the like poles will repel each other and the opposite poles will attract each other.
 * <br/>
 * Mike starts by laying one magnet horizontally on the table. During each following step Mike adds one more magnet horizontally to the right end of the row. Depending on how Mike puts the magnet on the table, it is either attracted to the previous one (forming a group of multiple magnets linked together) or repelled by it (then Mike lays this magnet at some distance to the right from the previous one). We assume that a sole magnet not linked to others forms a group of its own.
 * <br/>
 * Mike arranged multiple magnets in a row. Determine the number of groups that the magnets formed.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6
 * <br/>
 * 10
 * <br/>
 * 10
 * <br/>
 * 10
 * <br/>
 * 01
 * <br/>
 * 10
 * <br/>
 * 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 01
 * <br/>
 * 01
 * <br/>
 * 10
 * <br/>
 * 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * The first testcase corresponds to the figure. The testcase has three groups consisting of three, one and two magnets.
 * <br/>
 * The second testcase has two groups, each consisting of two magnets.
 * </h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_f_fox_and_snake.images <h2>Figure 1</h2>
 */

public class MagnetsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int length = INPUT.nextInt(),
            lastValue = INPUT.nextInt(),
            groupCounts = 1;

    public static void main(final String[] ARGUMENTS) {
        inputValues();
        System.out.print(groupCounts);
    }

    private static void inputValues() {
        while (length-- > 1) {
            final int CURRENT_VALUE = INPUT.nextInt();
            if (lastValue != CURRENT_VALUE) {
                lastValue = CURRENT_VALUE;
                groupCounts++;
            }
        }
    }
}