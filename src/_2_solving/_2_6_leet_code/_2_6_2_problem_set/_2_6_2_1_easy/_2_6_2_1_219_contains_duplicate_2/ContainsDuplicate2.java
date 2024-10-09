package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_219_contains_duplicate_2;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.</h2>
 */

public class ContainsDuplicate2 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 1, 2, 3};
        final int TARGET = 2;
        System.out.print(containsNearbyDuplicate(NUMBERS, TARGET));
    }

    private static boolean containsNearbyDuplicate(final int[] NUMBERS, final int TARGET) {
        final Map<Integer, Integer> MAP = new HashMap<>();
        for (int index = 0; index < NUMBERS.length; index++)
            if (MAP.containsKey(NUMBERS[index]) && index - MAP.get(NUMBERS[index]) <= TARGET)
                return true;
            else
                MAP.put(NUMBERS[index], index);
        return false;
    }
}