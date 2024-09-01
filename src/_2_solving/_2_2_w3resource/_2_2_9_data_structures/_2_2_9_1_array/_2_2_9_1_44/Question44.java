package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_44;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count the number of possible triangles from a given unsorted array of positive integers.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The triangle inequality states that the sum of the lengths of any two sides of a triangle must be greater than or equal to the length of the third side.</h2>
 */

public class Question44 {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {2, 4, 2, 3};
        System.out.print(getCountOfPossibleTriangles(NUMBERS));
    }

    private static int getCountOfPossibleTriangles(final int[] NUMBERS) {
        int countOfPossibleTriangles = 0;
        for (int firstSideIndex = 0; firstSideIndex < NUMBERS.length - 2; firstSideIndex++) {
            final int FIRST_SIDE = NUMBERS[firstSideIndex];
            for (int secondSideIndex = firstSideIndex + 1; secondSideIndex < NUMBERS.length - 1; secondSideIndex++) {
                final int SECOND_SIDE = NUMBERS[secondSideIndex];
                for (int thirdSideIndex = secondSideIndex + 1; thirdSideIndex < NUMBERS.length; thirdSideIndex++) {
                    final int THIRD_SIDE = NUMBERS[thirdSideIndex];
                    if (FIRST_SIDE + SECOND_SIDE > THIRD_SIDE)
                        countOfPossibleTriangles++;
                }
            }
        }
        return countOfPossibleTriangles;
    }
}