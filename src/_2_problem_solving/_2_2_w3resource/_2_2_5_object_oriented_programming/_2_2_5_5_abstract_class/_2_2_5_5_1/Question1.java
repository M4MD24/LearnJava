package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_abstract_class._2_2_5_5_1;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an abstract class Animal with an abstract method called sound(). Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method to make a specific sound for each animal.</h2>
 */

public class Question1 {
    public static void main(final String[] ARGS) {
        lion();
        tiger();
    }

    private static void tiger() {
        final Tiger TIGER = new Tiger();
        System.out.print("Tiger Sound: ");
        TIGER.sound();
    }

    private static void lion() {
        final Lion LION = new Lion();
        System.out.print("Lion Sound: ");
        LION.sound();
    }
}

abstract class Animal {
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Roar");
    }
}

class Tiger extends Animal {
    @Override
    void sound() {
        System.out.println("Growls");
    }
}