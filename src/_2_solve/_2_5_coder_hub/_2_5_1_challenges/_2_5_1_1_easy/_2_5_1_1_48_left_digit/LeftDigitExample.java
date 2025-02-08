package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_48_left_digit;

import java.util.Scanner;

public class LeftDigitExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(left_digit(INPUT.nextLine()));
    }

    public static int left_digit(final String TEXT) {
        for (final char CHARACTER : TEXT.toCharArray())
            if (String.valueOf(CHARACTER).matches("[0-9]"))
                return
                        CHARACTER - '0';
        return -1;
    }
}