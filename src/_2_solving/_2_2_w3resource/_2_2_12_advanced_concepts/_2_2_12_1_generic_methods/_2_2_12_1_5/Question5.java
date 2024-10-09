package _2_solving._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_1_generic_methods._2_2_12_1_5;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a generic method that takes two lists of the same type and merges them into a single list. This method alternates the elements of each list.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        final Integer[] FIRST_NUMBERS = {1, 3, 5, 7, 9},
                SECOND_NUMBERS = {2, 4, 6, 8, 10};
        System.out.print(Arrays.toString(getElementsAfterMerge(FIRST_NUMBERS, SECOND_NUMBERS)));
    }

    private static <Type> Type[] getElementsAfterMerge(final Type[] FIRST_ELEMENTS, final Type[] SECOND_ELEMENTS) {
        return (Type[]) IntStream.range(
                0,
                FIRST_ELEMENTS.length + SECOND_ELEMENTS.length
        ).mapToObj(index -> index % 2 == 0
                ? FIRST_ELEMENTS[index / 2]
                : SECOND_ELEMENTS[index / 2]
        ).toArray();
    }
}