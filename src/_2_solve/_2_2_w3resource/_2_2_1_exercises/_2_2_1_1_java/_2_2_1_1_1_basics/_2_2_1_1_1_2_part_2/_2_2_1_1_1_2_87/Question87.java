package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_87;

/**
 * <h1>Problem:</h1>
 * <h2>
 * There are 10 vertical and horizontal squares on a plane. Each square is painted in blue and green. Blue represents the sea, and green represents the land. When two green squares are in contact with the top and bottom, or right and left, they are ground. The area created by only one green square is called an "island". For example, the figure below shows five islands.
 * <br/>
 * Write a Java program to read the mass data and find the number of islands.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input 10 rows of 10 numbers representing green squares (island) as 1 and blue squares (sea) as zeros
 * <br/>
 * 1100000111
 * <br/>
 * 1000000111
 * <br/>
 * 0000000111
 * <br/>
 * 0010001000
 * <br/>
 * 0000011100
 * <br/>
 * 0000111110
 * <br/>
 * 0001111111
 * <br/>
 * 1000111110
 * <br/>
 * 1100011100
 * <br/>
 * 1110001000
 * <br/>
 * Number of islands:
 * <br/>
 * 5
 * </h2>
 */

public class Question87 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println("Input 10 rows of 10 numbers representing green squares (island) as 1 and blue squares (sea) as zeros");
        final StringBuilder[] MAP = {
                new StringBuilder("1100000111"),
                new StringBuilder("1000000111"),
                new StringBuilder("0000000111"),
                new StringBuilder("0010001000"),
                new StringBuilder("0000011100"),
                new StringBuilder("0000111110"),
                new StringBuilder("0001111111"),
                new StringBuilder("1000111110"),
                new StringBuilder("1100011100"),
                new StringBuilder("1110001000"),
        };
        printMap(MAP);
        System.out.printf("\nCount of islands: %d", getCountOfIsland(MAP));
    }

    private static void printMap(final StringBuilder[] MAP) {
        for (final StringBuilder LINE : MAP)
            System.out.println(LINE);
    }

    private static int getCountOfIsland(final StringBuilder[] MAP) {
        int countOfLands = 0;
        for (int row = 0; row < MAP.length; row++)
            for (int column = 0; column < MAP[row].length(); column++)
                if (MAP[row].charAt(column) == '1') {
                    countOfLands++;
                    markIsPartOfIsland(MAP, row, column);
                }
        return countOfLands;
    }

    private static void markIsPartOfIsland(final StringBuilder[] MAP, final int ROW, final int COLUMN) {
        if (ROW < 0 || ROW >= 10 || COLUMN < 0 || COLUMN >= 10 || MAP[ROW].charAt(COLUMN) != '1')
            return;
        MAP[ROW].setCharAt(COLUMN, '-');
        markIsPartOfIsland(MAP, ROW + 1, COLUMN);
        markIsPartOfIsland(MAP, ROW - 1, COLUMN);
        markIsPartOfIsland(MAP, ROW, COLUMN + 1);
        markIsPartOfIsland(MAP, ROW, COLUMN - 1);
    }
}