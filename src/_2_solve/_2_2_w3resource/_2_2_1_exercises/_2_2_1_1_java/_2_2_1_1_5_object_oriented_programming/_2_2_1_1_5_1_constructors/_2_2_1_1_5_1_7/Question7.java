package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_1_constructors._2_2_1_1_5_1_7;

/**
 * <h3>Constructor with Default Values</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Car with instance variables make, model, and year. Implement a parameterized constructor that initializes these variables and assigns default values if not provided. Print the values of the variables.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        new Car("", "", 0).printInformation();
    }
}

class Car {
    private final String MAKE,
            MODEL;
    private final int YEAR;

    Car(final String MAKE, final String MODEL, final int YEAR) {
        this.MAKE = (MAKE == null || MAKE.isEmpty())
                ? "Unknown"
                : MAKE;
        this.MODEL = (MODEL == null || MODEL.isEmpty())
                ? "Unknown"
                : MODEL;
        this.YEAR = (YEAR < 1886)
                ? 0
                : YEAR;
    }

    void printInformation() {
        System.out.printf("Make: %s%nMode: %s%nYear: %d",
                MAKE,
                MODEL,
                YEAR);
    }
}