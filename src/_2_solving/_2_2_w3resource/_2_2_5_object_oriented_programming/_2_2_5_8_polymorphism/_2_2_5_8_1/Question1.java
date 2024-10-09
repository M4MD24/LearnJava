package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_8_polymorphism._2_2_5_8_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        final Animal ANIMAL = new Animal();
        ANIMAL.sound();

        final Animal BIRD = new Bird();
        BIRD.sound();

        final Animal CAT = new Cat();
        CAT.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Sound!");
    }
}

class Bird extends Animal {
    @Override
    void sound() {
        System.out.println("Chirps!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}