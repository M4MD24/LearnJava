package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_abstract_class._2_2_5_2_2_question_409;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). Create subclasses Circle and Triangle that extend the Shape class and implement the respective methods to calculate the area and perimeter of each shape.</h2>
 */

public class Question409 {
    public static void main(final String[] ARGS) {
        circle();
        triangle();
    }

    private static void circle() {
        final Circle CIRCLE = new Circle(5);
        System.out.printf("■ Circle:%nPerimeter: %f%nArea: %f",
                CIRCLE.calculatePerimeter(),
                CIRCLE.calculateArea());
    }

    private static void triangle() {
        final Triangle Triangle = new Triangle(3, 4, 5);
        System.out.printf("%n%n■ Triangle:%nPerimeter: %f%nArea: %f",
                Triangle.calculatePerimeter(),
                Triangle.calculateArea());
    }
}

abstract class Shape {
    abstract double calculatePerimeter();

    abstract double calculateArea();
}

class Circle extends Shape {
    private final double RADIUS;

    Circle(final double RADIUS) {
        this.RADIUS = RADIUS;
    }

    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * RADIUS;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(RADIUS, 2);
    }
}

class Triangle extends Shape {
    private final double FIRST_SIDE,
            SECOND_SIDE,
            THIRD_SIDE;

    Triangle(final double FIRST_SIDE, final double SECOND_SIDE, final double THIRD_SIDE) {
        this.FIRST_SIDE = FIRST_SIDE;
        this.SECOND_SIDE = SECOND_SIDE;
        this.THIRD_SIDE = THIRD_SIDE;
    }

    @Override
    double calculatePerimeter() {
        return FIRST_SIDE + SECOND_SIDE + THIRD_SIDE;
    }

    @Override
    double calculateArea() {
        final double SEMI_PERIMETER = (FIRST_SIDE + SECOND_SIDE + THIRD_SIDE) / 2;
        return Math.sqrt(SEMI_PERIMETER * (SEMI_PERIMETER - FIRST_SIDE) * (SEMI_PERIMETER - SECOND_SIDE) * (SEMI_PERIMETER - THIRD_SIDE));
    }
}