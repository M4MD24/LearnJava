package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_9;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.</h2>
 */

public class Question9 {
    private static final ArrayList<Employee> EMPLOYEES = new ArrayList<>();

    public static void main(final String[] PARAMETERS) {
        addEmployees();
        printEmployees();
    }

    private static void printEmployees() {
        for (int index = 0; index < EMPLOYEES.size(); index++) {
            System.out.print(EMPLOYEES.get(index).getEmployeeInformation());
            if (index < EMPLOYEES.size() - 1)
                System.out.println("\n");
        }
    }

    private static void addEmployees() {
        EMPLOYEES.add(new Employee("Mohamed", 111_111, 2021, (byte) 6, (byte) 9));
        EMPLOYEES.add(new Employee("Ahmed", 222_222, 2022, (byte) 5, (byte) 8));
        EMPLOYEES.add(new Employee("Mahmoud", 333_333, 2023, (byte) 4, (byte) 7));
    }
}

class Employee {
    private final String NAME;
    private final double SALARY;
    private final Calendar HIRE_DATE = Calendar.getInstance();

    Employee(final String NAME, final double SALARY, final int YEAR, final byte MONTH, final byte DAY) {
        this.NAME = NAME;
        this.SALARY = SALARY;
        HIRE_DATE.set(YEAR, MONTH, DAY);
    }

    String getName() {
        return NAME;
    }

    double getSalary() {
        return SALARY;
    }

    String getHireDate() {
        return new SimpleDateFormat("yyyy/MMMM/dd", Locale.US).format(HIRE_DATE.getTime());
    }

    int getYearsOfService() {
        return Calendar.getInstance().get(Calendar.YEAR) - HIRE_DATE.get(Calendar.YEAR);
    }

    String getEmployeeInformation() {
        return String.format("Name: %s%nSalary: £%.4f%nHire Date: %s%nYears of Service: %d",
                getName(),
                getSalary(),
                getHireDate(),
                getYearsOfService());
    }
}