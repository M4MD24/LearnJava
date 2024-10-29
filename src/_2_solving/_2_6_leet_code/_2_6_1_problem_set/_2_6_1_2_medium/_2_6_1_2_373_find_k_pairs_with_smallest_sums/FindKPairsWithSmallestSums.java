package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_373_find_k_pairs_with_smallest_sums;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given two integer arrays nums1 and nums2 sorted in non-decreasing order and an integer k.
 * <br/>
 * <br/>
 * Define a pair (u, v) which consists of one element from the first array and one element from the second array.
 * <br/>
 * <br/>
 * Return the k pairs (u1, v1), (u2, v2), ..., (uk, vk) with the smallest sums.
 * </h2>
 */

public class FindKPairsWithSmallestSums {
    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBERS = {1, 7, 11},
                SECOND_NUMBERS = {2, 4, 6};
        final int COUNT_OF_PAIRS = 3;
        System.out.print(kSmallestPairs(FIRST_NUMBERS, SECOND_NUMBERS, COUNT_OF_PAIRS));
    }

    private static List<List<Integer>> kSmallestPairs(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS, final int COUNT_OF_PAIRS) {
        System.gc();
        final List<List<Integer>> SMALLEST_PAIRS = new ArrayList<>();
        final PriorityQueue<int[]> MINIMUM_HEAP = new PriorityQueue<>(Comparator.comparingInt(pair -> (FIRST_NUMBERS[pair[0]] + SECOND_NUMBERS[pair[1]])));
        for (int index = 0; index < Math.min(COUNT_OF_PAIRS, FIRST_NUMBERS.length); index++)
            MINIMUM_HEAP.offer(new int[]{index, 0});
        while (COUNT_OF_PAIRS > SMALLEST_PAIRS.size() && !MINIMUM_HEAP.isEmpty()) {
            final int[] CURRENT_INDEX_PAIR = MINIMUM_HEAP.poll();
            final int INDEX_IN_FIRST_NUMBERS = CURRENT_INDEX_PAIR[0],
                    INDEX_IN_SECOND_NUMBERS = CURRENT_INDEX_PAIR[1];
            SMALLEST_PAIRS.add(List.of(FIRST_NUMBERS[INDEX_IN_FIRST_NUMBERS], SECOND_NUMBERS[INDEX_IN_SECOND_NUMBERS]));
            if (INDEX_IN_SECOND_NUMBERS + 1 < SECOND_NUMBERS.length)
                MINIMUM_HEAP.offer(new int[]{
                        INDEX_IN_FIRST_NUMBERS,
                        INDEX_IN_SECOND_NUMBERS + 1
                });
        }
        return SMALLEST_PAIRS;
    }
}