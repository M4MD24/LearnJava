package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_21;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to display the pattern like a diamond.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number of rows (half of the diamond): 7</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 *       *
 *      ***
 *     *****
 *    *******
 *   *********
 *  ***********
 * *************
 *  ***********
 *   *********
 *    *******
 *     *****
 *      ***
 *       *
 * */
public class Question21 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER_OF_ROWS_HALF_OF_THE_DIAMOND = 7;
        System.out.printf("Input number of rows (half of the diamond): %d\n", NUMBER_OF_ROWS_HALF_OF_THE_DIAMOND);
        printStarsDiamond(NUMBER_OF_ROWS_HALF_OF_THE_DIAMOND);
    }

    private static void printStarsDiamond(final int NUMBER_OF_ROWS) {
        int countOfSpaces = NUMBER_OF_ROWS - 1,
                countOfStars = 1;
        for (int round = 0; round < NUMBER_OF_ROWS; round++) {
            System.out.print(" ".repeat(countOfSpaces));
            for (int counter = 0; counter < countOfStars; counter++)
                System.out.print('*');
            System.out.println();
            countOfStars += 2;
            countOfSpaces--;
        }
        countOfStars -= 4;
        countOfSpaces += 2;
        for (int round = NUMBER_OF_ROWS - 1; round > 0; round--) {
            System.out.print(" ".repeat(countOfSpaces));
            for (int counter = 0; counter < countOfStars; counter++)
                System.out.print('*');
            if (round > 1)
                System.out.println();
            countOfStars -= 2;
            countOfSpaces++;
        }
    }
}