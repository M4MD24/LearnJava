package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_4_inheritance._2_2_1_1_5_4_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        final Employee EMPLOYEE = new Employee(111_111);
        final HRManager HR_MANAGER = new HRManager(222_222);

        EMPLOYEE.work();
        System.out.println("\nEmployee salary: " + EMPLOYEE.getSalary() + "\n");

        HR_MANAGER.work();
        System.out.println("\nHR Manager salary: " + HR_MANAGER.getSalary());
        HR_MANAGER.addEmployee();
    }
}

class Employee {
    private final float SALARY;

    Employee(final float SALARY) {
        this.SALARY = SALARY;
    }

    void work() {
        System.out.print("working as an employee!");
    }

    float getSalary() {
        return SALARY;
    }
}

class HRManager extends Employee {
    HRManager(final float SALARY) {
        super(SALARY);
    }

    @Override
    void work() {
        System.out.print("Managing Employees!");
    }

    void addEmployee() {
        System.out.print("Adding new employee!");
    }
}