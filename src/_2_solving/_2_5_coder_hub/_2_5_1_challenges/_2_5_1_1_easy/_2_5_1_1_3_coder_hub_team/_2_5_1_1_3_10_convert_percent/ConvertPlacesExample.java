package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_10_convert_percent;

import java.util.Scanner;

public class ConvertPlacesExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(convertPercent(INPUT.nextLine()));
    }

    private static int convertPercent(final String NUMBER) {
        return NUMBER.contains(".")
                ? NUMBER.length() - NUMBER.indexOf('.') - 1
                : 0;
    }
}