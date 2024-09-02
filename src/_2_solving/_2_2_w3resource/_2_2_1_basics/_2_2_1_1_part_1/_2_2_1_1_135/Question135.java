package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_135;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to remove duplicates from a sorted linked list.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original List with duplicate elements:
 * <br/>
 * 12->12->13->14->15->15->16->17->17
 * <br/>
 * After removing duplicates from the said list:
 * <br/>
 * 12->13->14->15->16->17
 * </h2>
 */

class Node {
    int data;
    Node next;
}

class LinkedList {
    Node head;

    public void insertLast(int data) {
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
                System.out.print(node.data + "->");
                node = node.next;
            }
            System.out.print(node.data);
        } else System.out.print("Nothing to show");
    }

    public boolean checkLinkedListIsSorted() {
        Node currentNode = head;
        while (currentNode.next != null) {
            Node node1 = currentNode,
                    node2 = currentNode.next;
            if (node1.data <= node2.data) currentNode = currentNode.next;
            else return false;
        }
        return true;
    }

    public void removeDuplicatesFromSortedLinkedList() {
        if (checkLinkedListIsSorted()) {
            Node currentNode = head;
            while (currentNode != null && currentNode.next != null) {
                int node1 = currentNode.data,
                        node2 = currentNode.next.data;
                if (node1 == node2) currentNode.next = currentNode.next.next;
                else currentNode = currentNode.next;
            }
        } else System.out.println("LinkedList not sorted");
    }
}

public class Question135 {
    private static final LinkedList LINKED_LIST = new LinkedList();

    public static void main(final String[] ARGS) {
        insertion();
        System.out.println("Original List with duplicate elements:");
        LINKED_LIST.showAll();
        System.out.println();
        LINKED_LIST.removeDuplicatesFromSortedLinkedList();
        System.out.println("After removing duplicates from the said list:");
        LINKED_LIST.showAll();
    }

    private static void insertion() {
        LINKED_LIST.insertLast(12);
        LINKED_LIST.insertLast(12);
        LINKED_LIST.insertLast(13);
        LINKED_LIST.insertLast(14);
        LINKED_LIST.insertLast(15);
        LINKED_LIST.insertLast(15);
        LINKED_LIST.insertLast(16);
        LINKED_LIST.insertLast(17);
        LINKED_LIST.insertLast(17);
    }
}