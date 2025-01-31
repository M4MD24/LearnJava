package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_abstract_class._2_2_5_5_9;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an abstract class Fish with abstract methods swim(). Create subclasses for Salmon and Tuna that extend the Fish class and implement the respective methods to swim each instrument.</h2>
 */

public class Question9 {
    public static void main(final String[] ARGUMENTS) {
        salmon();
        tuna();
    }

    private static void tuna() {
        final Fish TUNA = new Tuna();
        TUNA.swim();
    }

    private static void salmon() {
        final Fish SALMON = new Salmon();
        SALMON.swim();
    }
}

abstract class Fish {
    abstract void swim();
}

class Salmon extends Fish {
    @Override
    void swim() {
        System.out.println("Salmon Swimming!");
    }
}

class Tuna extends Fish {
    @Override
    void swim() {
        System.out.println("Tuna Swimming!");
    }
}