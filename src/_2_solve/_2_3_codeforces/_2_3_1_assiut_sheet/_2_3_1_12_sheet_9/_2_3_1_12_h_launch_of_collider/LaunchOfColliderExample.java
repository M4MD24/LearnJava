package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_h_launch_of_collider;

import java.util.Scanner;

/**
 * <h1>H. Launch of Collider</h1>
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
 * There will be a launch of a new, powerful and unusual collider very soon, which located along a straight line. n particles will be launched inside it. All of them are located in a straight line and there can not be two or more particles located in the same point. The coordinates of the particles coincide with the distance in meters from the center of the collider, xi is the coordinate of the i-th particle and its position in the collider at the same time. All coordinates of particle positions are even integers.
 * <br/>
 * You know the direction of each particle movement — it will move to the right or to the left after the collider's launch start. All particles begin to move simultaneously at the time of the collider's launch start. Each particle will move straight to the left or straight to the right with the constant speed of 1 meter per microsecond. The collider is big enough so particles can not leave it in the foreseeable time.
 * <br/>
 * Write the program which finds the moment of the first collision of any two particles of the collider. In other words, find the number of microseconds before the first moment when any two particles are at the same point.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * RLRL
 * <br/>
 * 2 4 6 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * LLR
 * <br/>
 * 40 50 60
 * </h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample case the first explosion will happen in 1 microsecond because the particles number 1 and 2 will simultaneously be at the same point with the coordinate 3.
 * <br/>
 * In the second sample case there will be no explosion because there are no particles which will simultaneously be at the same point.
 * </h2>
 */

public class LaunchOfColliderExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int COUNT_OF_COLLIDER = INPUT.nextInt();
    private static final StringBuffer DIRECTIONS = new StringBuffer(INPUT.next());
    private static final int[] COLLIDERS = new int[COUNT_OF_COLLIDER];
    private static long minimumTime = Integer.MAX_VALUE;

    public static void main(final String[] ARGUMENTS) {
        inputColliders();
        launchColliders();
        System.out.print(minimumTime == Integer.MAX_VALUE
                ? -1
                : minimumTime);
    }

    private static void launchColliders() {
        for (int index = 0; index < COUNT_OF_COLLIDER - 1; index++)
            if (DIRECTIONS.charAt(index) == 'R' && DIRECTIONS.charAt(index + 1) == 'L')
                collision(index);
    }

    private static void collision(int index) {
        final long CURRENT_TIME = (COLLIDERS[index + 1] - COLLIDERS[index]) / 2;
        if (CURRENT_TIME < minimumTime)
            minimumTime = CURRENT_TIME;
    }

    private static void inputColliders() {
        for (int index = 0; index < COUNT_OF_COLLIDER; index++)
            COLLIDERS[index] = INPUT.nextInt();
    }
}