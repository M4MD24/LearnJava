package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_143_question_143;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to merge the two sorted linked list.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Merge Two Sorted Lists: 1 2 3 7 9 13 40</h2>
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
        if (doSort) sort();
    }

    public void sort() {
        Node node = head;
        int size = countSize(),
                currentData = node.data,
                anotherData;
        if (size > 1 && !isSorted()) {
            for (int round = 0; round < size; round++) {
                for (int indexCurrentData = 0; indexCurrentData < round; indexCurrentData++) {
                    node = node.next;
                    currentData = node.data;
                }
                node = node.next;
                for (int indexAnotherData = round + 1; indexAnotherData < size; indexAnotherData++) {
                    anotherData = node.data;
                    System.out.println(currentData + " | " + anotherData);
                    if (currentData < anotherData) {
                        final int TEMP = currentData;
                        currentData = anotherData;
                        anotherData = TEMP;
                    }
                    node = node.next;
                }
                node = head;
                System.out.println("done");
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

    public static void main(String[] args) {
        addition();
        LINKED_LIST_1.merge(LINKED_LIST_2, false);
        LINKED_LIST_1.sort();
        LINKED_LIST_1.showAll();
    }

    private static void addition() {
        LINKED_LIST_1.add(6);
        LINKED_LIST_1.add(2);
        LINKED_LIST_1.add(4);

        LINKED_LIST_2.add(3);
        LINKED_LIST_2.add(1);
        LINKED_LIST_2.add(5);
    }
}