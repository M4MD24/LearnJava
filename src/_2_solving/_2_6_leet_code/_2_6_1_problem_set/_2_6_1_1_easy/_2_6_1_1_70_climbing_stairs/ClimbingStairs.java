package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_70_climbing_stairs;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are climbing a staircase. It takes n steps to reach the top.
 * <br/>
 * <br/>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * </h2>
 */

public class ClimbingStairs {
    public static void main(final String[] PARAMETERS) {
        System.out.print(climbStairs(4));
    }

    private static int climbStairs(final int NUMBER) {
        if (NUMBER <= 3)
            return NUMBER;
        else {
            int previousStep = 2, currentStep = 3;
            for (int count = 4; count <= NUMBER; count++) {
                final int NEXT_STEP = previousStep + currentStep;
                previousStep = currentStep;
                currentStep = NEXT_STEP;
            }
            return currentStep;
        }
    }
}