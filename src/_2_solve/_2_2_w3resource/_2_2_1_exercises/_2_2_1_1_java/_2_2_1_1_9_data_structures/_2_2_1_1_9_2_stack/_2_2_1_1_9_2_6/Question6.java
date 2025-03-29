package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_2_stack._2_2_1_1_9_2_6;

import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove all elements from a stack.</h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.println("Numbers: " + NUMBERS);
        NUMBERS.removeAllElements();
        System.out.print("After Remove All Elements: " + NUMBERS);
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(5);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
    }
}