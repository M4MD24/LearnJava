package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_46_reverse_case;

import java.util.Scanner;

public class ReverseCaseExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(reverseCase(INPUT.nextLine()));
    }

    private static String reverseCase(final String TEXT) {
        return TEXT.chars()
                .map(character -> Character.isUpperCase(character)
                        ? Character.toLowerCase(character)
                        : Character.toUpperCase(character))
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}