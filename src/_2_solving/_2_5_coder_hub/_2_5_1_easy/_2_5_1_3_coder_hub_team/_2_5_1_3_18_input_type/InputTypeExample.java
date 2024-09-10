package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_18_input_type;

import java.util.Scanner;

public class InputTypeExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(inputType(INPUT.nextLine()));
    }

    private static String inputType(final String VALUE) {
        if (VALUE.contains("."))
            return "double";
        else if (VALUE.matches(".*[0-9]"))
            return "integer";
        else
            return "string";
    }
}