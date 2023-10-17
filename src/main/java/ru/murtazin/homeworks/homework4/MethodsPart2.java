package ru.murtazin.homeworks.homework4;

import java.util.Arrays;

public class MethodsPart2 {
    /*
   Метод 1*.
   Реализуйте метод, принимающий на вход набор целочисленных массивов, и получающий новый
   массив равный сумме входящих;
    */
    public static void getArrSumEl(int[]... num) {
        System.out.println("Метод 1*");
        int maxLength = 0;
        // Определяем количество элементов на входе
        for (int[] ints : num) {
            if (ints.length > maxLength) {
                maxLength = ints.length;
            }
        }
        System.out.println("Максимальный размер массива " + maxLength);
        int[] result = new int[maxLength]; // Результирующий массив
        System.out.println("Массивы на входе " + Arrays.deepToString(num) + "\n");
        // Приводим массивы к одному размеру
        System.out.println("Массивы после выравнивания количества элементов");
        for (int i = 0; i < num.length; i++) {
            if (num[i].length < maxLength) {
                num[i] = Arrays.copyOf(num[i], maxLength);
            }
            System.out.println(Arrays.toString(num[i]));
        }
        // Формируем результирующий массив из суммы элементов входных массивов
        for (int[] ints : num) {
            for (int j = 0; j < ints.length; j++) {
                result[j] += ints[j];
            }
        }
        System.out.println("Результирующий массив " + Arrays.toString(result) + "\n");
    }

    /*
    Метод 2*.
    Реализуйте метод, проверяющий, что есть “точка” в массиве, в которой сумма левой и правой части
    равны. “Точка находится между элементами”

    public static void met2() {

    }
    */
    /*
    Метод 3*.
    Реализуйте метод, проверяющий, что все элементы массива идут в порядке убывания или
    возрастания (по выбору пользователя)

    public static void met3() {

    }
    */
    /*
    Метод 4*.
    Реализуйте метод, “переворачивающий” входящий массив
    */
    public static void getReverseArray(int[] arr) {
        System.out.println("Метод 4*");
        int[] arrReverse = new int[arr.length];
        System.out.println("Исходный массив " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arrReverse[arr.length - 1 - i] = arr[i];
        }
        System.out.println("Инвертированный массив " + Arrays.toString(arrReverse));
    }
}
