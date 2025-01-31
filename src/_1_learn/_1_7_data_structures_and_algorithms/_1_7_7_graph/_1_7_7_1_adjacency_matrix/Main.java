package _1_learn._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_1_adjacency_matrix;

public class Main {
    private static final Graph GRAPH = new Graph(5);

    public static void main(final String[] ARGUMENTS) {
        addNodeTest();

        addEdgeTest();

        displayAll();

        checkEdgesTest();

        getTest();

        showDrawingTest();
    }

    protected static void showDrawingTest() {
        System.out.println("\n■ SHow Drawing:");
        GRAPH.showDrawing();
    }

    protected static void checkEdgesTest() {
        int source = 1,
                destination = 2;
        System.out.println();
        System.out.print("■ Check Edges" + " (" + GRAPH.getNode(source) + " - " + GRAPH.getNode(destination) + "): " + GRAPH.checkEdge(source, destination));
    }

    protected static void displayAll() {
        System.out.print("■ Elements: ");
        GRAPH.showAll();
        System.out.println();
        System.out.println();
        System.out.println("■ Truth Edges Table:");
        GRAPH.showTruthEdgesTable();
    }

    protected static void addEdgeTest() {
        GRAPH.addEdge(0, 1);
        GRAPH.addEdge(1, 2);
        GRAPH.addEdge(1, 4);
        GRAPH.addEdge(2, 3);
        GRAPH.addEdge(2, 4);
        GRAPH.addEdge(4, 0);
        GRAPH.addEdge(4, 2);
    }

    protected static void addNodeTest() {
        GRAPH.addNode('A');
        GRAPH.addNode('B');
        GRAPH.addNode('C');
        GRAPH.addNode('D');
        GRAPH.addNode('E');
    }

    protected static void getTest() {
        System.out.println("\n\n■ Get Elements: ");
        System.out.println(GRAPH.getNode(0));
        System.out.println(GRAPH.getNode(1));
        System.out.println(GRAPH.getNode(2));
    }
}