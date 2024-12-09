package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_29_last_element;

public class LastElementExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getLastElement(new int[]{42, 32, 42, 11, 30}));
        System.out.println(getLastElement(new int[]{34, 2, 23, 545, 6}));
        System.out.println(getLastElement(new int[]{5, 645, 3, 34, 5, 7, 0}));
        System.out.print(getLastElement(new int[]{3, 4, 5, 6, 1, 4, 6}));
    }

    private static int getLastElement(final int[] NUMBERS) {
        return NUMBERS[NUMBERS.length - 1];
    }
}