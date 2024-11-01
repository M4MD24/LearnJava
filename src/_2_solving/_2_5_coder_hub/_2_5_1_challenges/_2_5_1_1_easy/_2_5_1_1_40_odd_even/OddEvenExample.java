package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_40_odd_even;

import java.util.Scanner;

public class OddEvenExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(oddEven(INPUT.nextInt()));
    }

    private static String oddEven(final int NUMBER) {
        return NUMBER % 2 == 0
                ? "زوجي"
                : "فردي";
    }
}