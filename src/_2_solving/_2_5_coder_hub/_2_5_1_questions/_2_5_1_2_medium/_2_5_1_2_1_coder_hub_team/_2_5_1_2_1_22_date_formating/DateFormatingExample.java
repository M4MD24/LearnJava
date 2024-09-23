package _2_solving._2_5_coder_hub._2_5_1_questions._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_22_date_formating;

import java.util.Scanner;

public class DateFormatingExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(dateFormating(INPUT.nextLine()));
    }

    private static String dateFormating(final String DATE) {
        final String[] DATE_PARTS = DATE.split("-+");
        return DATE_PARTS[2] + "-" + DATE_PARTS[1] + "-" + DATE_PARTS[0];
    }
}