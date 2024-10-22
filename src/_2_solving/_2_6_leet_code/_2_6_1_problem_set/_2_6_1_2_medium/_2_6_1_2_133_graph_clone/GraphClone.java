package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_133_graph_clone;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a reference of a node in a connected undirected graph.
 * <br/>
 * <br/>
 * Return a deep copy (clone) of the graph.
 * <br/>
 * <br/>
 * Each node in the graph contains a value (int) and a list (List[Node]) of its neighbors.
 * <br/>
 * <br/>
 * For simplicity, each node's value is the same as the node's index (1-indexed). For example, the first node with val == 1, the second node with val == 2, and so on. The graph is represented in the test case using an adjacency list.
 * <br/>
 * <br/>
 * An adjacency list is a collection of unordered lists used to represent a finite graph. Each list describes the set of neighbors of a node in the graph.
 * <br/>
 * <br/>
 * The given node will always be the first node with val = 1. You must return the copy of the given node as a reference to the cloned graph.
 * </h2>
 */

public class GraphClone {
    public static void main(final String[] PARAMETERS) {
        final Node FIRST_NODE = new Node(1),
                SECOND_NODE = new Node(2),
                THIRD_NODE = new Node(3),
                FOURTH_NODE = new Node(4);
        FIRST_NODE.neighbors.add(SECOND_NODE);
        FIRST_NODE.neighbors.add(FOURTH_NODE);
        SECOND_NODE.neighbors.add(FIRST_NODE);
        SECOND_NODE.neighbors.add(THIRD_NODE);
        THIRD_NODE.neighbors.add(SECOND_NODE);
        THIRD_NODE.neighbors.add(FOURTH_NODE);
        FOURTH_NODE.neighbors.add(FIRST_NODE);
        FOURTH_NODE.neighbors.add(THIRD_NODE);
        System.out.print(cloneGraph(FIRST_NODE));
    }

    private static final Map<Integer, Node> OLD_TO_NEW_NODES = new HashMap<>();

    private static Node cloneGraph(final Node NODE) {
        return NODE == null
                ? null
                : cloneGraphRec(NODE);
    }

    private static Node cloneGraphRec(final Node NODE) {
        Node newNode = OLD_TO_NEW_NODES.get(NODE.val);
        if (newNode == null) {
            newNode = new Node(NODE.val);
            OLD_TO_NEW_NODES.put(NODE.val, newNode);
            final List<Node> NEIGHBORS = NODE.neighbors;
            if (NEIGHBORS != null)
                for (final Node NEIGHBOR : NEIGHBORS)
                    newNode.neighbors.add(cloneGraphRec(NEIGHBOR));
        }
        return newNode;
    }
}