package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_4_inheritance._2_2_5_4_1;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to Meow.</h2>
 */

public class Question1 {
    public static void main(final String[] ARGS) {
        System.out.print(new Cat().makeSound());
    }
}

class Animal {
    String makeSound() {
        return "Make a Sound!";
    }
}

class Cat extends Animal {
    @Override
    String makeSound() {
        return "Meow";
    }
}