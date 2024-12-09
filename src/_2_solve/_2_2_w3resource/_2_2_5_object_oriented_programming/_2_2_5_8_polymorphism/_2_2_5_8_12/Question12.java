package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_8_polymorphism._2_2_5_8_12;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create two subclasses Circle and Cylinder. Override the draw() method in each subclass to draw the respective shape. In addition, override the calculateArea() method in the Cylinder subclass to calculate and return the total surface area of the cylinder.</h2>
 */
public class Question12 {
    public static void main(final String[] PARAMETERS) {
        final Shape SHAPE = new Shape();
        SHAPE.draw();
        System.out.println(SHAPE.calculateArea() + "\n");

        final Shape CIRCLE = new Circle(5);
        CIRCLE.draw();
        System.out.println(CIRCLE.calculateArea() + "\n");

        final Shape CYLINDER = new Cylinder(5, 4);
        CYLINDER.draw();
        System.out.print(CYLINDER.calculateArea());
    }
}

class Shape {
    void draw() {
        System.out.println("◘");
    }

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
    void draw() {
        System.out.println("●");
    }

    @Override
    double calculateArea() {
        return Math.PI * Math.pow(RADIUS, 2);
    }
}

class Cylinder extends Shape {
    private final double RADIUS,
            HEIGHT;

    Cylinder(final double RADIUS, final double HEIGHT) {
        this.RADIUS = RADIUS;
        this.HEIGHT = HEIGHT;
    }

    @Override
    void draw() {
        System.out.println("\uD83D\uDEE2");
    }

    @Override
    double calculateArea() {
        return 2 * Math.PI * RADIUS * (RADIUS + HEIGHT);
    }
}