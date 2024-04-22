package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_f_marks;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * <h1>F. Marks</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Vasya, or Mr. Vasily Petrov is a dean of a department in a local university. After the winter exams he got his hands on a group's gradebook.
 * <br/>
 * Overall the group has n students. They received marks for m subjects. Each student got a mark from 1 to 9 (inclusive) for each subject.
 * <br/>
 * Let's consider a student the best at some subject, if there is no student who got a higher mark for this subject. Let's consider a student successful, if there exists a subject he is the best at.
 * <br/>
 * Your task is to find the number of successful students in the group.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * 223
 * <br/>
 * 232
 * <br/>
 * 112
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 5
 * <br/>
 * 91728
 * <br/>
 * 11828
 * <br/>
 * 11111
 * </h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample test the student number 1 is the best at subjects 1 and 3, student 2 is the best at subjects 1 and 2, but student 3 isn't the best at any subject.
 * <br/>
 * In the second sample test each student is the best at at least one subject.
 * </h2>
 */

public class MarksExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
    private static byte countOfStudents, countOfStudentMarks;
    private static StringBuffer[] students;

    public static void main(String[] args) throws IOException {
        inputStudentMarks();
        OUTPUT.write(String.valueOf(getCountOfSuccessfulStudents()));
        OUTPUT.flush();
    }

    private static byte getCountOfSuccessfulStudents() {
        final HashSet<Byte> SUCCESSFUL_STUDENTS = new HashSet<>();
        for (byte studentIndex = 0; studentIndex < countOfStudents; studentIndex++) {
            for (byte studentMarkIndex = 0; studentMarkIndex < countOfStudentMarks; studentMarkIndex++) {
                final byte CURRENT_MARK = (byte) ((byte) students[studentIndex].charAt(studentMarkIndex) - '0');
                if (isBestMark(CURRENT_MARK, studentMarkIndex)) {
                    SUCCESSFUL_STUDENTS.add(studentIndex);
                    break;
                }
            }
        }
        return (byte) SUCCESSFUL_STUDENTS.size();
    }

    private static boolean isBestMark(final byte MARK, final byte MARK_INDEX) {
        for (byte index = 0; index < countOfStudents; index++) if ((students[index].charAt(MARK_INDEX) - '0') > MARK) return false;
        return true;
    }

    private static void inputStudentMarks() throws IOException {
        StringTokenizer line = new StringTokenizer(INPUT.readLine());
        countOfStudents = Byte.parseByte(line.nextToken());
        countOfStudentMarks = Byte.parseByte(line.nextToken());
        students = new StringBuffer[countOfStudents];
        for (byte studentIndex = 0; studentIndex < countOfStudents; studentIndex++) students[studentIndex] = new StringBuffer(INPUT.readLine());
    }
}