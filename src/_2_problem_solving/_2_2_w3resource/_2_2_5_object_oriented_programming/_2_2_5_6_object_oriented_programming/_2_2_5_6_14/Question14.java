package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_6_object_oriented_programming._2_2_5_6_14;

import java.util.ArrayList;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "School" with attributes for students, teachers, and classes, and methods to add and remove students and teachers, and to create classes.</h2>
 */

public class Question14 {
    public static void main(final String[] ARGS) {
        final School SCHOOL = new School();

        SCHOOL.addTeacher("Mohamed");
        SCHOOL.addStudent("Mahmoud");
        SCHOOL.addStudent("Ahmed");
        SCHOOL.addStudent("Moon");
        SCHOOL.addTeacher("Karim");
        SCHOOL.addStudent("Hamada");
        SCHOOL.addTeacher("Abd-Allah");

        SCHOOL.removeStudent("Hamada");
        SCHOOL.removeTeacher("Karim");

        SCHOOL.printTeachersInformation();

        System.out.println();

        SCHOOL.printStudentsInformation();
    }
}

class School {
    private final ArrayList<Object> SCHOOL = new ArrayList<>();

    void addTeacher(final String NAME) {
        SCHOOL.add(new Teacher(NAME));
    }

    void removeTeacher(final String NAME) {
        SCHOOL.remove(containsTeacher(NAME));
    }

    void addStudent(final String NAME) {
        SCHOOL.add(new Student(NAME));
    }

    void removeStudent(final String NAME) {
        SCHOOL.remove(containsStudent(NAME));
    }

    int containsTeacher(final String NAME) {
        for (int index = 0; index < SCHOOL.size(); index++)
            if (SCHOOL.get(index) instanceof Teacher)
                if (((Teacher) SCHOOL.get(index)).getName().equals(NAME))
                    return index;
        return -1;
    }

    int containsStudent(final String NAME) {
        for (int index = 0; index < SCHOOL.size(); index++)
            if (SCHOOL.get(index) instanceof Student)
                if (((Student) SCHOOL.get(index)).getName().equals(NAME))
                    return index;
        return -1;
    }

    void printStudentsInformation() {
        System.out.println("Student Name\n" + "-".repeat(12));
        for (final Object STUDENT : SCHOOL)
            if (STUDENT instanceof Student)
                System.out.println(((Student) STUDENT).getName());
    }

    void printTeachersInformation() {
        System.out.println("Teacher Name\n" + "-".repeat(12));
        for (final Object TEACHER : SCHOOL)
            if (TEACHER instanceof Teacher)
                System.out.println(((Teacher) TEACHER).getName());
    }
}

class Teacher {
    private final String NAME;

    Teacher(final String NAME) {
        this.NAME = NAME;
    }

    String getName() {
        return NAME;
    }
}

class Student {
    private final String NAME;

    Student(final String NAME) {
        this.NAME = NAME;
    }

    String getName() {
        return NAME;
    }
}