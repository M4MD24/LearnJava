package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_22_question_314;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to display Pascal's triangle.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of rows: 5</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 *     1
 *    1 1
 *   1 2 1
 *  1 3 3 1
 * 1 4 6 4 1
 * */
public class Question314 {
    public static void main(final String[] ARGS) {
        final int NUMBER_OF_ROWS_HALF_OF_THE_DIAMOND = 5;
        System.out.printf("Input number of rows: %d\n", NUMBER_OF_ROWS_HALF_OF_THE_DIAMOND);
        printPascalTriangle(NUMBER_OF_ROWS_HALF_OF_THE_DIAMOND);
    }

    private static void printPascalTriangle(final int NUMBER_OF_ROWS) {
        for (int row = 0, space = NUMBER_OF_ROWS - 1; row < NUMBER_OF_ROWS; row++, space--) {
            int number = 1;
            System.out.print(" ".repeat(space));
            for (int column = 0; column <= row; column++) {
                System.out.print(number);
                number = number * (row - column) / (column + 1);
                if (column < row)
                    System.out.print(" ");
            }
            if (row < NUMBER_OF_ROWS - 1)
                System.out.println();
        }
    }
}