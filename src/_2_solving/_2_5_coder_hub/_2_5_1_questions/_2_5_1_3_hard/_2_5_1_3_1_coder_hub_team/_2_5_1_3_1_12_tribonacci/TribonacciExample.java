package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_3_hard._2_5_1_3_1_coder_hub_team._2_5_1_3_1_12_tribonacci;

import java.util.Arrays;
import java.util.Scanner;

public class TribonacciExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(Arrays.toString(getTribonacciNumbers(INPUT.nextInt())));
    }

    private static int[] getTribonacciNumbers(final int LENGTH) {
        final int[] TRIBONACCI_NUMBERS = new int[LENGTH];
        if (LENGTH >= 1)
            TRIBONACCI_NUMBERS[0] = 1;
        if (LENGTH >= 2)
            TRIBONACCI_NUMBERS[1] = 1;
        if (LENGTH >= 3)
            TRIBONACCI_NUMBERS[2] = 1;
        for (int index = 3; index < LENGTH; index++)
            TRIBONACCI_NUMBERS[index] = TRIBONACCI_NUMBERS[index - 3] + TRIBONACCI_NUMBERS[index - 2] + TRIBONACCI_NUMBERS[index - 1];
        return TRIBONACCI_NUMBERS;
    }
}