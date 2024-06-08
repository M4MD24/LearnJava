package _1_learning._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_3_strongly_connected_components;

import java.util.LinkedList;
import java.util.Stack;

class StronglyConnectedComponents {
    private final int NUMBER_VERTICES;
    private final LinkedList<Integer>[] ADJACENCY_LIST;

    StronglyConnectedComponents(final int NUMBER_VERTICES) {
        this.NUMBER_VERTICES = NUMBER_VERTICES;
        ADJACENCY_LIST = new LinkedList[NUMBER_VERTICES];
        for (int index = 0; index < NUMBER_VERTICES; ++index)
            ADJACENCY_LIST[index] = new LinkedList<>();
    }

    void addEdge(final int SOURCE, final int DESTINATION) {
        ADJACENCY_LIST[SOURCE].add(DESTINATION);
    }

    void DFSUtil(final int SOURCE, final boolean[] VISITED) {
        VISITED[SOURCE] = true;
        System.out.print(SOURCE + " ");
        for (final int ADJACENCY_VERTEX : ADJACENCY_LIST[SOURCE])
            if (!VISITED[ADJACENCY_VERTEX])
                DFSUtil(ADJACENCY_VERTEX, VISITED);
    }

    StronglyConnectedComponents getTranspose() {
        final StronglyConnectedComponents TRANSPOSED_GRAPH = new StronglyConnectedComponents(NUMBER_VERTICES);
        for (int source = 0; source < NUMBER_VERTICES; source++)
            for (final int ADJACENCY_VERTEX : ADJACENCY_LIST[source])
                TRANSPOSED_GRAPH.ADJACENCY_LIST[ADJACENCY_VERTEX].add(source);
        return TRANSPOSED_GRAPH;
    }

    void fillOrder(final int SOURCE, final boolean[] VISITED, final Stack<Integer> STACK) {
        VISITED[SOURCE] = true;
        for (final int NEIGHBOR : ADJACENCY_LIST[SOURCE])
            if (!VISITED[NEIGHBOR])
                fillOrder(NEIGHBOR, VISITED, STACK);
        STACK.push(SOURCE);
    }

    void printSCC() {
        final Stack<Integer> STACK = new Stack<>();
        final boolean[] VISITED = new boolean[NUMBER_VERTICES];
        for (int index = 0; index < NUMBER_VERTICES; index++)
            VISITED[index] = false;
        for (int index = 0; index < NUMBER_VERTICES; index++)
            if (!VISITED[index])
                fillOrder(index, VISITED, STACK);
        final StronglyConnectedComponents TRANSPOSED_GRAPH = getTranspose();
        for (int index = 0; index < NUMBER_VERTICES; index++)
            VISITED[index] = false;
        while (!STACK.empty()) {
            final int VERTEX = STACK.pop();
            if (!VISITED[VERTEX]) {
                TRANSPOSED_GRAPH.DFSUtil(VERTEX, VISITED);
                System.out.println();
            }
        }
    }
}