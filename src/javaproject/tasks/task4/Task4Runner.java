package javaproject.tasks.task4;

import java.util.Scanner;

public class Task4Runner {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String command = "";
            while (!command.equals("5")) {
                System.out.println("""
                        Выберите действие:
                            1. Добавить книгу
                            2. Отобразить все книги
                            3. Найти книги по автору
                            4. Удалить книгу
                            5. Выйти
                        """);
                command = scanner.nextLine();
                switch (command) {
                    case "1":
                        System.out.println("Введите через пробел название книги, автора, год и жанр");
                        String[] input = scanner.nextLine().split(" ");
                        Book book = new Book(input[0], input[1], Integer.parseInt(input[2]), input[3]);
                        Book.addBook(book);
                        System.out.println("Книга успешно добавлена!");
                        break;
                    case "2":
                        System.out.println("Все книги:");
                        Book.viewBooks();
                        break;
                    case "3":
                        System.out.println("Введите имя автора:");
                        String name = scanner.nextLine();
                        Book.searchByAuthor(name);
                        break;
                    case "4":
                        System.out.println("Введите название книги для удаления:");
                        String title = scanner.nextLine();
                        Book.deleteBook(title);
                        break;
                    case "5":
                        System.out.println("Пока!");
                        break;
                }
            }
        }
    }
}
