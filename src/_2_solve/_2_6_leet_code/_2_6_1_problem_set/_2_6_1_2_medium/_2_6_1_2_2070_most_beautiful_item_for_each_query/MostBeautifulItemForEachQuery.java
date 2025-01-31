package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_2070_most_beautiful_item_for_each_query;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a 2D integer array items where items[i] = [pricei, beautyi] denotes the price and beauty of an item respectively.
 * <br/>
 * <br/>
 * You are also given a 0-indexed integer array queries. For each queries[j], you want to determine the maximum beauty of an item whose price is less than or equal to queries[j]. If no such item exists, then the answer to this query is 0.
 * <br/>
 * <br/>
 * Return an array answer of the same length as queries where answer[j] is the answer to the jth query.
 * </h2>
 */

public class MostBeautifulItemForEachQuery {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(Arrays.toString(maximumBeauty(
                new int[][]{
                        {1, 2},
                        {3, 2},
                        {2, 4},
                        {5, 6},
                        {3, 5}
                },
                new int[]{1, 2, 3, 4, 5, 6}
        )));
    }

    private static int[] maximumBeauty(final int[][] ITEMS, final int[] QUERIES) {
        System.gc();
        Arrays.sort(
                ITEMS,
                (firstElement, secondElement) -> firstElement[0] == secondElement[0]
                        ? secondElement[1] - firstElement[1]
                        : firstElement[0] - secondElement[0]
        );
        int currentMaximumBeauty = 0;
        final TreeMap<Integer, Integer> PAIRS_ITEMS = new TreeMap<>();
        for (final int[] ITEM : ITEMS)
            if (ITEM[1] > currentMaximumBeauty) {
                currentMaximumBeauty = ITEM[1];
                PAIRS_ITEMS.put(ITEM[0], currentMaximumBeauty);
            }
        final int[] MAXIMUM_BEAUTY = new int[QUERIES.length];
        for (int index = 0; index < QUERIES.length; index++) {
            final Map.Entry<Integer, Integer> ENTRY = PAIRS_ITEMS.floorEntry(QUERIES[index]);
            if (ENTRY != null)
                MAXIMUM_BEAUTY[index] = ENTRY.getValue();
        }
        return MAXIMUM_BEAUTY;
    }

    /*private static int[] maximumBeauty(final int[][] ITEMS, final int[] QUERIES) {
        Arrays.sort(ITEMS, Comparator.comparingInt(items -> items[0]));
        final TreeMap<Integer, Integer> PRICE_TO_BEAUTY = new TreeMap<>();
        int maximumBeautySoFar = 0;
        for (final int[] ITEM : ITEMS) {
            maximumBeautySoFar = Math.max(maximumBeautySoFar, ITEM[1]);
            PRICE_TO_BEAUTY.put(ITEM[0], maximumBeautySoFar);
        }
        final int[] MAXIMUM_BEAUTY_NUMBERS = new int[QUERIES.length];
        for (int index = 0; index < QUERIES.length; index++) {
            final Integer FLOOR_KEY = PRICE_TO_BEAUTY.floorKey(QUERIES[index]);
            MAXIMUM_BEAUTY_NUMBERS[index] = (FLOOR_KEY == null)
                    ? 0
                    : PRICE_TO_BEAUTY.get(FLOOR_KEY);
        }
        return MAXIMUM_BEAUTY_NUMBERS;
    }*/
}