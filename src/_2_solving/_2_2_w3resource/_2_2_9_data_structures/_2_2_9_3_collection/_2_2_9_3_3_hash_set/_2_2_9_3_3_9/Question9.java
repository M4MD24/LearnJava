package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_3_hash_set._2_2_9_3_3_9;

import java.util.HashSet;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find numbers less than 7 in a hash set.</h2>
 */

public class Question9 {
    private static final HashSet<Integer> NUMBERS = new HashSet<>();

    public static void main(final String[] PARAMETERS) {
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