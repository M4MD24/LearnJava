package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_108_convert_sorted_array_to_binary_search_tree;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.</h2>
 */

public class ConvertSortedArrayToBinarySearchTree {
    public static void main(final String[] PARAMETERS) {
        System.out.print(sortedArrayToBST(new int[]{-10, -3, 0, 5, 9}));
    }

    private static TreeNode sortedArrayToBST(final int[] NUMBERS) {
        if (NUMBERS.length == 0) return null;
        else {
            System.gc();
            return createBST(
                    NUMBERS,
                    0,
                    NUMBERS.length - 1
            );
        }
    }

    private static TreeNode createBST(final int[] NUMBERS, final int START, final int END) {
        if (START > END)
            return null;
        else {
            final int MIDDLE = (START + END) / 2;
            return new TreeNode(
                    NUMBERS[MIDDLE],
                    createBST(
                            NUMBERS,
                            START,
                            MIDDLE - 1
                    ),
                    createBST(
                            NUMBERS,
                            MIDDLE + 1,
                            END
                    )
            );
        }
    }
}