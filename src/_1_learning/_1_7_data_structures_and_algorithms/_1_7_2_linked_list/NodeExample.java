package _1_learning._1_7_data_structures_and_algorithms._1_7_2_linked_list;

class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
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

class LinkedList {
    private Node head,
            tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    public void insert(int data, int position) {
        Node newNode = new Node(data);

        if (position == 0) {
            newNode.setNext(head);
            head = newNode;
        } else {
            Node current = head;
            Node previous = null;

            for (int i = 0; i < position; i++) {
                previous = current;
                current = current.getNext();
            }

            newNode.setNext(current);
            previous.setNext(newNode);
        }
    }

    public void delete(int position) {
        if (position == 0) {
            head = head.getNext();
        } else {
            Node current = head;
            Node previous = null;

            for (int i = 0; i < position; i++) {
                previous = current;
                current = current.getNext();
            }

            assert previous != null;
            previous.setNext(current.getNext());
        }
    }

    public void print() {
        Node current = head;

        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
            if (current != null) System.out.print(" ");
        }

        System.out.println();
    }
}

public class NodeExample {
    private static final LinkedList list = new LinkedList();

    public static void main(String[] args) {
        addElements();
        list.print();

        list.insert(5, 2);
        list.print();

        list.delete(3);
        list.print();
    }

    private static void addElements() {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }
}