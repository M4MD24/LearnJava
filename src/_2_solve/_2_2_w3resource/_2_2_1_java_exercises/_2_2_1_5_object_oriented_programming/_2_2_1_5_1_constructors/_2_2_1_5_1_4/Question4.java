package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_1_constructors._2_2_1_5_1_4;

/**
 * <h3>Chaining Constructors</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Student with instance variables studentId, studentName, and grade. Implement a default constructor and a parameterized constructor that takes all three instance variables. Use constructor chaining to initialize the variables. Print the values of the variables.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        new Student().printInformation();
        System.out.println("\n");
        new Student("StudentID", "StudentName", 100).printInformation();
    }
}

class Student {
    private final String STUDENT_ID,
            STUDENT_NAME;
    private final float GRADE;

    Student() {
        this("Unknown", "Unknown", 0);
    }

    Student(final String STUDENT_ID, final String STUDENT_NAME, final float GRADE) {
        this.STUDENT_ID = STUDENT_ID;
        this.STUDENT_NAME = STUDENT_NAME;
        this.GRADE = GRADE;
    }

    void printInformation() {
        System.out.printf("Student ID: %s%nName: %s%nGrade: %.2f%%",
                STUDENT_ID,
                STUDENT_NAME,
                GRADE);
    }
}