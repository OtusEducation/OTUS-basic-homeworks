package ru.murtazin.homeworks.homework4;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static Random randomInt = new Random();
    //public static int[] array;

    public static void main(String[] args) {
        printStringNum("Hello", Math.abs(getRandomNumber()));
        int[] array = getArrayInt();
        System.out.println("Исходный массив: " + Arrays.toString(array) + "\n");
        getSumElArr(array.clone(), getRandomNumber());
        getArray(getRandomNumber(), array.clone());
        getArraySumNum(getRandomNumber(), array.clone());
        getArraySumPiece(array.clone());
    }

    /*
     Метод 1. Реализуйте метод, принимающий в качестве аргументов целое число и строку,
     и печатающий в консоль строку указанное количество раз
     */
    public static void printStringNum(String word, int num) {
        System.out.println("Метод 1.");
        System.out.printf("Количество повторений строки %s равно %d \n", word, num);
        System.out.println(word.repeat(num) + "\n");
    }

    /*
     Метод 2. -Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
     суммирующий все элементы, значение которых больше 5,
     и печатающий полученную сумму в консоль.
     */
    public static void getSumElArr(int[] array, int num) {
        System.out.println("Метод 2.");
        System.out.println(Arrays.toString(array));
        int sum = 0;
        for (int i : array) {
            int a = (i > num) ? (sum += i) : sum;
        }
        if (sum == 0) {
            System.out.printf("Отсутствуют элементы больше %d \n", num);
        } else {
            System.out.printf("Сумма элементов больше %d равна %d \n", num, sum);
            System.out.println();
        }
    }

    /*
     Метод 3. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
     метод должен заполниться каждую ячейку массива указанным числом.
     */
    public static void getArray(int num, int[] array) {
        System.out.println("Метод 3.");
        Arrays.fill(array, num);
        System.out.printf("Элементы массива заменены на число %d \n", num);
        System.out.println(Arrays.toString(array) + "\n");
    }

    /*
     Метод 4. Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на целочисленный массив,
     увеличивающий каждый элемент которого на указанное число.
     */
    public static void getArraySumNum(int num, int[] array) {
        System.out.println("Метод 4.");
        for (int i = 0; i < array.length; i++) {
            array[i] += num;
        }
        System.out.printf("К элементам массива прибавлено число %d \n", num);
        System.out.println(Arrays.toString(array) + "\n");
    }

    /*
     Метод 4. Реализуйте метод, принимающий в качестве аргумента целочисленный массив,
     и печатающий в консоль сумма элементов какой из половин массива больше.
     */
    public static void getArraySumPiece(int[] array) {
        System.out.println("Метод 5.");
        int sum1 = 0, sum2 = 0;
        int[] arrayExtend;
        // В случае, если количество элементов массива нечетно, увеличиваем размер массива на один,
        // с помощью метода clone(), переносим элементы в новый массив и задаем размер нового массива на один больше
        if (array.length % 2 == 1) {
            arrayExtend = Arrays.copyOf(array, array.length + 1);
            arrayExtend[arrayExtend.length - 1] = getRandomNumber(); // выполняем генерацию нового элемента массива
        } else {
            arrayExtend = array.clone();
        }
        System.out.println("Результирующий массив " + Arrays.toString(arrayExtend));
        // Считаем сумму элементов левой части массива
        for (int i = 0; i < arrayExtend.length / 2; i++) {
            sum1 += arrayExtend[i];
        }
        // Считаем сумму элементов правой части массива
        for (int i = arrayExtend.length / 2; i < arrayExtend.length; i++) {
            sum2 += arrayExtend[i];
        }
        System.out.println("Сумма элементов левой половины массива равна " + sum1 + "\n" +
                "Сумма элементов правой половины массива равна " + sum2);
        if (sum1 > sum2) {
            System.out.println("Сумма элементов левой части больше");
        } else if (sum2 > sum1) {
            System.out.println("Сумма элементов правой части больше");
        } else {
            System.out.println("Сумма элементов левой и правой половины идентичны");
        }
    }

    // Метод для генерации массива
    private static int[] getArrayInt() {
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
}
