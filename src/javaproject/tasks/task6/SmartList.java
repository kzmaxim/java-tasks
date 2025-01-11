package javaproject.tasks.task6;

import java.util.*;

import static java.util.stream.Collectors.joining;

// Класс аналог ArrayList
public class SmartList<T> {
    // Печатает лист
    public static <T> void printList(List<T> list) {
        list.forEach(System.out::println);
    }
    // Печатает сумму элементов в SmartList
    public static void printSum(SmartList<? extends Number> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i).doubleValue();
        }
        System.out.println(sum);
    }
    private int size;
    private int capacity;
    private T[] arr;

    public SmartList() {
        this.size = 0;
        this.capacity = 10;
        this.arr = (T[]) new Object[this.capacity];
    }
    public SmartList(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.arr = (T[]) new Object[this.capacity];
    }
    public SmartList(T[] arr) {
        this.size = arr.length;
        this.capacity = arr.length*2;
        this.arr = arr;
    }

    public void add(T item) {
        if (this.size == this.capacity) {
            this.capacity *= 2;
            this.arr = (T[]) new Object[this.capacity];
        }
        arr[this.size++] = item;
    }
    public void remove(T item) {
        for (int i = 0; i < this.size; i++) {
            if (this.arr[i].equals(item)) {
                if (i == this.size - 1) {
                    this.size--;
                    continue;
                }
                this.arr[i] = this.arr[i+1];
                this.arr[i+1] = null;
                ++i;
            }
        }
        this.size--;
    }
    public T get(int index) {
        return this.arr[index];
    }
    public int size() {
        return this.size;
    }
    public boolean contains(T item) {
        for (T t : arr) {
            if (t.equals(item)) {
                return true;
            }
        }
        return false;
    }
    public void sort(Comparator<? super T> comparator) {
        T[] nonNullArr = Arrays.stream(arr)
                .filter(Objects::nonNull)
                .toArray(size -> (T[]) new Object[size]);

        Arrays.sort(nonNullArr, comparator);

        System.arraycopy(nonNullArr, 0, arr, 0, nonNullArr.length);
    }
    // Добавляет элементы из List в SmartList
    public void addList(List<? super T> list) {
        for (Object o : list) {
            this.add((T)o);
        }
    }

    public String toString() {
        return "[" + Arrays.stream(arr)
                .filter(Objects::nonNull)
                .map(Objects::toString)
                .collect(joining(", ")) + "]";
    }

}
