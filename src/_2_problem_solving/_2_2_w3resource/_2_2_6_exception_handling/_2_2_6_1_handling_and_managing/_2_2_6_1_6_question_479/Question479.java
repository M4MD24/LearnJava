package _2_problem_solving._2_2_w3resource._2_2_6_exception_handling._2_2_6_1_handling_and_managing._2_2_6_1_6_question_479;

import java.util.HashSet;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates.</h2>
 */

public class Question479 {
    public static void main(final String[] ARGS) {
        inputNumbers();
    }

    private static void inputNumbers() {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("How many numbers do you want to add? ");
        final int COUNT_OF_NUMBERS = INPUT.nextInt();
        final HashSet<Integer> NUMBERS = new HashSet<>();
        for (int index = 0; index < COUNT_OF_NUMBERS; index++) {
            System.out.print("Input index number " + index + ": ");
            final int NUMBER = INPUT.nextInt();
            if (!NUMBERS.add(NUMBER)) {
                System.out.print(new DuplicateNumberException("Duplicate number found: " + NUMBER).getMessage());
                return;
            }
        }
        System.out.print("Duplicate number not found!");
    }
}

class DuplicateNumberException extends Exception {
    DuplicateNumberException(final String MESSAGE) {
        super(MESSAGE);
    }
}