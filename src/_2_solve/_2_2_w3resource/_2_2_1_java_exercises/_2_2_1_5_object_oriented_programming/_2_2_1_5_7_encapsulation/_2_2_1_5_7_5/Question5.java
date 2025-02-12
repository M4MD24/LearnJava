package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_7_encapsulation._2_2_1_5_7_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Circle with a private instance variable radius. Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.</h2>
 */

public class Question5 {
    private static final Circle CIRCLE = new Circle();

    public static void main(final String[] ARGUMENTS) {
        addDataCircle();
        getInformationCircle();
    }

    private static void getInformationCircle() {
        System.out.printf("Radius: %f%nPerimeter: %f%nArea: %f",
                CIRCLE.getRadius(),
                CIRCLE.calculatePerimeter(),
                CIRCLE.calculateArea());
    }

    private static void addDataCircle() {
        CIRCLE.setRadius(4);
    }
}

class Circle {
    private double radius;

    double getRadius() {
        return radius;
    }

    void setRadius(final double RADIUS) {
        radius = RADIUS;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}