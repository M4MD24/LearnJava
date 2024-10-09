package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_8;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to count the number of occurrences of a specific element in an array.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The number of occurrences of 20 in the array is: 3</h2>
 */

public class Question8 {
    private static final int[] NUMBERS = {10, 20, 30, 40, 20, 60, 20, 80};

    public static void main(final String[] PARAMETERS) {
        final int TARGET_NUMBER = 20;
        System.out.printf("The number of occurrences of %d in the array is: %d",
                TARGET_NUMBER,
                getCountOfOccurrencesTargetNumber(TARGET_NUMBER, 0, 0));
    }

    private static int getCountOfOccurrencesTargetNumber(final int TARGET_NUMBER, int index, int countOfOccurrencesTargetNumber) {
        if (index == NUMBERS.length)
            return countOfOccurrencesTargetNumber;
        else {
            if (TARGET_NUMBER == NUMBERS[index])
                countOfOccurrencesTargetNumber++;

            return getCountOfOccurrencesTargetNumber(TARGET_NUMBER, ++index, countOfOccurrencesTargetNumber);
        }
    }
}