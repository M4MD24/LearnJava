package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_33_division_remainder;

import java.util.Scanner;

public class DivisionRemainderExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(divisionRemainder(INPUT.nextInt(), INPUT.nextInt()));
    }

    private static int divisionRemainder(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER % SECOND_NUMBER;
    }
}