package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_17_date;

import java.util.Scanner;

public class DateExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(checkDateByCoderHubDate(INPUT.nextLine()));
    }

    private static boolean checkDateByCoderHubDate(final String DATE) {
        final int YEAR_OF_DATE = Integer.parseInt(DATE.substring(0, 4));
        return YEAR_OF_DATE <= 2018 && YEAR_OF_DATE > (2022 - 200);
    }
}