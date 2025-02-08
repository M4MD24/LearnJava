package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_9_decimal_places;

import java.util.Scanner;

public class DecimalPlacesExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(decimalPlaces(INPUT.nextLine()));
    }

    private static int decimalPlaces(final String NUMBER) {
        return NUMBER.contains(".")
                ? NUMBER.length() - NUMBER.indexOf('.') - 1
                : 0;
    }
}