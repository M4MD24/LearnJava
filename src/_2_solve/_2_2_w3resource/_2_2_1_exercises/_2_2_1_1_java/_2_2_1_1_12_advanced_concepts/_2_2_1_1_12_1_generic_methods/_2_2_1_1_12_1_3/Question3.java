package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_12_advanced_concepts._2_2_1_1_12_1_generic_methods._2_2_1_1_12_1_3;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a generic method that takes a list of any type and a target element. It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final Integer[] NUMBERS = {1, 2, 3, 4, 5};
        System.out.print(getIndexOfElement(NUMBERS, 3));
    }

    private static <Type> int getIndexOfElement(final Type[] ELEMENTS, final Type TARGET_ELEMENT) {
        return Arrays.stream(ELEMENTS)
                .toList()
                .indexOf(TARGET_ELEMENT);
    }
}