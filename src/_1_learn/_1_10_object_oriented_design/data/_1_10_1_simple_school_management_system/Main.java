package _1_learn._1_10_object_oriented_design.data._1_10_1_simple_school_management_system;

public class Main {
    public static void main(final String[] PARAMETERS) {
        final School THE_DILIGENTS = new School();

        final Student MAHMOUD = new Student(
                "Mahmouad",
                1
        );
        final Student AHMED = new Student(
                "Ahmed",
                2
        );

        final Teacher MR_MOHAMED = new Teacher(
                "Mr. Mohamed",
                101
        );

        final Course MATH_101 = new Course(
                "Math 101",
                201
        );
        final Course PHYSICS_101 = new Course(
                "Physics 101",
                202
        );

        THE_DILIGENTS.registerStudent(MAHMOUD);
        THE_DILIGENTS.registerStudent(AHMED);
        THE_DILIGENTS.hireTeacher(MR_MOHAMED);
        THE_DILIGENTS.offerCourse(MATH_101);
        THE_DILIGENTS.offerCourse(PHYSICS_101);

        MAHMOUD.enroll(MATH_101);
        AHMED.enroll(PHYSICS_101);

        MR_MOHAMED.assignCourse(PHYSICS_101);
        MR_MOHAMED.assignCourse(MATH_101);
        MR_MOHAMED.gradeStudent(MAHMOUD, MATH_101);
    }
}