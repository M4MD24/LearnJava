package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_4_inheritance._2_2_5_4_10;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.</h2>
 */

public class Question10 {
    public static void main(final String[] ARGS) {
        final Manager MANAGER = new Manager("Alice", "123 Main St, City", 60000);
        final  Employee DEVELOPER = new Developer("Bob", "456 Broad St, Town", 50000);
        final Employee PROGRAMMER = new Programmer("Charlie", "789 High St, Village", 40000);

        System.out.println(MANAGER.generatePerformanceReport());
        System.out.println("£" + DEVELOPER.calculateBonuses());
        PROGRAMMER.manageProject();
    }
}

class Employee {
    private final String NAME,
            ADDRESS;
    private final int SALARY;
    private final JobTitle JOB_TITLE;

    Employee(final String NAME, final String ADDRESS, final int SALARY, final JobTitle JOB_TITLE) {
        this.NAME = NAME;
        this.ADDRESS = ADDRESS;
        this.SALARY = SALARY;
        this.JOB_TITLE = JOB_TITLE;
    }

    float calculateBonuses() {
        return SALARY * 0.1F;
    }

    String generatePerformanceReport() {
        return "Performance report for " + NAME + ": Excellent";
    }

    void manageProject() {
        System.out.println("Employee " + NAME + " is managing a project.");
    }
}

class Manager extends Employee {
    Manager(final String NAME, final String ADDRESS, final int SALARY) {
        super(NAME, ADDRESS, SALARY, JobTitle.Manager);
    }
}

class Developer extends Employee {
    Developer(final String NAME, final String ADDRESS, final int SALARY) {
        super(NAME, ADDRESS, SALARY, JobTitle.Developer);
    }
}

class Programmer extends Employee {
    Programmer(final String NAME, final String ADDRESS, final int SALARY) {
        super(NAME, ADDRESS, SALARY, JobTitle.Programmer);
    }
}

enum JobTitle {
    Manager,
    Developer,
    Programmer
}