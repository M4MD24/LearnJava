package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_abstract_class._2_2_5_5_8;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the Person class and implement the respective methods to describe how each person eats and exercises.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGS) {
        athlete();
        lazyPerson();
    }

    private static void lazyPerson() {
        final Person LAZY_PERSON = new LazyPerson();
        System.out.println("\nLazy Person:");
        LAZY_PERSON.eat();
        LAZY_PERSON.exercise();
    }

    private static void athlete() {
        final Person ATHLETE = new Athlete();
        System.out.println("Lazy Person:");
        ATHLETE.eat();
        ATHLETE.exercise();
    }
}

abstract class Person {
    abstract void eat();

    abstract void exercise();
}

class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("Eating healthy food!");
    }

    @Override
    void exercise() {
        System.out.println("Exercising regularly!");
    }
}

class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("Eating not healthy food!");
    }

    @Override
    void exercise() {
        System.out.println("Exercising not regularly!");
    }
}