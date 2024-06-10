package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_1_inheritance._2_2_5_1_7;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGS) {
        final Person PERSON = new Person("Ahmed", "Hamam");
        System.out.printf("■ Person%nFirst Name: %s%nLast Name: %s%n%n",
                PERSON.getFirstName(),
                PERSON.getLastName());
        final Employee EMPLOYEE = new Employee("Mohamed", "Hamam", "0987654321", "Native Android Developer");
        System.out.printf("■ Employee%nFirst Name: %s%nLast Name: %s",
                EMPLOYEE.getFirstName(),
                EMPLOYEE.getLastName());
    }
}

class Person {
    private final String FIRST_NAME,
            LAST_NAME;

    Person(final String FIRST_NAME, final String LAST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
    }

    String getFirstName() {
        return FIRST_NAME;
    }

    String getLastName() {
        return LAST_NAME;
    }
}

class Employee extends Person {
    private final String EMPLOYEE_ID,
            JOB_TITLE;

    Employee(final String FIRST_NAME, final String LAST_NAME, final String EMPLOYEE_ID, final String JOB_TITLE) {
        super(FIRST_NAME, LAST_NAME);
        this.EMPLOYEE_ID = EMPLOYEE_ID;
        this.JOB_TITLE = JOB_TITLE;
    }

    String getEmployeeId() {
        return EMPLOYEE_ID;
    }

    @Override
    String getLastName() {
        return super.getLastName() + ", " + JOB_TITLE;
    }
}