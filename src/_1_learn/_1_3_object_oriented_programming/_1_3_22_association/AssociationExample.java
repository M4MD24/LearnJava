package _1_learn._1_3_object_oriented_programming._1_3_22_association;

import java.util.ArrayList;
import java.util.List;

record Student(String name) {
}

class Course {
    final String COURSE_NAME;
    final List<Student> STUDENTS = new ArrayList<>();

    public Course(final String COURSE_NAME) {
        this.COURSE_NAME = COURSE_NAME;
    }

    void addStudent(Student student) {
        STUDENTS.add(student);
    }

    void printStudents() {
        System.out.println("Students in " + COURSE_NAME + " course:");
        for (final Student STUDENT : STUDENTS)
            System.out.println(STUDENT.name());
    }
}

public class AssociationExample {
    public static void main(final String[] ARGUMENTS) {
        Student student1 = new Student("Mohamed");
        Student student2 = new Student("Ahmed");
        Student student3 = new Student("Mahmoud");

        Course course = new Course("Arabic");
        course.addStudent(student1);
        course.addStudent(student2);
        course.addStudent(student3);

        course.printStudents();
    }
}