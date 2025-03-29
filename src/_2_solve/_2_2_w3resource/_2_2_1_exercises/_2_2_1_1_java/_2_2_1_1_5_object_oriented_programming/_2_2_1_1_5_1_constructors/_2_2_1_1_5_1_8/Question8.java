package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_1_constructors._2_2_1_1_5_1_8;

/**
 * <h3>Overloading Constructors with Different Data Types</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:</h2>
 * <ul>
 *     <li>One constructor takes int ARGUMENTS.</li>
 *     <li>Another constructor takes double ARGUMENTS.</li>
 *     <li>Print the values of the variables for each constructor.</li>
 * </ul>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) {
        new Point(1, 2).printValues();
        System.out.println("\n");
        new Point(3.456D, 4.567).printValues();
    }
}

class Point {
    private final int X,
            Y;

    Point(final int X, final int Y) {
        this.X = X;
        this.Y = Y;
    }

    Point(final double X, final double Y) {
        this.X = (int) X;
        this.Y = (int) Y;
    }

    void printValues() {
        System.out.printf("X: %d%nY: %d",
                X,
                Y);
    }
}