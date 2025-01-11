package javaproject.tasks.task6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Класс чисто для тестирования

public class Main {
    public static void main(String[] args) {
        // Проверяем базовые методы SmartList
        SmartList<Integer> smartList = new SmartList<>();
        smartList.add(2);
        smartList.add(1);
        smartList.add(3);
        System.out.println(smartList.toString());
        smartList.sort(Comparator.comparingInt(o -> o));
        System.out.println(smartList.toString());
        smartList.remove(2);
        System.out.println(smartList.toString());

        // Работает со стиравнием типов
        SmartList rawList = new SmartList();
        rawList.add(1);
        rawList.add("hello");
        System.out.println(rawList.toString());

        // Проверяем работу метода printSum
        SmartList.printSum(smartList);

        // Проверяем методы addList и printList
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        smartList.addList(list);
        System.out.println(smartList.toString());
        SmartList.printList(list);
    }
}
