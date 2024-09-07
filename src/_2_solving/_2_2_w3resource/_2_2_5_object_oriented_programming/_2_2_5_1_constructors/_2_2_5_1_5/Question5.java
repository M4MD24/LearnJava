package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_1_constructors._2_2_5_1_5;

/**
 * <h3>Copy Constructor</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Rectangle with instance variables length and width. Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object. Print the values of the variables.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        new Rectangle(new Rectangle(2, 8)).printInformation();
    }
}

class Rectangle {
    private final float LENGTH,
            WIDTH;

    Rectangle(final int LENGTH, final int WIDTH) {
        this.LENGTH = LENGTH;
        this.WIDTH = WIDTH;
    }

    Rectangle(final Rectangle RECTANGLE) {
        this.LENGTH = RECTANGLE.LENGTH;
        this.WIDTH = RECTANGLE.WIDTH;
    }

    void printInformation() {
        System.out.printf("Length: %f%nWidth: %f",
                LENGTH,
                WIDTH);
    }
}