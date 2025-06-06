package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_8_polymorphism._2_2_1_1_5_8_4;

class Programmer extends Employee {
    private float baseSalary;
    private final float OVERTIME_PAY;

    Programmer(final String NAME, final float BASE_SALARY, final float OVERTIME_PAY) {
        super(NAME, "Programmer");
        this.baseSalary = BASE_SALARY;
        this.OVERTIME_PAY = OVERTIME_PAY;
    }

    @Override
    float calculateSalary() {
        return baseSalary += OVERTIME_PAY;
    }
}