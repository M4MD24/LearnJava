package _2_problem_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_20;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to convert an array to an ArrayList.</h2>
 */

public class Question20 {
    public static void main(final String[] ARGS) {
        final Integer[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        final ArrayList<Integer> NUMBERS_AS_ARRAYLIST = new ArrayList<>(Arrays.asList(NUMBERS));
    }
}