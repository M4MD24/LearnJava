package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_4_encapsulation._2_2_5_4_4_question_434;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted float.</h2>
 */

public class Question434 {
    private static final Employee EMPLOYEE = new Employee();

    public static void main(final String[] ARGS) {
        addDataEmployee();
        getInformationEmployee();
    }

    private static void getInformationEmployee() {
        System.out.printf("Id: %s%nName: %s%nBalance: %f",
                EMPLOYEE.getId(),
                EMPLOYEE.getName(),
                EMPLOYEE.getBalance());
    }

    private static void addDataEmployee() {
        EMPLOYEE.setId("0987654321");
        EMPLOYEE.setName("Mohamed");
        EMPLOYEE.setBalance(123_456_789);
    }
}

class Employee {
    private String id,
            name;
    private float balance;

    String getId() {
        return id;
    }

    void setId(final String ID) {
        id = ID;
    }

    String getName() {
        return name;
    }

    void setName(final String NAME) {
        name = NAME;
    }

    float getBalance() {
        return balance;
    }

    void setBalance(final float BALANCE) {
        balance = BALANCE;
    }
}