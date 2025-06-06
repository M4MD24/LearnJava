package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_2_static_members._2_2_1_1_5_2_4;

/**
 * <h3>Static Final Variables</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Constants with a static final variable 'PI' initialized to 3.14159. Create a method to calculate the area of a circle given its radius, using the 'PI' constant. Demonstrate the method in the main method.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(calculateAreaCircle(2));
    }

    private static double calculateAreaCircle(final double RADIUS) {
        return Constants.PI * RADIUS * RADIUS;
    }
}

class Constants {
    final static double PI = Math.PI;
}