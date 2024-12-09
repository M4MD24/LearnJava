package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_238_product_of_array_except_self;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <br/>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <br/>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * </h2>
 */

public class ProductOfArrayExceptSelf {
    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBERS = {1, 2, 3, 4};
        System.out.print(Arrays.toString(productExceptSelf(FIRST_NUMBERS)));
    }

    private static int[] productExceptSelf(final int[] NUMBERS) {
        final int[] PRODUCT_ARRAY = new int[NUMBERS.length];
        {
            int currentIndex = 0,
                    product = 1;
            while (currentIndex < NUMBERS.length) {
                PRODUCT_ARRAY[currentIndex] = product;
                product *= NUMBERS[currentIndex++];
            }
        }
        {
            int currentIndex = NUMBERS.length - 1,
                    product = 1;
            while (currentIndex >= 0) {
                PRODUCT_ARRAY[currentIndex] *= product;
                product *= NUMBERS[currentIndex--];
            }
        }
        return PRODUCT_ARRAY;
    }
}