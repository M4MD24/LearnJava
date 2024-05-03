package _2_problem_solving._2_2_w3resource._2_2_2_data_types._2_2_2_2_enum_types._2_2_2_2_3_question_290;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to implement an enum called "Shape" with constants representing different geometric shapes.</h2>
 */

enum Shape {
    Circle,
    Triangle,
    Square,
    Rectangle,
    Parallelogram,
    Hexagon
}

public class Question290 {
    public static void main(final String[] ARGS) {
        System.out.println(Shape.Circle);
        System.out.print(Shape.Triangle);
    }
}