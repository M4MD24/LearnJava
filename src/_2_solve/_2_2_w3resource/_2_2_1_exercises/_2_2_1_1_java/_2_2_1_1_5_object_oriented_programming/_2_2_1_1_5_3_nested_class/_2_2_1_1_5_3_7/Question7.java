package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_3_nested_class._2_2_1_1_5_3_7;

/**
 * <h3>Local Class Accessing Local Variables</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called House with a method calculateArea(). Inside this method, define a local class Room with a method getArea() that calculates and returns the area of the room (length * width). Instantiate the Room class and call the getArea() method from within calculateArea().</h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        new House().calculateArea(10, 20);
    }
}

class House {
    void calculateArea(final float WIDTH, final float HEIGHT) {
        class Room {
            float getArea() {
                return WIDTH * HEIGHT;
            }
        }
        System.out.print("Room Area: " + new Room().getArea());
    }
}