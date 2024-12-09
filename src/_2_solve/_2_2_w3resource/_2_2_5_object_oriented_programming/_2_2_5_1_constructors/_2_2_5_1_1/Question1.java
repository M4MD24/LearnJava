package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_1_constructors._2_2_5_1_1;

/**
 * <h3>Default Constructor</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Cat" with instance variables name and age. Implement a default constructor that initializes the name to "Unknown" and the age to 0. Print the values of the variables.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        new Cat().printInformation();
    }
}

class Cat {
    private final String NAME;
    private final int AGE;

    Cat() {
        NAME = "Unknown";
        AGE = 0;
    }

    void printInformation() {
        System.out.printf("Name: %s%nAge: %d",
                NAME,
                AGE);
    }
}