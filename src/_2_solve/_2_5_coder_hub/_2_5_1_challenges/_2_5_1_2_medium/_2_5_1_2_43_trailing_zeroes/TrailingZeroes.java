package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_43_trailing_zeroes;

public class TrailingZeroes {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(trailingZeroes(100));
    }

    private static int trailingZeroes(int number) {
        int trailingZeros = 0;
        while (number > 0)
            trailingZeros += number /= 5;
        return trailingZeros;
    }
}