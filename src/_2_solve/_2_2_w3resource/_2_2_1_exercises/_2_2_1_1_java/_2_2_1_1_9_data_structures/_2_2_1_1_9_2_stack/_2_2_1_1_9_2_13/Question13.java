package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_2_stack._2_2_1_1_9_2_13;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove a specific element from a stack.</h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        final int TARGET_NUMBER_TO_REMOVE = 2;
        addNumbers(NUMBERS);
        System.out.println("Before Remove: " + NUMBERS);
        NUMBERS.remove((Integer) TARGET_NUMBER_TO_REMOVE);
        System.out.print("After Remove : " + NUMBERS);
    }


    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(1);
        NUMBERS.push(5);
        NUMBERS.push(3);
        NUMBERS.push(2);
        NUMBERS.push(6);
        NUMBERS.push(4);
    }
}