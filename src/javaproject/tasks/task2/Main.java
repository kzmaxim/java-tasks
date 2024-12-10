package javaproject.tasks.task2;

public class Main {
    public static void main(String[] args) {
        Librarian librarian = new Librarian("Alex", 56, "National Library");
        Book book1 = new Book("Hobbit", "Tolkien", 1991);
        Book book2 = new Book("Harry Potter", "Rowling", 2003);
        Reader reader1 = new Reader("Harry", 23, 1);
        Reader reader2 = new Reader("Emily", 19, 2);

        Library nationalLibrary = new Library(librarian, new Book[]{book1, book2}, new Reader[]{reader1, reader2});
        nationalLibrary.getLibraryInfo();

        Book book3 = new Book("The Lord of The Rings", "Tolkien", 2001);
        Reader reader3 = new Reader("John", 20, 3);
        System.out.println("Добавил одну книгу и одного читалеля:");
        nationalLibrary.addBook(book3);
        nationalLibrary.addReader(reader3);
        nationalLibrary.getLibraryInfo();

        System.out.println("Удалил одного читателя и одну книгу:");
        nationalLibrary.removeBook(book2);
        nationalLibrary.removeReader(reader2);
        nationalLibrary.getLibraryInfo();
    }
}
