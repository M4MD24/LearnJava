package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_s_interval;

import java.util.Scanner;

/**
 * <h1>S. Interval</h1>
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
 * <h2>
 * Given a number X. Determine in which of the following intervals the number X belongs to:
 * <br/>
 * [0,25], (25,50], (50,75], (75,100]
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * if X belongs to any of the above intervals print "Interval " followed by the interval.
 * <br/>
 * if X does not belong to any of the above intervals print "Out of Intervals".
 * <br/>
 * The symbol '(' represents greater than.
 * <br/>
 * The symbol ')' represents smaller than.
 * <br/>
 * The symbol '[' represents greater than or equal.
 * <br/>
 * The symbol ']' represents smaller than or equal.
 * <br/>
 * For example:
 * <br/>
 * [0,25] indicates numbers between 0 and 25.0000, including both.
 * <br/>
 * (25,50] indicates numbers greater than 25: (25.00001) up to 50.0000000.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>25.1</h2>
 * <h1>Output:</h1>
 * <h2>Interval (25,50]</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>25.0</h2>
 * <h1>Output:</h1>
 * <h2>Interval [0,25]</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>100.0</h2>
 * <h1>Output:</h1>
 * <h2>Interval (75,100]</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>-25.2</h2>
 * <h1>Output:</h1>
 * <h2>Out of Intervals</h2>
 */

public class IntervalExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final float TARGET_VALUE = INPUT.nextFloat();
    private static final int[][] INTERVALS = {
            {0, 25},
            {25, 50},
            {50, 75},
            {75, 100}
    };

    public static void main(final String[] ARGS) {
        printCorrectInterval();
    }

    private static void printCorrectInterval() {
        for (int[] interval : INTERVALS) {
            if (interval[0] <= TARGET_VALUE && interval[1] >= TARGET_VALUE) {
                System.out.print("Interval ");
                if (interval[0] < TARGET_VALUE && interval[1] >= TARGET_VALUE && interval[0] > 0) System.out.print("(");
                else System.out.print("[");
                System.out.print(interval[0] + "," + interval[1] + "]");
                return;
            }
        }
        System.out.print("Out of Intervals");
    }
}