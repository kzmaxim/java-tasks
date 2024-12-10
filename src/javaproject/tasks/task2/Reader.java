package javaproject.tasks.task2;

public class Reader extends Person {
    private int readerId;

    public Reader(String name, int age, int readerId) {
        super(name, age);
        this.readerId = readerId;
    }

    public int getReaderId() {
        return readerId;
    }
    public void setReaderId(int readerId) {
        this.readerId = readerId;
    }
    public String getInfo() {
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", ReaderId: " + this.getReaderId();
    }
}
