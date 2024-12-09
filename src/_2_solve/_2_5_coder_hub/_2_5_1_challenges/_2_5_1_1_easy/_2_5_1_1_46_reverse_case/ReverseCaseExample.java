package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_46_reverse_case;

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