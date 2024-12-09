package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_8_number_to_string;

import java.util.Scanner;

public class NumberToStringExample {
    private static final String[] BELOW_TWENTY = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
            "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    private static final String[] TENS = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getNumberToWords(INPUT.nextInt()));
    }

    private static String getNumberToWords(final int NUMBER) {
        return NUMBER == 0 ? "zero" :
                NUMBER < 20 ? BELOW_TWENTY[NUMBER] :
                        NUMBER < 100 ? TENS[NUMBER / 10] + (NUMBER % 10 > 0 ? "-" + BELOW_TWENTY[NUMBER % 10] :
                                "") :
                                BELOW_TWENTY[NUMBER / 100] + " hundred" + (NUMBER % 100 > 0 ? " " + getNumberToWords(NUMBER % 100) :
                                        "");
    }
}
/*
999
NUMBER == 0     -> X
NUMBER < 20     -> X
NUMBER < 100    -> √
0.9
NUMBER % 10 > 0 -|(9 > 0)|-> √

*/