package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_15_question_339;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java recursive method to check if a given array is sorted in ascending order.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original Array: [1, 2, 3, 4, 5]
 * <br/>
 * Is array sorted in ascending order? true
 * </h2>
 */

public class Question339 {
    private static boolean areNumbersSortedInAscendingOrder = true;

    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5};
        System.out.print("Original numbers: [");
        printNumbers(NUMBERS, 0);
        System.out.print(STR."Is array sorted in ascending order? \{areNumbersSortedInAscendingOrder}");
    }

    private static void printNumbers(final int[] NUMBERS, int index) {
        if (index < NUMBERS.length) {
            System.out.print(NUMBERS[index]);
            if (index == NUMBERS.length - 1)
                System.out.println("]");
            else {
                if (NUMBERS[index] > NUMBERS[++index])
                    areNumbersSortedInAscendingOrder = false;
                System.out.print(", ");
                printNumbers(NUMBERS, index);
            }
        }
    }
}