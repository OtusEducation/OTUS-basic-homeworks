package ru.murtazin.homeworks.homework7;

import ru.murtazin.homeworks.homework5.AdditionalMethods;

public class Main {
    public static void main(String[] args) {
        int[] array = AdditionalMethods.getArrayInt();
        printSquareOfSymbol(5);
    }

    /**
     * Метод 1.
     * Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0
     */
    public static int getSumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    /**
     * Метод 2.
     * Реализовать метод, который принимает в качестве аргумента int size и печатает в консоль квадрат из символов *
     * со сторонами соответствующей длины
     */

    public static void printSquareOfSymbol(int size) {
        char symb = '*';
        int num = 0;
        while (num < size) {
            if (num == 0 || num == size - 1) {
                for (int i = 0; i < size; i++) {
                    System.out.print(symb + " ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < size; i++) {
                    if (i == 0) {
                        System.out.print(symb + " ");
                    } else if (i == size - 1) {
                        System.out.print(symb + "\n");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            num++;
        }
    }
}
