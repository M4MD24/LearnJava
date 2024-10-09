package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_nested_class._2_2_5_3_8;

/**
 * <h3>Anonymous Class Implementing Abstract Class</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an abstract class called Animal with an abstract method makeSound(). In the main method, create an anonymous class that extends Animal and override the makeSound() method to print "Meow" for a cat. Call the makeSound() method</h2>
 */

public class Question8 {
    public static void main(final String[] PARAMETERS) {
        new Animal() {
            @Override
            void makeSound() {
                System.out.print("Meow");
            }
        }.makeSound();
    }
}

abstract class Animal {
    abstract void makeSound();
}