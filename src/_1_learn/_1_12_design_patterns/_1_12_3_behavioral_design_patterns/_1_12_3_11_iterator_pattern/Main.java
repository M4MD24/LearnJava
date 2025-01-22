package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_11_iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] PARAMETERS) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ahmed", 50_000));
        employees.add(new Employee("Mahmoud", 60_000));
        employees.add(new Employee("Hamada", 70_000));

        Company company = new Company(employees);
        Iterator<Employee> iterator = company.createIterator();

        double totalSalary = 0;
        while (iterator.hasNext())
            totalSalary += iterator.next()
                    .salary();
        System.out.print("Total salary: " + totalSalary);
    }
}