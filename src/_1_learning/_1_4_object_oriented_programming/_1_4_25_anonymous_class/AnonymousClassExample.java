package _1_learning._1_4_object_oriented_programming._1_4_25_anonymous_class;

public class AnonymousClassExample {
    public static void main(final String[] ARGS) {
        // Anonymous class implementing the Greeting interface
        final Greeting GREETING = () -> System.out.println("Hello, World!");
        GREETING.sayHello();
    }
}

interface Greeting {
    void sayHello();
}