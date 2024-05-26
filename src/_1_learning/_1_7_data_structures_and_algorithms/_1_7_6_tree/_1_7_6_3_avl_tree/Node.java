package _1_learning._1_7_data_structures_and_algorithms._1_7_6_tree._1_7_6_3_avl_tree;

class Node {
    final int VALUE;
    int heightOfDepth;
    Node left,
            right;

    Node(final int VALUE) {
        left = null;
        right = null;
        this.VALUE = VALUE;
        heightOfDepth = 0;
    }
}