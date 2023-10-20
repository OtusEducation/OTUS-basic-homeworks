package ru.murtazin.homeworks.homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = AdditionalMethods.getArrayInt2();
        System.out.println(Arrays.deepToString(array));
        System.out.println(getSumOfPositiveElements(array));
        printSquareOfSymbol(5);
        System.out.println(sumElArray(AdditionalMethods.getArrayInt2()));
        System.out.println(findMax(AdditionalMethods.getArrayInt2()));
    }

    /**
     * Метод 1.
     * Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0
     */
    public static int getSumOfPositiveElements(int[][] array) {
        System.out.println("Метод 1");
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
        System.out.println("Метод 2");
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

    /**
     * Метод 3.
     * Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
     * и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе)
     */
    public static void print1(int size) {
        System.out.println("Метод 3");
    }

    /**
     * Метод 4.
     * Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива
     */
    public static int findMax(int[][] array) {
        System.out.println("Метод 4");
        int result = array[0][0];
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > result) {
                    result = array[i][j];
                }
            }
        }
        return result;
    }

    /**
     * Метод 5.
     * Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
     * если второй строки не существует, то в качестве результата необходимо вернуть -1
     */
    public static int sumElArray(int[][] array) {
        System.out.println("Метод 5");
        int sum = 0;
        System.out.println(Arrays.deepToString(array));
        if (array.length < 2) {
            sum = -1;
        } else {
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
        }
        return sum;
    }
}
