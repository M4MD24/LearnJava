package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_19;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of rows: 4</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 *    1
 *   2 2
 *  3 3 3
 * 4 4 4 4
 * */
public class Question19 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER_OF_ROWS = 4;
        System.out.printf("Input number of rows: %d\n", NUMBER_OF_ROWS);
        printTriangleNumbers(NUMBER_OF_ROWS);
    }

    private static void printTriangleNumbers(final int NUMBER_OF_ROWS) {
        for (int number = 1, countOfSpaces = NUMBER_OF_ROWS - 1; number <= NUMBER_OF_ROWS; number++, countOfSpaces--) {
            System.out.print(" ".repeat(countOfSpaces));
            for (int counter = 0; counter < number; counter++) {
                System.out.print(number);
                if (counter < number - 1)
                    System.out.print(" ");
            }
            if (number < NUMBER_OF_ROWS)
                System.out.println();
        }
    }
}