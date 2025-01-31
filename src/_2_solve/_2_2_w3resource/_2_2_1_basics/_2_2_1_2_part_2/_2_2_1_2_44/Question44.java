package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_44;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to determine the all positions of a given number in a given matrix. If the number is not found print ("Number not found!").</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * (0,2)
 * <br/>
 * (1,0)
 * <br/>
 * (2,1)
 * </h2>
 */

public class Question44 {
    public static void main(final String[] ARGUMENTS) {
        final int TARGET_NUMBER = 3;
        final int[][] MATRIX = {
                {2, 5, 3},
                {3, 2, 1},
                {1, 3, 5},
        };
        final ArrayList<Position> POSITIONS = getPositions(MATRIX, TARGET_NUMBER);
        printPositions(POSITIONS);
    }

    private static void printPositions(ArrayList<Position> POSITIONS) {
        for (final Position POSITION : POSITIONS)
            System.out.printf("(%d, %d)\n",
                    POSITION.row,
                    POSITION.column);
    }

    private static ArrayList<Position> getPositions(final int[][] MATRIX, final int TARGET_NUMBER) {
        final ArrayList<Position> POSITIONS = new ArrayList<>();
        for (int row = 0; row < MATRIX.length; row++)
            for (int column = 0; column < MATRIX[row].length; column++)
                if (MATRIX[row][column] == TARGET_NUMBER)
                    POSITIONS.add(new Position(row, column));
        return POSITIONS;
    }
}

class Position {
    int row,
            column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }
}