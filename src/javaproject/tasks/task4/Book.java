package javaproject.tasks.task4;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;


    public Book(String title, String author, int year, String genre) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public static void addBook(Book book) {
        try (OutputStream output = Files.newOutputStream(Path.of("/home/maxim/IdeaProjects/JavaRush/src/javaproject/tasks/task4/books.txt"), StandardOpenOption.APPEND);
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output)))
        {
            String buffer = "Title: " + book.title + " Author: " + book.author + " Year: " + book.year + " Genre: " + book.genre + "\n";
            writer.write(buffer, 0, buffer.length());
        } catch(Exception e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        }
    }
    public static void viewBooks() {
        try (InputStream input = Files.newInputStream(Path.of("/home/maxim/IdeaProjects/JavaRush/src/javaproject/tasks/task4/books.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready()) {
                String line = reader.readLine();
                System.out.println(line);
            }
        } catch(IOException e) {
            System.out.println("Ошибка при чтении файла " + e.getMessage());
        }
    }
    public static void searchByAuthor(String author) {
        try (InputStream input = Files.newInputStream(Path.of("/home/maxim/IdeaProjects/JavaRush/src/javaproject/tasks/task4/books.txt"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready()) {
                String line = reader.readLine();
                for (String s : line.split(" ")) {
                    if (s.equals(author)) {
                        System.out.println(line);
                        break;
                    }
                }
            }
        } catch(IOException e) {
            System.out.println("Ошибка при чтении файла " + e.getMessage());
        }
    }
    public static void deleteBook(String title) {
        Path path = Path.of("/home/maxim/IdeaProjects/JavaRush/src/javaproject/tasks/task4/books.txt");
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Добавляем строку в список, если она не содержит указанного названия книги
                if (!line.contains(title)) {
                    lines.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка чтения файла: " + e.getMessage());
            return;
        }
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Ошибка записи файла: " + e.getMessage());
        }
    }


}
