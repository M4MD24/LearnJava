package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_66_count_down_by_three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CountDownByThreeExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(Arrays.toString(getEvenNumbersWithCountDownByThree(INPUT.nextInt())));
    }

    private static int[] getEvenNumbersWithCountDownByThree(int number) {
        final ArrayList<Integer> EVEN_NUMBERS = new ArrayList<>();
        while (number > 0)
            if ((number -= 3) % 2 == 0 && number > 0)
                EVEN_NUMBERS.add(number);
        return EVEN_NUMBERS.isEmpty()
                ? new int[]{0}
                : EVEN_NUMBERS.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}