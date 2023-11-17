package ru.murtazin.homeworks.homework11;

import java.util.Scanner;

/**
 * Домашнее задание 11.
 * Создайте классы Cat, Dog и Horse с наследованием от класса Animal
 * У каждого животного есть имя, скорость бега и плавания (м/с), и выносливость (измеряется в условных единицах)
 * Затраты выносливости:
 * Все животные на 1 метр бега тратят 1 ед. выносливости,
 * Собаки на 1 метр плавания - 2 ед.
 * Лошади на 1 метр плавания тратят 4 единицы
 * Кот плавать не умеет.
 * Реализуйте методы run(int distance) и swim(int distance), которые должны возвращать время,
 * затраченное на указанное действие, и “понижать выносливость” животного.
 * Если выносливости не хватает, то возвращаем время -1 и указываем что у животного появилось состояние усталости.
 * При выполнении действий пишем сообщения в консоль.
 * Добавьте метод info(), который выводит в консоль состояние животного.
 */
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
