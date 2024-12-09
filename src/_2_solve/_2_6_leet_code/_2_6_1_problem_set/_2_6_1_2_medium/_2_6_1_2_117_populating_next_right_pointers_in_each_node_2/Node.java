package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_117_populating_next_right_pointers_in_each_node_2;

class Node {
    int val;
    Node left,
            right,
            next;

    Node() {
    }

    Node(final int VALUE) {
        val = VALUE;
    }

    Node(final int VALUE, final Node LEFT, final Node RIGHT, final Node NEXT) {
        val = VALUE;
        left = LEFT;
        right = RIGHT;
        next = NEXT;
    }
};