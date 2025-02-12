package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_2_stack._2_2_1_9_2_5;

import java.util.Comparator;
import java.util.Stack;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the maximum and minimum elements in a stack.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final Stack<Integer> NUMBERS = new Stack<>();
        addNumbers(NUMBERS);
        System.out.println("Numbers: " + NUMBERS);
        System.out.println("Maximum Number: " + NUMBERS.stream().max(Comparator.naturalOrder()).get());
        System.out.print("Minimum Number: " + NUMBERS.stream().min(Comparator.naturalOrder()).get());
    }

    private static void addNumbers(final Stack<Integer> NUMBERS) {
        NUMBERS.push(5);
        NUMBERS.push(2);
        NUMBERS.push(4);
        NUMBERS.push(3);
    }
}