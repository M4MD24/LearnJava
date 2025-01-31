package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_45_sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_45_sort.files <h2>Question</h2>
 */

class Student {
    private final int ID;
    private final String FIRST_NAME;
    private final float CGPA;

    Student(final int ID, final String FIRST_NAME, final float CGPA) {
        this.ID = ID;
        this.FIRST_NAME = FIRST_NAME;
        this.CGPA = CGPA;
    }

    int getId() {
        return ID;
    }

    String getFirstName() {
        return FIRST_NAME;
    }

    float getCgpa() {
        return CGPA;
    }
}

public class SortExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        int countOfStudents = INPUT.nextInt();
        final List<Student> STUDENTS = new ArrayList<>();
        while (countOfStudents-- > 0)
            STUDENTS.add(new Student(
                    INPUT.nextInt(),
                    INPUT.next(),
                    INPUT.nextFloat()
            ));
        STUDENTS.sort(
                Comparator
                        .comparing(Student::getCgpa).reversed()
                        .thenComparing(Student::getFirstName)
                        .thenComparingInt(Student::getId)
        );
        for (final Student STUDENT : STUDENTS)
            System.out.println(STUDENT.getFirstName());
    }
}