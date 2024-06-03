package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_1_inheritance._2_2_5_1_3_question_400;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.</h2>
 */

public class Question400 {
    public static void main(final String[] ARGS) {
        System.out.print(new Car(2, 4).getArea());
    }
}

class Shape {
    float getArea() {
        return 0;
    }
}

class Car extends Shape {
    private final float WIDTH,
            LENGTH;

    Car(final float WIDTH, final float LENGTH) {
        this.WIDTH = WIDTH;
        this.LENGTH = LENGTH;
    }

    @Override
    float getArea() {
        return WIDTH * LENGTH;
    }
}