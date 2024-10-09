package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_47;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the rotation count in a given rotated sorted array of integers.</h2>
 */

public class Question47 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {35, 32, 30, 14, 18, 21, 27};
        final int COUNT_OF_ROTATION = getCountOfRotation(NUMBERS);
        System.out.print(COUNT_OF_ROTATION);
    }

    private static int getCountOfRotation(final int[] NUMBERS) {
        int countOfRotation = -1,
                currentNumber = NUMBERS[0];
        for (int index = 1; index < NUMBERS.length; index++) {
            final int NEXT_NUMBER = NUMBERS[index];
            if (currentNumber > NEXT_NUMBER) {
                currentNumber = NEXT_NUMBER;
                countOfRotation = index;
            }
        }
        return countOfRotation;
    }
}