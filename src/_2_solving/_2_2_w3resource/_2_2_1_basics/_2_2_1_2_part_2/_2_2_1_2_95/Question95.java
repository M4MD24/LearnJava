package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_95;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program that accepts students' names, ids, and marks and displays their highest and lowest scores.
 * <br/>
 * The student name and id are all strings of no more than 10 characters. The score is an integer between 0 and 100.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input number of students: 3
 * <br/>
 * Input Student Name, ID, Score:
 * <br/>
 * Devid v1 72
 * <br/>
 * Peter v2 68
 * <br/>
 * Johnson v3 85
 * <br/>
 * name, ID of the highest score and the lowest score:
 * <br/>
 * Johnson v3
 * <br/>
 * Peter v2
 * </h2>
 */

public class Question95 {
    private static final Scanner INPUT = new Scanner(System.in);
    private static Student studentWhoHighestScore,
            studentWhoLowestScore;

    public static void main(final String[] PARAMETERS) {
        System.out.print("Input number of students: ");
        final int COUNT_OF_STUDENTS = INPUT.nextInt();
        if (COUNT_OF_STUDENTS > 0) {
            System.out.println("Name and id of the highest score and the lowest score:");
            inputStudentDetails(COUNT_OF_STUDENTS);
            System.out.printf("%s %s\n",
                    studentWhoHighestScore.name(),
                    studentWhoHighestScore.id());
            System.out.printf("%s %s",
                    studentWhoLowestScore.name(),
                    studentWhoLowestScore.id());
        } else {
            System.out.println("\u001B[31mEnter count of students greater than 1\u001B[0m");
            Question95.main(PARAMETERS);
        }
    }

    private static void inputStudentDetails(final int COUNT_OF_STUDENTS) {
        final Student[] STUDENTS = new Student[COUNT_OF_STUDENTS];
        STUDENTS[0] = studentWhoHighestScore = studentWhoLowestScore = new Student(INPUT.next(), INPUT.next(), INPUT.nextByte());
        for (int index = 1; index < COUNT_OF_STUDENTS; index++) {
            STUDENTS[index] = new Student(INPUT.next(), INPUT.next(), INPUT.nextByte());
            if (STUDENTS[index].score() > studentWhoHighestScore.score()) studentWhoHighestScore = STUDENTS[index];
            if (STUDENTS[index].score() < studentWhoLowestScore.score()) studentWhoLowestScore = STUDENTS[index];
        }
    }
}

record Student(String name, String id, byte score) {
}