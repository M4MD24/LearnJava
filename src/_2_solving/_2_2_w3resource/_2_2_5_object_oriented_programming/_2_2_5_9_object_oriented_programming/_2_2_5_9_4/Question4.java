package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_4;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Circle" with a radius attribute. You can access and modify this attribute. Calculate the area and circumference of the circle.</h2>
 */

public class Question4 {
    private static final Circle[] CIRCLES = {new Circle(3), new Circle(0)};

    public static void main(final String[] PARAMETERS) {
        printDetailsOfCircles();
    }

    private static void printDetailsOfCircles() {
        CIRCLES[1].setRadius(4);
        for (int index = 0; index < CIRCLES.length; index++) {
            System.out.println("■ " + index);
            System.out.println("Radius: " + CIRCLES[index].getRadius());
            System.out.println("Area: " + CIRCLES[index].getArea());
            System.out.print("Circumference: " + CIRCLES[index].getCircumference());
            if (index < CIRCLES.length - 1)
                System.out.println("\n");
        }
    }
}

class Circle {
    private float radius;

    Circle(final float radius) {
        this.radius = radius;
    }

    float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }

    float getCircumference() {
        return (float) (2 * Math.PI * radius);
    }

    float getRadius() {
        return radius;
    }

    void setRadius(final float RADIUS) {
        this.radius = RADIUS;
    }
}