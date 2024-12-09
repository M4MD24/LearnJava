package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_87;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that then reads an integer and calculates the sum of its digits and writes the number of each digit of the sum in English.</h2>
 */

public class Question87 {
    public static void main(final String[] PARAMETERS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter some digits to calculates the sum: ");
        String text = input.nextLine();
        char[] digitsOrLetters = text.toCharArray();
        int sum = 0;

        for (int digitOrLetter : digitsOrLetters) {
            System.out.println((digitOrLetter - '0') + " + " + sum + " = " + ((digitOrLetter - '0') + sum));
            sum += digitOrLetter - '0';
        }
        System.out.println("sum of each digit= " + sum);

        digitsOrLetters = String.valueOf(sum).toCharArray();
        StringBuilder numberName = new StringBuilder();
        for (int index = 0; index < digitsOrLetters.length; index++) {
            numberName.append(switch (digitsOrLetters[index]) {
                case '0' -> "Zero";
                case '1' -> "One";
                case '2' -> "Two";
                case '3' -> "Three";
                case '4' -> "Four";
                case '5' -> "Five";
                case '6' -> "Six";
                case '7' -> "Seven";
                case '8' -> "Eight";
                case '9' -> "Nine";
                default -> "Unknown-Digit";
            }).append((index < digitsOrLetters.length - 1) ? " " : "");
        }
        System.out.print("Name number in English: " + numberName);
    }
}