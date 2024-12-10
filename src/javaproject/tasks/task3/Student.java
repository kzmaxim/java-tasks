package javaproject.tasks.task3;

import java.util.ArrayList;

public class Student extends Person implements Enrollable {
    public static ArrayList<Student> students = new ArrayList<>();
    private ArrayList<String> courseList;

    public Student(String name, ArrayList<String> courseList) {
        this.id = lastId++;
        this.name = name;
        this.courseList = courseList;
        students.add(this);
        people.add(this);
    }

    @Override
    public void enroll(String courseName) {
        if (!courseList.contains(courseName)) {
            courseList.add(courseName);
        }
    }

    @Override
    public String getDetails() {
        return "ID: " + id + "\nName: " + name + "\nCourses: " + courseList.toString();
    }

    public String getCourseList() {
        return courseList.toString();
    }
    public void setCourseList(ArrayList<String> courseList) {
        this.courseList = courseList;
    }
    public void addCourse(String course) {
        this.courseList.add(course);
    }
    public void removeCourse(String course) {
        this.courseList.remove(course);
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
