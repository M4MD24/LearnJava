package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_25;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to delete a specified node in the middle of a singly linked list.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 10->20->30->40->50
 * <br/>
 * After deleting the fourth node, Linked list becomes:
 * <br/>
 * 10->20->30->50
 * </h2>
 */

public class Question25 {
    private static final LinkedList<Integer> ORIGINAL_NODES = new LinkedList<>();

    public static void main(final String[] ARGS) {
        inputValues();
        ORIGINAL_NODES.showAll();
        System.out.println();
        System.out.print("After deleting the fourth node, Linked list becomes:");
        System.out.println();
        ORIGINAL_NODES.remove2ndFromTheEnd();
        ORIGINAL_NODES.showAll();
    }

    private static void inputValues() {
        ORIGINAL_NODES.insertLast(10);
        ORIGINAL_NODES.insertLast(20);
        ORIGINAL_NODES.insertLast(30);
        ORIGINAL_NODES.insertLast(40);
        ORIGINAL_NODES.insertLast(50);
    }
}

class Node<Type> {
    Type data;
    Node<Type> next;
}

class LinkedList<Type> {
    Node<Type> head;

    public void insertLast(Type data) {
        Node<Type> node = new Node<>();
        node.data = data;
        node.next = null;
        if (head == null) head = node;
        else {
            Node<Type> anotherNode = head;
            while (anotherNode.next != null) anotherNode = anotherNode.next;
            anotherNode.next = node;
        }
    }

    public void showAll() {
        Node<Type> node = head;
        if (node != null) {
            while (node.next != null) {
                System.out.print(node.data + "->");
                node = node.next;
            }
            System.out.print(node.data);
        } else System.out.print("Nothing to show");
    }

    public void remove2ndFromTheEnd() {
        Node<Type> node = head,
                anotherNode = null;
        if (node.next != null) {
            while (node.next != null) {
                if (node.next.next == null) {
                    anotherNode = node.next;
                    break;
                } else node = node.next;
            }
            assert anotherNode != null;
            node.data = anotherNode.data;
            node.next = null;
        } else head = null;
    }
}