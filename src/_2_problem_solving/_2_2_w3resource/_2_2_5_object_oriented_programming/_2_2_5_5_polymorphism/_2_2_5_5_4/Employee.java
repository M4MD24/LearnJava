package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_5_polymorphism._2_2_5_5_4;

class Employee {
    private final String NAME,
            ROLE;

    Employee(final String NAME, final String ROLE) {
        this.NAME = NAME;
        this.ROLE = ROLE;
    }

    String getName() {
        return NAME;
    }

    String getRole() {
        return ROLE;
    }

    float calculateSalary() {
        return 3000;
    }
}