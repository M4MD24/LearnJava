package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_129_sum_root_to_leaf_numbers;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given the root of a binary tree containing digits from 0 to 9 only.
 * <br/>
 * <br/>
 * Each root-to-leaf path in the tree represents a number.
 * <br/>
 * <br/>
 * For example, the root-to-leaf path 1 -> 2 -> 3 represents the number 123.
 * <br/>
 * <br/>
 * Return the total sum of all root-to-leaf numbers. Test cases are generated so that the answer will fit in a 32-bit integer.
 * <br/>
 * <br/>
 * A leaf node is a node with no children.
 * </h2>
 */

public class SumRootToLeafNumbers {
    public static void main(final String[] ARGUMENTS) {
        final TreeNode ROOT = new TreeNode(
                1,
                new TreeNode(2),
                new TreeNode(3)
        );
        System.out.print(sumNumbers(ROOT));
    }

    private static int sumNumbers(final TreeNode ROOT) {
        return sum(ROOT, 0);
    }

    private static int sum(final TreeNode ROOT, final int SUM) {
        return ROOT == null
                ? 0
                : (ROOT.left == null && ROOT.right == null
                ? SUM * 10 + ROOT.val
                : sum(ROOT.left, SUM * 10 + ROOT.val) + sum(ROOT.right, SUM * 10 + ROOT.val));
    }
}