package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_11_iterator_pattern;

import java.util.List;

class Company implements Aggregate<Employee> {
    private final List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public Iterator<Employee> createIterator() {
        return new EmployeeIterator(employees);
    }
}