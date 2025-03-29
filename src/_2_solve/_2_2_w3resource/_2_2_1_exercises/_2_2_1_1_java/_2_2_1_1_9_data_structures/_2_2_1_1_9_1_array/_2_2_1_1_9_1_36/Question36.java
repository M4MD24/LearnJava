package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_36;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to find all the distinct triplets such that the sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
 * <br/>
 * Sample array: [-4, -2, 0, 6, 4]
 * <br/>
 * Target value: 2.
 * </h2>
 */

public class Question36 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {-4, -2, 0, 6, 4};
        printDistinctTripletsSumOfAllThreeNumbersWithSameFormat(NUMBERS, 2);
    }

    private static void printDistinctTripletsSumOfAllThreeNumbersWithSameFormat(final int[] NUMBERS, final int SPECIFIC_NUMBER) {
        for (int firstNumberIndex = 0; firstNumberIndex < NUMBERS.length - 2; firstNumberIndex++) {
            final int FIRST_NUMBER = NUMBERS[firstNumberIndex];
            for (int secondNumberIndex = firstNumberIndex + 1; secondNumberIndex < NUMBERS.length - 1; secondNumberIndex++) {
                final int SECOND_NUMBER = NUMBERS[secondNumberIndex];
                for (int thirdNumberIndex = secondNumberIndex + 1; thirdNumberIndex < NUMBERS.length; thirdNumberIndex++) {
                    final int THIRD_NUMBER = NUMBERS[thirdNumberIndex],
                            SUM_OF_THREE_NUMBERS = FIRST_NUMBER + SECOND_NUMBER + THIRD_NUMBER;
                    final boolean ARE_SUM_OF_DISTINCT_TRIPLETS_EQUALS_SPECIFIC_NUMBER = SUM_OF_THREE_NUMBERS == SPECIFIC_NUMBER;
                    if (ARE_SUM_OF_DISTINCT_TRIPLETS_EQUALS_SPECIFIC_NUMBER)
                        printResultOfSumThreeNumbers(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, SUM_OF_THREE_NUMBERS);
                }
            }
        }
    }

    private static void printResultOfSumThreeNumbers(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER, final int SPECIFIC_NUMBER) {
        System.out.printf("""
                        %d + %d + %d = %d
                        """,
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER,
                SPECIFIC_NUMBER);
    }
}