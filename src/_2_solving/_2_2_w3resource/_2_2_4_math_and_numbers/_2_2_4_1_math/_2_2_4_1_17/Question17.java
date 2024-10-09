package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_17;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate and print the average (or mean) of the stream of given numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Average numbers from index 0 to index 4 is: 30</h2>
 */

public class Question17 {
    private static final int[] NUMBERS = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

    public static void main(final String[] PARAMETERS) {
        final int FROM_THIS_INDEX_NUMBER = 0,
                TO_THIS_INDEX_NUMBER = 4;
        System.out.printf("Average numbers from %d to %d is: %f",
                FROM_THIS_INDEX_NUMBER + 1,
                TO_THIS_INDEX_NUMBER + 1,
                getAverageNumbers(FROM_THIS_INDEX_NUMBER, TO_THIS_INDEX_NUMBER));
    }

    private static double getAverageNumbers(final int FROM_THIS_INDEX_NUMBER, final int TO_THIS_INDEX_NUMBER) {
        int sumOfNumbers = 0;
        for (int index = 0; index <= TO_THIS_INDEX_NUMBER; index++)
            sumOfNumbers += NUMBERS[index];
        return (double) sumOfNumbers / (TO_THIS_INDEX_NUMBER + 1 - FROM_THIS_INDEX_NUMBER);
    }
}