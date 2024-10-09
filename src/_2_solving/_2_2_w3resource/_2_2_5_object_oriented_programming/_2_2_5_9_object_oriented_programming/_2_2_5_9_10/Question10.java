package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_10;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Student" with a name, grade, and courses attributes, and methods to add and remove courses.</h2>
 */

public class Question10 {
    public static void main(final String[] PARAMETERS) {
        final Student STUDENT = new Student("Mahmoud", 99.42F);
        STUDENT.addCourse("Java");
        STUDENT.addCourse("Intellij Idea");
        STUDENT.addCourse("Kotlin");
        STUDENT.addCourse("XML");
        STUDENT.addCourse("SQL");
        STUDENT.addCourse("C#");
        STUDENT.addCourse("Android Studio");
        STUDENT.removeCourse("C#");
        STUDENT.printInformation();
    }
}

class Student {
    private final String NAME;
    private final float GRADE;
    private final List<String> COURSES = new ArrayList<>();

    Student(final String NAME, final float GRADE) {
        this.NAME = NAME;
        this.GRADE = GRADE;
    }

    String getName() {
        return NAME;
    }

    float getGrade() {
        return GRADE;
    }

    void addCourse(final String COURSE) {
        COURSES.add(COURSE);
    }

    void removeCourse(final String COURSE) {
        COURSES.remove(COURSE);
    }

    List<String> getCourses() {
        return COURSES;
    }

    void printInformation() {
        System.out.printf("Name: %s%nGrade: %%%.2f%nCourses: %s",
                getName(),
                getGrade(),
                getCourses());
    }
}