package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_interface._2_2_5_6_6;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an interface Drawable with a method draw() that takes no arguments and returns void. Create three classes Circle, Rectangle, and Triangle that implement the Drawable interface and override the draw() method to draw their respective shapes.</h2>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) {
        final Drawable CIRCLE = new Circle();
        CIRCLE.draw();
        final Drawable RECTANGLE = new Rectangle();
        RECTANGLE.draw();
        final Drawable TRIANGLE = new Triangle();
        TRIANGLE.draw();
    }
}

interface Drawable {
    void draw();
}

class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("●");
    }
}

class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("▬");
    }
}

class Triangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("▲");
    }
}