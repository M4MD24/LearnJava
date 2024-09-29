package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_1_search._2_2_13_1_7;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the row, column position of a specified number (row, column position) in a given 2-dimensional array.</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) {
        final int[][] NUMBERS = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        final int TARGET = 10;
        System.out.print(saddleBack(NUMBERS, TARGET));
    }

    private static String saddleBack(final int[][] ARRAY, final int TARGET) {
        for (int row = 0; row < ARRAY.length; row++)
            for (int column = 0; column < ARRAY[row].length; column++)
                if (ARRAY[row][column] == TARGET)
                    return "Element found at row: " + row + ", column: " + column;
        return "Element not found";
    }
}