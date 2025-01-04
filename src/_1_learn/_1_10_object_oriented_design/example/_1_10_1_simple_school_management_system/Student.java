package _1_learn._1_10_object_oriented_design.example._1_10_1_simple_school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int studentId;
    private List<Course> courses;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void drop(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
