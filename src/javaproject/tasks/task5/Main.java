package javaproject.tasks.task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int input = 0;
            while (input != 3) {
                System.out.println("Введите тип доставки:");
                System.out.println("1 - Home delivery");
                System.out.println("2 - Pickup delivery");
                System.out.println("3 - Exit");
                input = scanner.nextInt();
                DeliveryFactory factory = null;
                switch (input) {
                    case 1:
                        factory = new HomeDeliveryFactory();
                        break;
                    case 2:
                        factory = new PickupDeliveryFactory();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Неверная операция, попробуйте еще раз.");
                }
                if (factory != null) {
                    Delivery delivery = factory.createDelivery();
                    System.out.println("Стоимость доставки: " + delivery.calculateCost() + " тенге.");
                }
            }
        }
    }
}
