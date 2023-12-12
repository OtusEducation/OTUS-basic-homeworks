package ru.murtazin.homeworks.homework12;

import java.util.Scanner;

/**
 * Домашнее задание 12. (ООП. Работа со строками)
 * Реализуйте классы Тарелка (максимальное количество еды, текущее количество еды) и Кот (имя, аппетит).
 * Количество еды измеряем в условных единицах.
 * При создании тарелки указывается ее объем и она полностью заполняется едой
 * В тарелке должен быть метод, позволяющий добавить еду в тарелку.
 * После добавления в тарелке не может оказаться еды больше максимума
 * В тарелке должен быть boolean метод уменьшения количества еды, при этом после такого уменьшения,
 * в тарелке не может оказаться отрицательное количество еды (если удалось уменьшить еду так,
 * чтобы в тарелке осталось >= 0 кусков еды, то возвращаем true, в противном случае - false).
 * Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 * Если коту удалось покушать (хватило еды), сытость = true.
 * Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
 * то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 * Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и
 * потом вывести информацию о сытости котов в консоль.
 */
public class Main {
    public static Scanner scan = new Scanner(System.in);
    public static int numFood;
    public static int countHungerCats;
    public static int maxAppettite;

    public static void main(String[] args) {
        Cat[] cats = {new Cat("Snowball1", 20),
                new Cat("Snowball2", 50),
                new Cat("Snowball3", 25)};
        Plate plate;
        countHungerCats = cats.length;
        maxAppettite = cats[0].getAppetite();
        System.out.println("Добро пожаловать.\n");
        plate = new Plate(determPlateSize(cats)); // определяем минимальный размер тарелки
        plate.setCurAmountFood(plate.getMaxAmountFood()); // Заполняем тарелку
        do {
            System.out.println("Давайте покормим голодных котиков\n");
            for (int i = 0; i < cats.length; i++) {
                if (cats[i].eaten(plate)) {
                    countHungerCats -= 1;
                }
            }
            if (countHungerCats == 0) {
                System.out.println("\nВсе котики поели и довольные отдыхают\n");
            } else {
                System.out.println("\nЕще остались голодные котики. Заполняем тарелку\n");
                plate.setCurAmountFood(numFood);
            }
        } while (countHungerCats != 0);
    }

    private static int determPlateSize(Cat[] cats) {
        for (int i = 1; i < cats.length; i++) {
            if (cats[i].getAppetite() > maxAppettite) {
                maxAppettite = cats[i].getAppetite();
            }
        }
        do {
            System.out.println("Введите размер тарелки");
            numFood = scan.nextInt();
            if (numFood < maxAppettite) {
                System.out.println("Размер тарелки слишком мал, не все коты смогут наесться. Возьмите другую тарелку");
                System.out.println("Минимальный размер тарелки " + maxAppettite);
            }
        } while (numFood < maxAppettite);
        return numFood;
    }
}
