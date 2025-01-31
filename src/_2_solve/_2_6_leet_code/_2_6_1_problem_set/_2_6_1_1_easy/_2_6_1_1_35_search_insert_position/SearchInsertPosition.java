package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_35_search_insert_position;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <br/>
 * You must write an algorithm with O(log n) runtime complexity.
 * </h2>
 */

public class SearchInsertPosition {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    private static int searchInsert(final int[] ARRAY, final int TARGET) {
        System.gc();
        int left = 0,
                right = ARRAY.length - 1;
        while (left <= right) {
            final int MIDDLE = (left + right) / 2;
            if (ARRAY[MIDDLE] == TARGET)
                return MIDDLE;
            else if (ARRAY[MIDDLE] < TARGET)
                left = MIDDLE + 1;
            else
                right = MIDDLE - 1;
        }
        return left;
    }
}