package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_18_sort_by_length;

import java.util.Scanner;

public class SortByLengthExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getTextAfterSortByLength(INPUT.nextLine()));
    }

    private static String getTextAfterSortByLength(final String TEXT) {
        return String.join(
                " ",
                java.util.Arrays
                        .stream(TEXT.split(" +"))
                        .sorted(java.util.Comparator
                                .comparingInt(String::length))
                        .toList()
        );
    }
}