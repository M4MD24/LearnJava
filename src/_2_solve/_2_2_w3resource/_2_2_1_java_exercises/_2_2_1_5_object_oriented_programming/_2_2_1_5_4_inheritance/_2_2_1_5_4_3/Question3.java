package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_4_inheritance._2_2_1_5_4_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Shape with a method called getArea(). Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
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