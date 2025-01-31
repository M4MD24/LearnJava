package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_14;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to swap the top two elements of a given stack.</h2>
 */

public class Question14 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.println("Before Swap: " + NUMBERS);
        swapTwoNumbers(NUMBERS, 2, 4);
        System.out.print("After Swap : " + NUMBERS);
    }

    private static void swapTwoNumbers(final Stack<Integer> NUMBERS, final int FIRST_NUMBER, final int SECOND_NUMBER) {
        final int FIRST_NUMBER_INDEX = NUMBERS.indexOf(FIRST_NUMBER),
                SECOND_NUMBER_INDEX = NUMBERS.indexOf(SECOND_NUMBER);
        if (FIRST_NUMBER_INDEX != -1 || SECOND_NUMBER_INDEX != -1) {
            NUMBERS.set(FIRST_NUMBER_INDEX, SECOND_NUMBER);
            NUMBERS.set(SECOND_NUMBER_INDEX, FIRST_NUMBER);
        } else
            System.out.print("Can't Swap!");
    }


    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(1);
        NUMBERS.push(4);
        NUMBERS.push(3);
        NUMBERS.push(2);
        NUMBERS.push(5);
        NUMBERS.push(6);
    }
}