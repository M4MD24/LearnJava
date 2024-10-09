package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_3_coder_hub_team._2_5_1_1_3_24_delete_element_in_array;

import java.util.Arrays;

public class DeleteElementInArrayExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(deleteNumberByIndex(new int[]{2, 3, 2, 3}, 2)));
        System.out.println(Arrays.toString(deleteNumberByIndex(new int[]{10, 5, 9, 5}, 0)));
        System.out.println(Arrays.toString(deleteNumberByIndex(new int[]{6, 3, 12, 12}, 1)));
        System.out.print(Arrays.toString(deleteNumberByIndex(new int[]{3, -9, -9, -4}, 0)));
    }

    private static int[] deleteNumberByIndex(final int[] NUMBERS, final int INDEX) {
        return java.util.stream.IntStream.range(0, NUMBERS.length)
                .filter(index -> index != INDEX)
                .map(index -> NUMBERS[index])
                .toArray();
    }
}