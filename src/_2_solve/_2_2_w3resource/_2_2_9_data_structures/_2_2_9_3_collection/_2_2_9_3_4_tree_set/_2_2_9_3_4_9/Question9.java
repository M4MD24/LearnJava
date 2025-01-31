package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_4_tree_set._2_2_9_3_4_9;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find numbers less than 7 in a tree set.</h2>
 */

public class Question9 {
    private static final TreeSet<Integer> NUMBERS = new TreeSet<>();

    public static void main(final String[] ARGUMENTS) {
        addNumbers();
        NUMBERS.stream()
                .filter(number -> number < 7)
                .forEach(System.out::println);
    }

    private static void addNumbers() {
        NUMBERS.add(1);
        NUMBERS.add(54);
        NUMBERS.add(23);
        NUMBERS.add(6);
        NUMBERS.add(100);
    }
}