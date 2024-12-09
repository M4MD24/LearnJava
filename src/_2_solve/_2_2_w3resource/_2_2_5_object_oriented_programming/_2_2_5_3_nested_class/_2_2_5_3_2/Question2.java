package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_nested_class._2_2_5_3_2;

/**
 * <h3>Static Nested Class</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an outer class called University with a static nested class Department. The Department class should have a method "displayInfo()" that prints the department name and the number of faculty members. Instantiate the Department class from the main method and call the "displayInfo()" method.</h2>
 */

public class Question2 {
    public static void main(final String[] PARAMETERS) {
        new University.Department("Computer Science", 259).displayInfo();
    }
}

class University {
    static class Department {
        private final String NAME;
        private final int NUMBER_OF_FACULTY_MEMBERS;

        Department(final String NAME, final int NUMBER_OF_FACULTY_MEMBERS) {
            this.NAME = NAME;
            this.NUMBER_OF_FACULTY_MEMBERS = NUMBER_OF_FACULTY_MEMBERS;
        }

        void displayInfo() {
            System.out.printf("""
                            Name: %s
                            Number of Faculty Members: %d""",
                    NAME,
                    NUMBER_OF_FACULTY_MEMBERS);
        }
    }
}