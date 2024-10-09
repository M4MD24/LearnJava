package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_35_array_root;

import java.util.Arrays;

public class ArrayRootExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(arrayRoot(new double[]{4, 81, 49})));
        System.out.println(Arrays.toString(arrayRoot(new double[]{15, 6, 3})));
        System.out.println(Arrays.toString(arrayRoot(new double[]{121, 144, 169})));
        System.out.print(Arrays.toString(arrayRoot(new double[]{4.2, 6.9})));
    }

    private static double[] arrayRoot(final double[] NUMBERS) {
        return Arrays
                .stream(NUMBERS)
                .map(Math::sqrt)
                .toArray();
    }
}