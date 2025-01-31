package _1_learn._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_3_strongly_connected_components;

public class Main {
    private static final StronglyConnectedComponents ELEMENTS = new StronglyConnectedComponents(8);

    public static void main(final String[] ARGUMENTS) {
        addElements();
        ELEMENTS.printSCC();
    }

    private static void addElements() {
        ELEMENTS.addEdge(0, 1);
        ELEMENTS.addEdge(1, 2);
        ELEMENTS.addEdge(2, 3);
        ELEMENTS.addEdge(2, 4);
        ELEMENTS.addEdge(3, 0);
        ELEMENTS.addEdge(4, 5);
        ELEMENTS.addEdge(5, 6);
        ELEMENTS.addEdge(6, 4);
        ELEMENTS.addEdge(6, 7);
    }
}