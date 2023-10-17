package ru.murtazin.homeworks.homework4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Методы основной части домашнего задания\n");
        MethodsPart1.printStringNum("Hello", Math.abs(AdditionalMethods.getRandomNumber()));
        int[] array = AdditionalMethods.getArrayInt();
        System.out.println("Исходный массив: " + Arrays.toString(array) + "\n");
        MethodsPart1.getSumElArr(array.clone(), AdditionalMethods.getRandomNumber()); // Метод 1
        MethodsPart1.getArrayReplaceEl(AdditionalMethods.getRandomNumber(), array.clone()); // Метод 2
        MethodsPart1.getArrayAddElNum(AdditionalMethods.getRandomNumber(), array.clone()); // Метод 3
        MethodsPart1.getArraySumHalf(array.clone()); // Метод 4
        System.out.println("Методы дополнительной части домашнего задания\n");
        MethodsPart2.getArrSumEl(AdditionalMethods.getArrayInt(), AdditionalMethods.getArrayInt(),
                AdditionalMethods.getArrayInt()); // Метод 1*
        MethodsPart2.getReverseArray(AdditionalMethods.getArrayInt()); // Метод 4*
    }
}
