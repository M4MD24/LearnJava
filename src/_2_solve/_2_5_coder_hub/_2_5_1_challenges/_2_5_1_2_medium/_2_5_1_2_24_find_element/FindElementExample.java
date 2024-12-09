package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_24_find_element;

public class FindElementExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(findNumber(new int[]{2, 12, 34, 2, 3, 4, 5}, 4));
        System.out.println(findNumber(new int[]{3232, 1, 24, 45, 335, 454}, 3554));
        System.out.println(findNumber(new int[]{2, 5, 6, 7, 8, 2, 1}, 5));
        System.out.print(findNumber(new int[]{1, 5, 7, 3, 6, 1}, 1));
    }

    private static boolean findNumber(final int[] NUMBERS, final int TARGET_NUMBER) {
        return java.util.Arrays.stream(NUMBERS).anyMatch(number -> number == TARGET_NUMBER);
    }
}