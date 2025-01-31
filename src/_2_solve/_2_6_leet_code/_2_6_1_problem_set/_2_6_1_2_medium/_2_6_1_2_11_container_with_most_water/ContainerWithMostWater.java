package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_11_container_with_most_water;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * <br/>
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 * <br/>
 * Return the maximum amount of water a container can store.
 * <br/>
 * Notice that you may not slant the container.
 * </h2>
 */

public class ContainerWithMostWater {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.print(maxArea(NUMBERS));
    }

    private static int maxArea(final int[] HEIGHTS) {
        int leftPosition = 0,
                rightPosition = HEIGHTS.length - 1,
                maximumArea = 0;
        while (leftPosition < rightPosition)
            maximumArea = Math.max(
                    maximumArea,
                    (rightPosition - leftPosition) * (HEIGHTS[leftPosition] < HEIGHTS[rightPosition]
                            ? HEIGHTS[leftPosition++]
                            : HEIGHTS[rightPosition--])
            );
        return maximumArea;
    }
}