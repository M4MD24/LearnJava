package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_110;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether the given integer is a power of 4 or not. Given num = 64, return true. Given num = 6, return false.</h2>
 */

public class Question110 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        final int NUMBER = input.nextInt();
        System.out.println(isPowerOfFourSolution1(NUMBER));
        System.out.print(isPowerOfFourSolution2(NUMBER));
    }

    private static boolean isPowerOfFourSolution1(final int NUMBER) {
        if (NUMBER <= 0) return false;
        if ((NUMBER & (NUMBER - 1)) == 0) return (NUMBER - 1) % 3 == 0;
        return false;
    }

    private static boolean isPowerOfFourSolution2(int NUMBER) {
        if (NUMBER < 1) return false;
        if ((NUMBER & (NUMBER - 1)) != 0) return false;
        return (NUMBER & 0x55555555) != 0;
    }
}