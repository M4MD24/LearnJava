package _2_solve._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_1_generic_methods._2_2_12_1_1;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a generic method that takes two arrays of the same type and checks if they have the same elements in the same order.</h2>
 */

public class Question1 {
    public static void main(final String[] ARGUMENTS) {
        final String[] NUMBERS_WORDS = {"One", "Second", "Third", "Four", "Five"};
        final Integer[] NUMBERS = {1, 2, 3, 4, 5};
        System.out.print(areSameTypeAndElements(NUMBERS_WORDS, NUMBERS));
    }

    private static <Type> boolean areSameTypeAndElements(final Type[] FIRST_ELEMENTS, final Type[] SECOND_ELEMENTS) {
        return Arrays.equals(FIRST_ELEMENTS, SECOND_ELEMENTS);
    }
}