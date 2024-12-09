package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_2_date_format;

import java.util.Scanner;

public class DateFormatExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getDateFormat(INPUT.nextLine()));
    }

    private static String getDateFormat(final String DATE) {
        final String[] DATE_PARTS = DATE.split("/+");
        final String DAY = DATE_PARTS[2],
                MONTH = DATE_PARTS[1],
                YEAR = DATE_PARTS[0];
        return String.format(DATE + " | %s-%s-%s | %s/%s/%s",
                YEAR,
                MONTH,
                DAY,
                MONTH,
                DAY,
                YEAR);
    }
}