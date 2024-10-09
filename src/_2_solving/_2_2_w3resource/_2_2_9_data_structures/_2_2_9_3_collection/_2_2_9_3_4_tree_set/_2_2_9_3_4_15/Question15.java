package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_4_tree_set._2_2_9_3_4_15;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to retrieve and remove the last element of a tree set.</h2>
 */

public class Question15 {
    private static final TreeSet<Integer> NUMBERS = new TreeSet<>();

    public static void main(final String[] PARAMETERS) {
        addNumbers();
        System.out.println("Before Remove: " + NUMBERS);
        System.out.println("First Number: " + NUMBERS.pollLast());
        System.out.print("After Remove: " + NUMBERS);
    }

    private static void addNumbers() {
        NUMBERS.add(1);
        NUMBERS.add(54);
        NUMBERS.add(23);
        NUMBERS.add(6);
        NUMBERS.add(100);
    }
}