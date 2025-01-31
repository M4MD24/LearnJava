package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_46;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether there is a pair with a specified sum in a given sorted and rotated array.</h2>
 */

public class Question46 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {22, 25, 17, 18, 19, 20};
        final int TARGET_NUMBER = 42;
        System.out.print(isPairFoundEqualTargetNumber(NUMBERS, TARGET_NUMBER));
    }

    private static boolean isPairFoundEqualTargetNumber(final int[] NUMBERS, final int TARGET_NUMBER) {
        for (int firstIndex = 0; firstIndex < NUMBERS.length; firstIndex++) {
            final int FIRST_NUMBER = NUMBERS[firstIndex];
            for (int secondIndex = firstIndex + 1; secondIndex < NUMBERS.length; secondIndex++) {
                final int SECOND_NUMBER = NUMBERS[secondIndex];
                if (FIRST_NUMBER + SECOND_NUMBER == TARGET_NUMBER)
                    return true;
            }
        }
        return false;
    }
}