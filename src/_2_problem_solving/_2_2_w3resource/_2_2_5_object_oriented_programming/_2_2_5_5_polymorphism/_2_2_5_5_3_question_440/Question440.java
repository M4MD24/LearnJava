package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_polymorphism._2_2_5_5_3_question_440;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.</h2>
 */

public class Question440 {
    public static void main(final String[] ARGS) {
        final Shape SHAPE = new Shape();
        System.out.println("Shape Area: " + SHAPE.calculateArea());

        final Shape CIRCLE = new Circle(5);
        System.out.println("Circle Area: " + CIRCLE.calculateArea());

        final Shape RECTANGLE = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + RECTANGLE.calculateArea());

        final Shape TRIANGLE = new Triangle(3, 4, 5);
        System.out.print("Triangle Area: " + TRIANGLE.calculateArea());
    }
}

class Shape {
    double calculateArea() {
        return 0;
    }
}

class Circle extends Shape {
    private final double RADIUS;

    Circle(final double RADIUS) {
        this.RADIUS = RADIUS;
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(RADIUS, 2);
    }
}

class Rectangle extends Shape {
    private final double WIDTH,
            LENGTH;

    Rectangle(final double WIDTH, final double LENGTH) {
        this.WIDTH = WIDTH;
        this.LENGTH = LENGTH;
    }

    @Override
    double calculateArea() {
        return WIDTH * LENGTH;
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
    double calculateArea() {
        final double SEMI_PERIMETER = (FIRST_SIDE + SECOND_SIDE + THIRD_SIDE) / 2;
        return Math.sqrt(SEMI_PERIMETER * (SEMI_PERIMETER - FIRST_SIDE) * (SEMI_PERIMETER - SECOND_SIDE) * (SEMI_PERIMETER - THIRD_SIDE));
    }
}