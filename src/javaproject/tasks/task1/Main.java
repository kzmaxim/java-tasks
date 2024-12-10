package javaproject.tasks.task1;

public class Main {
    public static void main(String[] args) {
        Instructor instructor = new Instructor("Alex", 24, "Java");
        Student student1 = new Student("John", 20, 1);
        Student student2 = new Student("Jane", 21, 2);
        Student student3 = new Student("Jack", 22, 3);

        Course javaCourse = new Course("Java Programming", instructor, new Student[] {student1, student2});
        javaCourse.addStudent(student3);
        javaCourse.getCourseInfo();
    }
}
