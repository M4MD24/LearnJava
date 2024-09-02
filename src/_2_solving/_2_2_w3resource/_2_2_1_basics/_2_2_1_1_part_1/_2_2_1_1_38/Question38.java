package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_38;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count letters, spaces, numbers and other characters in an input string.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
 * <br/>
 * Letter: 23
 * <br/>
 * Space: 9
 * <br/>
 * Number: 10
 * <br/>
 * Other: 6
 * </h2>
 */

public class Question38 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a string: ");
        String text = input.nextLine();

        count(text);
    }

    private static void count(final String TEXT) {
        char[] chars = TEXT.toCharArray();
        int lettersCount = 0,
                spacesCount = 0,
                numbersCount = 0,
                othersCount = 0;

        for (char item : chars) {
            if (Character.isLetter(item)) lettersCount++;
            else if (Character.isSpaceChar(item)) spacesCount++;
            else if (Character.isDigit(item)) numbersCount++;
            else othersCount++;
        }

        System.out.println("The string is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");
        System.out.println("Letters: " + lettersCount);
        System.out.println("Spaces: " + spacesCount);
        System.out.println("Numbers: " + numbersCount);
        System.out.print("Others: " + othersCount);
    }
}