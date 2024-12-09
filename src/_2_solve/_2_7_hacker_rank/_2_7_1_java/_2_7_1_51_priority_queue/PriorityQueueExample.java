package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_51_priority_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_51_priority_queue.files <h2>Question</h2>
 */

class Student implements Comparable<Student> {
    private final int ID;
    private final String NAME;
    private final double CGPA;

    public Student(final int ID, final String NAME, final double CGPA) {
        this.ID = ID;
        this.NAME = NAME;
        this.CGPA = CGPA;
    }

    String getName() {
        return NAME;
    }

    @Override
    public int compareTo(final Student OTHER) {
        if (Double.compare(OTHER.CGPA, this.CGPA) != 0)
            return Double.compare(OTHER.CGPA, this.CGPA);
        else if (!this.NAME.equals(OTHER.NAME))
            return this.NAME.compareTo(OTHER.NAME);
        else
            return Integer.compare(this.ID, OTHER.ID);
    }
}

class Priorities {
    List<Student> getStudents(final List<String> EVENTS) {
        final PriorityQueue<Student> QUEUE = new PriorityQueue<>();
        for (final String EVENT : EVENTS) {
            final String[] PARTS = EVENT.split(" ");
            if (PARTS[0].equals("ENTER"))
                QUEUE.add(new Student(
                        Integer.parseInt(PARTS[3]),
                        PARTS[1],
                        Double.parseDouble(PARTS[2])
                ));
            else if (PARTS[0].equals("SERVED"))
                QUEUE.poll();
        }
        final List<Student> REMAINING_STUDENTS = new ArrayList<>();
        while (!QUEUE.isEmpty())
            REMAINING_STUDENTS.add(QUEUE.poll());
        return REMAINING_STUDENTS;
    }
}

public class PriorityQueueExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final int COUNT_OF_ELEMENTS = Integer.parseInt(INPUT.nextLine());
        final List<String> EVENTS = new ArrayList<>();
        for (int index = 0; index < COUNT_OF_ELEMENTS; index++)
            EVENTS.add(INPUT.nextLine());
        final Priorities PRIORITIES = new Priorities();
        final List<Student> STUDENTS = PRIORITIES.getStudents(EVENTS);
        if (STUDENTS.isEmpty())
            System.out.println("EMPTY");
        else
            for (final Student STUDENT : STUDENTS)
                System.out.println(STUDENT.getName());
    }
}