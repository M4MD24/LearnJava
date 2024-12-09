package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_29;

import _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_2_stack._2_2_9_2_29.stack_algorithm_with_linked_list_algorithm.StackAlgorithm;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a stack using a linked list.</h2>
 */

public class Question29 {
    public static void main(final String[] PARAMETERS) {
        final StackAlgorithm<Integer> NUMBERS = new StackAlgorithm<>();

        System.out.println("Numbers after add numbers:");
        NUMBERS.push(4);
        NUMBERS.push(3);
        NUMBERS.push(1);
        NUMBERS.push(2);
        NUMBERS.showElements();

        System.out.println("\n\nNumbers after delete numbers:");
        NUMBERS.pop();
        NUMBERS.pop();
        NUMBERS.showElements();

        System.out.print("\n\nShow last number:\n" + NUMBERS.peek());
    }
}