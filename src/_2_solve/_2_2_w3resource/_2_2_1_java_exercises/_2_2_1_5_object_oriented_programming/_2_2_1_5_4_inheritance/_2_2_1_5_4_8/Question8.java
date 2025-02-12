package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_4_inheritance._2_2_1_5_4_8;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the area and perimeter of a circle.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) {
        final Circle CIRCLE = new Circle(5);
        System.out.printf("■ Circle:%nPerimeter: %f%nArea: %f",
                CIRCLE.getPerimeter(),
                CIRCLE.getArea());
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
        return Math.PI * (RADIUS * RADIUS);
    }
}