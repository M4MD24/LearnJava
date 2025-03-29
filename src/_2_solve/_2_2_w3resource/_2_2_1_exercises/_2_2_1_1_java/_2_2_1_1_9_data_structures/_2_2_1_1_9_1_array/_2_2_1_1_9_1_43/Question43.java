package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_43;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find all combinations of four elements of an array whose sum is equal to a given value.</h2>
 */

public class Question43 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {10, 20, 30, 40, 1, 2};
        final int TARGET_NUMBER = 53;
        printAllCombinationsOfFourNumbersEqualsTargetNumber(NUMBERS, TARGET_NUMBER);
    }

    private static void printAllCombinationsOfFourNumbersEqualsTargetNumber(final int[] NUMBERS, final int TARGET_NUMBER) {
        final int LENGTH_OF_NUMBER = String.valueOf(TARGET_NUMBER).length();
        for (int firstNumberIndex = 0; firstNumberIndex < NUMBERS.length - 3; firstNumberIndex++) {
            final int FIRST_NUMBER = NUMBERS[firstNumberIndex];
            for (int secondNumberIndex = firstNumberIndex + 1; secondNumberIndex < NUMBERS.length - 2; secondNumberIndex++) {
                final int SECOND_NUMBER = NUMBERS[secondNumberIndex];
                for (int thirdNumberIndex = secondNumberIndex + 1; thirdNumberIndex < NUMBERS.length - 1; thirdNumberIndex++) {
                    final int THIRD_NUMBER = NUMBERS[thirdNumberIndex];
                    for (int fourthNumberIndex = thirdNumberIndex + 1; fourthNumberIndex < NUMBERS.length; fourthNumberIndex++) {
                        final int FOURTH_NUMBER = NUMBERS[fourthNumberIndex];
                        if (FIRST_NUMBER + SECOND_NUMBER + THIRD_NUMBER + FOURTH_NUMBER == TARGET_NUMBER)
                            System.out.printf("%" + LENGTH_OF_NUMBER + "d + " + "%" + LENGTH_OF_NUMBER + "d + " + "%" + LENGTH_OF_NUMBER + "d + " + "%" + LENGTH_OF_NUMBER + "d + " + "%" + LENGTH_OF_NUMBER + "d\n",
                                    FIRST_NUMBER,
                                    SECOND_NUMBER,
                                    THIRD_NUMBER,
                                    FOURTH_NUMBER,
                                    TARGET_NUMBER);
                    }
                }
            }
        }
    }
}