package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_12;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method (takes n as input) to display an n-by-n matrix.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 10
 * <br/>
 * 1 0 0 1 1 0 0 0 1 1
 * <br/>
 * 0 0 1 0 1 0 1 0 0 0
 * <br/>
 * 0 1 0 1 0 0 0 0 0 1
 * <br/>
 * 1 1 1 0 0 0 0 1 1 1
 * <br/>
 * 1 1 0 1 1 1 0 1 0 0
 * <br/>
 * 1 0 0 0 1 1 0 0 0 0
 * <br/>
 * 0 0 1 0 0 0 0 1 1 1
 * <br/>
 * 1 1 0 1 0 1 0 0 1 0
 * <br/>
 * 0 0 1 0 0 0 0 1 1 0
 * <br/>
 * 1 1 1 0 0 1 1 1 1 0
 * </h2>
 */
public class Question12 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 10;
        System.out.printf("Input a number: %d\n", NUMBER);
        printRandomNumbers(NUMBER);
    }

    private static void printRandomNumbers(final int ROWS_AND_COLUMNS) {
        for (int row = 0; row < ROWS_AND_COLUMNS; row++) {
            for (int column = 0; column < ROWS_AND_COLUMNS; column++)
                System.out.printf("%d ", (byte) (Math.random() * 2));
            System.out.println();
        }
    }
}