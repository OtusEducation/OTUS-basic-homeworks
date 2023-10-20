package ru.murtazin.homeworks.homework4;

import java.util.Random;

public class AdditionalMethods {

    public static Random randomInt = new Random();

    // Метод для генерации массива
    public static int[] getArrayInt() {
        int max = 10; // максимальный размер элемента и длины массива
        int minEl = -10; // минимальный размер элемента массива
        int minLength = 1; // минимальная длина массива
        int[] array = new int[randomInt.nextInt(max - minLength) + minLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = randomInt.nextInt(max - minEl) + minEl;
        }
        return array;
    }

    // Метод для генерации случайного числа типа int
    public static int getRandomNumber() {
        // Генерируем число в диапазоне 1 - 10
        int max = 10;
        int min = -10;
        return randomInt.nextInt(max - min) + min;
    }

    // Метод для проверки элементов массива на сортировку
    public static int getSrt(int[] array, int srt) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) { // если предыдущий элемент больше следующего, массив не отсортирован
                srt = 2; // массив не отсортирован
                break; // прерываем цикл
            }
            srt = 1; // Массив отсортирован
        }
        return srt;
    }
}
