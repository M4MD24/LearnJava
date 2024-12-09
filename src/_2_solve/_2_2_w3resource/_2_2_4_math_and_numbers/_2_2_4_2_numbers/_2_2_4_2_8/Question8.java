package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_8;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to print out the first 10 Catalan numbers by extracting them from Pascal's triangle.
 * <br/>
 * In combinatorial mathematics, the Catalan numbers form a sequence of natural numbers that occur in various counting problems, often involving recursively-defined objects. They are named after the Belgian mathematician Eugène Charles Catalan.
 * <br/>
 * The first Catalan numbers for n = 0, 1, 2, 3, … are 1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, 16796, 58786, 208012, 742900, 2674440, 9694845, 35357670, 129644790, 477638700, 1767263190, 6564120420, 24466267020, 91482563640, 343059613650, 1289904147324, 4861946401452,
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * List 10 Catalan numbers:
 * <br/>
 * 1
 * <br/>
 * 2
 * <br/>
 * 5
 * <br/>
 * 14
 * <br/>
 * 42
 * <br/>
 * 132
 * <br/>
 * 429
 * <br/>
 * 1430
 * <br/>
 * 4862
 * <br/>
 * 16796
 * </h2>
 */
public class Question8 {
    public static void main(final String[] PARAMETERS) {
        final int COUNT_OF_CATALAN_NUMBERS = 10 + 1;
        printCatalanNumbers(COUNT_OF_CATALAN_NUMBERS);
    }

    private static void printCatalanNumbers(final int COUNT_OF_CATALAN_NUMBERS) {
        final long[] CATALAN_NUMBERS = new long[COUNT_OF_CATALAN_NUMBERS];
        System.out.println("List 10 Catalan numbers:");
        CATALAN_NUMBERS[0] = 1;
        for (int index = 0; index < COUNT_OF_CATALAN_NUMBERS - 1; index++) {
            System.out.print(CATALAN_NUMBERS[index + 1] = 2 * (2L * index + 1) * CATALAN_NUMBERS[index] / (index + 2));
            if (index < COUNT_OF_CATALAN_NUMBERS - 2)
                System.out.println();
        }
    }
}