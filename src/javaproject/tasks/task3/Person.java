package javaproject.tasks.task3;

import java.util.ArrayList;

public abstract class Person {
    static int lastId = 0;
    protected int id;
    protected String name;

    static ArrayList<Person> people = new ArrayList<>();

    public static void displayAllPersons() {
        for (Person person : people) {
            System.out.println(person.getDetails());
        }
    }


    public abstract String getDetails();
}
