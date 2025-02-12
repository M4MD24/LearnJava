package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_3_control_flow._2_2_1_3_1_conditional_statement._2_2_1_3_1_16;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to display the pattern like a right angle triangle with a number.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of rows: 10</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 12
 * <br/>
 * 123
 * <br/>
 * 1234
 * <br/>
 * 12345
 * <br/>
 * 123456
 * <br/>
 * 1234567
 * <br/>
 * 12345678
 * <br/>
 * 123456789
 * <br/>
 * 12345678910
 * </h2>
 */

public class Question16 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER_OF_ROWS = 10;
        printTriangleNumbers(NUMBER_OF_ROWS);
    }

    private static void printTriangleNumbers(final int NUMBER_OF_ROWS) {
        for (int row = 1; row <= NUMBER_OF_ROWS; row++) {
            for (int number = 1; number <= row; number++)
                System.out.print(number);
            if (row < NUMBER_OF_ROWS)
                System.out.println();
        }
    }
}