package _1_learning._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_1_adjacency_matrix;

import java.util.ArrayList;

public class Graph {
    public final int[][] MATRIX_ARRAY;
    public final ArrayList<Node> NODES;

    public Graph(int size) {
        this.MATRIX_ARRAY = new int[size][size];
        this.NODES = new ArrayList<>();
    }

    public void addNode(char data) {
        NODES.add(new Node(data));
    }

    public char getNode(int index) {
        return NODES.get(index).data;
    }

    public void addEdge(int source, int destination) {
        if (source != destination) MATRIX_ARRAY[source][destination] = 1;
    }

    public boolean checkEdge(int source, int destination) {
        return (MATRIX_ARRAY[source][destination] == 1);
    }

    public void showAll() {
        for (int index = 0; index < NODES.size(); index++) {
            System.out.print(NODES.get(index).data);
            if (index != NODES.size() - 1) System.out.print(" ");
        }
    }

    public void showTruthEdgesTable() {
        System.out.println("            Destination");
        System.out.println("            |");
        System.out.println("            V");
        System.out.print("            ");
        showAll();
        System.out.println();
        for (int index = 0; index < MATRIX_ARRAY.length; index++) {
            if (index == 0) System.out.print("Source -> ");
            else System.out.print("       -> ");
            System.out.print(NODES.get(index).data + " ");
            for (int index2 = 0; index2 < MATRIX_ARRAY[index].length; index2++) {
                System.out.print(MATRIX_ARRAY[index][index2]);
                if (index2 != MATRIX_ARRAY[index].length - 1) System.out.print(" ");
                else System.out.println();
            }
        }
    }

    public void showDrawing() {
        final String EDGE = " -> ",
                DELETE_4_CHARACTERS = "\b\b\b\b";
        for (int index = 0; index < MATRIX_ARRAY.length; index++) {
            System.out.print(NODES.get(index).data);
            System.out.print(EDGE);
            for (int index2 = 0; index2 < MATRIX_ARRAY[index].length; index2++) {
                if (checkEdge(index, index2)) {
                    System.out.print(NODES.get(index2).data);
                    System.out.print(EDGE);
                }
            }
            System.out.println(DELETE_4_CHARACTERS);
        }
    }
}