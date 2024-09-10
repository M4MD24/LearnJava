package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_7_say_hi_bye;

import java.util.Scanner;

public class SayHiByeExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(sayHiBye(INPUT.nextLine(), INPUT.nextInt()));
    }

    private static String sayHiBye(final String TEXT, final int NUMBER) {
        return NUMBER == 0
                ? "Bye " + TEXT
                : "Hi " + TEXT;
    }
}