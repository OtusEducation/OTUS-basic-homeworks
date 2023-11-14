package ru.murtazin.homeworks.homework10;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);
    public final static int YEAR = 40;

    public static void main(String[] args) {
        char program;
        do {
            System.out.println("Введите символ");
            String choice = scan.next();
            program = choice.toLowerCase().charAt(0);
            switch (program) {
                case 'u':
                    usersInfo();
                    break;
                case 'b':
                    boxes();
                    break;
                case 'q':
                case 'e':
                case 'в':
                    System.out.println("Выход из программы");
                    break;
                default:
                    System.out.println("Неверный ввод");
                    break;
            }
        } while (program != 'q' && program != 'e');
    }

    public static void usersInfo() {
        // Описание пользователей
        User[] users = {
                new User("Кейдж", "Николас", "",
                        LocalDate.of(1964, 1, 7), "face_off@gmail.com"),
                new User("Данст", "Кирстен", "Кэролайн",
                        LocalDate.of(1982, 4, 30), "spidy_best@gmail.com"),
                new User("Крэнстон", "Брайан", "",
                        LocalDate.of(1956, 3, 7), "breaking_bad@gmail.com"),
                new User("Джеймс", "Кевин", "",
                        LocalDate.of(1965, 4, 26), "hitch_can_help_you@gmain.com"),
                new User("Круз", "Том", "Мапотер IV",
                        LocalDate.of(1962, 7, 3), "mission_impossible@gmail.com"),
                new User("Бобби", "Милли", "Браун",
                        LocalDate.of(2004, 2, 19), "strange_girl@gmail.com"),
                new User("Кавилл", "Генри", "Уильям Далглиш",
                        LocalDate.of(1983, 5, 5), "man_of_steel@gmai.com"),
                new User("Йовович", "Милла", "",
                        LocalDate.of(1975, 12, 17), "fifth_elem@gmail.com"),
                new User("Лоуренс", "Дженифер", "",
                        LocalDate.of(1990, 8, 15), "mockingjay@gmail.com"),
                new User("Робби", "Марго", "Элис",
                        LocalDate.of(1990, 7, 2), "harley_quinn@gmail.com"),
        };
        ageSelection(users);
    }

    private static void ageSelection(User[] users) {
        System.out.println("Список актеров старше " + YEAR);
        for (User user : users) {
            if (LocalDate.now().getYear() - user.getBirthDay().getYear() >= YEAR) {
                System.out.println(user.getInfo());
                System.out.println();
            }
        }
    }

    public static void boxes() {
        // Описание ящиков
        Box box1 = new Box("Red", 1.0, 1.0, 1.0, false, true);
        System.out.println(box1.getInfo());
        box1.setCoverPosition(true);
        System.out.println(box1.getInfo());
    }
}
