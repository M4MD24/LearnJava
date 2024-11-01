package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_15_get_duplicate_elements;

import java.util.ArrayList;
import java.util.Arrays;

public class GetDuplicateElementExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getDuplicateNumbers(new int[]{2, 3, 2, 3})));
        System.out.println(Arrays.toString(getDuplicateNumbers(new int[]{10, 5, 9, 5})));
        System.out.println(Arrays.toString(getDuplicateNumbers(new int[]{6, 3, 12, 12})));
        System.out.print(Arrays.toString(getDuplicateNumbers(new int[]{3, -9, -9, -4})));
    }

    private static int[] getDuplicateNumbers(final int[] NUMBERS) {
        final ArrayList<Integer> DUPLICATE_NUMBERS = new ArrayList<>();
        for (int round = 0; round < NUMBERS.length; round++) {
            final int TARGET_NUMBER = NUMBERS[round];
            for (int index = round + 1; index < NUMBERS.length; index++) {
                final int CURRENT_NUMBER = NUMBERS[index];
                if (!DUPLICATE_NUMBERS.contains(TARGET_NUMBER) && TARGET_NUMBER == CURRENT_NUMBER) {
                    DUPLICATE_NUMBERS.add(TARGET_NUMBER);
                    break;
                }
            }
        }
        return DUPLICATE_NUMBERS
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}