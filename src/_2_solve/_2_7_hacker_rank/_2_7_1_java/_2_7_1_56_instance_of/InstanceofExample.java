package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_56_instance_of;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_56_instance_of.files <h2>Question</h2>
 */

class Student {
}

class Rockstar {
}

class Hacker {
}

public class InstanceofExample {
    private static void printNumbers(final ArrayList<Object> ELEMENTS) {
        int students = 0,
                rockstars = 0,
                hackers = 0;
        for (final Object Element : ELEMENTS)
            if (Element instanceof Student)
                students++;
            else if (Element instanceof Rockstar)
                rockstars++;
            else if (Element instanceof Hacker)
                hackers++;
        System.out.print(students + " " + rockstars + " " + hackers);
    }

    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        final int COUNT_OF_ELEMENTS = INPUT.nextInt();
        final ArrayList<Object> ELEMENTS = new ArrayList<>();
        for (int index = 0; index < COUNT_OF_ELEMENTS; index++)
            switch (INPUT.next()) {
                case "Student" -> ELEMENTS.add(new Student());
                case "Rockstar" -> ELEMENTS.add(new Rockstar());
                case "Hacker" -> ELEMENTS.add(new Hacker());
            }
        printNumbers(ELEMENTS);
    }
}