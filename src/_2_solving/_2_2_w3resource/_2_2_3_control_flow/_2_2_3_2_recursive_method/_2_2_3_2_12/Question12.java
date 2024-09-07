package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_12;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java recursive method to find the maximum element in an array.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original numbers: [34, 45, 34, 23, 56, 62, 27, 55]
 * <br/>
 * The maximum number in the numbers is: 62
 * </h2>
 */

public class Question12 {
    private static final int[] NUMBERS = {34, 45, 34, 23, 56, 62, 27, 55};
    private static int maximumNumber = NUMBERS[0];

    public static void main(final String[] PARAMETERS) {
        System.out.print("Original numbers: [");
        printNumbers(NUMBERS, 0);
        System.out.printf("The maximum number in the numbers is: %d", maximumNumber);
    }

    private static void printNumbers(final int[] NUMBERS, int index) {
        if (index < NUMBERS.length) {
            if (maximumNumber < NUMBERS[index])
                maximumNumber = NUMBERS[index];
            System.out.print(NUMBERS[index]);
            if (index == NUMBERS.length - 1)
                System.out.println("]");
            else {
                System.out.print(", ");
                printNumbers(NUMBERS, ++index);
            }
        }
    }
}