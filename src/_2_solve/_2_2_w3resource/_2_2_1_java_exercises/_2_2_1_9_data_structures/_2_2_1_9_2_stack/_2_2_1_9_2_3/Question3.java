package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_2_stack._2_2_1_9_2_3;

import java.util.Comparator;
import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort the elements of the stack in descending order.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.println("Before Sort: " + NUMBERS);
        NUMBERS.sort(Comparator.reverseOrder());
        System.out.print("After Sort : " + NUMBERS);
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(5);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
    }
}