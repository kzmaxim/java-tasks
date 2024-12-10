package javaproject.tasks.task2;

import java.util.Arrays;

public class Library {
    private Librarian librarian;
    private Book[] books;
    private Reader[] readers;


    public Library(Librarian librarian, Book[] books, Reader[] readers) {
        this.librarian = librarian;
        this.books = books;
        this.readers = readers;
    }
    public void addBook(Book book) {
        Book[] newBooks = Arrays.copyOf(this.books, this.books.length + 1);
        newBooks[newBooks.length - 1] = book;
        this.books = newBooks;
    }
    public void addReader(Reader reader) {
        Reader[] newReaders = Arrays.copyOf(this.readers, this.readers.length + 1);
        newReaders[newReaders.length - 1] = reader;
        this.readers = newReaders;
    }
    public void removeBook(Book book) {
        int index = 0;
        Book[] newBooks = new Book[this.books.length - 1];
        for (Book b : this.books) {
            if (b.getInfo().equals(book.getInfo())) {
                continue;
            }
            newBooks[index++] = b;
        }
        this.books = Arrays.copyOf(newBooks, index);
    }
    public void removeReader(Reader reader) {
        int index = 0;
        Reader[] newReaders = new Reader[this.readers.length - 1];
        for (Reader r : this.readers) {
            if (r.getInfo().equals(reader.getInfo())) {
                continue;
            }
            newReaders[index++] = r;
        }
        this.readers = Arrays.copyOf(newReaders, index);
    }
    public void getLibraryInfo() {
        System.out.println("Librarian: " + librarian.getName());
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + ", " + book.getAuthor() + ", " + book.getYear());
        }
        System.out.println("Readers:");
        for (Reader reader : readers) {
            System.out.println(reader.getName() + ", " + reader.getAge() + ", " + reader.getReaderId());
        }
    }
}