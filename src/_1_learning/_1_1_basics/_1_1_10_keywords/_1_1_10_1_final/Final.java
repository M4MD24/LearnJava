package _1_learning._1_1_basics._1_1_10_keywords._1_1_10_1_final;

public class Final {
    public static void main(final String[] ARGS) {
        final int variable = 5;
        /* Error! */
//         variable = 2;

        final int[] array = {1, 2, 3, 4, 5, 6};
        /* Error! */
//        array = new int[]{1, 2};
    }
}
