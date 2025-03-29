package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print the following grid.</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * <br/>
 * - - - - - - - - - -
 * </h2>
 */

public class Question3 {
    private static final int SIDE_LENGTH = 10;
    private static final String[] SQUARE = new String[SIDE_LENGTH];

    public static void main(final String[] ARGUMENTS) {
        inputDetails();
        printSquare();
    }

    private static void printSquare() {
        for (int index = 0; index < SIDE_LENGTH; index++) {
            System.out.print(SQUARE[index]);
            if (index < SIDE_LENGTH - 1)
                System.out.println();
        }
    }

    private static void inputDetails() {
        final char SHAPE = '-';
        for (int index = 0; index < SIDE_LENGTH; index++)
            SQUARE[index] = SHAPE + (" " + SHAPE).repeat(10);
    }
}