package _1_learn._1_10_object_oriented_design.example._1_10_1_simple_school_management_system;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String name;
    private int teacherId;
    private List<Course> courses;

    public Teacher(String name, int teacherId) {
        this.name = name;
        this.teacherId = teacherId;
        this.courses = new ArrayList<>();
    }

    public void assignCourse(Course course) {
        courses.add(course);
    }

    public void gradeStudent(Student student, Course course) {
        System.out.println("Grading " + student.getName() + " in " + course.getCourseName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}