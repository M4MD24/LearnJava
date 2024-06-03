package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_abstract_class._2_2_5_2_10_question_417;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize(). Create subclasses Rectangle and Circle that extend the Shape2D class and implement the respective methods to draw and resize each shape.</h2>
 */

public class Question417 {
    public static void main(final String[] ARGS) {
        rectangle();
        circle();
    }

    private static void circle() {
        final Shape2D CIRCLE = new Circle();
        System.out.println("\nCircle:");
        CIRCLE.draw();
        CIRCLE.resize();
    }

    private static void rectangle() {
        final Shape2D RECTANGLE = new Rectangle();
        System.out.println("Rectangle:");
        RECTANGLE.draw();
        RECTANGLE.resize();
    }
}

abstract class Shape2D {
    abstract void draw();

    abstract void resize();
}

class Rectangle extends Shape2D {
    @Override
    void draw() {
        System.out.println("▬");
    }

    @Override
    void resize() {
        System.out.println("Resize Rectangle!");
    }
}

class Circle extends Shape2D {
    @Override
    void draw() {
        System.out.println("●");
    }

    @Override
    void resize() {
        System.out.println("Resize Circle!");
    }
}