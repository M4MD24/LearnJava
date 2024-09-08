package _2_solving._2_2_w3resource._2_2_6_exception_handling._2_2_6_1_handling_and_managing._2_2_6_1_7;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a method that takes a string as input and throws an exception if the string does not contain vowels.</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isContainVowels(new Scanner(System.in).nextLine())
                ? "The text does contain vowels!"
                : new NotContainVowelsException("The text doesn't contain vowels!").getMessage()
        );
    }

    private static boolean isContainVowels(final String TEXT) {
        return TEXT.matches(".*[aAeEiIoOuU].*");
    }
}

class NotContainVowelsException extends Exception {
    NotContainVowelsException(final String MESSAGE) {
        super(MESSAGE);
    }
}