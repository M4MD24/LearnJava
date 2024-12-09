package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_8_polymorphism._2_2_5_8_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class Shape with methods getArea() and getPerimeter(). Create three subclasses: Circle, Rectangle, and Triangle. Override the getArea() and getPerimeter() methods in each subclass to calculate and return the area and perimeter of the respective shapes.</h2>
 */
public class Question6 {
    public static void main(final String[] PARAMETERS) {
        final Shape SHAPE = new Shape();
        System.out.println("Shape Perimeter: " + SHAPE.getPerimeter());
        System.out.println("Shape Area: " + SHAPE.getArea());

        final Shape CIRCLE = new Circle(5);
        System.out.println("\nCircle Perimeter: " + CIRCLE.getPerimeter());
        System.out.println("Circle Area: " + CIRCLE.getArea());

        final Shape RECTANGLE = new Rectangle(4, 6);
        System.out.println("\nRectangle Perimeter: " + RECTANGLE.getPerimeter());
        System.out.println("Rectangle Area: " + RECTANGLE.getArea());

        final Shape TRIANGLE = new Triangle(3, 4, 5);
        System.out.println("\nTriangle Perimeter: " + TRIANGLE.getPerimeter());
        System.out.print("Triangle Area: " + TRIANGLE.getArea());
    }
}

class Shape {
    double getPerimeter() {
        return 0;
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
    double getPerimeter() {
        return 2 * Math.PI * RADIUS;
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
    double getPerimeter() {
        return (WIDTH + LENGTH) * 2;
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
    double getPerimeter() {
        return FIRST_SIDE + SECOND_SIDE + THIRD_SIDE;
    }

    @Override
    double getArea() {
        final double SEMI_PERIMETER = (FIRST_SIDE + SECOND_SIDE + THIRD_SIDE) / 2;
        return Math.sqrt(SEMI_PERIMETER * (SEMI_PERIMETER - FIRST_SIDE) * (SEMI_PERIMETER - SECOND_SIDE) * (SEMI_PERIMETER - THIRD_SIDE));
    }
}