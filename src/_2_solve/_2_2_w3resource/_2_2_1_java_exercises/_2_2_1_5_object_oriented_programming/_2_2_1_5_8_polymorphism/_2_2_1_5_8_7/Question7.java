package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_8_polymorphism._2_2_1_5_8_7;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a base class Animal with methods move() and makeSound(). Create two subclasses Bird and Panther. Override the move() method in each subclass to describe how each animal moves. Also, override the makeSound() method in each subclass to make a specific sound for each animal.</h2>
 */
public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        final Animal ANIMAL = new Animal();
        ANIMAL.move();
        ANIMAL.makeSound();

        System.out.println();

        final Animal BIRD = new Bird();
        BIRD.move();
        BIRD.makeSound();

        System.out.println();

        final Animal PANTHER = new Panther();
        PANTHER.move();
        PANTHER.makeSound();
    }
}

class Animal {
    void move() {
        System.out.println("Moved animal!");
    }

    void makeSound() {
        System.out.println("Animal made sound!");
    }
}

class Bird extends Animal {
    @Override
    void move() {
        System.out.println("Moved bird!");
    }

    @Override
    void makeSound() {
        System.out.println("Bird made sound!");
    }
}

class Panther extends Animal {
    @Override
    void move() {
        System.out.println("Moved panther!");
    }

    @Override
    void makeSound() {
        System.out.println("Panther made sound!");
    }
}