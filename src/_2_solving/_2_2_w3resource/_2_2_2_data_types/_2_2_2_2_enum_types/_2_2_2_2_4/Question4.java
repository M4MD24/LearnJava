package _2_solving._2_2_w3resource._2_2_2_data_types._2_2_2_2_enum_types._2_2_2_2_4;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to implement an enum called "Direction" with constants representing the cardinal directions (North, South, East, West).</h2>
 */

enum Direction {
    North,
    East,
    West,
    South
}

public class Question4 {
    public static void main(final String[] ARGS) {
        System.out.printf("Top: %s\n", Direction.North);
        System.out.printf("Right: %s\n", Direction.East);
        System.out.printf("Left: %s\n", Direction.West);
        System.out.printf("Down: %s", Direction.South);
    }
}