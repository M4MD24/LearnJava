package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_abstract_class._2_2_5_5_4;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep() methods differently based on their specific behavior.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGS) {
        lion();
        tiger();
        deer();
    }

    private static void deer() {
        final Deer DEER = new Deer();
        DEER.eat();
        DEER.sleep();
    }

    private static void tiger() {
        final Tiger TIGER = new Tiger();
        TIGER.eat();
        TIGER.sleep();
    }

    private static void lion() {
        final Lion LION = new Lion();
        LION.eat();
        LION.sleep();
    }
}

abstract class Animal {
    abstract void eat();

    abstract void sleep();
}

class Lion extends Animal {
    @Override
    void eat() {
        System.out.println("Lion Eating!");
    }

    @Override
    void sleep() {
        System.out.println("Lion Sleeping!");
    }
}

class Tiger extends Animal {
    @Override
    void eat() {
        System.out.println("Tiger Eating!");
    }

    @Override
    void sleep() {
        System.out.println("Tiger Sleeping!");
    }
}

class Deer extends Animal {
    @Override
    void eat() {
        System.out.println("Deer Eating!");
    }

    @Override
    void sleep() {
        System.out.println("Deer Sleeping!");
    }
}