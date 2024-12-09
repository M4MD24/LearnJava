package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_21;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert an ArrayList to an array.</h2>
 */

public class Question21 {
    public static void main(final String[] PARAMETERS) {
        final ArrayList<Integer> NUMBERS_AS_ARRAYLIST = new ArrayList<>();
        addNumbers(NUMBERS_AS_ARRAYLIST);
        final Integer[] NUMBERS = NUMBERS_AS_ARRAYLIST.toArray(new Integer[0]);
    }

    private static void addNumbers(final ArrayList<Integer> NUMBERS_AS_ARRAYLIST) {
        NUMBERS_AS_ARRAYLIST.add(1);
        NUMBERS_AS_ARRAYLIST.add(2);
        NUMBERS_AS_ARRAYLIST.add(3);
        NUMBERS_AS_ARRAYLIST.add(4);
        NUMBERS_AS_ARRAYLIST.add(5);
        NUMBERS_AS_ARRAYLIST.add(6);
        NUMBERS_AS_ARRAYLIST.add(7);
        NUMBERS_AS_ARRAYLIST.add(8);
        NUMBERS_AS_ARRAYLIST.add(9);
    }
}