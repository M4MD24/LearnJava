package _2_solve._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_1_generic_methods._2_2_12_1_4;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a generic method that takes a list of any type and returns it as a new list with the elements in reverse order.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        final Integer[] NUMBERS = {1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(getElementsAfterReversed(NUMBERS)));
    }

    private static <Type> Type[] getElementsAfterReversed(final Type[] ELEMENTS) {
        return Arrays.stream(ELEMENTS)
                .collect(Collectors.toList())
                .reversed()
                .toArray(ELEMENTS.clone());
    }
}