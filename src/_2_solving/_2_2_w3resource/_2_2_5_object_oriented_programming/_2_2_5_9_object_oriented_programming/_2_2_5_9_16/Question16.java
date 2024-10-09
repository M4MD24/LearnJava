package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_16;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Shape" with abstract methods for calculating area and perimeter, and subclasses for "Rectangle", "Circle", and "Triangle".</h2>
 */

public class Question16 {
    public static void main(final String[] PARAMETERS) {
        final Shape CIRCLE = new Circle(5);
        System.out.println("Circle Perimeter: " + CIRCLE.calculatingPerimeter());
        System.out.println("Circle Area: " + CIRCLE.calculatingArea());

        final Shape RECTANGLE = new Rectangle(4, 6);
        System.out.println("\nRectangle Perimeter: " + RECTANGLE.calculatingPerimeter());
        System.out.println("Rectangle Area: " + RECTANGLE.calculatingArea());

        final Shape TRIANGLE = new Triangle(3, 4, 5);
        System.out.println("\nTriangle Perimeter: " + TRIANGLE.calculatingPerimeter());
        System.out.print("Triangle Area: " + TRIANGLE.calculatingArea());
    }
}

abstract class Shape {
    abstract double calculatingPerimeter();

    abstract double calculatingArea();
}

class Rectangle extends Shape {
    private final double WIDTH,
            LENGTH;

    Rectangle(final double WIDTH, final double LENGTH) {
        this.WIDTH = WIDTH;
        this.LENGTH = LENGTH;
    }

    @Override
    double calculatingPerimeter() {
        return (WIDTH + LENGTH) * 2;
    }

    @Override
    double calculatingArea() {
        return WIDTH * LENGTH;
    }
}

class Circle extends Shape {
    private final double RADIUS;

    Circle(final double RADIUS) {
        this.RADIUS = RADIUS;
    }

    @Override
    double calculatingPerimeter() {
        return 2 * Math.PI * RADIUS;
    }

    @Override
    double calculatingArea() {
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
    double calculatingPerimeter() {
        return FIRST_SIDE + SECOND_SIDE + THIRD_SIDE;
    }

    @Override
    double calculatingArea() {
        final double SEMI_PERIMETER = (FIRST_SIDE + SECOND_SIDE + THIRD_SIDE) / 2;
        return Math.sqrt(SEMI_PERIMETER * (SEMI_PERIMETER - FIRST_SIDE) * (SEMI_PERIMETER - SECOND_SIDE) * (SEMI_PERIMETER - THIRD_SIDE));
    }
}