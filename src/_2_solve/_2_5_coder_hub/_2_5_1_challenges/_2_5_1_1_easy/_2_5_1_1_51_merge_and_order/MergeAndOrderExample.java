package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_51_merge_and_order;

import java.util.Arrays;

public class MergeAndOrderExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{1, 2}, new int[]{1, 5})));
        System.out.println(Arrays.toString(mergeArrays(new int[]{}, new int[]{1, 4, 9})));
        System.out.print(Arrays.toString(mergeArrays(new int[]{}, new int[]{})));
    }

    private static int[] mergeArrays(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS) {
        return java.util.stream.IntStream.concat(
                        java.util.Arrays.stream(FIRST_NUMBERS),
                        java.util.Arrays.stream(SECOND_NUMBERS))
                .sorted()
                .toArray();
    }
}