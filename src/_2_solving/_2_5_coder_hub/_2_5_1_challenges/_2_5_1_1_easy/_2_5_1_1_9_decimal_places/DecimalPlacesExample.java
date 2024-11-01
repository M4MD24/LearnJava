package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_9_decimal_places;

import java.util.Scanner;

public class DecimalPlacesExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(decimalPlaces(INPUT.nextLine()));
    }

    private static double decimalPlaces(final String PERCENTAGE) {
        return Double.parseDouble(PERCENTAGE.replace("%", "")) / 100;
    }
}