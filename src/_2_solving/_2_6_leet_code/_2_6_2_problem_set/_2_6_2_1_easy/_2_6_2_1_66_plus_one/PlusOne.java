package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_1_easy._2_6_2_1_66_plus_one;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
 * <br/>
 * <br/>
 * Increment the large integer by one and return the resulting array of digits.
 * </h2>
 */

public class PlusOne {
    public static void main(final String[] PARAMETERS) {
        System.out.print(Arrays.toString(plusOne(new int[]{9})));
    }

    private static int[] plusOne(final int[] DIGITS) {
        int index = DIGITS.length - 1;
        while (index > -1) {
            if (DIGITS[index] == 9)
                DIGITS[index] = 0;
            else {
                DIGITS[index]++;
                break;
            }
            index--;
        }
        if (index == -1) {
            final int[] NEW_DIGITS = new int[DIGITS.length + 1];
            NEW_DIGITS[0]++;
            return NEW_DIGITS;
        } else
            return DIGITS;
    }
}