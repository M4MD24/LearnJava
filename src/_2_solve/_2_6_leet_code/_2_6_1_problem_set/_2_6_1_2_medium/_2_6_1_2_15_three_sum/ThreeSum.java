package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_15_three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <br/>
 * Notice that the solution set must not contain duplicate triplets.
 * </h2>
 */

public class ThreeSum {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {-1, 0, 1, 2, -1, -4};
        System.out.print(threeSums(NUMBERS));
    }

    private static List<List<Integer>> threeSums(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        final List<List<Integer>> THREE_SUMS = new ArrayList<>();
        for (int index = 0; index < NUMBERS.length - 2; index++)
            if (index > 0 && NUMBERS[index] == NUMBERS[index - 1])
                continue;
            else {
                for (int left = index + 1, right = NUMBERS.length - 1; left < right; ) {
                    final int SUM = NUMBERS[index] + NUMBERS[left] + NUMBERS[right];
                    if (SUM == 0) {
                        THREE_SUMS.add(List.of(
                                NUMBERS[index],
                                NUMBERS[left++],
                                NUMBERS[right--]
                        ));
                        while (left < right && NUMBERS[left] == NUMBERS[left - 1])
                            left++;
                        while (left < right && NUMBERS[right] == NUMBERS[right + 1])
                            right--;
                    } else if (SUM < 0)
                        left++;
                    else
                        right--;
                }
            }
        return THREE_SUMS;
    }
}