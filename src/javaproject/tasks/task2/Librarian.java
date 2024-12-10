package javaproject.tasks.task2;

public class Librarian extends Person {
    private String libraryName;

    public Librarian(String name, int age, String libraryName) {
        super(name, age);
        this.libraryName = libraryName;
    }

    public String getLibraryName() {
        return this.libraryName;
    }
    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }
    public String getInfo() {
        return "Name: " + this.getName() + ", Age: " + this.getAge() + ", Library Name: " + this.getLibraryName();
    }
}
