package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_145;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to remove the nth element from the end of a given list.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original node:
 * <br/>
 * 1 2 3 4 5
 * <br/>
 * After removing 2nd element from end:
 * <br/>
 * 1 2 3 5
 * </h2>
 */

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void add(int data) {
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head == null) head = node;
        else {
            Node anotherNode = head;
            while (anotherNode.next != null) anotherNode = anotherNode.next;
            anotherNode.next = node;
        }
    }

    public void showAll() {
        Node node = head;
        if (node != null) {
            while (node.next != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.print(node.data);
        }
    }

    public void remove2ndFromTheEnd() {
        Node node = head,
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

public class Question145 {
    private static final LinkedList LINKED_LIST = new LinkedList();

    public static void main(final String[] ARGS) {
        addition();
        displayOriginalNodes();
        LINKED_LIST.remove2ndFromTheEnd();
        afterRemoving2ndElementFromEnd();
    }

    private static void addition() {
        LINKED_LIST.add(1);
        LINKED_LIST.add(2);
        LINKED_LIST.add(3);
        LINKED_LIST.add(4);
        LINKED_LIST.add(5);
    }

    private static void displayOriginalNodes() {
        System.out.println("Original Node:");
        displayAll();
    }

    private static void afterRemoving2ndElementFromEnd() {
        System.out.println("After removing 2nd element from end:");
        LINKED_LIST.showAll();
    }

    private static void displayAll() {
        LINKED_LIST.showAll();
        System.out.println();
    }
}