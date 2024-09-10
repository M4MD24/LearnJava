package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_43_factorial;

import java.util.Scanner;

public class FactorialExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getFactorial(INPUT.nextInt()));
    }

    private static int getFactorial(final int NUMBER) {
        int multiplication = 1;
        for (int index = 2; index <= NUMBER; index++)
            multiplication *= index;
        return multiplication;
    }
}