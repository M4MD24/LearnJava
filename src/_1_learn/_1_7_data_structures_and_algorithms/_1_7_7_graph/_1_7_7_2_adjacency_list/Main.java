package _1_learn._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_2_adjacency_list;

public class Main {
    private static final Graph GRAPH = new Graph();

    public static void main(final String[] PARAMETERS) {
        addTest();
        addEdgeTest();
        checkEdgesTest();
        displayAll();
    }

    private static void checkEdgesTest() {
        int source = 1,
                destination = 2;
        System.out.println();
        System.out.print("■ Check Edges: " + GRAPH.checkEdge(source, destination));
        System.out.println();
        System.out.println();
    }

    private static void displayAll() {
        System.out.print("■ Elements: ");
        GRAPH.showAll();
        System.out.println();

        GRAPH.showDrawing();
    }

    private static void addEdgeTest() {
        GRAPH.addEdge(0, 0);
        GRAPH.addEdge(1, 2);
        GRAPH.addEdge(1, 4);
        GRAPH.addEdge(2, 3);
        GRAPH.addEdge(2, 4);
        GRAPH.addEdge(4, 0);
        GRAPH.addEdge(4, 2);
    }

    private static void addTest() {
        GRAPH.addNode('A');
        GRAPH.addNode('B');
        GRAPH.addNode('C');
        GRAPH.addNode('D');
        GRAPH.addNode('E');
    }
}