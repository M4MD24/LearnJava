package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_143;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to merge the two sorted linked list.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Linked list 1: 7 1 13 9 3
 * <br/>
 * Linked list 2: 50 30 2 40
 * <br/>
 * After merge two Linked lists: 1 2 3 7 9 13 30 40 50
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

    public void merge(LinkedList LinkedList2, boolean doSort) {
        Node node = head;
        if (node != null) {
            while (node.next != null) node = node.next;
            node.next = LinkedList2.head;
        }
        if (doSort) bubbleSort();
    }

    public void bubbleSort() {
        final int size = countSize();
        if (size > 1 && !isSorted()) {
            for (int round = 0; round < size - 1; round++) {
                Node current = head;
                for (int index = 0; index < size - round - 1; index++) {
                    Node next = current.next;
                    if (current.data > next.data) {
                        int temp = current.data;
                        current.data = next.data;
                        next.data = temp;
                    }
                    current = current.next;
                }
            }
        }
    }

    public boolean isSorted() {
        Node node = head;
        int size = countSize();
        if (node.next != null) {
            for (int index = 0; index < size; index++) {
                int data1 = node.data,
                        data2 = node.next.data;
                if (data1 < data2) node = node.next;
                else return false;
            }
        }
        return true;
    }

    public int countSize() {
        Node node = head;
        int maxSize = 1;
        if (node != null) {
            while (node.next != null) {
                node = node.next;
                maxSize++;
            }
        } else maxSize = 0;
        return maxSize;
    }

    public void showAll() {
        Node node = head;
        if (node != null) {
            while (node.next != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
            System.out.print(node.data + " ");
        }
    }
}

public class Question143 {
    private static final LinkedList LINKED_LIST_1 = new LinkedList(),
            LINKED_LIST_2 = new LinkedList();

    public static void main(final String[] ARGS) {
        addition();
        showLinkedList1();
        showLinkedList2();
        showAfterMergeAndSort();
    }

    private static void addition() {
        LINKED_LIST_1.add(7);
        LINKED_LIST_1.add(1);
        LINKED_LIST_1.add(13);
        LINKED_LIST_1.add(9);
        LINKED_LIST_1.add(3);

        LINKED_LIST_2.add(50);
        LINKED_LIST_2.add(30);
        LINKED_LIST_2.add(2);
        LINKED_LIST_2.add(40);
    }

    private static void showLinkedList1() {
        System.out.print("Linked list 1: ");
        LINKED_LIST_1.showAll();
        System.out.println();
    }

    private static void showLinkedList2() {
        System.out.print("Linked list 2: ");
        LINKED_LIST_2.showAll();
        System.out.println();
    }

    private static void showAfterMergeAndSort() {
        System.out.print("After merge and sort: ");
        LINKED_LIST_1.merge(LINKED_LIST_2, true);
        LINKED_LIST_1.showAll();
    }
}