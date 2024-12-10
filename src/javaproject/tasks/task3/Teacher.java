package javaproject.tasks.task3;

import java.util.ArrayList;

public class Teacher extends Person {
    public static ArrayList<Teacher> teachers = new ArrayList<>();
    private String subject;

    public Teacher(String name, String subject) {
        this.id = lastId++;
        this.name = name;
        this.subject = subject;
        teachers.add(this);
        people.add(this);
    }

    @Override
    public String getDetails() {
        return "ID: " + id + "\nName: " + name + "\nSubject: " + subject;
    }

    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
