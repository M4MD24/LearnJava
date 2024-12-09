package _2_solve._2_3_codeforces._2_3_2_problem_set._2_3_2_231a_team;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <h1>231A.Team</h1>
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
 * One day three best friends Petya, Vasya and Tonya decided to form a team and take part in programming contests. Participants are usually offered several problems during programming contests. Long before the start the friends decided that they will implement a problem if at least two of them are sure about the solution. Otherwise, the friends won't write the problem's solution.
 * <br/>
 * <br/>
 * This contest offers n problems to the participants. For each problem we know, which friend is sure about the solution. Help the friends find the number of problems for which they will write a solution.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 1 0
 * <br/>
 * 1 1 1
 * <br/>
 * 1 0 0
 * </h2>
 * <br/>
 * <h1>Output:</h1>
 * <h2>
 * 2
 * </h2>
 */

public class Team {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCases = Integer.parseInt(INPUT.readLine());
        int countOfMajorityConfirmed = 0;
        while (testCases-- > 0) {
            final String[] RESULTS_OF_FRIENDS = INPUT.readLine().split(" ");
            if (Integer.parseInt(RESULTS_OF_FRIENDS[0]) + Integer.parseInt(RESULTS_OF_FRIENDS[1]) + Integer.parseInt(RESULTS_OF_FRIENDS[2]) > 1)
                countOfMajorityConfirmed++;
        }
        OUTPUT.write(String.valueOf(countOfMajorityConfirmed));
        OUTPUT.flush();

// >
        /*final byte TARGET_NUMBER = Byte.parseByte(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print((TARGET_NUMBER % 2 == 0 && TARGET_NUMBER > 3) ? "YES" : "NO");*/
    }
}