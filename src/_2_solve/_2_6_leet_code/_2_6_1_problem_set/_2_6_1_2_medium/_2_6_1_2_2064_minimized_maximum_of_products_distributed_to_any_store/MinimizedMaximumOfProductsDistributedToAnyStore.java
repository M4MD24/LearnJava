package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_2064_minimized_maximum_of_products_distributed_to_any_store;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an integer n indicating there are n specialty retail stores. There are m product types of varying amounts, which are given as a 0-indexed integer array quantities, where quantities[i] represents the number of products of the ith product type.
 * <br/>
 * <br/>
 * You need to distribute all products to the retail stores following these rules:
 * <br/>
 * <br/>
 * • A store can only be given at most one product type but can be given any amount of it.
 * <br/>
 * <br/>
 * • After distribution, each store will have been given some number of products (possibly 0). Let x represent the maximum number of products given to any store. You want x to be as small as possible, i.e., you want to minimize the maximum number of products that are given to any store.
 * <br/>
 * <br/>
 * Return the minimum possible x.
 * </h2>
 */

public class MinimizedMaximumOfProductsDistributedToAnyStore {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minimizedMaximum(
                6,
                new int[]{11, 6}
        ));
    }

    private static int minimizedMaximum(final int STORE_COUNT, final int[] PRODUCT_QUANTITIES) {
        System.gc();
        int minimumLimit = 1,
                maximumLimit = 0;
        for (final int QUANTITY : PRODUCT_QUANTITIES)
            maximumLimit = Math.max(maximumLimit, QUANTITY);
        while (minimumLimit < maximumLimit) {
            final int MIDDLE = (minimumLimit + maximumLimit) / 2;
            if (canDistribute(STORE_COUNT, PRODUCT_QUANTITIES, MIDDLE))
                maximumLimit = MIDDLE;
            else
                minimumLimit = MIDDLE + 1;
        }
        return minimumLimit;
    }

    private static boolean canDistribute(final int STORE_COUNT, final int[] PRODUCT_QUANTITIES, final int MAXIMUM_PRODUCTS_PER_STORE) {
        int requiredStores = 0;
        for (final int QUANTITY : PRODUCT_QUANTITIES)
            requiredStores += (QUANTITY + MAXIMUM_PRODUCTS_PER_STORE - 1) / MAXIMUM_PRODUCTS_PER_STORE;
        return requiredStores <= STORE_COUNT;
    }
}