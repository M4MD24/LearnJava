package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_nested_class._2_2_5_3_10;

/**
 * <h3>Static Nested Class and Non-static Methods</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an outer class called School with a static nested class Student. The Student class should have a non-static method displayStudentInfo() that prints the student's name and grade. Instantiate the Student class from the main method and call the displayStudentInfo() method.</h2>
 */

public class Question10 {
    public static void main(final String[] PARAMETERS) {
        new School.Student("Name", 100).displayStudentInfo();
    }
}

class School {
    static class Student {
        private final String NAME;
        private final float GRADE;

        Student(final String NAME, final float GRADE) {
            this.NAME = NAME;
            this.GRADE = GRADE;
        }

        void displayStudentInfo() {
            System.out.printf("""
                            Name: %s
                            Grade: %s""",
                    NAME,
                    GRADE);
        }
    }
}