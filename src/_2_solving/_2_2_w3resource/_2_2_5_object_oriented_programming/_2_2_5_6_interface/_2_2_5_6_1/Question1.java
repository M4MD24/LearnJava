package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_interface._2_2_5_6_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface Shape with the getArea() method. Create three classes Rectangle, Circle, and Triangle that implement the Shape interface. Implement the getArea() method for each of the three classes.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        rectangle();
        circle();
        triangle();
    }

    private static void triangle() {
        final Shape TRIANGLE = new Triangle(4, 5);
        System.out.print("Triangle Area: " + TRIANGLE.getArea());
    }

    private static void circle() {
        final Shape CIRCLE = new Circle(3);
        System.out.println("Circle Area: " + CIRCLE.getArea());
    }

    private static void rectangle() {
        final Shape RECTANGLE = new Rectangle(5, 10);
        System.out.println("Rectangle Area: " + RECTANGLE.getArea());
    }
}

interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private final double WIDTH,
            HEIGHT;

    Rectangle(final double WIDTH, final double HEIGHT) {
        this.WIDTH = WIDTH;
        this.HEIGHT = HEIGHT;
    }

    @Override
    public double getArea() {
        return WIDTH * HEIGHT;
    }
}

class Circle implements Shape {
    private final double RADIUS;

    Circle(final double RADIUS) {
        this.RADIUS = RADIUS;
    }

    @Override
    public double getArea() {
        return Math.PI * RADIUS * RADIUS;
    }
}

class Triangle implements Shape {
    private final double BASE,
            HEIGHT;

    Triangle(final double BASE, final double HEIGHT) {
        this.BASE = BASE;
        this.HEIGHT = HEIGHT;
    }

    @Override
    public double getArea() {
        return BASE * HEIGHT;
    }
}