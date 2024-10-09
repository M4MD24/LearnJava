package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_92;

/**
 * <h1>Problem:</h1>
 * <h2>Your task is to develop a small piece of spreadsheet software. Write a Java program that adds up the columns and rows of a given table as shown in the specified figure:</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input count of rows and columns: 4
 * <br/>
 * 25 69 51 26
 * <br/>
 * 68 35 29 54
 * <br/>
 * 54 57 45 63
 * <br/>
 * 61 68 47 59
 * <br/>
 * Result:
 * <br/>
 * 25   69   51   26  171
 * <br/>
 * 68   35   29   54  186
 * <br/>
 * 54   57   45   63  219
 * <br/>
 * 61   68   47   59  235
 * <br/>
 * 208  229  172  202  811
 * </h2>
 */

public class Question92 {
    public static void main(final String[] PARAMETERS) {
        final int COUNT_OF_ROWS_AND_COLUMNS = 4;
        System.out.printf("Input count of rows and columns: %d\n", COUNT_OF_ROWS_AND_COLUMNS);
        final int[][] NUMBERS = {
                {25, 69, 51, 26},
                {68, 35, 29, 54},
                {54, 57, 45, 63},
                {61, 68, 47, 59}
        };
        printNumbers(NUMBERS);
        System.out.println("Result:");
        printSumOfRowsAndColumns(NUMBERS);
    }

    private static void printSumOfRowsAndColumns(final int[][] NUMBERS) {
        printSumOfRows(NUMBERS);
        int sumOfColumns = 0;
        for (int column = 0; column < NUMBERS.length; column++) {
            int sumOfColumn = 0;
            for (int row = 0; row < NUMBERS[column].length; row++)
                sumOfColumn += NUMBERS[row][column];
            System.out.printf("%d ", sumOfColumn);
            sumOfColumns += sumOfColumn;
        }
        System.out.print(sumOfColumns);
    }

    private static void printSumOfRows(final int[][] NUMBERS) {
        for (final int[] NUMBER : NUMBERS) {
            int sumOfRow = 0;
            for (final int DIGIT : NUMBER) {
                System.out.printf("%d ", DIGIT);
                sumOfRow += DIGIT;
            }
            System.out.println(sumOfRow);
        }
    }

    private static void printNumbers(final int[][] NUMBERS) {
        for (final int[] NUMBER : NUMBERS) {
            for (final int DIGIT : NUMBER)
                System.out.printf("%d ", DIGIT);
            System.out.println();
        }
    }
}