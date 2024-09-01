package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_7;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to display the first 50 pentagonal numbers.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>A pentagonal number is a figurative number that extends the concept of triangular and square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 * 1     5     12    22    35    51    70    92    117   145
 * 176   210   247   287   330   376   425   477   532   590
 * 651   715   782   852   925   1001  1080  1162  1247  1335
 * 1426  1520  1617  1717  1820  1926  2035  2147  2262  2380
 * 2501  2625  2752  2882  3015  3151  3290  3432  3577  3725
 * */
public class Question7 {
    public static void main(final String[] ARGS) {
        final int COUNT_OF_PENTAGONAL_NUMBERS = 50;
        System.out.printf("The first %d pentagonal numbers are:\n", COUNT_OF_PENTAGONAL_NUMBERS);
        displayPentagonalNumbers(50);
    }

    private static void displayPentagonalNumbers(final int COUNT_OF_PENTAGONAL_NUMBERS) {
        for (int index = 1; index <= COUNT_OF_PENTAGONAL_NUMBERS; index++) {
            System.out.printf("%-6d", getPentagonalNumber(index));
            if (index % 10 == 0)
                System.out.println();
        }
    }

    private static int getPentagonalNumber(final int NUMBER) {
        return NUMBER * (3 * NUMBER - 1) / 2;
    }
}