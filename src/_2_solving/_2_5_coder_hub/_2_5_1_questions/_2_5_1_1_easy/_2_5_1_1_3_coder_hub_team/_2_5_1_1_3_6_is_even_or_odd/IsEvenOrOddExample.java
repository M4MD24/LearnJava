package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_6_is_even_or_odd;

import java.util.Scanner;

public class IsEvenOrOddExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isEvenOrOdd(INPUT.nextInt()));
    }

    private static String isEvenOrOdd(final int NUMBER) {
        return NUMBER % 2 == 0
                ? "even"
                : "odd";
    }
}