package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_1;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Person" with a name and age attribute. Create two instances of the "Person" class, set their attributes using the constructor, and print their name and age.</h2>
 */

public class Question1 {
    private static final Person[] PERSONS = {new Person("Mohamed", 21), new Person("Ahmed", 11)};

    public static void main(final String[] ARGS) {
        printDetailsOfPersons();
    }

    private static void printDetailsOfPersons() {
        for (int index = 0; index < PERSONS.length; index++) {
            System.out.println("■ " + index);
            System.out.println("Name: " + PERSONS[index].getName());
            System.out.print("Age: " + PERSONS[index].getAge());
            if (index < PERSONS.length - 1)
                System.out.println("\n");
        }
    }
}

class Person {
    private final String NAME;
    private final int AGE;

    Person(final String NAME, final int AGE) {
        this.NAME = NAME;
        this.AGE = AGE;
    }

    String getName() {
        return NAME;
    }

    int getAge() {
        return AGE;
    }
}