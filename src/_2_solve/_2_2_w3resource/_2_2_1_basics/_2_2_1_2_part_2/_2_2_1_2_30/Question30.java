package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_30;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to swap two adjacent nodes in a linked list.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Linked list:
 * <br/>
 * 10->20->30->40->50
 * <br/>
 * <br/>
 * After swiping Linked list becomes:
 * <br/>
 * 20->10->40->30->50
 * </h2>
 */

public class Question30 {
    private static final LinkedList<Integer> NODES = new LinkedList<>();

    public static void main(final String[] ARGUMENTS) {
        inputValues();
        NODES.showAll();
        System.out.println();
        System.out.print("After deleting the fourth node, Linked list becomes:");
        System.out.println();
        NODES.swapEveryTwoAdjacent();
        NODES.showAll();
    }

    private static void inputValues() {
        NODES.insertLast(10);
        NODES.insertLast(20);
        NODES.insertLast(30);
        NODES.insertLast(40);
        NODES.insertLast(50);
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

    public void swapEveryTwoAdjacent() {
        Node<Type> firstNode = head,
                secondNode;
        while (firstNode != null && firstNode.next != null) {
            secondNode = firstNode.next;
            final Type TEMPORARY_NODE_DATA = firstNode.data;
            firstNode.data = secondNode.data;
            secondNode.data = TEMPORARY_NODE_DATA;
            firstNode = secondNode.next;
        }
    }
}