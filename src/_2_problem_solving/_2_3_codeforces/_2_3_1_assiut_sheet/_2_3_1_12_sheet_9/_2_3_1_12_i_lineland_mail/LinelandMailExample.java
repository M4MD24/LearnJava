package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_i_lineland_mail;

import java.util.Scanner;

/**
 * <h1>I. Lineland mail</h1>
 * <h2>
 * time limit per test: 3 second
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
 * All cities of Lineland are located on the Ox coordinate axis. Thus, each city is associated with its position xi — a coordinate on the Ox axis. No two cities are located at a single point.
 * <br/>
 * Lineland residents love to send letters to each other. A person may send a letter only if the recipient lives in another city (because if they live in the same city, then it is easier to drop in).
 * <br/>
 * Strange but true, the cost of sending the letter is exactly equal to the distance between the sender's city and the recipient's city.
 * <br/>
 * For each city calculate two values mini and maxi, where mini is the minimum cost of sending a letter from the i-th city to some other city, and maxi is the the maximum cost of sending a letter from the i-th city to some other city
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * -5 -2 2 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 3 12
 * <br/>
 * 3 9
 * <br/>
 * 4 7
 * <br/>
 * 5 12
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * -1 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 2
 * <br/>
 * 2 2
 * </h2>
 */

public class LinelandMailExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LINE_LENGTH = INPUT.nextInt();
    private static final int[] CITES = new int[LINE_LENGTH];

    public static void main(final String[] ARGS) {
        inputCosts();
        printCostsReport();
    }

    private static void printCostsReport() {
        int minimumIndex = 0, maximumIndex = LINE_LENGTH - 1;
        System.out.println(Math.abs(CITES[minimumIndex] - CITES[1]) + " " + Math.abs(CITES[minimumIndex] - CITES[maximumIndex]));
        for (int index = 1; index < LINE_LENGTH - 1; index++)
            System.out.println(Math.min(Math.abs(CITES[index] - CITES[index - 1]), Math.abs(CITES[index] - CITES[index + 1])) + " " + Math.max(Math.abs(CITES[index] - CITES[minimumIndex]), Math.abs(CITES[index] - CITES[maximumIndex])));
        System.out.print(Math.abs(CITES[maximumIndex] - CITES[maximumIndex - 1]) + " " + Math.abs(CITES[maximumIndex] - CITES[minimumIndex]));
    }

    private static void inputCosts() {
        for (int index = 0; index < LINE_LENGTH; index++) CITES[index] = INPUT.nextInt();
    }
}