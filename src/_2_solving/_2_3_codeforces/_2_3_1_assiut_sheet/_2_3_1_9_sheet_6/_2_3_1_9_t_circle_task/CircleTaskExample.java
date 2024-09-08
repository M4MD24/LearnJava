package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_t_circle_task;

import java.util.Scanner;

/**
 * <h1>T. Circle Task</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a cartesian point (X,Y) donates a circle center, a number R donates radius of the circle and a number N donates number of points coordinates. For each point determine whether it belongs to the circle or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 0 0 4 5
 * <br/>
 * 1 3
 * <br/>
 * 4 5
 * <br/>
 * 4 0
 * <br/>
 * 0 0
 * <br/>
 * 5 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * YES
 * <br/>
 * NO
 * <br/>
 * YES
 * <br/>
 * YES
 * <br/>
 * NO
 * </h2>
 */

public class CircleTaskExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int FIRST_CENTER_POINT = INPUT.nextInt(),
            SECOND_CENTER_POINT = INPUT.nextInt(),
            RADIUS = INPUT.nextInt();
    private static final byte COUNT_OF_TEST_CASES = INPUT.nextByte();

    public static void main(final String[] PARAMETERS) {
        inputValues();
    }

    private static void inputValues() {
        for (byte index = 0; index < COUNT_OF_TEST_CASES; index++)
            System.out.println(isBelongToCircle(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static String isBelongToCircle(final int FIRST_POINT, final int SECOND_POINT) {
        final long FIRST_DISTANCE = (long) (FIRST_CENTER_POINT - FIRST_POINT) * (FIRST_CENTER_POINT - FIRST_POINT),
                SECOND_DISTANCE = (long) (SECOND_CENTER_POINT - SECOND_POINT) * (SECOND_CENTER_POINT - SECOND_POINT);
        return (FIRST_DISTANCE + SECOND_DISTANCE <= (long) RADIUS * RADIUS) ? "YES" : "NO";
    }
}