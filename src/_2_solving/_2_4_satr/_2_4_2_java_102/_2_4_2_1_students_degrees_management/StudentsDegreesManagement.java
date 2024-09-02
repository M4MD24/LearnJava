package _2_solving._2_4_satr._2_4_2_java_102._2_4_2_1_students_degrees_management;

public class StudentsDegreesManagement {
    private static final int LENGTH = 7;
    private static final String[] STUDENTS_NAMES = new String[LENGTH];
    private static final int[] STUDENTS_DEGREES = new int[LENGTH];

    public static void main(final String[] ARGS) {
        addData();
        displayData();
    }

    private static void addData() {
        addStudentsNames();
        addStudentsDegrees();
    }

    private static void addStudentsNames() {
        STUDENTS_NAMES[0] = "Abdullah";
        STUDENTS_NAMES[1] = "Mohamed";
        STUDENTS_NAMES[2] = "Abdulrahman";
        STUDENTS_NAMES[3] = "Ahmed";
        STUDENTS_NAMES[4] = "AbdulSamad";
        STUDENTS_NAMES[5] = "Mahmoud";
        STUDENTS_NAMES[6] = "Mostafa";
    }

    private static void addStudentsDegrees() {
        STUDENTS_DEGREES[0] = 87;
        STUDENTS_DEGREES[1] = 73;
        STUDENTS_DEGREES[2] = 15;
        STUDENTS_DEGREES[3] = 42;
        STUDENTS_DEGREES[4] = 60;
        STUDENTS_DEGREES[5] = 28;
        STUDENTS_DEGREES[6] = 91;
    }

    private static void displayData() {
        final int maxLengthOfName = getMaxLengthOfName();
        final int SPACE_DEFERENCE = maxLengthOfName - "Student".length();
        final String TITLE = String.format("Student%s | Degree\n", " ".repeat(SPACE_DEFERENCE)),
                LINE = "-".repeat(TITLE.length() - 1);

        displayTableTitle(TITLE);
        System.out.println(LINE);
        displayStudentsNamesAndDegrees(maxLengthOfName);
        System.out.println(LINE);
        calculateAndDisplayAverageDegrees();
    }

    private static void displayTableTitle(String TITLE) {
        System.out.print(TITLE);
    }

    private static void displayStudentsNamesAndDegrees(int maxLengthOfName) {
        int spaceDeference;
        for (int index = 0; index < LENGTH; index++) {
            spaceDeference = maxLengthOfName - STUDENTS_NAMES[index].length();
            System.out.printf("%s%s |   %d\n",
                    STUDENTS_NAMES[index],
                    " ".repeat(spaceDeference),
                    STUDENTS_DEGREES[index]);
        }
    }

    private static void calculateAndDisplayAverageDegrees() throws ArithmeticException {
        int totalDegreesNumbers = 0;
        final int TOTAL_DEGREES = STUDENTS_DEGREES.length;

        for (int degree : STUDENTS_DEGREES) totalDegreesNumbers += degree;

        System.out.print("Average students degrees: ");
        try {
            final float averageStudentsDegrees = (float) totalDegreesNumbers / TOTAL_DEGREES;
            System.out.printf("%d / %d = %.2f",
                    totalDegreesNumbers,
                    TOTAL_DEGREES,
                    averageStudentsDegrees);
        } catch (ArithmeticException ignored) {
            System.out.printf("%d / %d = %s",
                    totalDegreesNumbers,
                    TOTAL_DEGREES,
                    "Division by zero is not permissible");
        }
    }

    private static int getMaxLengthOfName() {
        int maxLengthOfName = 0;
        for (int index = 0; index < LENGTH; index++) {
            int currentLengthOfName = STUDENTS_NAMES[index].length();
            if (maxLengthOfName < currentLengthOfName) maxLengthOfName = currentLengthOfName;
        }
        return maxLengthOfName;
    }
}