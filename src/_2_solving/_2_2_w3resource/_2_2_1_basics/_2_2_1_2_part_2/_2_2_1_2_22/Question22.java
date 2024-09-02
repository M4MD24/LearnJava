package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_22;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the number of elements in a given array of integers that are smaller than the integer in another given array of integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 0
 * <br/>
 * 3
 * <br/>
 * 7
 * </h2>
 */

public class Question22 {
    private static final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8},
            TARGET_NUMBERS = {1, 4, 8};

    public static void main(final String[] ARGS) {
        printTargetNumbersIndices(0);
    }

    private static void printTargetNumbersIndices(int index) {
        if (index != TARGET_NUMBERS.length) {
            for (int numberIndex = 0; numberIndex < NUMBERS.length; numberIndex++)
                if (NUMBERS[numberIndex] == TARGET_NUMBERS[index])
                    System.out.println(numberIndex);
            printTargetNumbersIndices(++index);
        }
    }
}