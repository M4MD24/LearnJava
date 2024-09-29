package _1_learning._1_6_algorithms._1_6_1_search._1_6_1_9_saddle_back;

public class SaddleBackExample {
    public static void main(final String[] PARAMETERS) {
        final int[][] NUMBERS = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        final int TARGET = 10;
        System.out.print(saddleBack(NUMBERS, TARGET));
    }

    private static String saddleBack(final int[][] ARRAY, final int TARGET) {
        for (int row = 0; row < ARRAY.length; row++)
            for (int column = 0; column < ARRAY[row].length; column++)
                if (ARRAY[row][column] == TARGET)
                    return "Element found at row: " + row + ", column: " + column;
        return "Element not found";
    }
}