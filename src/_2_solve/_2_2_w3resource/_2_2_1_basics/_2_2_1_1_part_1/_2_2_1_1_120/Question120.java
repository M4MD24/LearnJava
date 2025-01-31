package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_120;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that searches for a value in an m x n matrix.</h2>
 */

public class Question120 {
    private static final int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    private static final int elementTarget = 0;

    private static boolean status = false;

    public static void main(final String[] ARGUMENTS) {
        displayMatrix();
        System.out.print(searchElement(elementTarget));
    }

    private static boolean searchElement(int elementTarget) {
        for (int[] array : matrix)
            for (int element : array)
                if (element == elementTarget) {
                    status = true;
                    break;
                }
        return status;
    }

    private static void displayMatrix() {
        for (int[] array : matrix) {
            for (int index2dimension = 0; index2dimension < array.length; index2dimension++) {
                System.out.print(array[index2dimension]);
                if (index2dimension != array.length - 1) System.out.print(" ");
                else System.out.println();
            }
        }
    }
}