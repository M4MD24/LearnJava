package _1_learn._1_12_design_patterns._1_12_3_behavioral_design_patterns._1_12_3_11_iterator_pattern;

import java.util.List;
import java.util.NoSuchElementException;

class EmployeeIterator implements Iterator<Employee> {
    private int currentIndex = 0;
    private final List<Employee> employees;

    public EmployeeIterator(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < employees.size();
    }

    @Override
    public Employee next() {
        if (!hasNext())
            throw new NoSuchElementException();
        else
            return employees.get(currentIndex++);
    }
}