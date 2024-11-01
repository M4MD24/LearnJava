package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_55_remove_duplicate;

import java.util.Arrays;

public class RemoveDuplicateExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getNumbersAfterRemoveDuplicateNumbers(new int[]{7, 8, 9, 7})));
        System.out.println(Arrays.toString(getNumbersAfterRemoveDuplicateNumbers(new int[]{10, -10, -10, 10})));
        System.out.println(Arrays.toString(getNumbersAfterRemoveDuplicateNumbers(new int[]{100, 101, 102, 100})));
        System.out.print(Arrays.toString(getNumbersAfterRemoveDuplicateNumbers(new int[]{12, 3})));
    }

    private static int[] getNumbersAfterRemoveDuplicateNumbers(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS)
                .distinct()
                .toArray();
    }
}