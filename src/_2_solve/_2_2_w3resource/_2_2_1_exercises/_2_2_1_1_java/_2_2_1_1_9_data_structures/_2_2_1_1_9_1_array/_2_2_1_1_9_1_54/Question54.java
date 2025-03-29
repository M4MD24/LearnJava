package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_54;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a given array contains a sub-array with 0 sum.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * first numbers = {1, 2, -2, 3, 4, 5, 6}
 * <br/>
 * second numbers = {1, 2, 3, 4, 5, 6}
 * <br/>
 * third numbers = {1, 2, -3, 4, 5, 6}
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Does the said array contain a sub-array with 0 sum: true
 * <br/>
 * Does the said array contain a sub-array with 0 sum: false
 * <br/>
 * Does the said array contain a sub-array with 0 sum: true
 * </h2>
 */

public class Question54 {
    public static void main(final String[] ARGUMENTS) {
        final int[][] ARRAYS_OF_NUMBERS = {
                {1, 2, -2, 3, 4, 5, 6},
                {1, 2, 3, 4, 5, 6},
                {1, 2, -3, 4, 5, 6}
        };
        for (final int[] NUMBERS : ARRAYS_OF_NUMBERS)
            System.out.println("Does the said array contain a sub-array with 0 sum: " + isFoundSubArrayAfterSummationEqualsZero(NUMBERS));
    }

    private static boolean isFoundSubArrayAfterSummationEqualsZero(final int[] NUMBERS) {
        if (Arrays.stream(NUMBERS).anyMatch(number -> number == 0))
            return true;
        else {
            int countOfLengthNumbers = 1;
            while (countOfLengthNumbers++ < NUMBERS.length) {
                for (int indexOfStart = 0, indexOfEnd = countOfLengthNumbers; indexOfEnd < NUMBERS.length; indexOfStart++, indexOfEnd++) {
                    final int SUM_OF_SUB_ARRAY = Arrays.stream(NUMBERS)
                            .skip(indexOfStart)
                            .limit(countOfLengthNumbers)
                            .sum();
                    if (SUM_OF_SUB_ARRAY == 0)
                        return true;
                }
            }
            return false;
        }
    }
}