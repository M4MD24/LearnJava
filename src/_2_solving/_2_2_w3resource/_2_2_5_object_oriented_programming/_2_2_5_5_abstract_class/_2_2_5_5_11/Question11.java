package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_abstract_class._2_2_5_5_11;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound(). Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods to describe how each bird flies and makes a sound.</h2>
 */

public class Question11 {
    public static void main(final String[] PARAMETERS) {
        eagle();
        hawk();
    }

    private static void hawk() {
        System.out.println("\n■ Hawk");
        final Bird HAWK = new Hawk();
        HAWK.fly();
        HAWK.makeSound();
    }

    private static void eagle() {
        System.out.println("■ Eagle");
        final Bird EAGLE = new Eagle();
        EAGLE.fly();
        EAGLE.makeSound();
    }
}

abstract class Bird {
    abstract void fly();

    abstract void makeSound();
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle flying!");
    }

    @Override
    void makeSound() {
        System.out.println("Screeching sound!");
    }
}

class Hawk extends Bird {
    @Override
    void fly() {
        System.out.println("Hawk flying!");
    }

    @Override
    void makeSound() {
        System.out.println("high-pitched sound!");
    }
}