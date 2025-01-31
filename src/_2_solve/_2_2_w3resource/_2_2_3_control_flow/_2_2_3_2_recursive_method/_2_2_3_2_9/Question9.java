package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_9;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to find the sum of all odd numbers in an array.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The sum of all odd numbers in the array is: 25</h2>
 */

public class Question9 {
    private static final int[] NUMBERS = {4, 5, 1, 7, 8, 3, 6, 2, 9};

    public static void main(final String[] ARGUMENTS) {
        System.out.printf("The sum of all odd numbers in the array is: %d", getSumOFOddNumbers(0, 0));
    }

    private static int getSumOFOddNumbers(final int INDEX, int sumOFOddNumbers) {
        if (INDEX == NUMBERS.length)
            return sumOFOddNumbers;
        else {
            if (NUMBERS[INDEX] % 2 != 0)
                sumOFOddNumbers += NUMBERS[INDEX];
            return getSumOFOddNumbers(INDEX + 1, sumOFOddNumbers);
        }
    }
}