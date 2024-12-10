package javaproject.tasks.task1;

public class Instructor extends Person {
    private String subject;

    public Instructor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public String getSubject() {
        return this.subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void getInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Subject: " + this.subject);
    }
}
