package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_19_smallest_number;

public class SmallestElementExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(getMaximumNumber(new int[]{13, 2, 1, 4, 106}));
        System.out.println(getMaximumNumber(new int[]{90, 87, 56, 33, 83}));
        System.out.println(getMaximumNumber(new int[]{91, 67, 223, 943, 34}));
        System.out.print(getMaximumNumber(new int[]{43, 3, -5, 205}));
    }

    private static int getMaximumNumber(final int[] NUMBERS) {
        return java.util.Arrays.stream(NUMBERS).min().getAsInt();
    }
}