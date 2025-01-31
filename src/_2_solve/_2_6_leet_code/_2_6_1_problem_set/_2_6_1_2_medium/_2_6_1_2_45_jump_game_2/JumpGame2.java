package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_45_jump_game_2;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * <br/>
 * Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 * <br/>
 * 0 <= j <= nums[i] and
 * <br/>
 * i + j < n
 * <br/>
 * Return the minimum number of jumps to reach nums[n - 1]. The test cases are generated such that you can reach nums[n - 1].
 * </h2>
 */

public class JumpGame2 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {3, 2, 1, 0, 4};
        System.out.print(jump(NUMBERS));
    }

    private static int jump(final int[] NUMBERS) {
        int countOfJumps = 0,
                farthest = 0,
                end = 0;
        for (int index = 0; index < NUMBERS.length - 1; index++) {
            farthest = Math.max(farthest, index + NUMBERS[index]);
            if (index == end) {
                countOfJumps++;
                end = farthest;
            }
        }
        return countOfJumps;
    }
}