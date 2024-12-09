package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Employee" with a name, job, and salary attributes, and methods to raise and update salary.</h2>
 */

public class Question6 {
    private static final Employee[] EMPLOYEES = {
            new Employee(
                    "Alice",
                    "Software Engineer",
                    50_000),
            new Employee(
                    "Bob",
                    "Data Analyst",
                    45_000)
    };

    public static void main(final String[] PARAMETERS) {
        EMPLOYEES[1].updateSalary(40_000);
        EMPLOYEES[1].raiseSalary(1.1);
        for (int index = 0; index < EMPLOYEES.length; index++) {
            EMPLOYEES[index].printEmployeeDetails();
            if (index < EMPLOYEES.length - 1)
                System.out.println("\n");
        }
    }
}

class Employee {
    private final String NAME,
            JOB;
    private double salary;

    Employee(final String NAME, final String JOB, final double SALARY) {
        this.NAME = NAME;
        this.JOB = JOB;
        this.salary = SALARY;
    }

    void updateSalary(final double NEW_SALARY) {
        this.salary = NEW_SALARY;
    }

    void raiseSalary(final double PERCENTAGE) {
        this.salary *= PERCENTAGE;
    }

    void printEmployeeDetails() {
        System.out.printf("%s%n%s%n%.1f",
                NAME,
                JOB,
                salary);
    }
}