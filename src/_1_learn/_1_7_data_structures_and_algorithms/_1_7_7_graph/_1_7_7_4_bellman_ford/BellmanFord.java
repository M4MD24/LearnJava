package _1_learn._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_4_bellman_ford;

class BellmanFord {
    private final int VERTICES,
            EDGE;
    private final Edge[] EDGES;

    BellmanFord(final int VERTICES, final int EDGE) {
        this.VERTICES = VERTICES;
        this.EDGE = EDGE;
        EDGES = new Edge[EDGE];
        for (int index = 0; index < EDGE; index++)
            EDGES[index] = new Edge();
    }

    void addEdge(final int SOURCE, final int DESTINATION, final int WEIGHT) {
        for (int index = 0; index < EDGE; index++)
            if (EDGES[index].source == 0 &&
                    EDGES[index].destination == 0 &&
                    EDGES[index].weight == 0) {
                EDGES[index].source = SOURCE;
                EDGES[index].destination = DESTINATION;
                EDGES[index].weight = WEIGHT;
                break;
            }
    }

    void showAllElements() {
        final int[] DISTANCES = new int[VERTICES];
        for (int index = 0; index < VERTICES; index++)
            DISTANCES[index] = Integer.MAX_VALUE;
        DISTANCES[0] = 0;

        for (int round = 0; round < VERTICES - 1; round++)
            for (int index = 0; index < EDGE; index++) {
                final int SOURCE = EDGES[index].source,
                        DESTINATION = EDGES[index].destination,
                        WEIGHT = EDGES[index].weight;
                if (DISTANCES[SOURCE] != Integer.MAX_VALUE && DISTANCES[SOURCE] + WEIGHT < DISTANCES[DESTINATION])
                    DISTANCES[DESTINATION] = DISTANCES[SOURCE] + WEIGHT;
            }

        for (int index = 0; index < EDGE; index++) {
            final int SOURCE = EDGES[index].source,
                    DESTINATION = EDGES[index].destination,
                    WEIGHT = EDGES[index].weight;
            if (DISTANCES[SOURCE] != Integer.MAX_VALUE && DISTANCES[SOURCE] + WEIGHT < DISTANCES[DESTINATION]) {
                System.out.println("Graph contains negative weight cycle");
                return;
            }
        }

        System.out.println("Vertex Distance from Source:");
        for (int index = 0; index < VERTICES; index++)
            System.out.println(index + "\t\t" + DISTANCES[index]);
    }
}