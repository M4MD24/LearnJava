package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_8_polymorphism._2_2_5_8_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class Employee with a method called calculateSalary(). Create two subclasses Manager and Programmer. In each subclass, override the calculateSalary() method to calculate and return the salary based on their specific roles.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        printEmployeeInformation(
                new Employee(
                        "Person 1",
                        "Employee"
                ),
                "■ Employee%nName: %s%nRole: %s%nSalary: %f%n%n");

        printEmployeeInformation(
                new Programmer(
                        "Person 2",
                        12_000,
                        1_250
                ),
                "■ Programmer%nName: %s%nRole: %s%nSalary: %f%n%n");

        printEmployeeInformation(
                new Manager(
                        "Person 3",
                        23_000,
                        5_600
                ),
                "■ Manager%nName: %s%nRole: %s%nSalary: %f");
    }

    private static void printEmployeeInformation(final Employee EMPLOYEE, final String INFORMATION) {
        System.out.printf(INFORMATION,
                EMPLOYEE.getName(),
                EMPLOYEE.getRole(),
                EMPLOYEE.calculateSalary());
    }
}