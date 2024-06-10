package _2_problem_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_2_streams._2_2_7_2_5;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count the number of strings in a list that start with a specific letter using streams.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGS) {
        final List<String> TEXTS = Arrays.asList("Cat", "Apple", "Bear", "Deer", "Banana");
        final long COUNT_OF_START_WITH_SPECIFIC_LETTER = TEXTS.stream()
                .filter(TEXT -> TEXT
                        .toUpperCase()
                        .startsWith(String.valueOf(Character.toUpperCase('B'))))
                .count();
        System.out.print(COUNT_OF_START_WITH_SPECIFIC_LETTER);
    }
}