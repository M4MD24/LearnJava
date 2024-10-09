package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_4_tree_set._2_2_9_3_4_11;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the element in a tree set less than or equal to the given element.</h2>
 */

public class Question11 {
    private static final TreeSet<Integer> NUMBERS = new TreeSet<>();

    public static void main(final String[] PARAMETERS) {
        addNumbers();
        System.out.print(NUMBERS.floor(20));
    }

    private static void addNumbers() {
        NUMBERS.add(1);
        NUMBERS.add(54);
        NUMBERS.add(23);
        NUMBERS.add(6);
        NUMBERS.add(100);
    }
}