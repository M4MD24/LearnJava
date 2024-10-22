package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_42_trapping_rain_water;

/**
 * <h1>Problem:</h1>
 * <h2>Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.</h2>
 */

public class TrappingRainWater {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.print(trap(NUMBERS));
    }

    private static int trap(final int[] HEIGHTS) {
        int left = 0, right = HEIGHTS.length - 1;
        int leftMax = 0, rightMax = 0;
        int waterTrapped = 0;
        while (left < right) {
            if (HEIGHTS[left] < HEIGHTS[right]) {
                if (HEIGHTS[left] >= leftMax) {
                    leftMax = HEIGHTS[left];
                } else {
                    waterTrapped += leftMax - HEIGHTS[left];
                }
                left++;
            } else {
                if (HEIGHTS[right] >= rightMax) {
                    rightMax = HEIGHTS[right];
                } else {
                    waterTrapped += rightMax - HEIGHTS[right];
                }
                right--;
            }
        }
        return waterTrapped;
    }
}