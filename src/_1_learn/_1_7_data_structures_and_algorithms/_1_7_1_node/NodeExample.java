package _1_learn._1_7_data_structures_and_algorithms._1_7_1_node;

class Node {
    private int data;
    private Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class NodeExample {
    public static void main(final String[] PARAMETERS) {
        Node a = new Node(1, null);
        Node b = new Node(2, a);
        Node c = new Node(3, b);
        Node d = new Node(4, c);
        Node e = new Node(5, d);

        System.out.println("e = " + e.getData());
        System.out.println("d = " + e.getNext().getData());
        System.out.println("c = " + e.getNext().getNext().getData());
        System.out.println("b = " + e.getNext().getNext().getNext().getData());
        System.out.println("a = " + e.getNext().getNext().getNext().getNext().getData());
    }
}