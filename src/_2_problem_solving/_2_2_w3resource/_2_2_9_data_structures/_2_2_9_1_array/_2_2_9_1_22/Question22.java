package _2_problem_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_22;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.</h2>
 */

public class Question22 {
    public static void main(final String[] ARGS) {
        printAllPPairsOfElementsWhoseSumIsEqualSpecifiedNumber(new int[]{1, 7, 4, 5, 9, 6, 8, 2, 3}, 10);
    }

    private static void printAllPPairsOfElementsWhoseSumIsEqualSpecifiedNumber(final int[] ELEMENTS, final int SPECIFIC_NUMBER) {
        for (int firstNumberIndex = 0; firstNumberIndex < ELEMENTS.length - 1; firstNumberIndex++)
            for (int secondNumberIndex = firstNumberIndex + 1; secondNumberIndex < ELEMENTS.length; secondNumberIndex++) {
                final int FIRST_NUMBER = ELEMENTS[firstNumberIndex],
                        SECOND_NUMBER = ELEMENTS[secondNumberIndex];
                if (FIRST_NUMBER + SECOND_NUMBER == SPECIFIC_NUMBER)
                    System.out.println(FIRST_NUMBER + " + " + SECOND_NUMBER + " = " + SPECIFIC_NUMBER);
            }
    }
}