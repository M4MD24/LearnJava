package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_41_inheritance_1;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_41_inheritance_1.files <h2>Question</h2>
 */

class Animal {
    void walk() {
        System.out.println("I am walking");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("I am flying");
    }

    void sing() {
        System.out.println("I am singing");
    }
}

public class Inheritance1 {
    public static void main(final String[] PARAMETERS) {
        final Bird BIRD = new Bird();
        BIRD.walk();
        BIRD.fly();
        BIRD.sing();
    }
}