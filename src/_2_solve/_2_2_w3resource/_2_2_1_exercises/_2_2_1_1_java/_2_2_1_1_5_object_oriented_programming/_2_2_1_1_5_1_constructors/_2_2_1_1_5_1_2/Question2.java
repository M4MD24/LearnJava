package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_1_constructors._2_2_1_1_5_1_2;

/**
 * <h3>Parameterized Constructor</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Dog with instance variables name and color. Implement a parameterized constructor that takes name and color as ARGUMENTS and initializes the instance variables. Print the values of the variables.</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        new Dog("Name", "Color").printInformation();
    }
}

class Dog {
    private final String NAME,
            COLOR;

    Dog(final String NAME, final String COLOR) {
        this.NAME = NAME;
        this.COLOR = COLOR;
    }

    void printInformation() {
        System.out.printf("Name: %s%nColor: %s",
                NAME,
                COLOR);
    }
}