package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_8_polymorphism._2_2_5_8_8;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a base class Shape with methods draw() and calculateArea(). Create three subclasses: Circle, Square, and Triangle. Override the draw() method in each subclass to draw the respective shape, and override the calculateArea() method to calculate and return the area of each shape.</h2>
 */
public class Question8 {
    public static void main(final String[] PARAMETERS) {
        final Shape SHAPE = new Shape();
        SHAPE.draw();
        System.out.println("Shape Area: " + SHAPE.getArea() + "\n");

        final Shape CIRCLE = new Circle(5);
        CIRCLE.draw();
        System.out.println("Circle Area: " + CIRCLE.getArea() + "\n");

        final Shape RECTANGLE = new Rectangle(4, 6);
        RECTANGLE.draw();
        System.out.println("Rectangle Area: " + RECTANGLE.getArea() + "\n");

        final Shape TRIANGLE = new Triangle(3, 4, 5);
        TRIANGLE.draw();
        System.out.print("Triangle Area: " + TRIANGLE.getArea());
    }
}

class Shape {
    void draw() {
        System.out.println("◘");
    }

    double getArea() {
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
    double getArea() {
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
    void draw() {
        System.out.println("▬");
    }

    @Override
    double getArea() {
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
    void draw() {
        System.out.println("▲");
    }

    @Override
    double getArea() {
        final double SEMI_PERIMETER = (FIRST_SIDE + SECOND_SIDE + THIRD_SIDE) / 2;
        return Math.sqrt(SEMI_PERIMETER * (SEMI_PERIMETER - FIRST_SIDE) * (SEMI_PERIMETER - SECOND_SIDE) * (SEMI_PERIMETER - THIRD_SIDE));
    }
}