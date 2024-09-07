package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_7;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Student with private instance variables student_id, student_name, and grades. Provide public getter and setter methods to access and modify the student_id and student_name variables. However, provide a method called addGrade() that allows adding a grade to the grades variable while performing additional validation.</h2>
 */

public class Question7 {
    private static final Student STUDENT = new Student();

    public static void main(final String[] PARAMETERS) {
        addDataStudent();
        getInformationStudent();
    }

    private static void getInformationStudent() {
        System.out.printf("Id: %s%nName: %s%nGrades: %s",
                STUDENT.getId(),
                STUDENT.getName(),
                STUDENT.getGrades());
    }

    private static void addDataStudent() {
        STUDENT.setId("0987654321");
        STUDENT.setName("Ahmed");
        STUDENT.addGrades(87.5F);
        STUDENT.addGrades(92.1F);
        STUDENT.addGrades(100.0F);
        STUDENT.addGrades(94.3F);
    }
}

class Student {
    private String id,
            name;
    private final List<Float> GRADES = new ArrayList<>();

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

    List<Float> getGrades() {
        return GRADES;
    }

    void addGrades(final float GRADE) {
        GRADES.add(GRADE);
    }
}