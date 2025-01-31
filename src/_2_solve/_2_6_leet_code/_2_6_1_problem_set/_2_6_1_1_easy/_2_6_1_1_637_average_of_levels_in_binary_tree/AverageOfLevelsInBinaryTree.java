package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_637_average_of_levels_in_binary_tree;

import java.util.List;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.Queue;

/**
 * <h1>Problem:</h1>
 * <h2>Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted.</h2>
 */

public class AverageOfLevelsInBinaryTree {
    public static void main(final String[] ARGUMENTS) {
        final TreeNode ROOT = new TreeNode(3);
        ROOT.left = new TreeNode(9);
        ROOT.right = new TreeNode(20);
        ROOT.right.left = new TreeNode(15);
        ROOT.right.right = new TreeNode(7);
        System.out.print(averageOfLevels(ROOT));
    }

    private static List<Double> averageOfLevels(final TreeNode ROOT) {
        return new AbstractList<>() {
            final List<Double> AVERAGES = new ArrayList<>();
            final Queue<TreeNode> NODES_AT_CURRENT_LEVEL = new ArrayDeque<>();

            @Override
            public Double get(final int INDEX) {
                init();
                return AVERAGES.get(INDEX);
            }

            @Override
            public int size() {
                init();
                return AVERAGES.size();
            }

            private void init() {
                if (!AVERAGES.isEmpty()) return;
                NODES_AT_CURRENT_LEVEL.offer(ROOT);
                traversalLevel();
            }

            private void traversalLevel() {
                while (!NODES_AT_CURRENT_LEVEL.isEmpty()) {
                    final int LEVEL_SIZE = NODES_AT_CURRENT_LEVEL.size();
                    double levelSum = 0.0D;
                    for (int index = 0; index < LEVEL_SIZE; index++) {
                        final TreeNode CURRENT_NODE = NODES_AT_CURRENT_LEVEL.poll();
                        assert CURRENT_NODE != null;
                        levelSum += CURRENT_NODE.val;
                        if (CURRENT_NODE.left != null)
                            NODES_AT_CURRENT_LEVEL.offer(CURRENT_NODE.left);
                        if (CURRENT_NODE.right != null)
                            NODES_AT_CURRENT_LEVEL.offer(CURRENT_NODE.right);
                    }
                    AVERAGES.add(levelSum / LEVEL_SIZE);
                }
            }
        };
    }

// >
    /*private static List<Double> averageOfLevels(final TreeNode ROOT) {
        if (ROOT == null)
            return new ArrayList<>();
        else {
            final List<Double> AVERAGES = new ArrayList<>();
            final Queue<TreeNode> NODES = new LinkedList<>();
            NODES.add(ROOT);
            while (!NODES.isEmpty()) {
                final int LEVEL_SIZE = NODES.size();
                double sumOfValues = 0;
                for (int index = 0; index < LEVEL_SIZE; index++) {
                    final TreeNode CURRENT_NODE = NODES.poll();
                    sumOfValues += CURRENT_NODE.val;
                    if (CURRENT_NODE.left != null)
                        NODES.add(CURRENT_NODE.left);
                    if (CURRENT_NODE.right != null)
                        NODES.add(CURRENT_NODE.right);
                }
                AVERAGES.add(sumOfValues / LEVEL_SIZE);
            }
            return AVERAGES;
        }
    }*/

// >
    /*private static List<Double> averageOfLevels(final TreeNode ROOT) {
        final List<List<Integer>> NODE_VALUES_PER_LEVEL = new ArrayList<>();
        collectValuesPerLevel(
                ROOT,
                NODE_VALUES_PER_LEVEL,
                0
        );
        return NODE_VALUES_PER_LEVEL.stream()
                .map(levelValues -> levelValues.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0))
                .collect(Collectors.toList());
    }

    private static void collectValuesPerLevel(final TreeNode CURRENT_NODE, final List<List<Integer>> NODE_VALUES_PER_LEVEL, final int CURRENT_DEPTH) {
        if (CURRENT_NODE != null) {
            if (NODE_VALUES_PER_LEVEL.size() == CURRENT_DEPTH)
                NODE_VALUES_PER_LEVEL.add(new ArrayList<>());
            NODE_VALUES_PER_LEVEL.get(CURRENT_DEPTH)
                    .add(CURRENT_NODE.val);
            collectValuesPerLevel(
                    CURRENT_NODE.left,
                    NODE_VALUES_PER_LEVEL,
                    CURRENT_DEPTH + 1
            );
            collectValuesPerLevel(
                    CURRENT_NODE.right,
                    NODE_VALUES_PER_LEVEL,
                    CURRENT_DEPTH + 1
            );
        }
    }*/
}