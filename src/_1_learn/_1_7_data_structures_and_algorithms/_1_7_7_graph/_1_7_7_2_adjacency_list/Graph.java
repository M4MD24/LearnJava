package _1_learn._1_7_data_structures_and_algorithms._1_7_7_graph._1_7_7_2_adjacency_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    private static final ArrayList<LinkedList<Node>> linkedListArrayList = new ArrayList<>();

    public void addNode(char data) {
        LinkedList<Node> currentLinkedlist = new LinkedList<>();
        currentLinkedlist.add(new Node(data));
        linkedListArrayList.add(currentLinkedlist);
    }

    public void addEdge(int source, int destination) {
        if (source != destination) {
            Node destinationNode = linkedListArrayList.get(destination).getFirst();
            linkedListArrayList.get(source).add(destinationNode);
        }
    }

    public boolean checkEdge(int source, int destination) {
        Node destinationNode = linkedListArrayList.get(destination).getFirst();
        for (Node nodeLinkedList : linkedListArrayList.get(source))
            if (nodeLinkedList == destinationNode) return true;
        return false;
    }

    public void showAll() {
        for (int index = 0; index < linkedListArrayList.size(); index++) {
            System.out.print(linkedListArrayList.get(index).getFirst().data);
            if (index != linkedListArrayList.size() - 1) System.out.print(", ");
        }
    }

    public void showDrawing() {
        for (LinkedList<Node> nodeLinkedList : linkedListArrayList) {
            for (Node node : nodeLinkedList) System.out.print(node.data + " -> ");
            System.out.println("\b\b\b\b");
        }
    }
}