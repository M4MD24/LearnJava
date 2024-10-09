package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_abstract_class._2_2_5_5_5;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo(). Create subclasses Manager and Programmer that extend the Employee class and implement the respective methods to calculate salary and display information for each role.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        manager();
        programmer();
    }

    private static void programmer() {
        final Employee PROGRAMMER = new Programmer("Mahmoud");
        System.out.println("\n■ Programmer:\nSalary: " + PROGRAMMER.calculateSalary());
        PROGRAMMER.displayInformation();
    }

    private static void manager() {
        final Employee MANAGER = new Manager("Ahmed");
        System.out.println("■ Manager:\nSalary: " + MANAGER.calculateSalary());
        MANAGER.displayInformation();
    }
}

abstract class Employee {
    private final String NAME;

    Employee(final String NAME) {
        this.NAME = NAME;
    }

    protected String getName() {
        return NAME;
    }

    abstract float calculateSalary();

    abstract void displayInformation();
}

class Manager extends Employee {
    Manager(final String NAME) {
        super(NAME);
    }

    @Override
    float calculateSalary() {
        return 2000;
    }

    @Override
    void displayInformation() {
        System.out.println(getName());
    }
}

class Programmer extends Employee {
    Programmer(final String NAME) {
        super(NAME);
    }

    @Override
    float calculateSalary() {
        return 1000;
    }

    @Override
    void displayInformation() {
        System.out.println(getName());
    }
}