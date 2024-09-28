package _1_learning._1_3_object_oriented_programming._1_3_24_local_class;

public class LocalClassExample {
    public static void main(final String[] PARAMETERS) {
        new Car().startEngine();
    }
}

class Car {
    void startEngine() {
        class Engine { // Local Class
            void run() {
                System.out.print("Engine is running!");
            }
        }
        new Engine().run();
    }
}