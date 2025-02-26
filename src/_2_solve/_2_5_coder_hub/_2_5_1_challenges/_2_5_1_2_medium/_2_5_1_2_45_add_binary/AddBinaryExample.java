package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_45_add_binary;

import java.util.Scanner;

public class AddBinaryExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.println(addBinary(INPUT.nextLine(), INPUT.nextLine()));
    }

    private static String addBinary(String firstNumber, String secondNumber) {
        return Integer.toBinaryString(Integer.parseInt(
                firstNumber,
                2
        ) + Integer.parseInt(
                secondNumber,
                2
        ));
    }
}