package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * array = {
 * <br/>
 * {true, false, true},
 * <br/>
 * {false, true, false}
 * <br/>
 * }
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * t f t
 * <br/>
 * f t f
 * </h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        printReverseValues(new boolean[][]{{true, false, true}, {false, true, false}});
    }

    private static void printReverseValues(final boolean[][] BOOLEAN_VALUES) {
        for (byte round = 0; round < BOOLEAN_VALUES.length; round++) {
            for (byte index = 0; index < BOOLEAN_VALUES[round].length; index++) {
                System.out.print(BOOLEAN_VALUES[round][index] ? 't' : 'f');
                if (index < BOOLEAN_VALUES[round].length - 1) System.out.print(' ');
            }
            if (round < BOOLEAN_VALUES.length - 1) System.out.println();
        }
    }
}