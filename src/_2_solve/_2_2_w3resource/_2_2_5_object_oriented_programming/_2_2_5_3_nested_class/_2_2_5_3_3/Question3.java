package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_nested_class._2_2_5_3_3;

/**
 * <h3>Local Class</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Car with a method startEngine(). Inside this method, define a local class Engine that has a method run(). The run() method should print "Engine is running". Instantiate and call the run() method from within the startEngine() method.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        new Car().startEngine();
    }
}

class Car {
    void startEngine() {
        class Engine {
            void run() {
                System.out.print("Engine is running!");
            }
        }
        final Engine ENGINE = new Engine();
        ENGINE.run();
    }
}