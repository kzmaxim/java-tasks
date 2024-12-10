package javaproject.tasks.task1;

import java.util.Arrays;

public class Course {
    private String title;
    private Instructor instructor;
    private Student[] students;

    public Course(String title, Instructor instructor, Student[] students) {
        this.title = title;
        this.instructor = instructor;
        this.students = students;
    }
    public void addStudent(Student student) {
        Student[] newStudents = Arrays.copyOf(this.students, this.students.length + 1);
        newStudents[newStudents.length - 1] = student;
        this.students = newStudents;
    }
    public void getCourseInfo() {
        System.out.println("Course Title: " + this.title);
        System.out.println("Instructor: ");
        this.instructor.getInfo();
        System.out.println("Students: ");
        for (Student student : this.students) {
            student.getInfo();
        }
    }
}
