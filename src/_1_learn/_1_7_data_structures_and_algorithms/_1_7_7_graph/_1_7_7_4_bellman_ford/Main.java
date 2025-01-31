package _1_learn._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_4_bellman_ford;

public class Main {
    private static final BellmanFord ELEMENTS = new BellmanFord(5, 8);

    public static void main(final String[] ARGUMENTS) {
        addEdges();
        ELEMENTS.showAllElements();
    }

    private static void addEdges() {
        ELEMENTS.addEdge(0, 1, -1);
        ELEMENTS.addEdge(0, 2, 4);
        ELEMENTS.addEdge(1, 2, 3);
        ELEMENTS.addEdge(1, 3, 2);
        ELEMENTS.addEdge(1, 4, 2);
        ELEMENTS.addEdge(3, 2, 5);
        ELEMENTS.addEdge(3, 1, 1);
        ELEMENTS.addEdge(4, 3, -3);
    }
}