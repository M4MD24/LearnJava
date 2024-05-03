package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_2_enum_types._2_2_2_2_4_question_291;

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

public class Question291 {
    public static void main(final String[] ARGS) {
        System.out.println(STR."Top: \{Direction.North}");
        System.out.println(STR."Right: \{Direction.East}");
        System.out.println(STR."Left: \{Direction.West}");
        System.out.print(STR."Down: \{Direction.South}");
    }
}