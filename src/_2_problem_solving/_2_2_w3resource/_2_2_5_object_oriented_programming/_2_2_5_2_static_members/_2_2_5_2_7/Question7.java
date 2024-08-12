package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_2_static_members._2_2_5_2_7;

/**
 * <h3>Static Block for Complex Initialization</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "ComplexInitializer" with a static block that initializes multiple static variables (x, y, z) using complex logic. Print the values of these variables in the main method.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGS) {
        ComplexInitializer.printValues();
    }
}

class ComplexInitializer {
    private static final int X,
            Y,
            Z;

    static {
        X = 10;
        Y = (int) Math.pow(X, 2);
        Z = X * Y;
    }

    static void printValues() {
        System.out.printf(
                "X = %d%nY = %d%nZ = %d",
                X,
                Y,
                Z);
    }
}