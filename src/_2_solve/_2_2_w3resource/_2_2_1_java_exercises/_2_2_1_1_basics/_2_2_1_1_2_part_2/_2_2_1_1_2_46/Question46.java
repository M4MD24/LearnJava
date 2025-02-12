package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_2_part_2._2_2_1_1_2_46;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a spiral array of n * n sizes from a given integer n.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input a number: 5
 * <br/>
 * Spiral array becomes:
 * <br/>
 * 1 2 3 4 5
 * <br/>
 * 16 17 18 19 6
 * <br/>
 * 15 24 25 20 7
 * <br/>
 * 14 23 22 21 8
 * <br/>
 * 13 12 11 10 9
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * After spiral sort:
 * <br/>
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25
 * </h2>
 */

public class Question46 {
    private static final int[][] MATRIX = {
            {1, 2, 3, 4, 5},
            {16, 17, 18, 19, 6},
            {15, 24, 25, 20, 7},
            {14, 23, 22, 21, 8},
            {13, 12, 11, 10, 9}
    };

    private static int rows = MATRIX.length,
            columns = rows;

    public static void main(final String[] ARGUMENTS) {
        printInputs();
        printOutputs();
    }

    private static void printOutputs() {
        System.out.println("\nAfter spiral sort:");
        printSpiralOrder();
    }

    private static void printInputs() {
        System.out.printf("Input a number: %d\n", rows);
        System.out.println("Spiral array becomes:");
        for (final int[] NUMBERS : MATRIX) {
            for (final int NUMBER : NUMBERS)
                System.out.printf("%d ", NUMBER);
            System.out.println();
        }
    }

    private static void printSpiralOrder() {
        short row = 0,
                column = 0;
        while (row < rows && column < columns) {
            for (short index = column; index < columns; index++)
                System.out.printf("%d ", MATRIX[row][index]);
            row++;
            for (short index = row; index < rows; index++)
                System.out.printf("%d ", MATRIX[index][columns - 1]);
            columns--;
            if (row < rows) {
                for (short index = (short) (columns - 1); index >= column; index--)
                    System.out.printf("%d ", MATRIX[rows - 1][index]);
                rows--;
            }
            if (column < columns) {
                for (short index = (short) (rows - 1); index >= row; index--)
                    System.out.printf("%d ", MATRIX[index][column]);
                column++;
            }
        }
    }
}