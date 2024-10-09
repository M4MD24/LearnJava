package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_18;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to make such a pattern like a right angle triangle with the number increased by 1.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of rows: 4</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 2 3
 * <br/>
 * 4 5 6
 * <br/>
 * 7 8 9 10
 * </h2>
 */

public class Question18 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER_OF_ROWS = 4;
        System.out.printf("Input target number: %d\n", NUMBER_OF_ROWS);
        printTriangleNumbers(NUMBER_OF_ROWS);
    }

    private static void printTriangleNumbers(final int NUMBER_OF_ROWS) {
        int number = 1;
        for (int currentLineLength = 1; currentLineLength <= NUMBER_OF_ROWS; currentLineLength++) {
            for (int counter = 1; counter <= currentLineLength; counter++) {
                System.out.print(number++);
                if (counter < currentLineLength)
                    System.out.print(" ");
            }
            if (currentLineLength < NUMBER_OF_ROWS)
                System.out.println();
        }
    }
}