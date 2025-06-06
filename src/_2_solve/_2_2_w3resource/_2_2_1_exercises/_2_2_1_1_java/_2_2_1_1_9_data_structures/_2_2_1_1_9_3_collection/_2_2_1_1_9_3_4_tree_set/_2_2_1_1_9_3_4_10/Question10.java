package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_4_tree_set._2_2_1_1_9_3_4_10;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the element in a tree set which is greater than or equal to the given element.</h2>
 */

public class Question10 {
    private static final TreeSet<Integer> NUMBERS = new TreeSet<>();

    public static void main(final String[] ARGUMENTS) {
        addNumbers();
        System.out.print(NUMBERS.ceiling(20));
    }

    private static void addNumbers() {
        NUMBERS.add(1);
        NUMBERS.add(54);
        NUMBERS.add(23);
        NUMBERS.add(6);
        NUMBERS.add(100);
    }
}