package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_121;

import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to reverse a linked list.</h2>
 * <h1>Example:</h1>
 * <h2>
 * For linked list 20->40->60->80,
 * <br/>
 * The reversed linked list is 80->60->40->20
 * </h2>
 */

enum SolutionsHeader {
    Solution1,
    Solution2;

    String getSolutionHeader() {
        return switch (this) {
            case Solution1 -> "Solution1:";
            case Solution2 -> "\n\nSolution2:";
        };
    }
}

class Solution1 {
    static Node head;

    static class Node {
        int data;
        Node next_node;

        Node(int value) {
            data = value;
            next_node = null;
        }
    }

    public static void mainMethod() {
        System.out.println(SolutionsHeader.Solution1.getSolutionHeader());

        head = new Node(20);
        head.next_node = new Node(40);
        head.next_node.next_node = new Node(60);
        head.next_node.next_node.next_node = new Node(80);

        System.out.println("Original Linked list:");
        printList(head);

        System.out.println("\nReversed Linked list:");
        head = reverse(head);
        printList(head);
    }

    static Node reverse(Node node) {
        Node prev_node = null,
                current_node = node,
                next_node = null;
        while (current_node != null) {
            next_node = current_node.next_node;
            current_node.next_node = prev_node;
            prev_node = current_node;
            current_node = next_node;
        }
        node = prev_node;
        return node;
    }

    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data);
            node = node.next_node;
            if (node != null) System.out.print(" ");
        }
    }
}

class Solution2 {
    static LinkedList<Integer> elements = new LinkedList<>();

    static void mainMethod() {
        System.out.println(SolutionsHeader.Solution2.getSolutionHeader());
        addData();
        displayOriginalLinkedList();
        System.out.println();
        displayReversedLinkedList();
    }

    private static void addData() {
        elements.offer(20);
        elements.offer(40);
        elements.offer(60);
        elements.offer(80);
    }

    private static void displayOriginalLinkedList() {
        System.out.println("Original Linked list:");
        for (int index = 0; index < elements.size(); index++) {
            System.out.print(elements.get(index));
            if (index == elements.size()) System.out.println();
            else System.out.print(" ");
        }
    }

    private static void displayReversedLinkedList() {
        System.out.println("Reversed Linked list:");
        for (int index = elements.size() - 1; index > -1; index--) {
            System.out.print(elements.get(index));
            if (index != 0) System.out.print(" ");
        }
    }
}

public class Question121 {
    public static void main(final String[] PARAMETERS) {
        Solution1.mainMethod();
        Solution2.mainMethod();
    }
}