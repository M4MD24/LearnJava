package _1_learn._1_1_basics._1_1_10_keywords._1_1_10_1_final;

public class Final {
    public static void main(final String[] ARGUMENTS) {
        final int variable = 5;
        /* Error! */
//         variable = 2;

        final int[] array = {1, 2, 3, 4, 5, 6};
        /* Error! */
//        array = new int[]{1, 2};
    }
}