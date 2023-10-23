package ru.murtazin.homeworks.homework7;

import java.util.Arrays;

public class Main {
    public static int[][] arrayUneven = AdditionalMethods.getMultiDimUnevenArray();
    public static int[][] arrayEven = AdditionalMethods.getMultiDimEvenArray();

    public static void main(String[] args) {
        System.out.println("\nИсходный массив: " + Arrays.deepToString(arrayUneven) + "\n");
        System.out.println(getSumOfPositiveElements(arrayUneven)); // Метод 1
        printSquareOfSymbol(Math.abs(AdditionalMethods.getRandomNumber()));  // Метод 2
        generateArrayWithZeroDiag(arrayEven); // Метод 3
        System.out.println(findMax(arrayUneven)); // Метод 4
        System.out.println(sumElArray(arrayUneven));// Метод 5
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
        char symbol = '*';
        int num = 0;
        while (num < size) {
            if (num == 0 || num == size - 1) {
                for (int i = 0; i < size; i++) {
                    System.out.print(symbol + " ");
                }
                System.out.println();
            } else {
                for (int i = 0; i < size; i++) {
                    if (i == 0) {
                        System.out.print(symbol + " ");
                    } else if (i == size - 1) {
                        System.out.print(symbol + "\n");
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
     * и заменяющий элементы по диагоналям на значение ноль
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
     * Реализуйте метод, который считает сумму элементов второй строки/столбца двумерного массива,
     * если второй строки/столбца не существует, то в качестве результата необходимо вернуть -1
     */
    // TODO: 23.10.2023 Доработать метод
    // TODO 1. Некорректно работает подсчет суммы элементов во втором столбце. Исправлено
    // TODO 2. Учесть ситуацию, при которой вторая строка массива может быть пустой,
    //  но подсчет суммы элементов во втором столбце произойдет. Исправлено
    public static String sumElArray(int[][] array) {
        System.out.println("Метод 5");
        final int EL = 1;
        int sumElSecondStr = 0;
        int sumElSecondCol = 0;
        int numCol = array.length;
        String sSumElSecondStr;
        String sSumElSecondCol;
        System.out.println(Arrays.deepToString(array));
        if (array.length < 2 || array[EL].length == 0) {
            sSumElSecondStr = "Второй строки массива не существует\n";
        } else {
            for (int i = 0; i < array[EL].length; i++) {
                sumElSecondStr += array[EL][i];
            }
            sSumElSecondStr = "Сумма элементов второй строки массива равна " + sumElSecondStr + "\n";
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i].length < 2) {
                numCol--;
            } else {
                sumElSecondCol += array[i][EL];
            }
        }
        if (numCol == 0) {
            sSumElSecondCol = "Второго столбца массива не существует\n";
        } else {
            sSumElSecondCol = "Сумма элементов второго столбца массива равна " + sumElSecondCol + "\n";
        }

        return sSumElSecondStr + sSumElSecondCol;
    }
}
