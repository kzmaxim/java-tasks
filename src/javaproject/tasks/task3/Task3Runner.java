package javaproject.tasks.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3Runner {
    public static void assignCourse(int studentId, String courseName) {
        for (Student student : Student.students) {
            if (student.getId() == studentId) {
                student.enroll(courseName);
                System.out.println("Курс " + courseName + " добавлен студенту " + student.getName());
                return;
            }
        }
        System.out.println("Студент с ID " + studentId + " не найден.");
    }



    public static void main(String[] args) {
        System.out.println("""
            1. Добавить студента
            2. Добавить преподавателя
            3. Назначить курс студенту
            4. Показать всех людей
            5. Выход
            """);

        while (true) {
            System.out.println("Выберите действие: ");
            Scanner console = new Scanner(System.in);
            String input = console.nextLine();

            if (input.equals("1")) {
                System.out.println("Введите имя студента: ");
                String name = console.nextLine();
                ArrayList<String> courses = new ArrayList<>();
                System.out.println("Напишите список курсов, на который обучается студент. После того как ввели, введите exit");
                for (String i = console.nextLine(); !i.equals("exit"); i = console.nextLine()) {
                    courses.add(i);
                }
                Student student = new Student(name, courses);
                System.out.println("Студент добавлен!");
                System.out.println(student.getDetails());

            } else if (input.equals("2")) {
                System.out.println("Введите имя преподавателя: ");
                String name = console.nextLine();
                System.out.println("Введите предмет, который ведет преподаватель: ");
                String subject = console.nextLine();

                Teacher teacher = new Teacher(name, subject);
                System.out.println("Учитель создан!");
                System.out.println(teacher.getDetails());

            } else if (input.equals("3")) {
                System.out.println("Введите ID студента: ");
                int studentId = console.nextInt();
                console.nextLine();
                System.out.println("Введите название курса: ");
                String courseName = console.nextLine();
                assignCourse(studentId, courseName);

            } else if (input.equals("4")) {
                Person.displayAllPersons();

            } else if (input.equals("5")) {
                System.out.println("Пока!");
                break;

            } else {
                System.out.println("Некорректный ввод. Попробуйте снова.");
            }
        }
    }

}
