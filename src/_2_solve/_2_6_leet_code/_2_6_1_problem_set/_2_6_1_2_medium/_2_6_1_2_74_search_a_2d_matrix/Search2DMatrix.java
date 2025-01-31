package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_74_search_a_2d_matrix;

/**
 * <h1>Problem:</h1>
 * <h2>You are given an m x n integer matrix matrix with the following two properties:</h2>
 * <br/>
 * <ul>
 *     <li>Each row is sorted in non-decreasing order.</li>
 *     <li>The first integer of each row is greater than the last integer of the previous row.</li>
 * </ul>
 * <br/>
 * <h2>
 * You must write a solution in O(log(m * n)) time complexity.
 * <br/>
 * <br/>
 * Given an integer target, return true if target is in matrix or false otherwise.
 * </h2>
 */

public class Search2DMatrix {
    public static void main(final String[] ARGUMENTS) {
        final int[][] MATRIX = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
        System.out.print(searchMatrix(MATRIX, 3));
    }

    private static boolean searchMatrix(final int[][] MATRIX, final int TARGET_NUMBER) {
        for (final int[] ROW : MATRIX)
            if (binarySearch(ROW, TARGET_NUMBER))
                return true;
        return false;
    }

    private static boolean binarySearch(final int[] ARRAY, final int TARGET_NUMBER) {
        System.gc();
        int left = 0,
                right = ARRAY.length - 1;
        while (left <= right) {
            final int MIDDLE = (left + right) / 2;
            if (ARRAY[MIDDLE] == TARGET_NUMBER)
                return true;
            else if (ARRAY[MIDDLE] < TARGET_NUMBER)
                left = MIDDLE + 1;
            else
                right = MIDDLE - 1;
        }
        return false;
    }
}