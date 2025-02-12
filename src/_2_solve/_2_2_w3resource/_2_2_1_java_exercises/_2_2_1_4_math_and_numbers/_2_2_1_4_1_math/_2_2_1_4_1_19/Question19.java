package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_4_math_and_numbers._2_2_1_4_1_math._2_2_1_4_1_19;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to generate a magic square of order n (all row, column, and diagonal sums are equal).
 * <br/>
 * From Wikipedia, In recreational mathematics and combinatorial design, a magic square is a n x n square grid (where n is the number of cells on each side) filled with distinct positive integers in the range 1, 2, ..., n2 such that each cell contains a different integer and the sum of the integers in each row, column and diagonal is equal. The sum is called the magic constant or magic sum of the magic square. A square grid with n cells on each side is said to have order n.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 * Input a number: 13
 *  79  94 109 124 139 154 169   2  17  32  47  62  77
 *  78  80  95 110 125 140 155 157   3  18  33  48  63
 *  64  66  81  96 111 126 141 156 158   4  19  34  49
 *  50  65  67  82  97 112 127 142 144 159   5  20  35
 *  36  51  53  68  83  98 113 128 143 145 160   6  21
 *  22  37  52  54  69  84  99 114 129 131 146 161   7
 *   8  23  38  40  55  70  85 100 115 130 132 147 162
 * 163   9  24  39  41  56  71  86 101 116 118 133 148
 * 149 164  10  25  27  42  57  72  87 102 117 119 134
 * 135 150 165  11  26  28  43  58  73  88 103 105 120
 * 121 136 151 166  12  14  29  44  59  74  89 104 106
 * 107 122 137 152 167  13  15  30  45  60  75  90  92
 *  93 108 123 138 153 168   1  16  31  46  61  76  91
 * */
public class Question19 {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Input odd number greater than 2: ");
        final int NUMBER = INPUT.nextInt();
        if (NUMBER % 2 != 0)
            generateMagicSquare(NUMBER);
        else {
            System.out.println();
            Question19.main(ARGUMENTS);
        }
    }

    private static void generateMagicSquare(final int COUNT_OF_ROWS_AND_COLUMNS) {
        final int[][] MAGIC_SQUARE = new int[COUNT_OF_ROWS_AND_COLUMNS][COUNT_OF_ROWS_AND_COLUMNS];
        int number = 1,
                currentRow = 0,
                currentColumn = COUNT_OF_ROWS_AND_COLUMNS / 2;

        while (number <= COUNT_OF_ROWS_AND_COLUMNS * COUNT_OF_ROWS_AND_COLUMNS) {
            MAGIC_SQUARE[currentRow][currentColumn] = number;
            number++;
            currentRow--;
            currentColumn++;

            if (currentRow == -1 && currentColumn == COUNT_OF_ROWS_AND_COLUMNS) {
                currentRow = 1;
                currentColumn = COUNT_OF_ROWS_AND_COLUMNS - 1;
            } else if (currentRow == -1)
                currentRow = COUNT_OF_ROWS_AND_COLUMNS - 1;
            else if (currentColumn == COUNT_OF_ROWS_AND_COLUMNS)
                currentColumn = 0;

            if (MAGIC_SQUARE[currentRow][currentColumn] != 0) {
                if (currentRow == COUNT_OF_ROWS_AND_COLUMNS - 1)
                    currentRow = 0;
                else
                    currentRow += 2;
                if (currentColumn == 0)
                    currentColumn = COUNT_OF_ROWS_AND_COLUMNS - 1;
                else
                    currentColumn--;
            }
        }
        printMagicSquare(MAGIC_SQUARE);
    }

    private static void printMagicSquare(final int[][] MAGIC_SQUARE) {
        for (final int[] ROWS_OF_MAGIC_SQUARE : MAGIC_SQUARE) {
            for (final int NUMBER : ROWS_OF_MAGIC_SQUARE)
                System.out.printf("%3d ", NUMBER);
            System.out.println();
        }
    }
}