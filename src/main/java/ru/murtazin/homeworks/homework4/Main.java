package ru.murtazin.homeworks.homework4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Методы основной части домашнего задания\n");
        MethodsPart1.printStringNum("Hello", Math.abs(AdditionalMethods.getRandomNumber()));
        int[] array = AdditionalMethods.getArrayInt();
        System.out.println();
        System.out.println("\nИсходный массив: " + Arrays.toString(array) + "\n");
        MethodsPart1.getSumElArr(array.clone(), AdditionalMethods.getRandomNumber()); // Метод 1
        MethodsPart1.getArrayReplaceEl(AdditionalMethods.getRandomNumber(), array.clone()); // Метод 2
        MethodsPart1.getArrayAddElNum(AdditionalMethods.getRandomNumber(), array.clone()); // Метод 3
        MethodsPart1.getArraySumHalf(array.clone()); // Метод 4
        System.out.println("Методы дополнительной части домашнего задания\n");
        MethodsPart2.getArrSumEl(AdditionalMethods.getArrayInt(), AdditionalMethods.getArrayInt(),
                AdditionalMethods.getArrayInt()); // Метод 1*
        // Массивы для проверки метода 2
        int[] arr1 = {1, 1, 1, 1, 1, 3, 4, -2};
        int[] arr2 = {7, 2, 2, 2, 9, 4};
        MethodsPart2.getEqulibInd(arr1); // Метод 2*
        MethodsPart2.getEqulibInd(arr2);
        MethodsPart2.checkSortArray(AdditionalMethods.getArrayInt()); // Метод 3*
        MethodsPart2.getReverseArray(AdditionalMethods.getArrayInt()); // Метод 4*
    }
}
