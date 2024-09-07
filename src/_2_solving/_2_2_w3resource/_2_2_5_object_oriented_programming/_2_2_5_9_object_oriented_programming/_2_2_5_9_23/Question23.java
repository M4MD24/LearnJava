package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_23;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Course" with attributes for course name, instructor, and credits. Create a subclass "OnlineCourse" that adds attributes for platform and duration. Implement methods to display course details and check if the course is eligible for a certificate based on duration.</h2>
 */

public class Question23 {
    public static void main(final String[] PARAMETERS) {
        final Course COURSE = new OnlineCourse(
                "Learn Java",
                "Mohamed Sadawy",
                123,
                "Telegram: Nullexia For Programming",
                (byte) 3,
                (byte) 24,
                (byte) 45
        );
        COURSE.printCourseInformation();
    }
}

class Course {
    private final String NAME,
            NAME_OF_INSTRUCTOR;
    private final float CREDITS;

    Course(final String NAME, final String NAME_OF_INSTRUCTOR, final float CREDITS) {
        this.NAME = NAME;
        this.NAME_OF_INSTRUCTOR = NAME_OF_INSTRUCTOR;
        this.CREDITS = CREDITS;
    }

    String getName() {
        return NAME;
    }

    String getNameOfInstructor() {
        return NAME_OF_INSTRUCTOR;
    }

    float getCredits() {
        return CREDITS;
    }

    void printCourseInformation() {
        System.out.printf(
                "Name: %s%nName of Constructor: %s%nCredits: %f%n",
                getName(),
                getNameOfInstructor(),
                getCredits()
        );
    }
}

class OnlineCourse extends Course {
    private final String PLATFORM;
    private final Calendar DURING = Calendar.getInstance();

    OnlineCourse(final String NAME, final String NAME_OF_INSTRUCTOR, final float CREDITS, final String PLATFORM, final byte HOURS, final byte MINUTES, final byte SECONDS) {
        super(NAME, NAME_OF_INSTRUCTOR, CREDITS);
        this.PLATFORM = PLATFORM;
        DURING.set(
                0,
                0,
                0,
                HOURS,
                MINUTES,
                SECONDS);
    }

    String getPlatform() {
        return PLATFORM;
    }

    String getDuring() {
        return new SimpleDateFormat("hh:mm:ss", Locale.US).format(DURING.getTime());
    }

    boolean isEligibleForCertificate() {
        return DURING.HOUR > 3;
    }

    @Override
    void printCourseInformation() {
        super.printCourseInformation();
        System.out.printf("Platform: %s%nDuring: %s%nIs Eligible for Certificate: %s%n",
                PLATFORM,
                getDuring(),
                isEligibleForCertificate()
        );
    }
}