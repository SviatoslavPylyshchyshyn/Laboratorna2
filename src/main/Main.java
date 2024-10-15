package main;

import house.House;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // створення масиву хат через введення з клавіатури
        House[] houses = createHousesArray(scan);

        // введення критеріїв для вибірки
        System.out.println("Введіть кількість кімнат для вибірки:");
        int rooms = scan.nextInt();

        System.out.println("Введіть мінімальний поверх для вибірки:");
        int minFloor = scan.nextInt();

        System.out.println("Введіть максимальний поверх для вибірки:");
        int maxFloor = scan.nextInt();

        System.out.println("Введіть мінімальну площу для вибірки:");
        double minArea = scan.nextDouble();

        // виведення результатів
        System.out.println("Квартири з " + rooms + " кімнатами:");
        printHousesWithRooms(houses, rooms);

        System.out.println("Квартири з " + rooms + " кімнатами на поверхах від " + minFloor + " до " + maxFloor + ":");
        printHousesWithRoomsAndFloorRange(houses, rooms, minFloor, maxFloor);

        System.out.println("Квартири з площею більше " + minArea + ":");
        printHousesWithAreaMoreThan(houses, minArea);
    }

    // метод для створення масиву об'єктів House з використанням setValue()
    public static House[] createHousesArray(Scanner scanner) {
        System.out.println("Скільки квартир ви хочете додати?");
        int count = scanner.nextInt();
        House[] houses = new House[count];

        // введення даних про кожну квартиру
        for (int i = 0; i < count; i++) {
            System.out.println("Введіть дані для квартири #" + (i + 1) + ":");

            House house = new House();

            System.out.print("ID: ");
            house.setValue("id", scanner.nextInt());

            System.out.print("Номер квартири: ");
            house.setValue("apartmentNumber", scanner.nextInt());

            System.out.print("Площа: ");
            house.setValue("area", scanner.nextDouble());

            System.out.print("Поверх: ");
            house.setValue("floor", scanner.nextInt());

            System.out.print("Кількість кімнат: ");
            house.setValue("numberOfRooms", scanner.nextInt());

            scanner.nextLine(); // очищення буфера після введення числа

            System.out.print("Вулиця: ");
            house.setValue("street", scanner.nextLine());

            // Додавання об'єкта House до масиву
            houses[i] = house;
        }

        return houses;
    }

    // метод для виведення квартир з певною кількістю кімнат
    public static void printHousesWithRooms(House[] houses, int numberOfRooms) {
        boolean found = false; // для перевірки, чи були знайдені квартири
        for (House house : houses) {
            if ((int) house.getValue("numberOfRooms") == numberOfRooms) {
                System.out.println(house);
                found = true;
            }
            if ((int) house.getValue("floor")) == 5) {

            }
        }
        if (!found) {
            System.out.println("Не знайдено квартир з " + numberOfRooms + " кімнатами.");
        }

    }

    // метод для виведення квартир з певною кількістю кімнат та у межах певного поверху
    public static void printHousesWithRoomsAndFloorRange(House[] houses, int numberOfRooms, int minFloor, int maxFloor) {
        boolean found = false; // Для перевірки, чи були знайдені квартири
        for (House house : houses) {
            int rooms = (int) house.getValue("numberOfRooms");
            int floor = (int) house.getValue("floor");
            if (rooms == numberOfRooms && floor >= minFloor && floor <= maxFloor) {
                System.out.println(house);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Не знайдено квартир з " + numberOfRooms + " кімнатами на поверхах від " + minFloor + " до " + maxFloor + ".");
        }
    }

    // метод для виведення квартир, площа яких перевищує задану величину
    public static void printHousesWithAreaMoreThan(House[] houses, double minArea) {
        boolean found = false; // для перевірки, чи були знайдені квартири
        for (House house : houses) {
            double area = (double) house.getValue("area");
            if (area > minArea) {
                System.out.println(house);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Не знайдено квартир з площею більше " + minArea + ".");
        }
    }
}
