package _1_learning._1_6_algorithms._1_6_1_searching._1_6_1_4_depth_first_search;

import _1_learning._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_1_adjacency_matrix.Graph;

/**
 * <h1>Note:</h1>
 * <h2>This algorithm is designed for graph searching, specifically using an adjacency matrix (1.7.7.1).</h2>
 *
 * @see _1_learning._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_1_adjacency_matrix
 */

class AnotherGraph extends Graph {
    public AnotherGraph(int size) {
        super(size);
    }

    public void depthFirstSearch(int source) {
        boolean[] visited = new boolean[MATRIX_ARRAY.length];
        depthFirstSearchHelper(source, visited);
    }

    private void depthFirstSearchHelper(int source, boolean[] visited) {
        if (visited[source]) return;
        else {
            visited[source] = true;
            System.out.println(getNode(source) + ": visited");
        }
        for (int index = 0; index < MATRIX_ARRAY[source].length; index++)
            if (MATRIX_ARRAY[source][index] == 1) depthFirstSearchHelper(index, visited);
    }
}

public class DepthFirstSearchExample {
    private static final AnotherGraph ANOTHER_GRAPH = new AnotherGraph(5);

    public static void main(String[] args) {
        initializeLast();
        depthFirstSearchTest();
    }

    private static void depthFirstSearchTest() {
        System.out.println("\n■ Depth First Search: ");
        ANOTHER_GRAPH.depthFirstSearch(1);
    }

    private static void initializeLast() {
        addNodeTest();
        addEdgeTest();
        displayAll();
        checkEdgesTest();
        getTest();
        showDrawingTest();
    }

    protected static void showDrawingTest() {
        System.out.println("\n■ SHow Drawing:");
        ANOTHER_GRAPH.showDrawing();
    }

    protected static void checkEdgesTest() {
        int source = 1,
                destination = 2;
        System.out.println();
        System.out.print("■ Check Edges" + " (" + ANOTHER_GRAPH.getNode(source) + " - " + ANOTHER_GRAPH.getNode(destination) + "): " + ANOTHER_GRAPH.checkEdge(source, destination));
    }

    protected static void displayAll() {
        System.out.print("■ Elements: ");
        ANOTHER_GRAPH.showAll();
        System.out.println();
        System.out.println();
        System.out.println("■ Truth Edges Table:");
        ANOTHER_GRAPH.showTruthEdgesTable();
    }

    protected static void addEdgeTest() {
        ANOTHER_GRAPH.addEdge(0, 1);
        ANOTHER_GRAPH.addEdge(1, 2);
        ANOTHER_GRAPH.addEdge(1, 4);
        ANOTHER_GRAPH.addEdge(2, 3);
        ANOTHER_GRAPH.addEdge(2, 4);
        ANOTHER_GRAPH.addEdge(4, 0);
        ANOTHER_GRAPH.addEdge(4, 2);
    }

    protected static void addNodeTest() {
        ANOTHER_GRAPH.addNode('A');
        ANOTHER_GRAPH.addNode('B');
        ANOTHER_GRAPH.addNode('C');
        ANOTHER_GRAPH.addNode('D');
        ANOTHER_GRAPH.addNode('E');
    }

    protected static void getTest() {
        System.out.println("\n\n■ Get Elements: ");
        System.out.println(ANOTHER_GRAPH.getNode(0));
        System.out.println(ANOTHER_GRAPH.getNode(1));
        System.out.println(ANOTHER_GRAPH.getNode(2));
    }
}