package ru.murtazin.homeworks.homework7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = AdditionalMethods.getArrayInt2();
        System.out.println("\nИсходный массив: " + Arrays.deepToString(array) + "\n");
        System.out.println(getSumOfPositiveElements(array)); // Метод 1
        printSquareOfSymbol(AdditionalMethods.getRandomNumber());  // Метод 2
        int[][] array1 = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        generateArrayWithZeroDiag(array1); // Метод 3
        System.out.println(findMax(AdditionalMethods.getArrayInt2())); // Метод 4
        System.out.println(sumElArray(AdditionalMethods.getArrayInt2()));// Метод 5
    }


    /**
     * Метод 1.
     * Реализовать метод sumOfPositiveElements(..), принимающий в качестве аргумента целочисленный двумерный массив,
     * метод должен посчитать и вернуть сумму всех элементов массива, которые больше 0
     */
    public static String getSumOfPositiveElements(int[][] array) {
        System.out.println("Метод 1");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return "Сумма элементов массива больше нуля равна " + sum + "\n";
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
        System.out.println();
    }

    /**
     * Метод 3.
     * Реализовать метод, принимающий в качестве аргумента двумерный целочисленный массив,
     * и зануляющий его диагональные элементы (можете выбрать любую из диагоналей, или занулить обе)
     */
    private static void generateArrayWithZeroDiag(int[][] mas) {
        System.out.println("Метод 3");
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j || j == mas[i].length - i - 1) {
                    mas[i][j] = 0;
                }
                System.out.printf("%4d", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Метод 4.
     * Реализовать метод findMax(int[][] array) который должен найти и вернуть максимальный элемент массива
     */
    public static String findMax(int[][] array) {
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
        return "Максимальный элемента массива равен " + result + "\n";
    }

    /**
     * Метод 5.
     * Реализуйте метод, который считает сумму элементов второй строки двумерного массива,
     * если второй строки не существует, то в качестве результата необходимо вернуть -1
     */
    public static String sumElArray(int[][] array) {
        System.out.println("Метод 5");
        int sum = 0;
        String result;
        System.out.println(Arrays.deepToString(array));
        if (array.length < 2) {
            result = "Второй строки массива не существует\n";
        } else {
            for (int i = 0; i < array[1].length; i++) {
                sum += array[1][i];
            }
            result = "Сумма элементов второй строки массива равна " + sum + "\n";
        }
        return result;
    }
}
