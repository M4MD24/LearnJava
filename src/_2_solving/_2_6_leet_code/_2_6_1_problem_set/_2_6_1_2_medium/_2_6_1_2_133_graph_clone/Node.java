package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_133_graph_clone;

import java.util.ArrayList;
import java.util.List;

public class Node {
    int val;
    List<Node> neighbors;

    Node() {
        val = 0;
        neighbors = new ArrayList<>();
    }

    Node(final int VALUE) {
        val = VALUE;
        neighbors = new ArrayList<>();
    }

    Node(final int VALUE, final ArrayList<Node> NEIGHBORS) {
        val = VALUE;
        this.neighbors = NEIGHBORS;
    }
}