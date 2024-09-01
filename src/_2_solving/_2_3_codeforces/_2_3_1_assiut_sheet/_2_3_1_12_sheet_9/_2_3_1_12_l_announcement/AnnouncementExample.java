package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_l_announcement;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * <h1>L. Announcement!</h1>
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
 * During the last contest, There was a notification saying "2 Problems are added Enjoy" Yasser found that the contestants were angry.
 * <br/>
 * After the contest Moamen gives Yasser the problems of the next contest and asked him if the difficulty level of any problem exists more than once he will replace it with another easy problem.
 * <br/>
 * Given N (The number of problems) then the difficulty of each problem and find How many problems should be replaced? If each problem exists exactly once print -1
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 1 2
 * </h2>
 * <h1>Output</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1
 * <br/>
 * 1
 * </h2>
 * <h1>Output</h1>
 * <h2>-1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 2 3 4 3
 * </h2>
 * <h1>Output</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 1 1 3 3
 * </h2>
 * <h1>Output</h1>
 * <h2>2</h2>
 */

public class AnnouncementExample {
    private static int totalOfFrequentlyProblems = 0;

    public static void main(final String[] ARGS) {
        inputProblems();
        System.out.print(totalOfFrequentlyProblems == 0 ? -1 : totalOfFrequentlyProblems);
    }

    private static void inputProblems() {
        final Scanner INPUT = new Scanner(System.in);
        short countOfProblems = INPUT.nextShort();
        final Set<Integer> PROBLEMS = new HashSet<>();
        for (short index = 0; index < countOfProblems; index++) if (!PROBLEMS.add(INPUT.nextInt())) totalOfFrequentlyProblems++;
    }
}