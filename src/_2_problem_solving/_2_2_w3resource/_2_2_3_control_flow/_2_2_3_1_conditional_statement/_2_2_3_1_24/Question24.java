package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_24;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to generate the following @ triangle.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of rows: 6</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 *      @
 *     @@
 *    @@@
 *   @@@@
 *  @@@@@
 * @@@@@@
 * */
public class Question24 {
    public static void main(final String[] ARGS) {
        final int NUMBER_OF_ROWS = 6;
        System.out.printf("Input number of rows: %d\n", NUMBER_OF_ROWS);
        printStarsTriangle(NUMBER_OF_ROWS);
    }

    private static void printStarsTriangle(final int NUMBER_OF_ROWS) {
        for (int index = 0, countOfSpaces = NUMBER_OF_ROWS - 1, countOfAt = 1; index < NUMBER_OF_ROWS; index++, countOfSpaces--, countOfAt++) {
            System.out.print(" ".repeat(countOfSpaces) + "@".repeat(countOfAt));
            if (index < NUMBER_OF_ROWS - 1)
                System.out.println();
        }
    }
}