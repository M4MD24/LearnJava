package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_interface._2_2_5_6_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a Animal interface with a method called bark() that takes no arguments and returns void. Create a Dog class that implements Animal and overrides speak() to print "Dog is barking!".</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final Animal DOG = new Dog();
        DOG.bark();
    }
}

interface Animal {
    void bark();
}

class Dog implements Animal {
    @Override
    public void bark() {
        System.out.println("Dog is barking!");
    }
}