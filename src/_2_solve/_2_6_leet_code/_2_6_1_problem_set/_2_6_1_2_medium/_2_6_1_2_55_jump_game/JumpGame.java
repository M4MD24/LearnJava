package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_55_jump_game;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.
 * <br/>
 * Return true if you can reach the last index, or false otherwise.
 * </h2>
 */

public class JumpGame {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {3, 2, 1, 0, 4};
        System.out.print(canJump(NUMBERS));
    }

    private static boolean canJump(final int[] NUMBERS) {
        int lastPosition = NUMBERS.length - 1;
        for (int index = lastPosition; index >= 0; index--)
            if (index + NUMBERS[index] >= lastPosition)
                lastPosition = index;
        return lastPosition == 0;
    }
}