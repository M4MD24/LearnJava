package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_3_hard._2_6_1_3_135_candy;

/**
 * <h1>Problem:</h1>
 * <h2>
 * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * <br/>
 * You are giving candies to these children subjected to the following requirements:
 * <br/>
 * Each child must have at least one candy.
 * <br/>
 * Children with a higher rating get more candies than their neighbors.
 * <br/>
 * Return the minimum number of candies you need to have to distribute the candies to the children.
 * </h2>
 */

public class Candy {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 0, 2};
        System.out.print(candy(NUMBERS));
    }

    private static int candy(final int[] RATINGS) {
        final int COUNT_OF_CHILDREN = RATINGS.length;
        int totalCandies = 0;
        final int[] CANDIES = new int[COUNT_OF_CHILDREN];
        for (int index = 1; index < COUNT_OF_CHILDREN; index++)
            if (RATINGS[index] > RATINGS[index - 1])
                CANDIES[index] = CANDIES[index - 1] + 1;
        for (int index = COUNT_OF_CHILDREN - 2; index >= 0; index--)
            if (RATINGS[index] > RATINGS[index + 1])
                CANDIES[index] = Math.max(
                        CANDIES[index],
                        CANDIES[index + 1] + 1
                );
        for (int index = 0; index < COUNT_OF_CHILDREN; index++)
            totalCandies += CANDIES[index] + 1;
        return totalCandies;
    }
}