package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_1_constructors._2_2_5_1_9;

import java.util.Arrays;

/**
 * <h3>Constructor with Array Initialization</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.</h2>
 */

public class Question9 {
    public static void main(final String[] ARGS) {
        new ClassRoom("Name", new String[]{"Mohamed", "Ahmed", "Mahmoud", "Abdelrahman", "Abdallah", "Osman", "Ali"}).printInformation();
    }
}

class ClassRoom {
    final String CLASS_NAME;
    final String[] STUDENTS;

    ClassRoom(final String CLASS_NAME, final String[] STUDENTS) {
        this.CLASS_NAME = CLASS_NAME;
        this.STUDENTS = STUDENTS;
    }

    void printInformation() {
        System.out.printf("Class Name: %s%nStudents: %s",
                CLASS_NAME,
                Arrays.toString(STUDENTS));
    }
}