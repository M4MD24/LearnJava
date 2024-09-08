package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_8;

import java.util.Stack;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to implement a stack that checks if a given element is present or not in the stack.</h2>
 */

public class Question8 {
    public static void main(final String[] PARAMETERS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        final int TARGET_NUMBER = 5;
        addNumbers(NUMBERS);
        System.out.println("Numbers: " + NUMBERS);
        System.out.print("Is contain " + TARGET_NUMBER + "? " + NUMBERS.contains(TARGET_NUMBER));
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(5);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
    }
}