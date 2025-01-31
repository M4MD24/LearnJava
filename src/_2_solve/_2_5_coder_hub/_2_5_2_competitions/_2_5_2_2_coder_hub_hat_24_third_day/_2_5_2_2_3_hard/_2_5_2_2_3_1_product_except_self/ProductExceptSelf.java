package _2_solve._2_5_coder_hub._2_5_2_competitions._2_5_2_2_coder_hub_hat_24_third_day._2_5_2_2_3_hard._2_5_2_2_3_1_product_except_self;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{2, 3, 4, 5})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{0, 1, 2, 3})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }

    private static int[] productExceptSelf(final int[] NUMBERS) {
        final int[] productExceptSelf = new int[NUMBERS.length];
        for (int ruond = 0; ruond < NUMBERS.length; ruond++) {
            int sumOfProductExceptSelf = 1;
            for (int index = 0; index < NUMBERS.length; index++)
                if (ruond != index)
                    sumOfProductExceptSelf *= NUMBERS[index];
            productExceptSelf[ruond] = sumOfProductExceptSelf;
        }
        return productExceptSelf;
    }
}