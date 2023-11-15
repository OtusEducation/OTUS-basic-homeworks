package ru.murtazin.homeworks.homework11;

import java.util.Scanner;

public class Main {
    public static String competitions;
    public static int distance;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Dog dog = new Dog("Barni", 4, 3, 30);
        Horse horse = new Horse("Spirit", 10, 5, 100);
        Cat cat = new Cat("Snowball", 6, 0, 25);
        System.out.println("Добро пожаловать!\n" +
                "Уcтроим спортивные соревнования между животными.\n" +
                "Доступны следующие дисциплины:\n" +
                "run - бег\n" +
                "swim - плавание\n" +
                "info - информация об участниках\n" +
                "quit - завершить соревнования");
        do {
            System.out.println("Выберите дисциплину");
            competitions = scan.next();
            switch (competitions) {
                case "run":
                    System.out.println("Введите дистанцию бега");
                    distance = scan.nextInt();
                    dog.run(distance);
                    cat.run(distance);
                    horse.run(distance);
                    break;
                case "swim":
                    System.out.println("Введите дистанцию плавания");
                    distance = scan.nextInt();
                    dog.swim(distance);
                    cat.swim(distance);
                    horse.swim(distance);
                    break;
                case "info":
                    dog.info();
                    cat.info();
                    horse.info();
                    break;
                case "quit":
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неизвестная дисциплина");
                    break;
            }
        } while (!competitions.equals("quit"));
    }
}
